package com.envyus.ironnetwork.Listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeaveEvent implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
        Player player = e.getPlayer();

        e.setJoinMessage(ChatColor.YELLOW + "" + ChatColor.BOLD +  player.getDisplayName() + ChatColor.RED + " Joins the game, what a pleasure.");
    }
    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent e){
        Player player = e.getPlayer();

        e.setQuitMessage(ChatColor.YELLOW + "" + ChatColor.BOLD +  player.getDisplayName() + ChatColor.RED + " Quits the game, what a coward.");
    }

}