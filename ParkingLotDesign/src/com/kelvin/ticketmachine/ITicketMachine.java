package com.kelvin.ticketmachine;


public interface ITicketMachine {
	ITicket createTicket(int spaceId, TicketType ticketType);
}
