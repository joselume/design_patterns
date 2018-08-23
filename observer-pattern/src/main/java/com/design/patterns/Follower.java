package com.design.patterns;

public class Follower implements Observer {

	private String followerName;
	
	private String status;
	
	public Follower(String followerName) {
		this.followerName = followerName;
	}		
	
	public String getFollowerName() {
		return followerName;
	}

	public void update(String status) {
		// Updates its status variable with the publisher status
		this.status = status;		
	}
	
	public void play() {
		System.out.println("Playing with the publisher status: " + this.status);
	}

}
