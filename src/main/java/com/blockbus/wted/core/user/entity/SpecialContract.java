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
 * 专属合约
 * </p>
 *
 * @author blockbus
 * @since 2019-08-21
 */
@TableName("special_contracts")
public class SpecialContract extends Model<SpecialContract> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
    /**
     * 专属合约名
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
     * 抢购时间
     */
	@TableField("buy_at")
	private Date buyAt;
	@TableField("limit_num")
	private Integer limitNum;
    /**
     * 每日释放率
     */
	@TableField("release_rate")
	private Float releaseRate;
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

	public Date getBuyAt() {
		return buyAt;
	}

	public void setBuyAt(Date buyAt) {
		this.buyAt = buyAt;
	}

	public Integer getLimitNum() {
		return limitNum;
	}

	public void setLimitNum(Integer limitNum) {
		this.limitNum = limitNum;
	}

	public Float getReleaseRate() {
		return releaseRate;
	}

	public void setReleaseRate(Float releaseRate) {
		this.releaseRate = releaseRate;
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
