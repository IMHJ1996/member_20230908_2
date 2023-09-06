package com.icia.member.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class MemberDTO {
    private Long id;
    private String MemberEmail;
    private String MemberPassword;
    private String MemberName;
    private String MemberBirth;
    private String MemberMobile;

}
