package com.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "RESOURCE_DTLS")
@Data
public class ResourceDtls {

	@Id
	//@SequenceGenerator(name="abc",sequenceName="resource_id_seq", allocationSize=1)
	//@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="abc")
	//@GeneratedValue(strategy=GenerationType.TABLE)
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@GeneratedValue
	@Column(name = "RESOURCE_ID")
	private Integer resourceId;

	@Column(name = "RESOURCE_NAME")
	private String resourceName;

	@Column(name = "RESOURCE_SKILL")
	private String resourceSkill;

	@Column(name = "RESOURCE_EXP")
	private String resourceExp;

}
