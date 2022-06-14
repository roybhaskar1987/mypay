package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.versioning.PersonV1;
import com.example.demo.controller.versioning.PersonV2;
import com.example.demo.vo.NameVo;

@RestController
public class PersonVersioningController {

	@GetMapping("personController/v1/person")
	public PersonV1 PersonV1() {
		return new PersonV1("Shubhdeep Roy");
	}
	
	@GetMapping("personController/v2/person")
	public PersonV2   PersonV2() {
		return new PersonV2(new NameVo("Bhaskar", "Roy") );
	}
	
	
	//  Way 2
	
	@GetMapping(value= "personController/getPerson" , params="version=1")
	public PersonV1 PersonV11() {
		return new PersonV1("Shubhdeep Roy");
	}
	
	@GetMapping(value= "personController/getPerson" ,  params="version=2" )
	public PersonV2   PersonV12() {
		return new PersonV2(new NameVo("Bhaskar", "Roy") );
	}
	
	// Way 3
	@GetMapping(value= "personController/getPerson/atHeader" , headers = "X-API-VERSION=1" )
	public PersonV1 PersonV111() {
		return new PersonV1("Shubhdeep Roy");
	}
	
	@GetMapping(value= "personController/getPerson/atHeader" ,   headers = "X-API-VERSION=2" )
	public PersonV2   PersonV112() {
		return new PersonV2(new NameVo("Bhaskar", "Roy") );
	}
	
	// pRODUCER WAY 4   (Also Known As MIME Versioning )
	
	@GetMapping(value= "personController/getPerson/producers" , produces = "application/gemini.api-v1+json" )
	public PersonV1 PersonV1111() {
		return new PersonV1("Shubhdeep Roy");
	}
	
	@GetMapping(value= "personController/producers" ,   produces = "application/gemini.api-v2+json")
	public PersonV2   PersonV1112() {
		return new PersonV2(new NameVo("Bhaskar", "Roy") );
	}
	
}
