package com.envyus.ironnetwork.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {

        if(sender instanceof Player p){
            p.sendMessage(ChatColor.BOLD + "" + ChatColor.RED + "FK THAT SHIT");


        }

        return true;
    }
}
