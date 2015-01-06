package com.kelvin.init;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

import com.kelvin.lists.IStation;

public class Dijkstra implements IDijkstra {

	public static void computePaths(IStation source) {

		source.setMinDistance(0.);
		PriorityQueue<IStation> vertexQueue = new PriorityQueue<IStation>();
		vertexQueue.add(source);

		while (!vertexQueue.isEmpty()) {
			IStation u = vertexQueue.poll();

			// visit each edge exiting u
			List<Edge> adjacencies = u.getAdjacencies();
			for (Edge e : adjacencies) {
				IStation v = e.getStation();
				double weight = e.getWeight();
				double uMinDistance = u.getMinDistance();
				double distanceThroughU = uMinDistance + weight;
				double vMinDistance = v.getMinDistance();
				if (distanceThroughU < vMinDistance) {
					vertexQueue.remove(v);
					vMinDistance = distanceThroughU;
					v.setPrevious(u);
					vertexQueue.add(v);
				}
			}
		}
	}

	public static List<IStation> getShortestPathTo(IStation target) {
		List<IStation> path = new ArrayList<IStation>();

		for (IStation station = target; station != null; station = station.getPrevious()) {
			path.add(station);
		}
		Collections.reverse(path);
		return path;
	}

}
