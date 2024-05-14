package controller;

import dto.IssueTicketRequestDTO;
import dto.IssueTicketResponseDTO;
import dto.ResponseStatus;
import exception.InvalidRequestDataException;
import models.Ticket;
import service.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }
    public IssueTicketResponseDTO getTicket(IssueTicketRequestDTO issueTicketRequestDTO) {
        IssueTicketResponseDTO issueTicketResponseDTO = new IssueTicketResponseDTO();
        Ticket ticket;
        try {
            if (issueTicketRequestDTO.getGateId() == 0 ||
            issueTicketRequestDTO.getVehicleType() == null ||
            issueTicketRequestDTO.getVehicleNumber() == null) {
                throw new InvalidRequestDataException("Ticket generation data is invalid");
            }
            ticket = ticketService.getTicket(issueTicketRequestDTO.getVehicleType(),
                    issueTicketRequestDTO.getVehicleNumber(),
                    issueTicketRequestDTO.getVehicleColor(),
                    issueTicketRequestDTO.getVehicleMake(),
                    issueTicketRequestDTO.getGateId());
        } catch (Exception e) {
            issueTicketResponseDTO.setResponseStatus(ResponseStatus.FAILURE);
            issueTicketResponseDTO.setFailureReason(e.getMessage());
        }
        return issueTicketResponseDTO;
    }
}
