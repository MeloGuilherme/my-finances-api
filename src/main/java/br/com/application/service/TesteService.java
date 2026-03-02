package br.com.application.service;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TesteService {

    public String testEndpoint() {
        return "Testando commit...";
    }
}
