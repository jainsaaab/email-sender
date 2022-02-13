package com.jainsaab.emailsender.model;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.ToString;
import lombok.Setter;

@Getter
@Setter
@ToString(exclude = "stacktrace")
public class ExceptionModel {	
	private LocalDateTime timestamp;
	private String errorMessage;
	private String corelationId;
	private String externalReferenceId;
	private String priority = "P4";
	private String stacktrace;
}
