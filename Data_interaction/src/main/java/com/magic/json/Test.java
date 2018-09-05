package com.magic.json;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * com.magic.json
 *
 * @author jh
 * @date 2018/9/5 9:33
 * description:使用fastJson进行解析json
 */
public class Test {
	static String jsonStr = "{\"sites\":[{\"name\":\"蚂蚁课堂\",\"url\":\"www.itmayiedu.com\"},{\"name\":\"每特教育\",\"url\":\"http://meiteedu.com/\"}]}";

	public static void main(String[] args) {
		JSONObject jsonObject = new JSONObject();
		// 将json字符串转为json object
		JSONObject jsonStrObject = jsonObject.parseObject(jsonStr);
		JSONArray jsonArray = jsonStrObject.getJSONArray("sites");
		for (Object object : jsonArray) {
			JSONObject stObject = (JSONObject) object;
			String name = stObject.getString("name");
			String url = stObject.getString("url");
			System.out.println(name + "---" + url);
		}
	}

}
