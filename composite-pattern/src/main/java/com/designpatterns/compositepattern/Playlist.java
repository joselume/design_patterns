package com.designpatterns.compositepattern;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements IComponent {

	private String name;
	private List<IComponent> playLists;
		
	public Playlist (String name_)
	{
		this.playLists = new ArrayList<IComponent>();
		this.name = name_;
	}	
	public void add(IComponent component) {
		playLists.add(component);
	}	
	public void remove(IComponent component)
	{
		playLists.remove(component);
	}	
	public void play() {
		for (IComponent component : playLists)
		{
			component.play();
		}							
	}	
	public void setPlaybackSpeed(float speed) {
		for (IComponent component : playLists)
		{
			component.setPlaybackSpeed(speed);
		}							
	}
	public String getName() {
		System.out.println("Playlist. getName()");
		return name;
	}
}
