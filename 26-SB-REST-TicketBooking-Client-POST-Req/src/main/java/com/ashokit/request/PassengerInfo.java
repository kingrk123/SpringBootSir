package com.ashokit.request;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class PassengerInfo {

	private String firstname;
	private String lastname;
	private String from;
	private String to;
	private String journeydate;

}
