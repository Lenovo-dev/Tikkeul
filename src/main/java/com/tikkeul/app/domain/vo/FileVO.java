package com.tikkeul.app.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class FileVO {
    private Long id;
    private int size;
    private String originName;
    private String uuid;
}
