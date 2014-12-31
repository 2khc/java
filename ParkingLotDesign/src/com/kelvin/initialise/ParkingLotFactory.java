package com.kelvin.initialise;

import java.util.List;

import com.kelvin.parkinglot.IParkingLot;
import com.kelvin.parkinglot.ParkingLot;
import com.kelvin.parkinglot.vehiclespace.BicycleSpace;
import com.kelvin.parkinglot.vehiclespace.CarSpace;
import com.kelvin.parkinglot.vehiclespace.IParkingSpace;
import com.kelvin.parkinglot.vehiclespace.MotorbikeSpace;

public class ParkingLotFactory implements IParkingLotFactory {

	public IParkingLot newInstance(int carSpaces, int motorbikeSpaces, int bicycleSpaces) {
		IParkingLot parkingLot = new ParkingLot();
		List<IParkingSpace> spaces = parkingLot.getParkingLot();
		IParkingSpace space;
		
		for (int i = 0; i < carSpaces; i++) {
			space = new CarSpace();
			spaces.add(space);
		}

		for (int i = 0; i < motorbikeSpaces; i++) {
			space = new MotorbikeSpace();
			spaces.add(space);
		}

		for (int i = 0; i < bicycleSpaces; i++) {
			space = new BicycleSpace();
			spaces.add(space);
		}

		return parkingLot;
	}
}
