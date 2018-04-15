package nl.lucemans.NovaMachines;

import nl.lucemans.NovaItems.NItem;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.plugin.java.JavaPlugin;

/*
 * Created by Lucemans at 15/04/2018
 * See https://lucemans.nl
 */
public class NovaMachines extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("item") || label.equalsIgnoreCase("/item"))
        {
            Player p = (Player) sender;
            p.getInventory().addItem(NItem.create(Material.GOLD_AXE).setName("&c&lBleeding &6&lAxe").make());
            p.getInventory().addItem(NItem.create(Material.BREWING_STAND_ITEM).setName("&6&lBier &cTap").setDescription("Doet dingen", "&rEn andere dingen").setEnchantment(Enchantment.DAMAGE_ALL, 10).make());
            return true;
        }
        return false;
    }
}
