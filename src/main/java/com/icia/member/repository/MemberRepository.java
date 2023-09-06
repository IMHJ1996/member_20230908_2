package com.icia.member.repository;

import com.icia.member.dto.MemberDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MemberRepository {
    @Autowired
    private SqlSessionTemplate sql;

    public int join(MemberDTO memberDTO){
        return sql.insert("Member.join", memberDTO);
    }
    public List<MemberDTO> findAll() {
        return sql.selectList("Member.findAll");
    }

    public MemberDTO findById(Long id) {
        return sql.selectOne("Member.findById", id);
    }


    public MemberDTO login(MemberDTO memberDTO) {
        return sql.selectOne("Member.login", memberDTO);
    }
    }

