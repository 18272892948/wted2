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
 * 分享奖金规则
 * </p>
 *
 * @author blockbus
 * @since 2019-08-21
 */
@TableName("recommend_awards")
public class RecommendAward extends Model<RecommendAward> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
    /**
     * 推荐的代数
     */
	private Integer generation;
    /**
     * 分享奖金比列
     */
	private Float percent;
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

	public Integer getGeneration() {
		return generation;
	}

	public void setGeneration(Integer generation) {
		this.generation = generation;
	}

	public Float getPercent() {
		return percent;
	}

	public void setPercent(Float percent) {
		this.percent = percent;
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
