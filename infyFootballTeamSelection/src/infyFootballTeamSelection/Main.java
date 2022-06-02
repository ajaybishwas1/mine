package infyFootballTeamSelection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int noOfPlayers = scan.nextInt();
		
		Map<Integer, Player> playerMap = new HashMap<>();
		for(int i=1;i<= noOfPlayers; i++) {
			Player player = new Player(scan.next(), scan.nextInt(), scan.nextDouble());
			playerMap.put(i, player);
		}
		scan.close();
		Map<Player, Integer> treeMapOfPlayers = Main.getMapOfSelectedPlayers(playerMap);
		System.out.println(treeMapOfPlayers);
		
		
	}
	
	
//	implemented this method
	public static TreeMap<Player, Integer> getMapOfSelectedPlayers(Map<Integer, Player> playerMap){
		
		TreeMap<Player, Integer> treeMapOfPlayers = new TreeMap<>();
		int i=1;

		Iterator<Integer> it = playerMap.keySet().iterator();
		while(it.hasNext())
		{
			int key =(int)it.next();
			Player player = new Player(playerMap.get(key).getPlayerName(), playerMap.get(key).getNoOfGoals(), playerMap.get(key).getAverage());
			treeMapOfPlayers.put(player,player.getNoOfGoals());
		}
		
//		map ke jitne bhi objects the unko TreeMap me copy kr rahe hai  -- and -- tree map me automatic sorting ho jaegi on the basis of compareto logic jo humne player class me implement kiya hai
//	    line35- making iterator object ; 
//		line36 - check iterator has next element or not; 
//		line 38 - finding key of next object in map
//		line 39 - copying that object of map to object of player class through key i.e playerMap.get(key)...
//		line 40 - setting the values in tree set with player object
		
		return treeMapOfPlayers;
	}

}
