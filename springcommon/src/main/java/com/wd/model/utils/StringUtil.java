package com.wd.model.utils;

import java.util.UUID;

public class StringUtil {

	public static String getUUId() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
}
