package com.kelvin.parkinglot;

import java.util.List;

import com.kelvin.parkinglot.vehicles.IVehicleSpace;

public interface IParkingLot {
	int getNumberOfSpaces();
	List<IParkingSpace> addParkingSpace(IVehicleSpace vehicle);
}
