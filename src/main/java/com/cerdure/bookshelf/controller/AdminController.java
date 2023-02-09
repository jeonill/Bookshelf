package com.cerdure.bookshelf.controller;

import com.cerdure.bookshelf.domain.member.Member;
import com.cerdure.bookshelf.dto.admin.MemberListDto;
import com.cerdure.bookshelf.service.interfaces.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class AdminController {

    private final AdminService adminService;
    @GetMapping("/admin")
    public String createAdminform(Model model, Pageable pageable){
       model.addAttribute("memberList",adminService.showMemberList(pageable));
       return "admin";
    }
}
