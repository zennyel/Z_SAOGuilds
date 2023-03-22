package com.zennyel.saodark.database;

import com.zennyel.saodark.guild.Guild;
import org.bukkit.entity.Player;

import java.sql.*;
import java.util.Set;
import java.util.UUID;

public class GuildDAO {

    private Connection conn;
    private MySQL sql;

    public GuildDAO(MySQL sql){
        this.sql = sql;
        conn = this.getSql().getConnection();
    }

    public void createPlayerTable(){
        String sql = "CREATE TABLE IF NOT EXISTS "+ getSql().getTable() +
                "(uuid VARCHAR(36)," +
                "guild_name VARCHAR(20)," +
                "PRIMARY KEY (uuid));";
        try(Connection connection = this.getConn(); PreparedStatement ps = connection.prepareStatement(sql)){
            ps.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void createGuildsTable() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS guilds (" +
                "id VARCHAR(36) PRIMARY KEY," +
                "name VARCHAR(20) NOT NULL," +
                "prefix VARCHAR(24) NOT NULL," +
                "owner_id BIGINT NOT NULL," +
                "friendly_fire_enabled BOOLEAN NOT NULL," +
                "home_x DOUBLE NOT NULL," +
                "home_y DOUBLE NOT NULL," +
                "home_z DOUBLE NOT NULL," +
                "home_world VARCHAR(72) NOT NULL" +
                ")";
        Statement stmt = conn.createStatement();
        stmt.execute(sql);
        stmt.close();
    }
    public void createGuildMembersTable() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS guild_members (" +
                "id INT PRIMARY KEY AUTO_INCREMENT," +
                "guild_id VARCHAR(255) NOT NULL," +
                "member_id BIGINT NOT NULL," +
                "FOREIGN KEY (guild_id) REFERENCES guilds(id) ON DELETE CASCADE" +
                ")";
        Statement stmt = conn.createStatement();
        stmt.execute(sql);
        stmt.close();
    }

    public void createGuildAlliesTable() throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS guild_allies (" +
                "id INT PRIMARY KEY AUTO_INCREMENT," +
                "guild_id VARCHAR(255) NOT NULL," +
                "ally_id VARCHAR(255) NOT NULL," +
                "FOREIGN KEY (guild_id) REFERENCES guilds(id) ON DELETE CASCADE," +
                "FOREIGN KEY (ally_id) REFERENCES guilds(id) ON DELETE CASCADE" +
                ")";
        Statement stmt = conn.createStatement();
        stmt.execute(sql);
        stmt.close();
    }

    public void insertGuild(Guild guild) throws SQLException {
        String sql = "INSERT INTO guilds (guild_id, name, prefix, owner_id, friendly_fire_enabled, home_x, home_y, home_z, home_world) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, guild.getGuildId().toString());
        stmt.setString(2, guild.getName());
        stmt.setString(3, guild.getPrefix());
        stmt.setLong(4, guild.getOwner().getUniqueId().getMostSignificantBits());
        stmt.setBoolean(5, guild.isFriendlyFireEnabled());
        stmt.setDouble(6, guild.getHome().getX());
        stmt.setDouble(7, guild.getHome().getY());
        stmt.setDouble(8, guild.getHome().getZ());
        stmt.setString(9, guild.getHome().getWorld().getName());
        stmt.executeUpdate();
        stmt.close();
        insertMembers(guild);
        insertAllies(guild);
    }


    private void insertMembers(Guild guild) throws SQLException {
        Set<Player> members = guild.getMembers();
        String sql = "INSERT INTO guild_members (guild_id, member_id) VALUES (?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        for (Player member : members) {
            stmt.setString(1, guild.getGuildId().toString());
            stmt.setLong(2, member.getUniqueId().getMostSignificantBits());
            stmt.executeUpdate();
        }
        stmt.close();
    }

    private void insertAllies(Guild guild) throws SQLException {
        Set<Guild> allies = guild.getAllies();
        String sql = "INSERT INTO guild_allies (guild_id, ally_id) VALUES (?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        for (Guild ally : allies) {
            stmt.setString(1, guild.getGuildId().toString());
            stmt.setString(2, ally.getGuildId().toString());
            stmt.executeUpdate();
        }
        stmt.close();
    }

    public MySQL getSql() {
        return sql;
    }

    public void close() throws SQLException {
        this.conn.close();
    }

    public Connection getConn() {
        return conn;
    }
}

