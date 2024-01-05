package org.acme;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.acme.Person;

;
@Path("/person")
public class PersonResource {
    private Person person;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPerson() {
        if (person == null) {
            person = new Person();
        }
        return person;
    }
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void updatePerson(Person updatedPerson) {
        if (updatedPerson != null) {


            if (person == null) {
                person = new Person();
            }
            person.setName(updatedPerson.getClass());
            person.setAddress(updatedPerson.getAddress());
        }
    }
}



