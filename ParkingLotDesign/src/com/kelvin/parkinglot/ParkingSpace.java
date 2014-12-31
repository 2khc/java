package com.kelvin.parkinglot;

import com.kelvin.parkinglot.vehicles.IVehicleSpace;

public class ParkingSpace implements IParkingSpace {
	protected IVehicleSpace vehicle;
	protected boolean isOccupied;

	public ParkingSpace(IVehicleSpace vehicle) {
//		switch (vehicle) {
//		case("car"):
//			car = 
//		}
		this.vehicle = vehicle;
		this.isOccupied = false;
	}

	protected boolean occupyParkingSpace() {
		this.isOccupied = true;
		return this.isOccupied;
	}

	protected boolean unoccupyParkingSpace() {
		this.isOccupied = false;
		return this.isOccupied;
	}
}
