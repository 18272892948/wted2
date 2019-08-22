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
 * 通过的区块号
 * </p>
 *
 * @author blockbus
 * @since 2019-08-21
 */
@TableName("eth_blocks")
public class EthBlock extends Model<EthBlock> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
    /**
     * 区块号
     */
	@TableField("block_no")
	private Integer blockNo;
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

	public Integer getBlockNo() {
		return blockNo;
	}

	public void setBlockNo(Integer blockNo) {
		this.blockNo = blockNo;
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
