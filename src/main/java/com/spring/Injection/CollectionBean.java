package com.spring.Injection;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * com.spring.Injection
 *
 * @author jh
 * @date 2018/8/21 12:49
 * description:
 */
public class CollectionBean  {
	private Object[] arr;//数据
	private List list;//list类型注入
	private Map map;
	private Properties properties;

	public Object[] getArr() {
		return arr;
	}

	public void setArr(Object[] arr) {
		this.arr = arr;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "CollectionBean{" +
				"arr=" + Arrays.toString (arr) +
				", list=" + list +
				", map=" + map +
				", properties=" + properties +
				'}';
	}
}
