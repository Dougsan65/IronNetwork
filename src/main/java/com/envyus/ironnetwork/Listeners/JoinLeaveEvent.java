package com.envyus.ironnetwork.Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeaveEvent implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
        Player player = e.getPlayer();

        e.setJoinMessage("§b§l"+ player.getDisplayName() + " §c§lJoin the game, what a pleasure.");
    }
    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent e){
        Player player = e.getPlayer();

        e.setQuitMessage("§b§l" + player.getDisplayName() + " §c§lQuits the game, what a coward.");
    }

}
