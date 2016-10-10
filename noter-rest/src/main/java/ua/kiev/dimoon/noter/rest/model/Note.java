package ua.kiev.dimoon.noter.rest.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by lutay.d on 06.10.2016.
 */
@Entity(name = "NOTES")
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "notes_id_gen")
    @SequenceGenerator(name = "notes_id_gen", allocationSize = 1, sequenceName = "NOTES_ID_SEQ")
    private Integer id;
    @NotEmpty
    @Size(max = 255)
    private String title;
    @NotEmpty
    private String context;

    public Integer getId() {
        return id;
    }

    public Note setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Note setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getContext() {
        return context;
    }

    public Note setContext(String context) {
        this.context = context;
        return this;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", context='" + context + '\'' +
                '}';
    }
}
