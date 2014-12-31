package com.kelvin.ticketmachine;

import java.util.Calendar;

import com.kelvin.parkinglot.IParkingLot;
import com.kelvin.parkinglot.vehiclespace.IParkingSpace;

public class TicketMachine implements ITicketMachine {
	private IParkingLot parkingLot;
	private int ticketMachineId;
	private double totalMoneyInMachine;
	private IParkingSpace space;

	public TicketMachine(int ticketMachineId, IParkingLot parkingLot) {
		this.ticketMachineId = ticketMachineId;
		this.totalMoneyInMachine = 0;
		this.parkingLot = parkingLot;
	}

	private double initTicketCost(TicketType ticketType) {
		double ticketCost;
		switch (ticketType) {
		case HALFHOUR:
			ticketCost = 0.50;
			return ticketCost;
		case ONEHOUR:
			ticketCost = 1.00;
			return ticketCost;
		case TWOHOURS:
			ticketCost = 1.50;
			return ticketCost;
		case THREEHOURS:
			ticketCost = 2.20;
			return ticketCost;
		case FOURHOURS:
			ticketCost = 3.0;
			return ticketCost;
		case WHOLEDAY:
			ticketCost = 5.00;
			return ticketCost;
		default:
			System.out.println("Something failed");
			return -1;
		}
	}

	public ITicket createTicket(int spaceId, TicketType ticketType) {
		Calendar cal = getCalendar();
		ITicket ticket = new Ticket(ticketType, cal);
		this.acceptMoney(ticketType);
		this.space = parkingLot.getParkingSpace(spaceId);
		return ticket;
	}

	private void acceptMoney(TicketType ticketType) {
		double ticketCost = initTicketCost(ticketType);
		this.totalMoneyInMachine += ticketCost;
	}

	private Calendar getCalendar() {
		Calendar cal = Calendar.getInstance();
		return cal;
	}
}
