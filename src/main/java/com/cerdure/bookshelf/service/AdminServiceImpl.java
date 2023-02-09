package com.cerdure.bookshelf.service;

import com.cerdure.bookshelf.domain.enums.MemberRole;
import com.cerdure.bookshelf.domain.member.Member;
import com.cerdure.bookshelf.repository.MemberRepository;
import com.cerdure.bookshelf.service.interfaces.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class AdminServiceImpl implements AdminService {

    private final MemberRepository memberRepository;

    @Override
    public Page<Member> showMemberList(Pageable pageable) {
        int page = (pageable.getPageNumber() == 0) ? 0 : (pageable.getPageNumber() - 1);
        pageable = PageRequest.of(page, 12, Sort.by("regDate").descending());
        return memberRepository.findAllByOrderByRegDateDesc(pageable);
    }

    @Override
    public Boolean createAdmin() {
        return null;
    }

    @Override
    public Boolean deleteAdmin() {
        return null;
    }
}
