package com.kelvin.parkinglot;

import java.time.LocalTime;

public abstract class ParkingSpace implements IParkingSpace {
	protected String vehicle;
	protected boolean isOccupied;
	protected LocalTime leaseEnds;

	public ParkingSpace() {

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
