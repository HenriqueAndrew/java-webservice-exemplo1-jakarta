/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author alexandrelerario
 */
@Path("prirest")
@RequestScoped
public class PrirestResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of PrirestResource
     */
    public PrirestResource() {
    }

    /**
     * Retrieves representation of an instance of br.PrirestResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getText() {
        //TODO return proper representation object
        //throw new UnsupportedOperationException();
        return "Ola mundo";
    }

    /**
     * PUT method for updating or creating an instance of PrirestResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.TEXT_PLAIN)
    public void putText(String content) {
    }
}
