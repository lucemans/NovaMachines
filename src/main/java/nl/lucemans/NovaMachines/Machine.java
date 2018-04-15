package nl.lucemans.NovaMachines;

import org.bukkit.event.Event;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;

/*
 * Created by Lucemans at 15/04/2018
 * See https://lucemans.nl
 */
public interface Machine {

    public String type = "";

    public void interact(PlayerInteractEvent event);

    public void place(BlockPlaceEvent event);

    public void destroy(BlockBreakEvent event);

    public void tick();

    public String getDefaultData();

    public void onEvent(Event event);

    public boolean isMachine();

}
