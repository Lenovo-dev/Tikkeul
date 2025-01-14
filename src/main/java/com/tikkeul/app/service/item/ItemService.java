package com.tikkeul.app.service.item;

import com.tikkeul.app.domain.dto.ItemDTO;
import com.tikkeul.app.domain.dto.OrderDTO;
import com.tikkeul.app.domain.type.CategoryType;

import java.util.List;
import java.util.Optional;

public interface ItemService {
//    김보령 작업공간
    //    열매샵 제품 목록 가져오기 : list.html
    public List<ItemDTO> getList(CategoryType categoryType);

    //    열매샵 제품 상세 보기 : readDetail.html
    public Optional<ItemDTO> readDetail(Long id);

    //    후기 수, 별점 가져오기
    public Optional<OrderDTO> readScoreAndCountOfReview(Long id);








//    홍윤기 작업공간
    //  메인페이지 제품 목록 가져오기 : list.html
    public List<ItemDTO> getitemList();

    public List<ItemDTO> getOptionItemList(Long savingLevelId);

}