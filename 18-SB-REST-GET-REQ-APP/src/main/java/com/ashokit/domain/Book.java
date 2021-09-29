package com.ashokit.domain;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Book {
	private Integer bookId;
	private String bookName;
	private String authorName;
	private Double bookPrice;
}
