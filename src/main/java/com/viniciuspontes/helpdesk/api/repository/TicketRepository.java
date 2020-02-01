package com.viniciuspontes.helpdesk.api.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.viniciuspontes.helpdesk.api.entity.Ticket;

public interface TicketRepository extends MongoRepository<Ticket, String>{
	
	Page<Ticket> findByUserIdOrderByDateDesc(Pageable pages, String userId);
	
	Page<Ticket> findByTituloIgnoreCaseContainingAndStatusContainingAndPrioridadeContainingOrderByDateDesc(
			String titulo, String status, String prioridade, Pageable pages);
	
	Page<Ticket> findByTituloIgnoreCaseContainingAndStatusContainingAndPrioridadeContainingAndUserIdOrderByDateDesc(
			String titulo, String status, String prioridade, String userId, Pageable pages);
	
	Page<Ticket> findByTituloIgnoreCaseContainingAndStatusContainingAndPrioridadeContainingAndAssignedUserIdOrderByDateDesc(
			String titulo, String status, String prioridade, String userId, Pageable pages);
	
	Page<Ticket> findByNumber(Integer number, Pageable pages);

}
