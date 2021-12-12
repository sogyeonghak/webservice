package com.sogang.book.springboot.web.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Getter
@RequiredArgsConstructor
public class HelloResponseDto {

    private final String name;
    private final int amount;


}
