package com.envyus.ironnetwork.Listeners;

import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;

public class PlayerBedLeave implements Listener {
    @EventHandler
    public void onPlayerLeaves(PlayerBedLeaveEvent e){
        Player player = e.getPlayer();
        World world = player.getWorld();
        world.setTime(1000);
        world.setStorm(true);
        Biome biome = player.getWorld().getBiome(player.getLocation());

        if (biome == Biome.PLAINS){
            player.setHealth(0);
            player.sendMessage("Dormiu no bioma errado e foi de arrasta pra cima");
        }else{
            player.setHealth(20);
            player.sendMessage("Dormiu no bioma certo");

        }
    }
}