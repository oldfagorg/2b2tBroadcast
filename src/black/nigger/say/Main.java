package black.nigger.say;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;

public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] arguments)
    {
        if ((label.equalsIgnoreCase("say")) && ((sender.isOp()))) {
            String sentence = Arrays.toString(arguments);
            getServer().broadcastMessage(ChatColor.YELLOW + "[SERVER] " + sentence.replace(",", "").replace("[", "").replace("]", ""));
        }
        return false;
    }

}