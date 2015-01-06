package com.kelvin.init;

import com.kelvin.lists.IStation;

public class Edge implements IEdge{

	private final IStation target;
	private final double weight;

	public Edge(IStation argTarget, double argWeight) {
		this.target = argTarget;
		this.weight = argWeight;
	}

	public IStation getStation() {
		return this.target;
	}
	
	public double getWeight() {
		return this.weight;
	}

}
