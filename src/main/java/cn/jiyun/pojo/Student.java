package cn.jiyun.pojo;

import lombok.Data;

import java.util.Date;
@Data
public class Student {
    private Integer id;
    private String name;
    private Integer sex;
    private String hobby;
    private Date birthday;
    private String img;
    private String dname;

    public Student(Integer id, String name, Integer sex, String hobby, Date birthday, String img, String dname) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.hobby = hobby;
        this.birthday = birthday;
        this.img = img;
        this.dname = dname;
    }

    public Student() {
    }
}
