package com.kelvin.lists;

import java.util.ArrayList;
import java.util.List;

import com.kelvin.init.Edge;

public class Station implements IStation, Comparable<IStation> {
	// private String name;
	private List<IStation> links = new ArrayList<IStation>();
	private final String name;
	private List<Edge> adjacencies = new ArrayList<Edge>();
	private double minDistance = Double.POSITIVE_INFINITY;
	private IStation previous;

	public Station(String name) {
		this.name = name;
	}

	public void addLinks(double weight, IStation... stations) {
		for (IStation station : stations) {
			Edge edge = new Edge(station, weight);
			this.adjacencies.add(edge);
		}
	}

	@Override
	public String toString() {
		return name;
	}

	public double getMinDistance() {
		return this.minDistance;
	}

	public List<Edge> getAdjacencies() {
		return this.adjacencies;
	}

	public IStation getPrevious() {
		return this.previous;
	}
	
	public void setPrevious(IStation station) {
		this.previous = station;
	}

	public void setMinDistance(double minDistance) {
		this.minDistance = minDistance;
	}

	public int compareTo(IStation station) {
		double stationMinDistance = getMinDistance();
		return Double.compare(minDistance, stationMinDistance);
	}

}
