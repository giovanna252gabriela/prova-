package com.example.Av1.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "notices")
public class NoticeEntity {

    @Id
    private String id;
    private String titulo;
    private String conteudo;


}
