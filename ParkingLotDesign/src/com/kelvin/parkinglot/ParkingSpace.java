package com.kelvin.parkinglot;

import com.kelvin.parkinglot.vehiclespace.IParkingSpace;

public abstract class ParkingSpace implements IParkingSpace {
	protected IParkingSpace vehicle;
	protected boolean isOccupied;

	public ParkingSpace() {
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
