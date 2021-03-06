package com.datastax.user.interactions.model;

import java.util.Date;
import java.util.UUID;

import com.datastax.driver.mapping.annotations.Column;
import com.datastax.driver.mapping.annotations.Table;

import com.datastax.driver.mapping.annotations.ClusteringColumn;
import com.datastax.driver.mapping.annotations.PartitionKey;

@Table(keyspace="datastax_demo", name="user_interaction")
public class UserInteraction {

	@PartitionKey
	private String userid;
	@ClusteringColumn
	private String correlationid;
	private String clientid;
	
	
	@Column(name="date")
	private Date dateTime;
	private String details;
	private String event_type;
	private String user_agent;;
	private String user_agent_filterd;
	private UUID id;
	private String reference;
	
	public UserInteraction(){
		
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getClientid() {
		return clientid;
	}

	public void setClientid(String clientid) {
		this.clientid = clientid;
	}

	public String getCorrelationid() {
		return correlationid;
	}

	public void setCorrelationid(String correlationid) {
		this.correlationid = correlationid;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getEvent_type() {
		return event_type;
	}

	public void setEvent_type(String event_type) {
		this.event_type = event_type;
	}

	public String getUser_agent() {
		return user_agent;
	}

	public void setUser_agent(String user_agent) {
		this.user_agent = user_agent;
	}

	public String getUser_agent_filterd() {
		return user_agent_filterd;
	}

	public void setUser_agent_filterd(String user_agent_filterd) {
		this.user_agent_filterd = user_agent_filterd;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}	
}
