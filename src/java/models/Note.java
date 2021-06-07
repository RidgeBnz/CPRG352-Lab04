/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
  
import java.io.Serializable;

/**
 *
 * @author 840288
 */
public class Note implements Serializable {
    private String noteContent;
    private String noteTitle;
        
        
    public Note() {
        noteContent = "";
        noteTitle = "";
    }
        
    public Note(String noteContent, String noteTitle) {
        this.noteContent = noteContent;
        this.noteTitle = noteTitle;
    }
    
    public String getNoteContent() {
        return noteContent;
    }

    public void setFirstname(String noteContent) {
        this.noteContent = noteContent;
    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public void setLastname(String noteContent) {
        this.noteTitle = noteContent;
    }   
}


