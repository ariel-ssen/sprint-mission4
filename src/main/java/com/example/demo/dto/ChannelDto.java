package com.example.demo.dto;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class ChannelDto {
    private Long id;
    private String name;
    private boolean isPrivate;
    private UUID userId;
}