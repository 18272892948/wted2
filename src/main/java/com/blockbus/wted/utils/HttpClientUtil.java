package com.blockbus.wted.utils;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpClientUtil {
    public static void sendMobileCode(String mobile,String code){
        String msg = "CPAY】你的验证码是"+code+"，请在5分钟内使用";
        String url = "http://39.100.86.240:18002/send.do?uid=3746&pw=074001&mb="+mobile+"&ms="+msg;
        System.out.println(url);
        HttpGet httpGet = null;
        try{
            HttpClient httpClient = HttpClients.createDefault();
            httpGet = new HttpGet(url);
            HttpResponse httpResponse = httpClient.execute(httpGet);
            HttpEntity httpEntity= httpResponse.getEntity();
            String result = "";
            if (httpEntity != null) {
                result = EntityUtils.toString(httpEntity,"utf-8");
                System.out.println(result);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            //关闭连接
            if(httpGet!= null){
                httpGet.releaseConnection();
            }
        }
    }

    public static void main(String[] args) {
        sendMobileCode("18721755326","111111");
    }
}
