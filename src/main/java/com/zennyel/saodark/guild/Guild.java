package com.zennyel.saodark.guild;

import co.aikar.util.LoadingMap;
import com.zennyel.saodark.Guilds;
import com.zennyel.saodark.utils.GuildMessages;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Guild {
    private static final int MAX_GUILD_NAME_LENGTH = 20;
    private static final int MAX_GUILD_SIZE = 50;
    private static final int MAX_GUILD_PREFIX_LENGTH = 5;
    private String name;
    private String prefix;
    private Set<Player> members;
    private Set<Guild> allies;
    private Player owner;
    private boolean friendlyFireEnabled;
    private Location home;
    private GuildMessages messages = new GuildMessages(Guilds.getPlugin(Guilds.class).getFileManager());
    private LoadingMap<Player, Object> pendingInvites;
    private UUID guild_id;

    public Guild(UUID guildId, String name, String prefix, Player owner, boolean friendlyFireEnabled, Location home) {
        this.guild_id = guildId;
        this.name = name;
        this.prefix = prefix;
        this.owner = owner;
        this.friendlyFireEnabled = friendlyFireEnabled;
        this.home = home;
        this.members = new HashSet<>();
        this.allies = new HashSet<>();
    }



    public static Guild fromResultSet(ResultSet rs) throws SQLException {
        UUID guildId = UUID.fromString(rs.getString("guild_id"));
        String name = rs.getString("name");
        String prefix = rs.getString("prefix");
        long ownerMSB = rs.getLong("owner_id");
        Player owner = Bukkit.getPlayer(String.valueOf(ownerMSB));
        boolean friendlyFireEnabled = rs.getBoolean("friendly_fire_enabled");
        double homeX = rs.getDouble("home_x");
        double homeY = rs.getDouble("home_y");
        double homeZ = rs.getDouble("home_z");
        World homeWorld = Bukkit.getWorld(rs.getString("home_world"));
        Location home = new Location(homeWorld, homeX, homeY, homeZ);
        Guild guild = new Guild(guildId, name, prefix, owner, friendlyFireEnabled, home);
        return guild;
    }

    public Guild(Player owner, String name) {
        if (name.length() < 3) {
            throw new IllegalArgumentException("Guild name is too short.");
        } else if (name.length() > MAX_GUILD_NAME_LENGTH) {
            throw new IllegalArgumentException("Guild name is too long.");
        }
        this.owner = owner;
        this.name = name;
        this.prefix = "";
        this.members = new HashSet<>();
        this.allies = new HashSet<>();
        this.friendlyFireEnabled = false;
        this.home = null;
        this.members.add(owner);
    }

    public String getName() {
        return name;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(Player player, String prefix) {
        if (player != owner) {
            throw new IllegalStateException("Only the guild owner can change the guild prefix.");
        } else if (prefix.length() > MAX_GUILD_PREFIX_LENGTH) {
            throw new IllegalArgumentException("Guild prefix is too long.");
        } else if (prefix.length() < 2) {
            throw new IllegalArgumentException("Guild prefix is too short.");
        }
        this.prefix = prefix;
    }

    public void invite(Player player) {
        if (members.contains(player)) {
            player.sendMessage(messages.getGuild_invite_invited_already_in_guild());
        } else if (pendingInvites.containsKey(player)) {
            player.sendMessage(messages.getGuild_invited_player_invite_pending());
        } else {
            player.sendMessage(messages.getGuild_invite_successful());
            pendingInvites.put(player, System.currentTimeMillis());
        }
    }

    public void acceptInvite(Player player) {
        if (!pendingInvites.containsKey(player)) {
            player.sendMessage(messages.getGuild_join_failed_no_invite());
            return;
        }
        if (members.size() >= MAX_GUILD_SIZE) {
            player.sendMessage(messages.getGuild_invite_max_size_reached());
            return;
        }
        members.add(player);
        pendingInvites.remove(player);
        player.sendMessage(messages.getGuild_invite_successful());
        for (Player guildMember : members) {
            if (guildMember != player) {
                guildMember.sendMessage(messages.getGuild_join_successful());
            }
        }
    }

    public UUID getGuildId() {
        return guild_id;
    }



    public void leave(Player player) {
        if (player == owner) {
            throw new IllegalStateException("Guild owner cannot leave the guild.");
        } else if (!members.contains(player)) {
            throw new IllegalArgumentException("Player is not a member of the guild.");
        }
        members.remove(player);
    }

    public void kick(Player kicker, Player target) {
        if (!members.contains(kicker)) {
            throw new IllegalStateException("Only guild members can kick other players.");
        } else if (kicker != owner) {
            throw new IllegalStateException("Only the guild owner can kick players.");
        } else if (target == owner) {
            throw new IllegalArgumentException("Guild owner cannot be kicked from the guild.");
        } else if (!members.contains(target)) {
            throw new IllegalArgumentException("Player is not a member of the guild.");
        }
        members.remove(target);
        target.sendMessage("You have been kicked from the guild.");
    }

    public GuildMessages getMessages() {
        return messages;
    }

    public void setMessages(GuildMessages messages) {
        this.messages = messages;
    }

    public LoadingMap<Player, Object> getPendingInvites() {
        return pendingInvites;
    }

    public void setPendingInvites(LoadingMap<Player, Object> pendingInvites) {
        this.pendingInvites = pendingInvites;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Set<Player> getMembers() {
        return members;
    }

    public void setMembers(Set<Player> members) {
        this.members = members;
    }

    public Set<Guild> getAllies() {
        return allies;
    }

    public void setAllies(Set<Guild> allies) {
        this.allies = allies;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public boolean isFriendlyFireEnabled() {
        return friendlyFireEnabled;
    }

    public void setFriendlyFireEnabled(boolean friendlyFireEnabled) {
        this.friendlyFireEnabled = friendlyFireEnabled;
    }

    public Location getHome() {
        return home;
    }

    public void setHome(Location home) {
        this.home = home;
    }
}
