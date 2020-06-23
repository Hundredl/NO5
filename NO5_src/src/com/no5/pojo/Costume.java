package com.no5.pojo;

public class Costume {
    private Integer id;
    private String name;
    private  String cover;
    private Integer role_id;
    private Integer likes;
    private String intro;
    private String state;

    public Costume() {
    }

    public Costume(Integer id, String name, String cover, Integer role_id, Integer likes, String intro) {
        this.id = id;
        this.name = name;
        this.cover = cover;
        this.role_id = role_id;
        this.likes = likes;
        this.intro = intro;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "costumes{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cover='" + cover + '\'' +
                ", role_id=" + role_id +
                ", likes=" + likes +
                ", intro='" + intro + '\'' +
                '}';
    }
}
