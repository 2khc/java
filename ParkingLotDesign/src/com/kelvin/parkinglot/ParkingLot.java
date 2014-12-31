package com.kelvin.parkinglot;

import java.util.ArrayList;
import java.util.List;

import com.kelvin.parkinglot.vehicles.IVehicleSpace;

public class ParkingLot implements IParkingLot {
	private List<IParkingSpace> spaces;
	

	public ParkingLot() {
		this.spaces = new ArrayList<IParkingSpace>();
	}
	
	public int getNumberOfSpaces(){
		return this.spaces.size();
	}
	
	public List<IParkingSpace> addParkingSpace(IVehicleSpace vehicle){
		IParkingSpace space = new ParkingSpace(vehicle);
		spaces.add(space);
		return spaces;
	}
	
}
