package com.goit.HW15.service;


import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Slf4j
@Service
public class NoteService {
    private List<Note> notes=new ArrayList<>();
    public List<Note> listAll(){
//        log.info("---listAll");
        return this.notes;
    }

    public Note add(Note note){
 //       log.info("---add");
        //  note.setId(UUID.randomUUID());
        long z =(int)(Math.random()*100);

//        log.info("     z= "+z);

        note.setId(z);
        this.notes.add(note);
        return note;
    }

    public   void deleteById(long id)  throws Exception {
 //       log.info("---deleteById   id= "+id);
        try {Note idNote=getById(id);
            this.notes.remove(idNote);
        } catch (Exception e) {
              log.info(e.getMessage());
        }
    }

    public   void update(Note note) throws Exception {
//        log.info("--- update");
        try { Note idNote=getById(note.getId());
            idNote.setTitle(note.getTitle());
            idNote.setContent(note.getContent());
        } catch (Exception e) {
             log.info(e.getMessage());
        }
    }
    public    Note getById(long id) throws Exception {
 //       log.info("--- getById   id= "+id);
        Note nn= new Note();
        boolean flag=true;
        for(Note ss: this.notes ){
//            log.info("    ss= " +ss.toString());
            if (ss.getId()==id){
                return ss;
            }
        }
        if (flag) {
            throw new Exception("***Method- getById- id not found !!!");
        }
        return nn;
    }
}
