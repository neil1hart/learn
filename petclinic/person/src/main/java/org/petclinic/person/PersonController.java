package org.petclinic.person;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping(path="/persons", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class PersonController {
    private final PersonRepository people;

    public PersonController(PersonRepository people) {
        this.people = people;
    }

    @GetMapping
    public Flux<Person> persons() {
        return this.people.findAll();
    }
}

