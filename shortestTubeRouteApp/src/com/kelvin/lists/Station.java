package com.kelvin.lists;

import java.util.List;

public class Station implements IStation {
	private String name;
	private List<String> lines;

	public Station(String name, List<String> line) {
		this.name = name;
		this.lines = line;
	}
}
