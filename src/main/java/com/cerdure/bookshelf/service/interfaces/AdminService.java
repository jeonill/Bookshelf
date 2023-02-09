package com.cerdure.bookshelf.service.interfaces;

import com.cerdure.bookshelf.domain.member.Member;
import com.cerdure.bookshelf.dto.admin.MemberListDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AdminService {
    Page<Member> showMemberList(Pageable pageable);
    Boolean createAdmin();
    Boolean deleteAdmin();
}
