package com.egor.rssaggregator.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class NewsEntryDto {
    private String newsHead;

    private LocalDateTime newsDate;

    private String feedUrl;
}
