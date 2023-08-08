package com.envyus.ironnetwork.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ExpBottleEvent;

public class XpBottleBreak implements Listener {
    @EventHandler
    public void XpBottleBreakk(ExpBottleEvent event){
        event.setExperience(10000);
        event.setShowEffect(false);

    }
}