package com.entity.vo;

import com.entity.LijiebiyeshengjiuyexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 历届毕业生就业信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-28 16:38:19
 */
public class LijiebiyeshengjiuyexinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 入职单位
	 */
	
	private String ruzhidanwei;
		
	/**
	 * 入职人数
	 */
	
	private Integer ruzhirenshu;
		
	/**
	 * 薪酬
	 */
	
	private Integer xinchou;
		
	/**
	 * 其他待遇
	 */
	
	private String qitadaiyu;
				
	
	/**
	 * 设置：入职单位
	 */
	 
	public void setRuzhidanwei(String ruzhidanwei) {
		this.ruzhidanwei = ruzhidanwei;
	}
	
	/**
	 * 获取：入职单位
	 */
	public String getRuzhidanwei() {
		return ruzhidanwei;
	}
				
	
	/**
	 * 设置：入职人数
	 */
	 
	public void setRuzhirenshu(Integer ruzhirenshu) {
		this.ruzhirenshu = ruzhirenshu;
	}
	
	/**
	 * 获取：入职人数
	 */
	public Integer getRuzhirenshu() {
		return ruzhirenshu;
	}
				
	
	/**
	 * 设置：薪酬
	 */
	 
	public void setXinchou(Integer xinchou) {
		this.xinchou = xinchou;
	}
	
	/**
	 * 获取：薪酬
	 */
	public Integer getXinchou() {
		return xinchou;
	}
				
	
	/**
	 * 设置：其他待遇
	 */
	 
	public void setQitadaiyu(String qitadaiyu) {
		this.qitadaiyu = qitadaiyu;
	}
	
	/**
	 * 获取：其他待遇
	 */
	public String getQitadaiyu() {
		return qitadaiyu;
	}
			
}
