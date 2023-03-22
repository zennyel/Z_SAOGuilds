package com.zennyel.saodark.commands;

import com.zennyel.saodark.Guilds;
import com.zennyel.saodark.database.GuildManager;
import com.zennyel.saodark.guild.Guild;
import com.zennyel.saodark.utils.GuildMessages;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GuildCommands implements CommandExecutor {


    Guilds instance = Guilds.getPlugin(Guilds.class);
    GuildManager manager = instance.getManager();
    GuildMessages messages = new GuildMessages(instance.getFileManager());


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)){
            System.out.println("Comando apenas para players");
            return true;
        }
        Player player = (Player) sender;

        if(args.length < 1){
            String message = String.valueOf(new StringBuilder().
                    append("Comando incorreto, use:").
                    append("").
                    append(""));
            player.sendMessage(message);
            return true;
        }

        switch (args[0]){
            case "sethome":

                break;

            case"delhome":

                break;

            case "prefix":

                break;

            case "debandar":

                break;

            case "convidar":

                break;

            case "criar":

                if(args.length < 2){
                    player.sendMessage(messages.getIncorrect_command_usage());
                    return false;
                }

                if(args[2].length() < 3){
                    player.sendMessage(messages.getGuild_name_too_short());
                    return false;
                }

                if(args[2].length() > 20){
                    player.sendMessage(messages.getGuild_name_too_long());
                    return false;
                }

                Guild guild = new Guild(player, args[1]);
                manager.saveGuild(guild);
                player.sendMessage(messages.getGuild_created_successfully());

                break;

            case "entrar":

                break;

            case "sair":

                break;

            case "promover":

                break;
        }


        return false;
    }

}
