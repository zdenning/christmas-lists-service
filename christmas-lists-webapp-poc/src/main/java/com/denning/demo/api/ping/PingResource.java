package com.denning.demo.api.ping;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/ping")
public class PingResource
{	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.WILDCARD)
	public Response ping()
	{
		Map<String, String> pong = new HashMap<>();
		pong.put("pong", "Hello, world!");
		return Response.status(200).entity(pong).build();
	}
}
