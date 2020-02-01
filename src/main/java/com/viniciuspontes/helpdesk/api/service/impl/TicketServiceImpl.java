package com.viniciuspontes.helpdesk.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.viniciuspontes.helpdesk.api.entity.ChangeStatus;
import com.viniciuspontes.helpdesk.api.entity.Ticket;
import com.viniciuspontes.helpdesk.api.repository.ChangeStatusRepository;
import com.viniciuspontes.helpdesk.api.repository.TicketRepository;
import com.viniciuspontes.helpdesk.api.service.TicketService;

@Service
public class TicketServiceImpl implements TicketService{
	
	@Autowired
	private TicketRepository ticketRepository;
	
	@Autowired
	private ChangeStatusRepository changeStatusRepository;

	@Override
	public Ticket createOrUpdate(Ticket ticket) {
		return this.ticketRepository.save(ticket);
	}

	@Override
	public Ticket findById(String id) {
		return this.ticketRepository.findOne(id);
	}

	@Override
	public void delete(String id) {
		this.ticketRepository.delete(id);
		
	}

	@Override
	public Page<Ticket> listTicket(int page, int count) {
		Pageable pages = new PageRequest(page, count);
		return this.ticketRepository.findAll(pages);
	}

	@Override
	public ChangeStatus createChangeStatus(ChangeStatus changeStatus) {
		return this.changeStatusRepository.save(changeStatus);
	}

	@Override
	public Iterable<ChangeStatus> listChangeStatus(String ticketId) {
		return this.changeStatusRepository.findByTicketIdOrderByDateChangeStatusDesc(ticketId);
	}

	@Override
	public Page<Ticket> findByCurrentUser(int page, int count, String userId) {
		Pageable pages = new PageRequest(page, count);
		return this.ticketRepository.findByUserIdOrderByDateDesc(pages, userId);
	}

	@Override
	public Page<Ticket> findByParameters(int page, int count, String titulo, String status, String prioridade) {
		Pageable pages = new PageRequest(page, count);
		return this.ticketRepository.findByTituloIgnoreCaseContainingAndStatusContainingAndPrioridadeContainingOrderByDateDesc(titulo, status, prioridade, pages);
	}

	@Override
	public Page<Ticket> findByParametersAndCurrentUser(int page, int count, String titulo, String status,
			String prioridade, String userId) {
		Pageable pages = new PageRequest(page, count);
		return this.
				ticketRepository.
				findByTituloIgnoreCaseContainingAndStatusContainingAndPrioridadeContainingAndUserIdOrderByDateDesc(titulo, status, prioridade, userId, pages);
	}

	@Override
	public Page<Ticket> findByNumber(int page, int count, Integer number) {
		Pageable pages = new PageRequest(page, count);
		return this.ticketRepository.findByNumber(number, pages);
	}

	@Override
	public Iterable<Ticket> findAll() {
		return this.ticketRepository.findAll();
	}

	@Override
	public Page<Ticket> findByParameterAndAssignedUser(int page, int count, String titulo, String status,
			String prioridade, String assignedUser) {
		Pageable pages = new PageRequest(page, count);
		return this.ticketRepository.findByTituloIgnoreCaseContainingAndStatusContainingAndPrioridadeContainingAndAssignedUserIdOrderByDateDesc(titulo, status, prioridade, assignedUser, pages);
	}

}
