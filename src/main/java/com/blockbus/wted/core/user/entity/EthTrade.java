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
 * 以太坊充币交易
 * </p>
 *
 * @author blockbus
 * @since 2019-08-21
 */
@TableName("eth_trades")
public class EthTrade extends Model<EthTrade> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
    /**
     * 区块哈希值
     */
	@TableField("block_hash")
	private String blockHash;
    /**
     * 区块号
     */
	@TableField("block_no")
	private String blockNo;
    /**
     * 发送地址
     */
	@TableField("from_addr")
	private String fromAddr;
    /**
     * gas的16进制值
     */
	private String gas;
    /**
     * gas价格的16进制值
     */
	@TableField("gas_price")
	private String gasPrice;
    /**
     * 交易哈希值
     */
	@TableField("transaction_hash")
	private String transactionHash;
    /**
     * input data
     */
	@TableField("input_data")
	private String inputData;
    /**
     * 接受地址/代币合约Token
     */
	@TableField("to_addr")
	private String toAddr;
    /**
     * 该交易在区块中的序号
     */
	@TableField("transaction_index")
	private String transactionIndex;
    /**
     * 交易数的16进制
     */
	private String value;
    /**
     * 交易时间
     */
	private Integer timestamp;
    /**
     * 会员ID
     */
	@TableField("user_id")
	private String userId;
    /**
     * 充币交易状态: 0交易到账 1已入账 -1拒绝
     */
	private Integer state;
	@TableField("admin_id")
	private String adminId;
    /**
     * 拒绝原因
     */
	private String remark;
	@TableField("created_at")
	private Date createdAt;
	@TableField("updated_at")
	private Date updatedAt;
    /**
     * 转矿工费交易
     */
	@TableField("miner_hash")
	private String minerHash;
    /**
     * 归集交易号
     */
	@TableField("collect_hash")
	private String collectHash;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBlockHash() {
		return blockHash;
	}

	public void setBlockHash(String blockHash) {
		this.blockHash = blockHash;
	}

	public String getBlockNo() {
		return blockNo;
	}

	public void setBlockNo(String blockNo) {
		this.blockNo = blockNo;
	}

	public String getFromAddr() {
		return fromAddr;
	}

	public void setFromAddr(String fromAddr) {
		this.fromAddr = fromAddr;
	}

	public String getGas() {
		return gas;
	}

	public void setGas(String gas) {
		this.gas = gas;
	}

	public String getGasPrice() {
		return gasPrice;
	}

	public void setGasPrice(String gasPrice) {
		this.gasPrice = gasPrice;
	}

	public String getTransactionHash() {
		return transactionHash;
	}

	public void setTransactionHash(String transactionHash) {
		this.transactionHash = transactionHash;
	}

	public String getInputData() {
		return inputData;
	}

	public void setInputData(String inputData) {
		this.inputData = inputData;
	}

	public String getToAddr() {
		return toAddr;
	}

	public void setToAddr(String toAddr) {
		this.toAddr = toAddr;
	}

	public String getTransactionIndex() {
		return transactionIndex;
	}

	public void setTransactionIndex(String transactionIndex) {
		this.transactionIndex = transactionIndex;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Integer getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Integer timestamp) {
		this.timestamp = timestamp;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
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

	public String getMinerHash() {
		return minerHash;
	}

	public void setMinerHash(String minerHash) {
		this.minerHash = minerHash;
	}

	public String getCollectHash() {
		return collectHash;
	}

	public void setCollectHash(String collectHash) {
		this.collectHash = collectHash;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
