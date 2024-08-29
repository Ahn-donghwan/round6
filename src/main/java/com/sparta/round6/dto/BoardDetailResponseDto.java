package com.sparta.round6.dto;

import lombok.Getter;

@Getter
public class BoardDetailResponseDto {

    private final long id;
    private final String title;
    private final String contents;


    public BoardDetailResponseDto(long id, String title, String contents) {
        this.id = id;
        this.title = title;
        this.contents = contents;
    }
}
