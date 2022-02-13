package com.jainsaab.emailsender.handler;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import com.jainsaab.emailsender.model.ExceptionModel;

@Component
public class ContentHandler {
	public String generateErrorMailSubjectLine(String serviceName, String priority, String errorMsg, LocalDateTime time) {
		return String.format("Service: %s, priority: %s, errorMessage: %s, timestamp: %s", serviceName, priority, errorMsg, time);
	}
	
	public String generateErrorMailContent(ExceptionModel ex) {
		return ex.getStacktrace();
	}
}
