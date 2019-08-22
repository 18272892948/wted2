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
 * 币变动记录
 * </p>
 *
 * @author blockbus
 * @since 2019-08-21
 */
@TableName("currency_records")
public class CurrencyRecord extends Model<CurrencyRecord> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
    /**
     * 用户ID
     */
	@TableField("user_id")
	private String userId;
    /**
     * 推荐分享奖的推荐的用户ID
     */
	@TableField("from_user_id")
	private String fromUserId;
    /**
     * 合约ID
     */
	@TableField("contract_id")
	private Integer contractId;
    /**
     * 推荐购买的合约ID
     */
	@TableField("from_contract_id")
	private Integer fromContractId;
    /**
     * 数量
     */
	private BigDecimal count;
    /**
     * 兑换数量
     */
	private BigDecimal amount;
	@TableField("exchange_rate")
	private Float exchangeRate;
    /**
     * 充币 1, 提币 2, 可提释放 3, 生态释放 4, 推荐 5, 领导 6, 购买合约 7
     */
	@TableField("record_type")
	private Integer recordType;
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

	public String getFromUserId() {
		return fromUserId;
	}

	public void setFromUserId(String fromUserId) {
		this.fromUserId = fromUserId;
	}

	public Integer getContractId() {
		return contractId;
	}

	public void setContractId(Integer contractId) {
		this.contractId = contractId;
	}

	public Integer getFromContractId() {
		return fromContractId;
	}

	public void setFromContractId(Integer fromContractId) {
		this.fromContractId = fromContractId;
	}

	public BigDecimal getCount() {
		return count;
	}

	public void setCount(BigDecimal count) {
		this.count = count;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Float getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(Float exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public Integer getRecordType() {
		return recordType;
	}

	public void setRecordType(Integer recordType) {
		this.recordType = recordType;
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
