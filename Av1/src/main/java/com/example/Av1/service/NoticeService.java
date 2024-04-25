package com.example.Av1.service;

import com.example.Av1.repository.NoticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoticeService {

@Autowired
    private NoticeRepository noticeRepository;

    public NoticeService(NoticeRepository noticeRepository) {
        this.noticeRepository = noticeRepository;
    }

    public String getNoticiasEReleases() {
        return noticeRepository.getNoticiasEReleases();
    }

    public String getNoticias() {
        return noticeRepository.getNoticias();
    }

    public String getReleases() {
        return noticeRepository.getReleases();
    }
}
