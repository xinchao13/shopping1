package com.asjy.shopping.model;

import java.util.Date;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopping_user.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopping_user.addtime
     *
     * @mbggenerated
     */
    private Date addtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopping_user.deletestatus
     *
     * @mbggenerated
     */
    private Boolean deletestatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopping_user.user_name
     *
     * @mbggenerated
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopping_user.user_password
     *
     * @mbggenerated
     */
    private String userPassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopping_user.phone
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopping_user.email
     *
     * @mbggenerated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopping_user.imgpath
     *
     * @mbggenerated
     */
    private String imgpath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopping_user.true_name
     *
     * @mbggenerated
     */
    private String trueName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopping_user.sex
     *
     * @mbggenerated
     */
    private String sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopping_user.power
     *
     * @mbggenerated
     */
    private Boolean power;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_user.id
     *
     * @return the value of shopping_user.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_user.id
     *
     * @param id the value for shopping_user.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_user.addtime
     *
     * @return the value of shopping_user.addtime
     *
     * @mbggenerated
     */
    public Date getAddtime() {
        return addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_user.addtime
     *
     * @param addtime the value for shopping_user.addtime
     *
     * @mbggenerated
     */
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_user.deletestatus
     *
     * @return the value of shopping_user.deletestatus
     *
     * @mbggenerated
     */
    public Boolean getDeletestatus() {
        return deletestatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_user.deletestatus
     *
     * @param deletestatus the value for shopping_user.deletestatus
     *
     * @mbggenerated
     */
    public void setDeletestatus(Boolean deletestatus) {
        this.deletestatus = deletestatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_user.user_name
     *
     * @return the value of shopping_user.user_name
     *
     * @mbggenerated
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_user.user_name
     *
     * @param userName the value for shopping_user.user_name
     *
     * @mbggenerated
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_user.user_password
     *
     * @return the value of shopping_user.user_password
     *
     * @mbggenerated
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_user.user_password
     *
     * @param userPassword the value for shopping_user.user_password
     *
     * @mbggenerated
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_user.phone
     *
     * @return the value of shopping_user.phone
     *
     * @mbggenerated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_user.phone
     *
     * @param phone the value for shopping_user.phone
     *
     * @mbggenerated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_user.email
     *
     * @return the value of shopping_user.email
     *
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_user.email
     *
     * @param email the value for shopping_user.email
     *
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_user.imgpath
     *
     * @return the value of shopping_user.imgpath
     *
     * @mbggenerated
     */
    public String getImgpath() {
        return imgpath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_user.imgpath
     *
     * @param imgpath the value for shopping_user.imgpath
     *
     * @mbggenerated
     */
    public void setImgpath(String imgpath) {
        this.imgpath = imgpath == null ? null : imgpath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_user.true_name
     *
     * @return the value of shopping_user.true_name
     *
     * @mbggenerated
     */
    public String getTrueName() {
        return trueName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_user.true_name
     *
     * @param trueName the value for shopping_user.true_name
     *
     * @mbggenerated
     */
    public void setTrueName(String trueName) {
        this.trueName = trueName == null ? null : trueName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_user.sex
     *
     * @return the value of shopping_user.sex
     *
     * @mbggenerated
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_user.sex
     *
     * @param sex the value for shopping_user.sex
     *
     * @mbggenerated
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_user.power
     *
     * @return the value of shopping_user.power
     *
     * @mbggenerated
     */
    public Boolean getPower() {
        return power;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_user.power
     *
     * @param power the value for shopping_user.power
     *
     * @mbggenerated
     */
    public void setPower(Boolean power) {
        this.power = power;
    }
}