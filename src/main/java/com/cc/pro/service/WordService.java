package com.cc.pro.service;

import com.cc.pro.entity.Word;

import java.util.List;

public interface WordService {
    Word getOneById(Long id);
    List<Word> listAllWords();
}
