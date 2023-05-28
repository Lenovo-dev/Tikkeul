package com.tikkeul.app.domain.vo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class FileVO {
    private Long id;
    private Long size;
    private String originName;
    private String uuid;
    private String path;
    private String fileType;

}
