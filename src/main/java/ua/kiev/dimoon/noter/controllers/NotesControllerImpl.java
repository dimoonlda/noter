package ua.kiev.dimoon.noter.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ua.kiev.dimoon.noter.controllers.interfaces.NotesController;
import ua.kiev.dimoon.noter.dto.BaseResponse;
import ua.kiev.dimoon.noter.model.Note;

import java.util.Arrays;
import java.util.List;

/**
 * Created by lutay.d on 06.10.2016.
 */
//@RestController
public class NotesControllerImpl implements NotesController {

    @RequestMapping("/notes.html")
    public String notes(){
        return "notes";
    }

    @Override
    @RequestMapping(name = "/notes", method = RequestMethod.GET)
    public ResponseEntity<BaseResponse<List<Note>>> getNotes() {
        return new ResponseEntity<>(new BaseResponse<>(
                Arrays.asList(
                        new Note().setId(1L)
                            .setTitle("Test title #1")
                            .setContext("Database migrations are something that Java developers struggle with, and Flyway provides a nice tool that anyone with basic knowledge of SQL can use. For that reason it has become the favourite migration tool in the Spring Boot team."),
                        new Note().setId(1L)
                                .setTitle("Evolve your Database Schema easily and\n" +
                                        "reliably across all your instances")
                                .setContext("With techniques such as Continuous Delivery becoming more mainstream, automated database migrations are a baseline capability for many software teams. Flyway makes it as painless as possible to automate this process.")
                )),
                HttpStatus.OK);
    }
}
