package com.kelvin.initialise;

import com.kelvin.parkinglot.IParkingLot;
import com.kelvin.parkinglot.ParkingLot;
import com.kelvin.parkinglot.vehiclespace.BicycleSpace;
import com.kelvin.parkinglot.vehiclespace.CarSpace;
import com.kelvin.parkinglot.vehiclespace.IBicycleSpace;
import com.kelvin.parkinglot.vehiclespace.ICarSpace;
import com.kelvin.parkinglot.vehiclespace.IMotorbikeSpace;
import com.kelvin.parkinglot.vehiclespace.MotorbikeSpace;

public class ParkingLotFactory implements IParkingLotFactory {

	public IParkingLot newInstance(int carSpaces, int motorbikeSpaces, int bicycleSpaces) {
		IParkingLot parkingLot = new ParkingLot();
		ICarSpace carSpace = new CarSpace();
		IMotorbikeSpace motorbikeSpace = new MotorbikeSpace();
		IBicycleSpace bicycleSpace = new BicycleSpace();

		

		return parkingLot;
	}
}
