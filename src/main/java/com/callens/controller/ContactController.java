package com.callens.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.callens.model.Contact;
import com.callens.services.ContactService;

@Controller
@RequestMapping( "/" )
public class ContactController {

    private ContactService service;

    @RequestMapping( method = RequestMethod.GET )
    public String viewContacts() {
        return "contacts";
    }

    @RequestMapping( value = "/contacts", method = RequestMethod.GET )
    public @ResponseBody List<Contact> getContacts() {
        return service.getContacts();
    }

    @RequestMapping( value = "/contacts/{id}", method = RequestMethod.PUT )
    public @ResponseBody Contact update( @PathVariable int id, @RequestBody Contact Contact ) {
        // Contact.setId( id );
        Contact out = service.updateContact( Contact );
        return out;
    }

    @RequestMapping( value = "/contacts", method = RequestMethod.POST )
    public @ResponseBody Contact add( @RequestBody Contact Contact ) {
        Contact out = service.addContact( Contact );
        return out;
    }

    @RequestMapping( value = "/Contacts/{id}", method = RequestMethod.DELETE )
    @ResponseStatus( HttpStatus.NO_CONTENT )
    public void delete( @PathVariable int id ) {
        Contact task = new Contact();
        // task.setId( id );
        // service.delete( task );
    }
}
