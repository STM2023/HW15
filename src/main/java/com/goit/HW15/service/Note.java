package com.goit.HW15.service;

import lombok.Data;

@Data
public class Note {

    private long id;
    //   private UUID id;
    private String title;
    private String content;

}
