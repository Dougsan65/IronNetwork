package com.envyus.ironnetwork.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.Objects;


public class BlockBreakEvent implements Listener {
    @EventHandler
    public void OnPlayerBreak(org.bukkit.event.block.BlockBreakEvent e){
        double PlayerHealth = e.getPlayer().getHealth();
        String PlayerName = Objects.requireNonNull(e.getPlayer().getPlayer()).getName();

        e.getPlayer().giveExpLevels(100);
        if (PlayerHealth == 20)
            System.out.println("O Player " +PlayerName+ " tem " +PlayerHealth+ " de vida.");
        else
            System.out.println("O Player " +PlayerName+ " tem " +PlayerHealth+ " de vida.");

    }
    }


