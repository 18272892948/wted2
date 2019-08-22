package com.blockbus.wted.core.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 * 提币申请
 * </p>
 *
 * @author blockbus
 * @since 2019-08-21
 */
@TableName("withdraw_applies")
public class WithdrawAppli extends Model<WithdrawAppli> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
    /**
     * 提币用户ID
     */
	@TableField("user_id")
	private String userId;
    /**
     * 币种:HQC
     */
	private String currency;
    /**
     * 申请数量
     */
	private BigDecimal amount;
    /**
     * 手续费10%
     */
	private BigDecimal fee;
    /**
     * 提现数量
     */
	@TableField("w_amount")
	private BigDecimal wAmount;
    /**
     * 提币地址
     */
	@TableField("withdraw_address")
	private String withdrawAddress;
    /**
     * 后台用户ID
     */
	@TableField("admin_id")
	private String adminId;
    /**
     * 0待处理 1已完成 -1已取消
     */
	private Integer state;
    /**
     * 处理了说明
     */
	private String remark;
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

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getFee() {
		return fee;
	}

	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}

	public BigDecimal getWAmount() {
		return wAmount;
	}

	public void setWAmount(BigDecimal wAmount) {
		this.wAmount = wAmount;
	}

	public String getWithdrawAddress() {
		return withdrawAddress;
	}

	public void setWithdrawAddress(String withdrawAddress) {
		this.withdrawAddress = withdrawAddress;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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
