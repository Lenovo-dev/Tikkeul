package com.tikkeul.app.controller;


import com.tikkeul.app.domain.dto.DoranBoardDTO;
import com.tikkeul.app.domain.dto.Pagination;
import com.tikkeul.app.domain.dto.Search;
import com.tikkeul.app.domain.vo.DoranBoardVO;
import com.tikkeul.app.service.doranBoard.DoranBoardService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Optional;

@Controller
@Slf4j
@RequestMapping("/doranboard/*")
@RequiredArgsConstructor
public class DoranBoardController {
    /*도란보드 최보근*/

    private final DoranBoardService doranBoardService;

    /*목록 가져오기*/
    @GetMapping("doranboard")
    public void list(Pagination pagination, Search search, Model model) {
        pagination.setTotal(doranBoardService.getTotal(search));
        pagination.progress();
        model.addAttribute("doranboards", doranBoardService.getList(pagination, search));

    }

    /*게시글 추가*/
    @GetMapping("doranwrite")
    public void goToWriteForm(DoranBoardVO doranBoardVO) {
        ;
    }

    @PostMapping("doranwrite")
    public RedirectView write(DoranBoardVO doranBoardVO) {
        doranBoardService.write(doranBoardVO);
        return new RedirectView("/doranboard/doranboard");
    }

    /*게시글 상세보기*/
    @GetMapping("dorandetail")
    public void read(Long id, Model model) {
        Optional<DoranBoardDTO> checkDoranBoardDTO = doranBoardService.read(id);
        if(checkDoranBoardDTO.isPresent()){
            model.addAttribute("doranboard", checkDoranBoardDTO.get());
        }
//        model.addAttribute("doranboard", doranBoardService.read(id));
    }

    /*게시글 수정*/
    @GetMapping("doranmodify")
    public RedirectView modify(DoranBoardDTO doranBoardDTO, RedirectAttributes redirectAttributes) {
        if (doranBoardDTO.getTitle() == null) {
            doranBoardDTO.setTitle("");  // 빈 문자열로 설정
        }
        doranBoardService.modify(doranBoardDTO);
        redirectAttributes.addAttribute("id", doranBoardDTO.getId());
        return new RedirectView("/doranboard/doranmodify");
    }



    /*게시글 삭제*/
    @GetMapping("remove")
    public RedirectView remove(Long id) {
        doranBoardService.remove(id);
        return new RedirectView("/doranboard/doranboard");
    }




}
