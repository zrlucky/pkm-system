package com.ZhangRuo.pkm.entity;

import java.time.LocalDateTime;

public class Note {
    // 字段（属性）- 使用 private 封装
    private Long id;
    private String title;
    private String content;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;

    // 无参构造方法
    public Note() {
        this.createTime = LocalDateTime.now();
        this.updateTime = LocalDateTime.now();
    }

    // 有参构造方法
    public Note(String title, String content) {
        this(); // 调用无参构造
        this.title = title;
        this.content = content;
    }

    // Getter 和 Setter 方法（体现封装）
    // IDEA 中可右键类 -> Generate -> Getter and Setter 快速生成
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        this.updateTime = LocalDateTime.now(); // 更新修改时间
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        this.updateTime = LocalDateTime.now(); // 更新修改时间
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }
}