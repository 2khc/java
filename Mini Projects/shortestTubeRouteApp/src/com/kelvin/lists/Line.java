package com.kelvin.lists;

public class Line implements ILine {
	private String name;

	public Line(String name) {
		// Objects.requireNonNull(name);
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
