package com.example.Av1.controller;

import com.example.Av1.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notices")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    public NoticeController(NoticeService noticeService) {
        this.noticeService = noticeService;
    }

    @GetMapping("/noticiasereleases")
    public String getNoticiasEReleases() {
        return noticeService.getNoticiasEReleases();
    }

    @GetMapping("/noticias")
    public String getNoticias() {
        return noticeService.getNoticias();
    }

    @GetMapping("/releases")
    public String getReleases() {
        return noticeService.getReleases();
    }
}
