package ua.kiev.dimoon.noter.rest.controllers.interfaces;

import org.springframework.http.ResponseEntity;
import ua.kiev.dimoon.noter.rest.dto.BaseResponse;
import ua.kiev.dimoon.noter.rest.model.Note;

import java.util.List;

/**
 * Created by lutay.d on 06.10.2016.
 */
public interface NotesController {
    ResponseEntity<BaseResponse<List<Note>>> getNotes();
    ResponseEntity<BaseResponse<Note>> getNoteById(Long id);
}
