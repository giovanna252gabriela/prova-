package com.example.Av1.repository;

import com.example.Av1.model.NoticeEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;


@Repository
public class NoticeRepository extends MongoRepository<NoticeEntity.MongoRepository> {
    private static  String
    IbgeApiURL = "https://servicodados.ibge.gov.br/api/v3/noticias";

    private  RestTemplate restTemplate;

    public NoticeRepository(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getNoticiasEReleases() {
        return restTemplate.getForObject(IbgeApiURL, String.class);
    }

    public String getNoticias() {
        return restTemplate.getForObject(IbgeApiURL + "/?tipo=noticia", String.class);
    }

    public String getReleases() {
        return restTemplate.getForObject(IbgeApiURL + "/?tipo=release", String.class);
    }
}

