package com.kelvin.lists;

import java.util.ArrayList;
import java.util.List;

import com.kelvin.init.Edge;

public class Station implements IStation, Comparable<IStation> {

	private final String name;
	private List<Edge> adjacencies = new ArrayList<Edge>();
	private double minDistance = Double.POSITIVE_INFINITY;
	private IStation previous;
	private List<ILine> lines = new ArrayList<ILine>();
	private ILine line;

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

	public void addLines(ILine... lines) {
		for (ILine line : lines) {
			this.lines.add(line);
		}
	}

	public List<ILine> getLines() {
		return this.lines;
	}

	public void setLine(IStation stationTwo) {
		if (this.previous != null) {
			
			List<ILine> stationTwoLines = stationTwo.getLines();
			for (int i = 0; i < this.lines.size(); i++) {
				ILine lineOne = this.lines.get(i);
				if (stationTwoLines.indexOf(lineOne) >= 0) {
					this.line = this.lines.get(i);
				}
			}
		}
	}
	
	public ILine getLine(){
		return this.line;
	}
}
