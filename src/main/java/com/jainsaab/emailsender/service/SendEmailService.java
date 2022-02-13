package com.jainsaab.emailsender.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.jainsaab.emailsender.handler.ContentHandler;
import com.jainsaab.emailsender.model.SendErrorEmailRequest;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SendEmailService {
	private final JavaMailSender mailSender;
	private final ContentHandler contentHandler;
	
	public void sendErrorEmail(final SendErrorEmailRequest request) {
		final SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(request.getTo().toArray(new String[0]));
		message.setSubject(contentHandler.generateErrorMailSubjectLine(request.getServiceName(), request.getException().getPriority(), request.getException().getErrorMessage(), request.getException().getTimestamp()));
		message.setText(contentHandler.generateErrorMailContent(request.getException()));
		mailSender.send(message);
	}
}
