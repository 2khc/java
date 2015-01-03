package com.kelvin.main;

import java.util.List;

public interface IMyHashTable<K, E> {
	void addValue(K key, E value);

	List<E> getValue(K key);
}
