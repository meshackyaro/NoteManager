package com.myworkspace.notesManagementServiceApp.dtos.responses;

import lombok.Data;

@Data
public class CreateNoteResponse {
    private String id;
    private String title;
    private String content;
    private String author;
    private String message;
}
