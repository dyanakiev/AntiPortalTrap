package net.minelink.antiportaltrap;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiPortalTrap extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void teleportToSpawn(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        Location loc = player.getLocation();

        if (loc.getBlock().getType() == Material.PORTAL) {
            player.teleport(loc.getWorld().getSpawnLocation());
        }
    }

}
