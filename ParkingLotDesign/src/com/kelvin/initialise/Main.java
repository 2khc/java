package com.kelvin.initialise;

import com.kelvin.parkinglot.IParkingLot;
import com.kelvin.ticketmachine.ITicketMachine;
import com.kelvin.ticketmachine.TicketMachine;

public class Main {
	public static void initialise() {
		IParkingLotFactory parkingLotFactory = new ParkingLotFactory();
		IParkingLot parkingLot = parkingLotFactory.newInstance(70, 20, 10);
		
		ITicketMachine ticketMachine = new TicketMachine(1);
	}
}
