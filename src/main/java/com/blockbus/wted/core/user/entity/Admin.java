package com.blockbus.wted.core.user.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 * 后台管理账户
 * </p>
 *
 * @author blockbus
 * @since 2019-08-21
 */
@TableName("admins")
public class Admin extends Model<Admin> {

    private static final long serialVersionUID = 1L;

	private String id;
    /**
     * 账号名
     */
	@TableField("nick_name")
	private String nickName;
    /**
     * 密码
     */
	@TableField("password_digest")
	private String passwordDigest;
    /**
     * Access Token
     */
	@TableField("access_token")
	private String accessToken;
	@TableField("created_at")
	private Date createdAt;
	@TableField("updated_at")
	private Date updatedAt;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getPasswordDigest() {
		return passwordDigest;
	}

	public void setPasswordDigest(String passwordDigest) {
		this.passwordDigest = passwordDigest;
	}

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
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
