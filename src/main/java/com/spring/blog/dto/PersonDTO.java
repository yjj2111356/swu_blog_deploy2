package com.spring.blog.dto;

import lombok.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder @ToString
public class PersonDTO {
    private long id;
    private String title;
    private int spectator;
}
