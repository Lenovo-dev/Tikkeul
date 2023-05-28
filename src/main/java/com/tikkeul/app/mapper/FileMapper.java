package com.tikkeul.app.mapper;

import com.tikkeul.app.domain.dto.FileDTO;
import com.tikkeul.app.domain.dto.ItemFileDTO;
import com.tikkeul.app.domain.dto.SavingLevelFileDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FileMapper {
//    김보령 작업공간
//    파일 조회
    public List<FileDTO> selectAll(Long itemId);





























    public void insertItem(ItemFileDTO fileVO);


    public List<SavingLevelFileDTO> savingLevelSelectlAll(Long savinglevelId);

    public void insert(SavingLevelFileDTO fileVO);

    public void savingLevelDelete(Long id);


}
