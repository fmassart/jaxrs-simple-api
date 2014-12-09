package org.fma.tests.jaxrs.services;

import java.io.InputStream;

/**
 * Created by Fred on 22/11/2014.
 */
@Path("/customers")
public interface CustomerResource {

    @POST
    @Consumes("application/xml")
    public Response createCustomer(InputStream is);

    @GET
    @Path("{id}")
    @Produces("application/xml")
    public StreamingOutput getCustomer(@PathParam("id") int id);

    @PUT
    @Path("{id}")
    @Consumes("application/xml")
    public void updateCustomer(@PathParam("id") int id, InputStream is);
}
