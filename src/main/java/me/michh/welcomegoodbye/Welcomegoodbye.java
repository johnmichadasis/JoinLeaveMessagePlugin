package me.michh.welcomegoodbye;

import org.bukkit.plugin.java.JavaPlugin;

public final class Welcomegoodbye extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new JoinLeaveListener(), this);
        // Plugin startup logic

    }

}
