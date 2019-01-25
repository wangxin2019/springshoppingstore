package com.wd.model.utils;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * easyui分页返回工具类
 * @author yjj
 *
 */
@Data
public class PageResult implements Serializable {

	private static final long serialVersionUID = -5159099131908869593L;

	private Integer total;
	
	private List<?> rows;

	private String message;
}
