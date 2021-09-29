package com.ashokit.reponse;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class TicketInfo {
	private Integer ticketId;
	private String ticketStatus;
	private Double ticketPrice;
}
