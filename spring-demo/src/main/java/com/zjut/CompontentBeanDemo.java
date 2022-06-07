package com.zjut;

import org.springframework.stereotype.Component;

/**
 * @author zoujiayang
 * @date 2022年05月18日
 */
@Component
public class CompontentBeanDemo {

	private String demoBeanName;

	public String getDemoBeanName() {
		return demoBeanName;
	}

	public void setDemoBeanName(String demoBeanName) {
		this.demoBeanName = demoBeanName;
	}
}
