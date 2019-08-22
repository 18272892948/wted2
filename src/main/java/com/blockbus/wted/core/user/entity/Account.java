package com.blockbus.wted.core.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.blockbus.wted.core.user.entity.extend.DateTime;

import java.math.BigDecimal;
import java.util.Date;

import java.io.Serializable;

/**
 * <p>
 * 用户账户
 * </p>
 *
 * @author blockbus
 * @since 2019-08-21
 */
@TableName("accounts")
public class Account extends DateTime {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
    /**
     * 用户ID
     */
	@TableField("user_id")
	private String userId;
    /**
     * 币种
     */
	private String currency;
    /**
     * 数量
     */
	private BigDecimal count;
    /**
     * 账户类型 1可提现 2生态资产
     */
	@TableField("account_type")
	private Integer accountType;
	@TableField("created_at")
	private Date createdAt;
	@TableField("updated_at")
	private Date updatedAt;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getCount() {
		return count;
	}

	public void setCount(BigDecimal count) {
		this.count = count;
	}

	public Integer getAccountType() {
		return accountType;
	}

	public void setAccountType(Integer accountType) {
		this.accountType = accountType;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}



	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
