package com.kelvin.initialise;

import com.kelvin.parkinglot.IParkingLot;
import com.kelvin.ticketmachine.ITicketMachine;
import com.kelvin.ticketmachine.TicketMachine;
import com.kelvin.ticketmachine.TicketType;

public class Main {
	public static void main(String[] args) {
		IParkingLotFactory parkingLotFactory = new ParkingLotFactory();
		IParkingLot parkingLot = parkingLotFactory.newInstance(70, 20, 10);

		ITicketMachine ticketMachine = new TicketMachine(1, parkingLot);

		ticketMachine.createTicket(1, TicketType.FOURHOURS);
	}
}
