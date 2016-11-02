package com.callens.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.callens.dto.ContactDto;

public interface ContactRepository extends JpaRepository<ContactDto, Integer> {

}
