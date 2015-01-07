package com.kelvin.ticketmachine;

import java.util.Calendar;
import java.util.Date;

public class Ticket implements ITicket {
	TicketType ticketType;
	private Date ticketTime;

	protected Date created;
	protected Date expires;
	protected double cost;

	public Ticket(TicketType ticketType, Calendar cal) {
		this.created = cal.getTime();
		this.expires = initTicketTime(cal, ticketType);
	}

	private Date initTicketTime(Calendar cal, TicketType ticketType) {

		switch (ticketType) {
		case HALFHOUR:
			cal.add(Calendar.MINUTE, 30);
			ticketTime = cal.getTime();
			return ticketTime;
		case ONEHOUR:
			cal.add(Calendar.HOUR_OF_DAY, 1);
			ticketTime = cal.getTime();
			return ticketTime;
		case TWOHOURS:
			cal.add(Calendar.HOUR_OF_DAY, 2);
			ticketTime = cal.getTime();
			return ticketTime;
		case THREEHOURS:
			cal.add(Calendar.HOUR_OF_DAY, 3);
			ticketTime = cal.getTime();
			return ticketTime;
		case FOURHOURS:
			cal.add(Calendar.HOUR_OF_DAY, 4);
			ticketTime = cal.getTime();
			return ticketTime;
		case WHOLEDAY:
			cal.add(Calendar.HOUR_OF_DAY, 24);
			ticketTime = cal.getTime();
			return ticketTime;
		default:
			System.out.println("Something failed");
			return ticketTime;
		}
	}
}
