package com.blockbus.wted.core.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 * 充提币地址
 * </p>
 *
 * @author blockbus
 * @since 2019-08-21
 */
@TableName("addresses")
public class Address extends Model<Address> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
    /**
     * 用户ID
     */
	@TableField("user_id")
	private String userId;
    /**
     * 地址类型 1充币 2提币
     */
	@TableField("address_type")
	private Integer addressType;
    /**
     * 地址密码
     */
	private String password;
    /**
     * 充币地址
     */
	@TableField("recharge_address")
	private String rechargeAddress;
    /**
     * 提币地址
     */
	@TableField("withdraw_address")
	private String withdrawAddress;
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

	public Integer getAddressType() {
		return addressType;
	}

	public void setAddressType(Integer addressType) {
		this.addressType = addressType;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRechargeAddress() {
		return rechargeAddress;
	}

	public void setRechargeAddress(String rechargeAddress) {
		this.rechargeAddress = rechargeAddress;
	}

	public String getWithdrawAddress() {
		return withdrawAddress;
	}

	public void setWithdrawAddress(String withdrawAddress) {
		this.withdrawAddress = withdrawAddress;
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
