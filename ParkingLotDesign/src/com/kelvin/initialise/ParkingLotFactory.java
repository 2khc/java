package com.kelvin.initialise;

import java.util.ArrayList;
import java.util.List;

import com.kelvin.parkinglot.IParkingLot;
import com.kelvin.parkinglot.vehiclespace.BicycleSpace;
import com.kelvin.parkinglot.vehiclespace.CarSpace;
import com.kelvin.parkinglot.vehiclespace.IParkingSpace;
import com.kelvin.parkinglot.vehiclespace.MotorbikeSpace;
import com.kelvin.parkinglot.vehiclespace.ParkingSpace;

public class ParkingLotFactory implements IParkingLotFactory {

	public IParkingLot newInstance(int carSpaces, int motorbikeSpaces, int bicycleSpaces) {
		List<IParkingSpace> parkingLot = new ArrayList<ParkingSpace>();
		IParkingSpace space;
		List<IParkingSpace> spaces = new ArrayList<IParkingSpace>();

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

		return parkingLot;
	}
}
