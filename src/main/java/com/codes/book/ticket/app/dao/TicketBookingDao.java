package com.codes.book.ticket.app.dao;

import com.codes.book.ticket.app.entities.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketBookingDao extends CrudRepository<Ticket, Integer>{
	Ticket findByEmail(String email);
}
