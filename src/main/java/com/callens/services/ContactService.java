package com.callens.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.callens.model.Contact;

public interface ContactService {
    List<Contact> getContacts();

    @Transactional
    Contact addContact( Contact Contact );

    @Transactional
    Contact updateContact( Contact Contact );

    @Transactional
    void deleteContact( Contact Contact );
}
