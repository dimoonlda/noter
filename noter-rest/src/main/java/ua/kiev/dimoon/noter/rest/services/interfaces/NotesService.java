package ua.kiev.dimoon.noter.rest.services.interfaces;

import ua.kiev.dimoon.noter.rest.model.Note;

import java.util.List;

/**
 * Created by lutay.d on 10.10.2016.
 */
public interface NotesService {
    List<Note> getNotes();
    Note getNoteById(Integer id);
    Note saveNote(Note note);
}
