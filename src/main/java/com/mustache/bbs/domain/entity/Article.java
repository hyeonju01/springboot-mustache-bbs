package com.mustache.bbs.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // JPA에서 객체로 다루겠다는 선언
@NoArgsConstructor
@Getter
public class Article {
    @Id //@Entity가 붙어있으면 꼭 붙여줘야 한다. PK를 의미한다.
    @GeneratedValue //auto-increment
    private Long id;

    @Column
    private String title;
    @Column

    private String content;

    public Article(Long id, String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}

// 여기서 하나라도 빼먹을 경우, 스프링부트가 뜨지 않음.