package com.sprungdata.JavaDevModule14;

import com.sprungdata.JavaDevModule14.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
}
