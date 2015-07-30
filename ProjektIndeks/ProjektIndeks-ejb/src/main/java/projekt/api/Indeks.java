package projekt.api;

import javax.ejb.EJB;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import projekt.BinEjb;

@Path("indeks")
public class Indeks {

	@EJB
	BinEjb bin;

	@GET
	@Path("hello")
	public String hello() {
		return bin.text();
	}

}
