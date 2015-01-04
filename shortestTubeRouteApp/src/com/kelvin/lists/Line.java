package com.kelvin.lists;

import java.util.LinkedList;
import java.util.List;

public class Line implements ILine {
	private String name;
	private List<IStation> stations;

	public Line(String name) {
		this.name = name;
		this.stations = new LinkedList<IStation>();
	}

	public List<IStation> addStation(IStation station) {
		this.stations.add(station);

		return this.stations;
	}

	public List<IStation> getList(ILine list) {
		return this.stations;
	}
}
