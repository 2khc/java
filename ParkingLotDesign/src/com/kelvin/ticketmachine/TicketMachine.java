package com.kelvin.ticketmachine;

import java.util.Calendar;

public class TicketMachine implements ITicketMachine {
	TicketType ticketType;
	private int ticketMachineId;
	private double totalMoneyInMachine;

	public TicketMachine(int ticketMachineId) {
		this.ticketMachineId = ticketMachineId;
		this.totalMoneyInMachine = 0;
	}

	public double initTicketCost(TicketType ticketType) {
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

	public ITicket createTicket(TicketType ticketType) {
		Calendar cal = getCalendar();
		ITicket ticket = new Ticket(ticketType, cal);
		acceptMoney(ticketType);
		return ticket;
	}

	private void acceptMoney(TicketType ticketType) {
		double ticketCost = initTicketCost(ticketType);
		this.totalMoneyInMachine += ticketCost;
	}

	private Calendar getCalendar() {
		Calendar cal = Calendar.getInstance();

		// SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		// currentTime = sdf.format(cal.getTime());
		return cal;
	}
}
