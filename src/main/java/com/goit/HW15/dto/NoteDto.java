package com.goit.HW15.dto;

import lombok.Data;
@Data
public class NoteDto {
    private long id;
    //   private UUID id;
    private String title;
    private String content;

}
