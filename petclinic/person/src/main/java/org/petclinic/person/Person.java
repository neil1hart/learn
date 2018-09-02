package org.petclinic.person;

import org.springframework.data.annotation.Id;

public class Person {
    @Id
    private Long id;
    private PersonName name;

}

