package ua.kiev.dimoon.noter.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.kiev.dimoon.noter.rest.model.Note;

/**
 * Created by lutay.d on 10.10.2016.
 */
@Repository
public interface NotesRepository extends JpaRepository<Note, Integer> {
}
