package com.kelvin.parkinglot.vehiclespace;


public abstract class ParkingSpace implements IParkingSpace {
	protected IParkingSpace vehicle;
	protected boolean isOccupied;

	public ParkingSpace() {
		this.isOccupied = false;
	}

	public boolean occupyParkingSpace() {
		this.isOccupied = true;
		return this.isOccupied;
	}

	public boolean unoccupyParkingSpace() {
		this.isOccupied = false;
		return this.isOccupied;
	}
}
