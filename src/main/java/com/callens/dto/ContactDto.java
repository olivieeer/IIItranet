package com.callens.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ContactDto {
    private static final long serialVersionUID = -6809049173391335091L;

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private int               id;

    @Column
    private String            title;

    @Column
    private String            description;
}
