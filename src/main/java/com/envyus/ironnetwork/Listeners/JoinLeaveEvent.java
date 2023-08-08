package com.envyus.ironnetwork.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeaveEvent implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){
        e.setJoinMessage(null);

    }
    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent e){
        e.setQuitMessage(null);
    }

}
