package com.kelvin.init;

import java.util.ArrayList;
import java.util.List;

import com.kelvin.lists.IStation;

public class Main {
	public static void main(String[] args) {
		List<IStation> paths = new ArrayList<IStation>();
		IStationFactory stationFactory = new StationFactory();

		List<IStation> stations = stationFactory.createStations();
		IDijkstra computer = new Dijkstra();
		IStation startingStation = stations.get(0);
		IStation endingStation = stations.get(10);
		computer.computePaths(startingStation);
		System.out.println("Beginning from station " + startingStation);
		for (int i = 0; i < stations.size(); i++) {
			paths = computer.getShortestPathTo(endingStation);
		}
		System.out.println(paths);
		System.out.println(computer.getLinePath());
	}
}
