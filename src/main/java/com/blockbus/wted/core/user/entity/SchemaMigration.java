package com.blockbus.wted.core.user.entity;

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
@TableName("schema_migrations")
public class SchemaMigration extends Model<SchemaMigration> {

    private static final long serialVersionUID = 1L;

	private String version;


	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	protected Serializable pkVal() {
		return this.version;
	}

}
