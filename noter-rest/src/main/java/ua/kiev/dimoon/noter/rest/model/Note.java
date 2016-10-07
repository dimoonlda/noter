package ua.kiev.dimoon.noter.rest.model;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by lutay.d on 06.10.2016.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Note {
    private Long id;
    private String title;
    private String context;

    public Long getId() {
        return id;
    }

    public Note setId(Long id) {
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
