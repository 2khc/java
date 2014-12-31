package com.kelvin.parkinglot;

public interface IParkingLot {
	int getNumberOfSpaces();

	void addParkingSpace(int carSpaces, int motorbikeSpaces, int bicycleSpaces);
}
