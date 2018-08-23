package com.design.patterns;

import java.util.ArrayList;
import java.util.List;

public class Program {
	
	public static void main (String [] argrs) {
	
		List<Follower> followers = new ArrayList<Follower>();
		followers.add(new Follower("Mother"));
		followers.add(new Follower("Father"));
		followers.add(new Follower("Daughter"));
		followers.add(new Follower("Son"));
										
		Channel channel = new Channel("MTV Channel");
		for(Follower follower : followers) {
			channel.registerObserver(follower);
		}
		channel.setStatus("First status");
		
		for(Follower follower : followers) {
			follower.play();
		}
		
		channel.setStatus("Second status");
		System.out.println();
		for(Follower follower : followers) {
			follower.play();
		}
	}
}
