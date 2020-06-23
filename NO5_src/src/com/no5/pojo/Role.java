package com.no5.pojo;

import java.util.Arrays;
import java.util.List;

public class Role {
    private Integer id;
    private String name;
    private String cover;
    private String intro;
    private Integer num;

    /*public void changeCover() {
        String[] sList=cover.split("\\");
        List<String> strList = Arrays.asList(sList);
        for(int i = 0; i < 5;i++)
            strList.remove(0);
        String[] sList2 = strList.toArray(new String[strList.size()]);
        cover = String.join("/",sList2);
        System.out.println("cover="+cover);
    }*/
    public Role() {
    }

    public Role(Integer id, String name, String cover, String intro, Integer num) {
        this.id = id;
        this.name = name;
        this.cover = cover;
        this.intro = intro;
        this.num = num;
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

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cover='" + cover + '\'' +
                ", intro='" + intro + '\'' +
                ", num=" + num +
                '}';
    }

    public String getClassify()
    {
        if (this.num.equals(1))
        {
            return "救援型";
        } else if (this.num.equals(2))
        {
            return "破译型";
        }
        else if (this.num.equals(3))
        {
            return "牵制型";
        }
        else if (this.num.equals(4))
        {
            return "辅助型";
        }
        else {
            return "监管者";
        }
    }
}
