package it.gov.mef.gfa.gateway.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import it.gov.mef.gfa.gateway.GatewayError;

@RestController
public class FallBackMethodController {
	
	@GetMapping("entiServicesFallBack")
	@ResponseStatus(HttpStatus.BAD_GATEWAY)
	private GatewayError entiServicesFallBackMethod() {
		return new GatewayError(HttpStatus.BAD_GATEWAY, "Il servizio sta impiegando più tempo del previsto. Prova più tardi.");
	}

}
