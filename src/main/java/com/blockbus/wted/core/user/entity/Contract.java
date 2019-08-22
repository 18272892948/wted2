package com.blockbus.wted.core.user.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.util.Date;

import java.io.Serializable;

/**
 * <p>
 * 合约
 * </p>
 *
 * @author blockbus
 * @since 2019-08-21
 */
@TableName("contracts")
public class Contract extends Model<Contract> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
    /**
     * 合约名
     */
	private String name;
    /**
     * 起订量
     */
	@TableField("set_num")
	private Integer setNum;
    /**
     * 倍数
     */
	private Integer multiple;
    /**
     * 每日释放率
     */
	@TableField("release_rate")
	private Float releaseRate;
    /**
     * 抢购时间
     */
	@TableField("buy_at")
	private Date buyAt;
	@TableField("end_at")
	private Date endAt;
    /**
     * 可购买数
     */
	@TableField("limit_num")
	private Integer limitNum;
    /**
     * 是否专属合约
     */
	@TableField("is_special")
	private Integer isSpecial;
	private Integer level;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSetNum() {
		return setNum;
	}

	public void setSetNum(Integer setNum) {
		this.setNum = setNum;
	}

	public Integer getMultiple() {
		return multiple;
	}

	public void setMultiple(Integer multiple) {
		this.multiple = multiple;
	}

	public Float getReleaseRate() {
		return releaseRate;
	}

	public void setReleaseRate(Float releaseRate) {
		this.releaseRate = releaseRate;
	}

	public Date getBuyAt() {
		return buyAt;
	}

	public void setBuyAt(Date buyAt) {
		this.buyAt = buyAt;
	}

	public Date getEndAt() {
		return endAt;
	}

	public void setEndAt(Date endAt) {
		this.endAt = endAt;
	}

	public Integer getLimitNum() {
		return limitNum;
	}

	public void setLimitNum(Integer limitNum) {
		this.limitNum = limitNum;
	}

	public Integer getIsSpecial() {
		return isSpecial;
	}

	public void setIsSpecial(Integer isSpecial) {
		this.isSpecial = isSpecial;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
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
