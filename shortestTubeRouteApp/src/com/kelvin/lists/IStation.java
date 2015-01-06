package com.kelvin.lists;

import java.util.List;

import com.kelvin.init.Edge;

public interface IStation {
	IStation getPrevious();

	double getMinDistance();

	List<Edge> getAdjacencies();

	void setMinDistance(double minDistance);

	void addLinks(double weight, IStation... stations);

	void setPrevious(IStation station);
}
