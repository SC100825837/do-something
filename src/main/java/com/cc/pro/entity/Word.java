package com.cc.pro.entity;

/**
 * @program: do-something
 * @description:
 * @author: SunChao
 * @create: 2021-04-07 13:11
 **/
public class Word {
    private Long id;
    private String letterSpell;
    private Integer page;
    private Integer belongList;

    public Word() {
    }

    public Word(Long id, String letterSpell, Integer page, Integer belongList) {
        this.id = id;
        this.letterSpell = letterSpell;
        this.page = page;
        this.belongList = belongList;
    }

    @Override
    public String toString() {
        return "Word{" +
                "id=" + id +
                ", letterSpell='" + letterSpell + '\'' +
                ", page=" + page +
                ", belongList=" + belongList +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLetterSpell() {
        return letterSpell;
    }

    public void setLetterSpell(String letterSpell) {
        this.letterSpell = letterSpell;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getBelongList() {
        return belongList;
    }

    public void setBelongList(Integer belongList) {
        this.belongList = belongList;
    }
}
