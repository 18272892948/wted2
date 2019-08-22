/**
 * 说明：MD5非摘要算法
 * 日期：Apr 10, 2014 创建文件
 */
package com.blockbus.wted.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MacMD5 {
	private static byte[] digesta;

	/**
	 * 对字符串进行MD5加密
	 * 
	 * @param myinfo
	 *            需要加密的字符串
	 * @return 通过MD5加密后的字符串
	 */
	public static String CalcMD5(String myinfo) {
		return CalcMD5(myinfo, 15);
	}
	
	public static String CalcMD5Member(String myinfo) {
		return CalcMD5(myinfo, 25);
	}

	/**
	 * 对字符串进行MD5加密
	 * 
	 * @param myinfo
	 *            需要加密的字符串
	 * @return 通过MD5加密后的字符串
	 */
	public static String CalcMD5(String myinfo, int length) {
		try {
			MessageDigest alga = MessageDigest.getInstance("MD5");
			alga.update(myinfo.getBytes());
			digesta = alga.digest();
		} catch (NoSuchAlgorithmException ex) {
			ex.printStackTrace();
		}
		return byte2hex(digesta, length);

	}

	private static String byte2hex(byte[] b, int length) { // 二行制转字符串
		String hs = "";
		String stmp = "";
		for (int n = 0; n < b.length; n++) {
			stmp = (Integer.toHexString(b[n] & 0XFF));
			if (stmp.length() == 1)
				hs = hs + "0" + stmp;
			else
				hs = hs + stmp;
		}

		// return hs;
		// 2012.11.12
		return hs.substring(0, length);
	}

	public static void main(String[] args) {
		MacMD5 md5 = new MacMD5();
		System.out.println(md5.CalcMD5("api_key=ac181497-4866-4ed8-803b-93887c2c6ac8", 32));
	}

}
