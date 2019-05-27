package com.example.demo.Controller;

import com.example.demo.Model.HelloModel;
import com.example.demo.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class HelloWorld {
	private final HelloService HelloService;

	@Autowired
	public HelloWorld(HelloService HelloService) {
		this.HelloService = HelloService;
	}

	@RequestMapping("/list")
	public List<HelloModel> List() {
		return HelloService.selectAll();
	}

	@RequestMapping("/insert")
	public boolean insert(HelloModel helloModel) {
		String id = UUID.randomUUID().toString().replaceAll("-", "");
		helloModel.setId(id);
		return HelloService.insert(helloModel);
	}

	@RequestMapping(value = "/updateValue", method = RequestMethod.POST)
	public boolean updateValue(HelloModel helloModel) {
		return HelloService.updateValue(helloModel);
	}
}
