package com.kelvin.initialise;

import com.kelvin.parkinglot.IParkingLot;
import com.kelvin.parkinglot.ParkingLot;
import com.kelvin.parkinglot.vehicles.BicycleSpace;
import com.kelvin.parkinglot.vehicles.CarSpace;
import com.kelvin.parkinglot.vehicles.IBicycleSpace;
import com.kelvin.parkinglot.vehicles.ICarSpace;
import com.kelvin.parkinglot.vehicles.IMotorbikeSpace;
import com.kelvin.parkinglot.vehicles.MotorbikeSpace;

public class ParkingLotFactory implements IParkingLotFactory {

	public IParkingLot newInstance(int carSpaces, int motorbikeSpaces, int bicycleSpaces) {
		IParkingLot parkingLot = new ParkingLot();
		ICarSpace carSpace = new CarSpace();
		IMotorbikeSpace motorbikeSpace = new MotorbikeSpace();
		IBicycleSpace bicycleSpace = new BicycleSpace();

		for (int i = 0; i < carSpaces; i++) {
			parkingLot.addParkingSpace(carSpace);
		}

		for (int i = 0; i < motorbikeSpaces; i++) {
			parkingLot.addParkingSpace(motorbikeSpace);
		}

		for (int i = 0; i < bicycleSpaces; i++) {
			parkingLot.addParkingSpace(bicycleSpace);
		}

		return parkingLot;
	}
}
