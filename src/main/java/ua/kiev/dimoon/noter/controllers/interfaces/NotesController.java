package ua.kiev.dimoon.noter.controllers.interfaces;

import org.springframework.http.ResponseEntity;
import ua.kiev.dimoon.noter.dto.BaseResponse;
import ua.kiev.dimoon.noter.model.Note;

import java.util.List;

/**
 * Created by lutay.d on 06.10.2016.
 */
public interface NotesController {
    ResponseEntity<BaseResponse<List<Note>>> getNotes();
}
