package com.backend.note.notes;

public interface NoteMapper {
    NoteDTO toDTO(NoteModel entity);
    NoteModel fromDTO(NoteDTO entity);
}
