package com.envyus.ironnetwork.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FeedCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {

        if (sender instanceof Player p){
            int food = p.getFoodLevel();
            System.out.println(food);
            p.setFoodLevel(20);

        }


        return true;
    }
}
