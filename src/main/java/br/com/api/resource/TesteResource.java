package br.com.api.resource;

import br.com.application.service.TesteService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
@Path("/teste")
public class TesteResource {

    @Inject
    TesteService service;

    @GET
    public Response testEndpoint() {
        return Response.ok(service.testEndpoint()).build();
    }
}
