package com.magic.json;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * com.magic.json
 *
 * @author jh
 * @date 2018/9/5 9:41
 * description:使用fastJson组装json
 */
public class Test2 {
	public static void main(String[] args) {
		JSONObject jsonObject = new JSONObject ();
		JSONArray jsonArray = new JSONArray ();

		JSONObject bean1 = new JSONObject ();
		bean1.put ("aa","111");
		bean1.put ("bb","222");
		jsonArray.add (bean1);
		JSONObject bean2 = new JSONObject ();
		bean2.put ("name","magic");
		bean2.put ("url","aaa");
		jsonArray.add (bean2);
		jsonObject.put("test",jsonArray);
		System.out.println (jsonObject.toJSONString ());

	}
}
