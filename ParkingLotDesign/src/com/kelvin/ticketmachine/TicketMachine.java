package com.kelvin.ticketmachine;

import java.time.LocalTime;

public class TicketMachine {

	public TicketMachine() {

	}

	public ITicket createTicket(LocalTime created, TicketType ticketType) {
		ITicket ticket = new Ticket(created, ticketType);
		return ticket;
	}
}
