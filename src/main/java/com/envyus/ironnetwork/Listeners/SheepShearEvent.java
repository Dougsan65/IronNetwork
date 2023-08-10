package com.envyus.ironnetwork.Listeners;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerShearEntityEvent;

public class SheepShearEvent implements Listener {
    @EventHandler
    public void onPlayerSheer(PlayerShearEntityEvent e){
        Player player = e.getPlayer();
        Entity entity = e.getEntity();

        if(entity.getType() == EntityType.SHEEP){
            player.sendMessage("Não tira o pelo da ovelha po");
            e.setCancelled(true);

        }else {
            player.sendMessage("Pode tirar a vontade, não é uma ovelha mesmo");

        }
    }
}