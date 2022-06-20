package me.michh.welcomegoodbye;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeaveListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {

        Player player = e.getPlayer();

        if(player.hasPlayedBefore()){
            e.setJoinMessage(ChatColor.GREEN + "Welcome back to the server " + ChatColor.YELLOW + "" + ChatColor.BOLD + player.getDisplayName() + ChatColor.GREEN + "! We missed you.");
        }else {
            e.setJoinMessage(ChatColor.GREEN + "Welcome to the server " + ChatColor.BOLD + "" + ChatColor.BLUE + player.getDisplayName() + "" + ChatColor.GREEN + ", Hope you enjoy your stay!");
        }

    }


    @EventHandler
    public void onLeave(PlayerQuitEvent e){

        Player player = e.getPlayer();

        e.setQuitMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + player.getDisplayName() + ChatColor.RED +" has left, let's hope they come back.");

    }

}
