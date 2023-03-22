package com.zennyel.saodark.database;

import com.zennyel.saodark.guild.Guild;
import org.bukkit.entity.Player;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.UUID;

public class GuildManager {

    private final GuildDAO guildDAO;

    public GuildManager(GuildDAO guildDAO) {
        this.guildDAO = guildDAO;
    }

    public void createTables() {
        guildDAO.createPlayerTable();
        try {
            guildDAO.createGuildsTable();
            guildDAO.createGuildMembersTable();
            guildDAO.createGuildAlliesTable();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void saveGuild(Guild guild) {
        try {
            guildDAO.insertGuild(guild);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public UUID loadPlayerGuild(Player player){
        String sql = "SELECT * FROM " + guildDAO.getSql().getTable() + " WHERE uuid = ?";
        try(PreparedStatement stmt = guildDAO.getConn().prepareStatement(sql)){
            stmt.setString(1, player.getUniqueId().toString());
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                return UUID.fromString(rs.getString(1));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public Guild loadGuild(UUID guildId) {
        String sql = "SELECT * FROM guilds WHERE id = ?";
        try (PreparedStatement stmt = guildDAO.getConn().prepareStatement(sql)) {
            stmt.setString(1, guildId.toString());
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return Guild.fromResultSet(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void close() {
        try {
            guildDAO.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
