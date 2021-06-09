/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 840288
 */
public class Note {
    private String noteTitle;
    private String noteContents;

    
    public Note() {
        this.noteTitle = "";
        this.noteContents = "";
    }
    public Note(String title, String contents) {
        this.noteTitle = title;
        this.noteContents = contents;
    }
    public String getTitle() {
        return noteTitle;
    }
    public void setTitle(String title) {
        this.noteTitle = title;
    }
    
    public String getContents() {
        return noteContents;
    }
    public void setContents(String content) {
        this.noteContents = content;
    }
}
