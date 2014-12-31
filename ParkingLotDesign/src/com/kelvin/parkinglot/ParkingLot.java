package com.kelvin.parkinglot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
	private List<IParkingSpace> spaces;
	

	public ParkingLot() {
		this.spaces = new ArrayList<IParkingSpace>();
	}
	
	public int getNumberOfSpaces(){
		return this.spaces.size();
	}
	
	public List<IParkingSpace> addParkingSpace(IParkingSpace space){
		spaces.add(space);
		return spaces;
	}
	
}
