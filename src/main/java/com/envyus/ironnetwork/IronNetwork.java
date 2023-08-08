package com.envyus.ironnetwork;

import com.envyus.ironnetwork.Listeners.*;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;


import java.util.Objects;

public final class IronNetwork extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new JoinLeaveEvent(), this);
        getServer().getPluginManager().registerEvents(new XpBottleBreak(), this);
        getServer().getPluginManager().registerEvents(new SheepShearEvent(), this);
        getServer().getPluginManager().registerEvents(new BlockBreakEvent(), this);
        getServer().getPluginManager().registerEvents(new PlayerBedLeave(), this);

        getServer().getConsoleSender().sendMessage("§bThe §cIron Network §bPLugin was Enabled!!");

    }
}
