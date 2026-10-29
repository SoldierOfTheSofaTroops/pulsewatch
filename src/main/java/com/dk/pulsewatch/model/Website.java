package com.dk.pulsewatch.model;

import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Website {

    private Long id;
    private String url;
    private LocalDateTime createdAt;
}
