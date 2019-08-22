package com.blockbus.wted.core.user.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author blockbus
 * @since 2019-08-21
 */
@TableName("users")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

	private String id;
    /**
     * 推荐人ID
     */
	@TableField("parent_id")
	private String parentId;
    /**
     * 用户手机号
     */
	private String mobile;
    /**
     * 密码
     */
	@TableField("password_digest")
	private String passwordDigest;
    /**
     * 支付密码
     */
	@TableField("pay_code")
	private String payCode;
    /**
     * 邀请码
     */
	@TableField("invite_code")
	private String inviteCode;
	private Integer generation;
    /**
     * 已购生效合约额
     */
	@TableField("contract_count")
	private Integer contractCount;
    /**
     * 所辖团队的生效合约总额
     */
	@TableField("team_contract_count")
	private Integer teamContractCount;
    /**
     * 所处领导名
     */
	@TableField("leader_name")
	private String leaderName;
	private Integer level;
	@TableField("sign_in_count")
	private Integer signInCount;
	@TableField("current_sign_in_at")
	private Date currentSignInAt;
	@TableField("last_sign_in_at")
	private Date lastSignInAt;
	@TableField("current_sign_in_ip")
	private String currentSignInIp;
	@TableField("last_sign_in_ip")
	private String lastSignInIp;
	@TableField("created_at")
	private Date createdAt;
	@TableField("updated_at")
	private Date updatedAt;
    /**
     * 团队数
     */
	@TableField("team_count")
	private Integer teamCount;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPasswordDigest() {
		return passwordDigest;
	}

	public void setPasswordDigest(String passwordDigest) {
		this.passwordDigest = passwordDigest;
	}

	public String getPayCode() {
		return payCode;
	}

	public void setPayCode(String payCode) {
		this.payCode = payCode;
	}

	public String getInviteCode() {
		return inviteCode;
	}

	public void setInviteCode(String inviteCode) {
		this.inviteCode = inviteCode;
	}

	public Integer getGeneration() {
		return generation;
	}

	public void setGeneration(Integer generation) {
		this.generation = generation;
	}

	public Integer getContractCount() {
		return contractCount;
	}

	public void setContractCount(Integer contractCount) {
		this.contractCount = contractCount;
	}

	public Integer getTeamContractCount() {
		return teamContractCount;
	}

	public void setTeamContractCount(Integer teamContractCount) {
		this.teamContractCount = teamContractCount;
	}

	public String getLeaderName() {
		return leaderName;
	}

	public void setLeaderName(String leaderName) {
		this.leaderName = leaderName;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getSignInCount() {
		return signInCount;
	}

	public void setSignInCount(Integer signInCount) {
		this.signInCount = signInCount;
	}

	public Date getCurrentSignInAt() {
		return currentSignInAt;
	}

	public void setCurrentSignInAt(Date currentSignInAt) {
		this.currentSignInAt = currentSignInAt;
	}

	public Date getLastSignInAt() {
		return lastSignInAt;
	}

	public void setLastSignInAt(Date lastSignInAt) {
		this.lastSignInAt = lastSignInAt;
	}

	public String getCurrentSignInIp() {
		return currentSignInIp;
	}

	public void setCurrentSignInIp(String currentSignInIp) {
		this.currentSignInIp = currentSignInIp;
	}

	public String getLastSignInIp() {
		return lastSignInIp;
	}

	public void setLastSignInIp(String lastSignInIp) {
		this.lastSignInIp = lastSignInIp;
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

	public Integer getTeamCount() {
		return teamCount;
	}

	public void setTeamCount(Integer teamCount) {
		this.teamCount = teamCount;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
