package com.cerdure.bookshelf.repository;


import com.cerdure.bookshelf.domain.member.Member;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    public Optional <Member> findByPhone(String phone);
    public List <Member> findByNickname(String nickname);
    Member findByEmail(String email);
    void deleteByPhone(String phone);
    Page<Member> findAllByOrderByRegDateDesc(Pageable pageable);
}
