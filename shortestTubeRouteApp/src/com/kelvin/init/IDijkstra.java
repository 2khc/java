package com.kelvin.init;

import java.util.List;

import com.kelvin.lists.ILine;
import com.kelvin.lists.IStation;

public interface IDijkstra {
	void computePaths(IStation source);

	List<IStation> getShortestPathTo(IStation target);

	List<ILine> getLinePath();
}
