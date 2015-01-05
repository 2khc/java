package com.kelvin.init;

public class Main {
	public static void main(String[] args) {
		StationFactory stationFactory = new StationFactory();
		stationFactory.createStations();
		// List<IStation> picadilly = stationFactory.createStations();

		Vertex v0 = new Vertex("Redville");
		Vertex v1 = new Vertex("Blueville");
		Vertex v2 = new Vertex("Greenville");
		Vertex v3 = new Vertex("Orangeville");
		Vertex v4 = new Vertex("Purpleville");

		v0.adjacencies = new Edge[] { new Edge(v1, 5), new Edge(v2, 10), new Edge(v3, 8) };
	}
}
