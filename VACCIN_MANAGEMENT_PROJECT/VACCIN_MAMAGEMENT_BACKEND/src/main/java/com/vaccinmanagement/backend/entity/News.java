package com.vaccinmanagement.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "news")
public class News {

    @Id
    @Column(name = "id_new", unique = true)
    private int id_new;

    @Column(name = "title", nullable = false, length = 300, unique = true)
    private String title;

    @Column(name = "preview" , nullable = false, length = 4000)
    private String preview;

    @Column(name = "content" , nullable = false, length = 300)
    private String content;

    public News() {}

    public News(String title, String preview, String content) {
        this.title = title;
        this.preview = preview;
        this.content = content;
    }

    public int getId_new() {
        return id_new;
    }

    public void setId_new(int id_new) {
        this.id_new = id_new;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
