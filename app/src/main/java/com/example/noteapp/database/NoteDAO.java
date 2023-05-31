package com.example.noteapp.database;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.noteapp.models.Note;

import java.util.List;

public interface NoteDAO {

    @Insert
    void insertNote(Note note);

    @Query("SELECT * FROM note ")
    List<Note> getAllNote();


    @Query("SELECT * FROM note where Title = :title")
    List<Note> checkNote(String title);

    @Update
    void  updateNote(Note note);

    @Delete
    void deleteNote(Note note);

    @Query("DELETE FROM note")
    void  deleteAllNote();

    @Query("SELECT * FROM note WHERE  Title LIKE '%' || :title || '%'")
    List<Note> serchNote(String title);


}
