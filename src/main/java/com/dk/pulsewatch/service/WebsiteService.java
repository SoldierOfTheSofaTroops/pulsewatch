package com.dk.pulsewatch.service;

import com.dk.pulsewatch.model.Website;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class WebsiteService {

    private final List<Website> websites = new ArrayList<>();
    private Long nextId = 1L;

    public Website addWebsite(Website website) {
        website.setId(nextId++);
        website.setUrl(website.getUrl());
        website.setCreatedAt(LocalDateTime.now());

        websites.add(website);

        return website;
    }

    public List<Website> getAllWebsites() {
        return websites;
    }
}
