package com.envyus.ironnetwork.Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;

public class PlayerBedLeave implements Listener {
    @EventHandler
    public void onPlayerLeaves(PlayerBedLeaveEvent e){
        Player player = e.getPlayer();

        player.setHealth(0);
        player.sendMessage("Deitou errado patrão");
    }

}
