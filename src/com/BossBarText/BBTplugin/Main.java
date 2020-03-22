package com.BossBarText.BBTplugin;

import org.bukkit.Bukkit;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin{
	
 BossBar bossBarWelcome;
	
	@Override
	public void onEnable() {
		
		Bukkit.getPluginManager().registerEvents(new JoinListener(this), this);
		System.out.println("BossBarText ENABLED");
		
		bossBarWelcome = Bukkit.createBossBar(
				ChatColor.DARK_RED + "" + ChatColor.MAGIC + " " + ChatColor.GOLD + "Welcome" + " to the Best Testing Server Ever" + ChatColor.DARK_RED + ChatColor.MAGIC + " " , 
				BarColor.GREEN, 
				BarStyle.SOLID);	
		

	}
	
	@Override
	public void onDisable() {
		System.out.println("BossBarText DISABLED");
	}


}
