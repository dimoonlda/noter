package ua.kiev.dimoon.noter.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.kiev.dimoon.noter.rest.controllers.interfaces.NotesController;
import ua.kiev.dimoon.noter.rest.dto.BaseResponse;
import ua.kiev.dimoon.noter.rest.model.Note;
import ua.kiev.dimoon.noter.rest.services.interfaces.NotesService;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by lutay.d on 06.10.2016.
 */
@RestController
@RequestMapping("/notes")
public class NotesControllerImpl implements NotesController {

    private NotesService notesService;

    @Autowired
    public NotesControllerImpl setNotesService(NotesService notesService) {
        this.notesService = notesService;
        return this;
    }

    @Override
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<BaseResponse<List<Note>>> getNotes() {
        return new ResponseEntity<>(new BaseResponse<>(notesService.getNotes()),
                HttpStatus.OK);
    }

    @Override
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<BaseResponse<Note>> getNoteById(@PathVariable Integer id) {
        return new ResponseEntity<>(new BaseResponse<>(notesService.getNoteById(id)),
                HttpStatus.OK);
    }

    @Override
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<BaseResponse<Note>> saveNote(@RequestBody @Valid Note note) {
        return new ResponseEntity<>(new BaseResponse<>(notesService.saveNote(note)),
                HttpStatus.OK);
    }
}
