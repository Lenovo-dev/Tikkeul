package com.tikkeul.app.domain.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class InquiryBoardDTO {
    private Long id;
    private String type;
    private String title;
    private String content;
    private String registerDate;
    private String updateDate;
    private Long userId;
    private String name;
    private String identification;
}
