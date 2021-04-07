package com.cc.pro.mapper;

import com.cc.pro.entity.Word;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface WordMapper {
    Word getOneById(@Param("id") Long id);
    List<Word> listAllWords();
}
