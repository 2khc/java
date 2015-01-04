package com.kelvin.init;

import java.util.ArrayList;
import java.util.List;

import com.kelvin.lists.ILine;
import com.kelvin.lists.IStation;
import com.kelvin.lists.Line;
import com.kelvin.lists.Station;

public class TubeFactory {
	private ILine picadilly;
	private ILine victoria;
	private ILine northen;
	private ILine bakerloo;
	private ILine central;
	private ILine circle;
	private ILine district;
	private ILine hammersmithAndCity;
	private ILine jubilee;
	private ILine metropolitan;
	private ILine waterlooAndCity;

	public TubeFactory() {

	}

	public ILine newInstance() {
		IStation station;
		this.picadilly = new Line("picadilly");

	}

	private void createStations() {
		IStation station;
		List<String> lines = new ArrayList<String>();
		lines.add("picadilly");
		station = new Station("Cockfosters", lines);
	}
}
