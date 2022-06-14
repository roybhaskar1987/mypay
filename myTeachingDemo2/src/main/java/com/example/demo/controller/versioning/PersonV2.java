package com.example.demo.controller.versioning;

import com.example.demo.vo.NameVo;

public class PersonV2 {
	
	
	private NameVo name;

	public NameVo getName() {
		return name;
	}

	public void setName(NameVo name) {
		this.name = name;
	}

	public PersonV2(NameVo name) {
		super();
		this.name = name;
	}

	public PersonV2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
