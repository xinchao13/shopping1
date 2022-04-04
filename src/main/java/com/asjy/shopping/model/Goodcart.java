package com.asjy.shopping.model;

import java.util.Date;

public class Goodcart {

    private Integer id;
    private Goods goods;
    
    public Goods getGoods() {
		return goods;
	}

	public void setGoods(Goods goods) {
		this.goods = goods;
	}

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopping_goodcart.addtime
     *
     * @mbggenerated
     */
    private Date addtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopping_goodcart.userid
     *
     * @mbggenerated
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopping_goodcart.goodsid
     *
     * @mbggenerated
     */
    private Integer goodsid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopping_goodcart.count
     *
     * @mbggenerated
     */
    private Integer count;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_goodcart.id
     *
     * @return the value of shopping_goodcart.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_goodcart.id
     *
     * @param id the value for shopping_goodcart.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_goodcart.addtime
     *
     * @return the value of shopping_goodcart.addtime
     *
     * @mbggenerated
     */
    public Date getAddtime() {
        return addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_goodcart.addtime
     *
     * @param addtime the value for shopping_goodcart.addtime
     *
     * @mbggenerated
     */
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_goodcart.userid
     *
     * @return the value of shopping_goodcart.userid
     *
     * @mbggenerated
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_goodcart.userid
     *
     * @param userid the value for shopping_goodcart.userid
     *
     * @mbggenerated
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_goodcart.goodsid
     *
     * @return the value of shopping_goodcart.goodsid
     *
     * @mbggenerated
     */
    public Integer getGoodsid() {
        return goodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_goodcart.goodsid
     *
     * @param goodsid the value for shopping_goodcart.goodsid
     *
     * @mbggenerated
     */
    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopping_goodcart.count
     *
     * @return the value of shopping_goodcart.count
     *
     * @mbggenerated
     */
    public Integer getCount() {
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopping_goodcart.count
     *
     * @param count the value for shopping_goodcart.count
     *
     * @mbggenerated
     */
    public void setCount(Integer count) {
        this.count = count;
    }
}