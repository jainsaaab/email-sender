package com.jainsaab.emailsender.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jainsaab.emailsender.model.SendErrorEmailRequest;
import com.jainsaab.emailsender.service.SendEmailService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequiredArgsConstructor
public class EmailSenderController {
	private final SendEmailService sendEmailService;
	
	@PostMapping("/sendErrorEmail")
    public void sendErrorEmail(@RequestBody SendErrorEmailRequest request) {
        log.debug("Start sendEmail, request body :: {}", request);

        sendEmailService.sendErrorEmail(request);
        
        log.debug("mail sent");
    }
}