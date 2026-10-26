package com.dk.pulsewatch.controller;

import com.dk.pulsewatch.model.Website;
import com.dk.pulsewatch.service.WebsiteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/websites")
@RequiredArgsConstructor
public class WebsiteController {

    private final WebsiteService websiteService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Website createWebsite(@RequestBody Website website) {
        websiteService.addWebsite(website);
        return website;
    }

    @GetMapping
    public List<Website> getAllWebsites() {
        return websiteService.getAllWebsites();
    }
}
