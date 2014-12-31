package com.kelvin.parkinglot.vehiclespace;

public abstract class ParkingSpace implements IParkingSpace {
	protected boolean isOccupied;

	public ParkingSpace() {
		this.isOccupied = false;
	}
}
