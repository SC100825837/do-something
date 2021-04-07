package com.cc.pro.service.impl;

import com.cc.pro.entity.Word;
import com.cc.pro.mapper.WordMapper;
import com.cc.pro.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: do-something
 * @description:
 * @author: SunChao
 * @create: 2021-04-07 13:18
 **/
@Service
public class WordServiceImpl implements WordService {

    @Autowired
    private WordMapper wordMapper;

    @Override
    public Word getOneById(Long id) {

        return wordMapper.getOneById(id);
    }

    @Override
    public List<Word> listAllWords() {
        return wordMapper.listAllWords();
    }
}
