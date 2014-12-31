package com.kelvin.initialise;

import com.kelvin.parkinglot.IParkingLot;

public interface IParkingLotFactory {
	IParkingLot newInstance(int carSpaces, int motorbikeSpaces, int bicycleSpaces);
}
