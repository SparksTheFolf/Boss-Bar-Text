package com.BossBarText.BBTplugin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener{
	
	private Main main;
	
	
//	public JoinListener(Main main2) {
//		// TODO Auto-generated constructor stub
//	}
	
	public JoinListener(Main main) {
		this.main = main;
		
	}

	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		
	//	Player player = e.getPlayer();
		
		main.bossBarWelcome.addPlayer(e.getPlayer());
	//	player.sendMessage("Boss Bar");
		
	}

}
