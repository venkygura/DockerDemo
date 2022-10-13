package com.example.DockerDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Docker")
public class DockerDemoController {
	
	@GetMapping("/Test")
	public String checkStatus () {
		
		return "Docker test message";
	}

}
