package com.kelvin.init;

import java.util.List;

import com.kelvin.lists.IStation;

public class LinkFactory {
	public LinkFactory() {

	}

	public void addLinks(List<IStation> picadilly) {
		for (int i = 0; i < picadilly.size(); i++) {
			if (i == 0) {
				picadilly.get(i).addLink(picadilly.get(i + 1));
			} else {
				picadilly.get(i).addLink(picadilly.get(i - 1));
				picadilly.get(i).addLink(picadilly.get(i + 1));
			}
		}
	}
}
