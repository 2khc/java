package com.kelvin.init;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

import com.kelvin.lists.ILine;
import com.kelvin.lists.IStation;

public class Dijkstra implements IDijkstra {
	private List<ILine> linePath;
	private List<IStation> path;

	public Dijkstra() {

	}

	public void computePaths(IStation source) {

		source.setMinDistance(0.0);
		PriorityQueue<IStation> vertexQueue = new PriorityQueue<IStation>();
		vertexQueue.add(source);

		while (!vertexQueue.isEmpty()) {
			IStation u = vertexQueue.poll();

			// visit each edge exiting u
			List<Edge> adjacencies = u.getAdjacencies();
			for (Edge edge : adjacencies) {
				IStation v = edge.getStation();
				double weight = edge.getWeight();
				double uMinDistance = u.getMinDistance();
				double distanceThroughU = uMinDistance + weight;
				double vMinDistance = v.getMinDistance();
				if (distanceThroughU < vMinDistance) {
					vertexQueue.remove(v);
					v.setMinDistance(distanceThroughU);
					v.setPrevious(u);

					vertexQueue.add(v);
				}
			}
		}
	}

	public List<IStation> getShortestPathTo(IStation target) {
		this.path = new ArrayList<IStation>();
		this.linePath = new ArrayList<ILine>();

		for (IStation station = target; station != null; station = station.getPrevious()) {
			path.add(station);
			// station.setLine(station);
			// linePath.add(station.getLine());

		}
		Collections.reverse(path);
		// Collections.reverse(linePath);
		// System.out.println(linePath);
		return path;
	}

	public List<ILine> getLinePath() {
		IStation stationOne;
		IStation stationTwo;

		for (int i = 1; i < this.path.size(); i++) {
			if (this.path.get(i - 1) != null) {
				stationOne = this.path.get(i - 1);
				stationTwo = this.path.get(i);
				stationOne.setLine(stationTwo);
				this.linePath.add(stationOne.getLine());
			}
		}
		return this.linePath;
	}

}
