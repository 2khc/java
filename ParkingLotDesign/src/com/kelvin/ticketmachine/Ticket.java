package com.kelvin.ticketmachine;

import java.time.LocalTime;

public class Ticket implements ITicket {
	TicketType ticketType;
	private LocalTime ticketTime;

	protected LocalTime created;
	protected LocalTime expires;


	public Ticket(LocalTime created, TicketType ticketType) {
		this.created = created;
		this.expires = initTicketTime(ticketType);
	}

	private LocalTime initTicketTime(TicketType ticketType) {
		switch (ticketType) {
		case HALFHOUR:
			ticketTime = ticketTime.plusMinutes(30);
			return ticketTime;
		case ONEHOUR:
			ticketTime = ticketTime.plusHours(1);
			return ticketTime;
		case TWOHOURS:
			ticketTime = ticketTime.plusHours(2);
			return ticketTime;
		case THREEHOURS:
			ticketTime = ticketTime.plusHours(3);
			return ticketTime;
		case FOURHOURS:
			ticketTime = ticketTime.plusHours(4);
			return ticketTime;
		case WHOLEDAY:
			ticketTime = ticketTime.plusHours(24);
			return ticketTime;
		default:
			System.out.println("Something failed");
			return ticketTime;
		}
	}

	
}
