package com.cc.pro.controller;

import com.cc.pro.entity.Word;
import com.cc.pro.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: do-something
 * @description:
 * @author: SunChao
 * @create: 2021-04-07 13:19
 **/
@RestController
@RequestMapping("/word")
public class WordController {

    @Autowired
    private WordService wordService;

    @GetMapping("/getOneById/{id}")
    public Word getOneById(@PathVariable Long id) {
        return wordService.getOneById(id);
    }

    @GetMapping("/listAllWords")
    public List<Word> listAllWords() {
        return wordService.listAllWords();
    }
}
