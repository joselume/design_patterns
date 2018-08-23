package com.design.patterns;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
	
	private List<Observer> observers = new ArrayList<Observer>();
	private String channelName;
	private String status;
	
	public Channel (String channelName) {
		this.channelName = channelName;		
	}
	
	public void registerObserver(Observer observer) {		
		this.observers.add(observer);
	}
	
	public void removeObserver(Observer observer) {
		this.observers.remove(observer);
	}
	
	public void notifyObservers() {
		for(Observer observer : this.observers) {
			observer.update(this.status);
		}
	}

	public String getChannelName() {
		return channelName;
	}	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
		notifyObservers();
	}	
}
