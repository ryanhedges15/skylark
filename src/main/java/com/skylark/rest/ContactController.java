package com.skylark.rest;

import com.skylark.customer.CustomerBo;
import com.skylark.domain.Contact;
import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/contact")
@Service
public class ContactController {

	CustomerBo customerBo;

	@GET
	@Path("/foo")
    @Produces("application/xml")
	public Response findContact() {

		//customerBo = (CustomerBo) SpringApplicationContext.getBean("customerBo");
		
		//String result = customerBo.getMsg();

        Contact foo = new Contact();
        foo.setFirstName("Bob");
        foo.setLastName("Newport");

		return Response.status(200).entity(foo).build();

	}

}