package com.java.ArrayList;

public class Cricket {

	String team_Name;
	private int numberOf_Matches;
	int NumberOf_Players;
	
	public Cricket(String name,int matches,int players){
		team_Name=name;
		numberOf_Matches=matches;
		NumberOf_Players=players;
		
		
	}
	
	// Gettters and Setters
	
	
	void setNumberOf_Matches(int noOfMatches){
		
		if(noOfMatches<=0){
			System.out.println("Please Enter the Positive Number which is greater than 0");
		}
		else{
			numberOf_Matches=noOfMatches;
		}
		
		
		
	}
	
	int getNumberOf_Matches(){
		return numberOf_Matches;
		
	}
	private String performance(){
		// Depends upon the last 10 matches Performance we will be deciding the Openers
				return "sachin"+"  sehwag";
		
	}
	
	public String openers(){
		String open=performance();
		return open;
		
	}
	
	
	void boundary(){
		System.out.println(" four runs");
	}
	void wicket(){
		System.out.println(" out");
	}
	
	public static void main(String[] args) {
		
		Cricket ct= new Cricket("india", 01, 11);
		
	}

}
