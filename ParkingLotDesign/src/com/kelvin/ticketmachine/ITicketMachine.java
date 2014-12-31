package com.kelvin.ticketmachine;

import java.util.Calendar;

public interface ITicketMachine {
	double initTicketCost(TicketType ticketType);
	ITicket createTicket(TicketType ticketType);
}
