package nl.lucemans.NovaMachines;

import nl.lucemans.NovaItems.NItem;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

/*
 * Created by MrDis at 14/04/2018
 */
public class NovaMachines extends JavaPlugin {

    @Override
    public void onEnable() {
        super.onEnable();
        NItem.create(Material.GOLD_AXE).make();
    }

    @Override
    public void onDisable() {

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return false;
    }

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event) {

    }
}
