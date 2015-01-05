package com.kelvin.lists;

import java.util.ArrayList;
import java.util.List;

public class Station implements IStation {
	private String name;
	private String line;
	private List<IStation> links = new ArrayList<IStation>();
	

	public Station(String name) {
		this.name = name;
	}

	public String getLines() {
		return this.line;
	}

	public void addLink(IStation station) {
		this.links.add(station);
	}
	
	public void addLinks(IStation... stations) {
		for (IStation station:stations){
			this.links.add(station);
		}
	}

	public List<IStation> getLinks() {
		return this.links;
	}

	public int getNumberOfLinks() {
		return this.links.size();
	}

}
