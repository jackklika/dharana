package com.kilobeast.dharana

import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender

class Dharana : JavaPlugin() {

    override fun onEnable() {
        logger.info("§a[Dharana] Plugin is enabled!")

        // Register the command
        getCommand("chezfly")?.setExecutor { sender, _, _, _ ->
            val player = server.getPlayer("chezhead")
            if (player != null) {
                player.allowFlight = true
                sender.sendMessage("§aEnabled flight for chezhead")
            } else {
                sender.sendMessage("§cchezhead is not online!")
            }
            true
        }
    }

    override fun onDisable() {
        logger.info("§c[Dharana] Plugin is disabled!")
    }
}