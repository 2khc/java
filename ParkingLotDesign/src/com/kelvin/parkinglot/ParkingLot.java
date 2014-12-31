package com.kelvin.parkinglot;

import java.util.ArrayList;
import java.util.List;

import com.kelvin.parkinglot.vehiclespace.BicycleSpace;
import com.kelvin.parkinglot.vehiclespace.CarSpace;
import com.kelvin.parkinglot.vehiclespace.IParkingSpace;
import com.kelvin.parkinglot.vehiclespace.MotorbikeSpace;

public class ParkingLot implements IParkingLot {
	private List<IParkingSpace> spaces;

	public ParkingLot() {
		this.spaces = new ArrayList<IParkingSpace>();
	}

	public int getNumberOfSpaces() {
		return this.spaces.size();
	}

	public List<IParkingSpace> getParkingLot() {
		return this.spaces;
	}

	public void addParkingSpace(int carSpaces, int motorbikeSpaces, int bicycleSpaces) {
		IParkingSpace space;

		for (int i = 0; i < carSpaces; i++) {
			space = (IParkingSpace) new CarSpace();
			spaces.add(space);
		}

		for (int i = 0; i < motorbikeSpaces; i++) {
			space = (IParkingSpace) new MotorbikeSpace();
			spaces.add(space);
		}

		for (int i = 0; i < bicycleSpaces; i++) {
			space = (IParkingSpace) new BicycleSpace();
			spaces.add(space);
		}
	}
}
