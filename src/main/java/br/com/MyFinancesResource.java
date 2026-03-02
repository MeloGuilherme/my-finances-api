package br.com;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
@Path("/")
public class MyFinancesResource {

    @GET
    public Response testEndpoint() {
        return Response.ok("Se você ta lendo isso, é porque o projeto ta rodando com sucesso!").build();
    }
}
