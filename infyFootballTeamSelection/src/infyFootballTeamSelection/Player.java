package infyFootballTeamSelection;

public class Player implements Comparable<Player>{
	
	private String playerName;
	private int noOfGoals;
	private Double average;
	
	
	public Player(String playerName, int noOfGoals, Double average) {
		super();
		this.playerName = playerName;
		this.noOfGoals = noOfGoals;
		this.average = average;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getNoOfGoals() {
		return noOfGoals;
	}
	public void setNoOfGoals(int noOfGoals) {
		this.noOfGoals = noOfGoals;
	}

	public Double getAverage() {
		return average;
	}

	public void setAverage(Double average) {
		this.average = average;
	}

	@Override
	public String toString() {
		return this.playerName;
	}

	@Override
	public int compareTo(Player o) {
		// TODO Auto-generated method stub
		int avg=0;
		
		if(this.noOfGoals==o.noOfGoals)
		{
			if(this.average<o.average)
		    {
		    	avg=1;
		    }
		    else if(this.average>o.average)
		    {
		    	avg=-1;
		    }
		    else
		    {
		    	avg= this.playerName.compareTo(o.getPlayerName());
		    }
		}
		else if (this.noOfGoals<o.noOfGoals) {
		    avg=1;
		}
		else
		{
			avg=-1;
		}
		
		return avg;
	}
	
	
	

}
