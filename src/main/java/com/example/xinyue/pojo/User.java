package com.example.xinyue.pojo;

/**
 * @ProjectName: xinyue
 * @Package: com.example.xinyue.pojo
 * @ClassName: User
 * @Author: zht19
 * @Description:
 * @Date: 2019/10/17 15:28
 * @Version: 1.0
 */

public class User {

    private Integer id;
    //  用户名
    private String name;
    //  手机号
    private String phone;
    //  部门
    private String dname;
    //  角色
    private String rname;
    //  群组
    private String grname;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getGrname() {
        return grname;
    }

    public void setGrname(String grname) {
        this.grname = grname;
    }

    public User() {
        this.id = id;
    }

    public User(Integer id, String name, String phone, String dname, String rname, String grname) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.dname = dname;
        this.rname = rname;
        this.grname = grname;
    }
}
