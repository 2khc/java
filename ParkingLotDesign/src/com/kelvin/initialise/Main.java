package com.kelvin.initialise;

public class Main {
	public static void initialise() {
		IParkingLotFactory parkingLot = new ParkingLotFactory();
		parkingLot.newInstance(70, 20, 10);
	}
}
