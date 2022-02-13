package com.jainsaab.emailsender.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SendErrorEmailRequest {
    List<String> to;
    String serviceName;
    ExceptionModel exception;
}