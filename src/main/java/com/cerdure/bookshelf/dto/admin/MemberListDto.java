package com.cerdure.bookshelf.dto.admin;

import com.cerdure.bookshelf.domain.enums.MemberRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberListDto {
    private String name;
    private MemberRole memberRole;
    private String memberNickName;
}
