package com.envyus.ironnetwork;

import com.envyus.ironnetwork.Listeners.*;
import com.envyus.ironnetwork.commands.FeedCommand;
import com.envyus.ironnetwork.commands.FlyCommand;
import com.envyus.ironnetwork.commands.GodCommand;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;



public final class IronNetwork extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new JoinLeaveEvent(), this);
        getServer().getPluginManager().registerEvents(new XpBottleBreak(), this);
        getServer().getPluginManager().registerEvents(new SheepShearEvent(), this);
        getServer().getPluginManager().registerEvents(new BlockBreakEvent(), this);
        getServer().getPluginManager().registerEvents(new PlayerBedLeave(), this);
        getCommand("god").setExecutor(new GodCommand());
        getCommand("feed").setExecutor(new FeedCommand());
        getCommand("fly").setExecutor(new FlyCommand());

        getServer().getConsoleSender().sendMessage(ChatColor.AQUA+ "The" +ChatColor.DARK_GRAY+" Iron Network" + ChatColor.AQUA+ " Plugin was Enabled!!");

    }


    }

