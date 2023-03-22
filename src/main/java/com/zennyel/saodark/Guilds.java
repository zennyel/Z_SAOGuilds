package com.zennyel.saodark;

import com.zennyel.saodark.config.MessagesFileManager;
import com.zennyel.saodark.database.GuildDAO;
import com.zennyel.saodark.database.GuildManager;
import com.zennyel.saodark.database.MySQL;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class Guilds extends JavaPlugin {

    private Logger logger = this.getLogger();
    private MySQL sql = new MySQL(this.getConfig());
    private GuildDAO guildDAO = new GuildDAO(sql);
    private GuildManager manager = new GuildManager(guildDAO);
    private MessagesFileManager fileManager = new MessagesFileManager();

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

    }
    public MessagesFileManager getFileManager() {
        return fileManager;
    }

    public void setFileManager(MessagesFileManager fileManager) {
        this.fileManager = fileManager;
    }

    public MySQL getSql() {
        return sql;
    }

    public GuildDAO getGuildDAO() {
        return guildDAO;
    }

    public GuildManager getManager() {
        return manager;
    }
}
