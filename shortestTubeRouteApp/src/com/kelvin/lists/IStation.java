package com.kelvin.lists;

public interface IStation {
	String getLines();

	void addLink(IStation station);

	void addLinks(IStation... stations);
}
