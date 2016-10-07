package ua.kiev.dimoon.noter.rest.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.kiev.dimoon.noter.rest.controllers.interfaces.NotesController;
import ua.kiev.dimoon.noter.rest.dto.BaseResponse;
import ua.kiev.dimoon.noter.rest.model.Note;

import java.util.Arrays;
import java.util.List;

/**
 * Created by lutay.d on 06.10.2016.
 */
@RestController
@RequestMapping("/notes")
public class NotesControllerImpl implements NotesController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<BaseResponse<List<Note>>> getNotes() {
        logger.debug("getNotes request.");
        return new ResponseEntity<>(new BaseResponse<>(
                Arrays.asList(
                        new Note().setId(1L)
                            .setTitle("Test title #1")
                            .setContext("Database migrations are something that Java developers struggle with, and Flyway provides a nice tool that anyone with basic knowledge of SQL can use. For that reason it has become the favourite migration tool in the Spring Boot team."),
                        new Note().setId(2L)
                                .setTitle("Evolve your Database Schema easily and\n" +
                                        "reliably across all your instances")
                                .setContext("With techniques such as Continuous Delivery becoming more mainstream, automated database migrations are a baseline capability for many software teams. Flyway makes it as painless as possible to automate this process.")
                )),
                HttpStatus.OK);
    }

    @Override
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<BaseResponse<Note>> getNoteById(@PathVariable Long id) {
        logger.debug("getNoteById request with param: id = {}.", id);
        return new ResponseEntity<>(new BaseResponse<>(new Note()
                .setId(id)
                .setTitle("Front end – Password Flow")
                .setContext("We’re going to be using the OAuth2 Password flow here – which is why this is just a proof of concept not a production ready application. You’ll notice that the client credentials are exposed to the front end – which is something we’ll address in a future article.")),
                HttpStatus.OK);
    }
}
