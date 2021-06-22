package com.fun.xml2Json.aaaa;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * @author liyiruo
 * @Description
 * @Date 2021/6/22 下午6:25
 */
public class XmlTest extends XmlExercise {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("username", "horizon");
        JSONArray jsonArray = new JSONArray();
        JSONObject dataJson = new JSONObject();
        jsonArray.add(jsonObject);
        //jsonArray.add(jsonObject);
        dataJson.put("data", jsonArray);
        System.out.println("1===>"+dataJson.toString());
        String xml = json2xml(dataJson.toString());
        System.out.println("xml=>" + xml);
        String str = xml2json(xml);
        System.out.println("to_json=>" + str);
    }
}


