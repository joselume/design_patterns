package com.designpatterns.compositepattern;

public class Song implements IComponent {

	private String name;
	private String artist;
	private float speed;
	
	public Song (String name, String artist)
	{
		this.name = name;
		this.artist = artist;
	}	
	public void play() {
		System.out.println("play() - "+"Song: "+this.name);		
	}
	public void setPlaybackSpeed(float speed) {
		System.out.println("setPlaybackSpeed("+speed+") - Song: "+this.name);
		this.speed = speed;		
	}
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}	
	public String getArtist()
	{
		return this.artist;
	}
}
