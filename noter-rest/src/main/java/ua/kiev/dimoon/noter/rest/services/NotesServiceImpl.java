package ua.kiev.dimoon.noter.rest.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.kiev.dimoon.noter.rest.model.Note;
import ua.kiev.dimoon.noter.rest.repositories.NotesRepository;
import ua.kiev.dimoon.noter.rest.services.interfaces.NotesService;

import java.util.List;

/**
 * Created by lutay.d on 10.10.2016.
 */
@Service
public class NotesServiceImpl implements NotesService {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private NotesRepository notesRepository;

    @Autowired
    public NotesServiceImpl setNotesRepository(NotesRepository notesRepository) {
        this.notesRepository = notesRepository;
        return this;
    }

    @Override
    public List<Note> getNotes() {
        logger.debug("getNotes request.");
        return notesRepository.findAll();
    }

    @Override
    public Note getNoteById(Integer id) {
        logger.debug("getNoteById request with id = {}.", id);
        return notesRepository.getOne(id);
    }

    @Override
    public Note saveNote(Note note) {
        logger.debug("saveNote request with params = {}.", note);
        return notesRepository.save(note);
    }

    @Override
    public void deleteNoteById(Integer id) {
        logger.debug("deleteNoteById request with id = {}.", id);
        notesRepository.delete(id);
    }

}
