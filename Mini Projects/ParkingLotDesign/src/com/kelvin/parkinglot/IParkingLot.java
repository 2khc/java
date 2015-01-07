package com.kelvin.parkinglot;

import java.util.List;

import com.kelvin.parkinglot.vehiclespace.IParkingSpace;

public interface IParkingLot {
	int getNumberOfSpaces();

	List<IParkingSpace> getParkingLot();

	void addParkingSpace(int carSpaces, int motorbikeSpaces, int bicycleSpaces);

	IParkingSpace getParkingSpace(int spaceId);
}
