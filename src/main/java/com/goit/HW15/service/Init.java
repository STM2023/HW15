package com.goit.HW15.service;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class Init {
    //    @Autowired
    private NoteService noteService;
    public Init (NoteService noteService){
        this.noteService=noteService;
    }


    @PostConstruct
    private void init(){
       // log.info("---POST CONSTRUCT");

        Note n= new Note();
        n.setTitle("title 11111111");
        n.setContent("body 11111111");
        noteService.add(n);

        Note n1= new Note();
        n1.setTitle("title 22222222");
        n1.setContent("body 2222222");
        noteService.add(n1);

        Note n2= new Note();
        n2.setTitle("title 33333333");
        n2.setContent("body 33333333");
        noteService.add(n2);

        log.info("listAll = "+noteService.listAll().toString());
        //UUID id =n1.getId();
//        long id=n1.getId();
//        try{
//            noteService.update(n1);
//        } catch (Exception e) {
//
//            log.info(e.getMessage());
//        }
//        try{
//            noteService.deleteById(id);
//        } catch (Exception e) {
//
//            log.info(e.getMessage());
//        }
//        id=(long)(Math.random()*100);
//
//        log.info(" new id = "+id);
//
//        try{
//            noteService.getById(id);
//        } catch (Exception e) {
//
//            log.info(e.getMessage());
//        }
//        try{
//            noteService.deleteById(id);
//        } catch (Exception e) {
//
//            log.info(e.getMessage());
//        }
//
//        log.info("listAll = "+noteService.listAll().toString());
    }

}



