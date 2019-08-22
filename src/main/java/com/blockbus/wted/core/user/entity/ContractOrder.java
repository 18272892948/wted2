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
 * 购买的合约
 * </p>
 *
 * @author blockbus
 * @since 2019-08-21
 */
@TableName("contract_orders")
public class ContractOrder extends Model<ContractOrder> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
    /**
     * 购买的用户ID
     */
	@TableField("user_id")
	private String userId;
    /**
     * 合约ID
     */
	@TableField("contract_id")
	private Integer contractId;
    /**
     * 是否专属合约
     */
	@TableField("is_special")
	private Integer isSpecial;
    /**
     * 购买数
     */
	@TableField("buy_amount")
	private BigDecimal buyAmount;
    /**
     * 裂变数
     */
	@TableField("fission_amount")
	private BigDecimal fissionAmount;
    /**
     * 已释放数
     */
	@TableField("release_amount")
	private BigDecimal releaseAmount;
    /**
     * 每日释放率
     */
	private Float rate;
    /**
     * 是否到期
     */
	private Integer enabled;
    /**
     * 结束日期
     */
	@TableField("end_at")
	private Date endAt;
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

	public Integer getContractId() {
		return contractId;
	}

	public void setContractId(Integer contractId) {
		this.contractId = contractId;
	}

	public Integer getIsSpecial() {
		return isSpecial;
	}

	public void setIsSpecial(Integer isSpecial) {
		this.isSpecial = isSpecial;
	}

	public BigDecimal getBuyAmount() {
		return buyAmount;
	}

	public void setBuyAmount(BigDecimal buyAmount) {
		this.buyAmount = buyAmount;
	}

	public BigDecimal getFissionAmount() {
		return fissionAmount;
	}

	public void setFissionAmount(BigDecimal fissionAmount) {
		this.fissionAmount = fissionAmount;
	}

	public BigDecimal getReleaseAmount() {
		return releaseAmount;
	}

	public void setReleaseAmount(BigDecimal releaseAmount) {
		this.releaseAmount = releaseAmount;
	}

	public Float getRate() {
		return rate;
	}

	public void setRate(Float rate) {
		this.rate = rate;
	}

	public Integer getEnabled() {
		return enabled;
	}

	public void setEnabled(Integer enabled) {
		this.enabled = enabled;
	}

	public Date getEndAt() {
		return endAt;
	}

	public void setEndAt(Date endAt) {
		this.endAt = endAt;
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
