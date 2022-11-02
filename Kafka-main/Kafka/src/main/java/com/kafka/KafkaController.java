package com.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController 
{
	@Autowired
	private KafkaTemplate<String, Object> temp;
	
	private String topic = "example";
	
	@GetMapping("/message/{name}")
	public String msg(@PathVariable String name)
	{
		temp.send(topic, "Hi I am "+name);
		return "Data Published";
	}
	
	@GetMapping("/json")
	public String msg()
	{
		Student student = new Student(1, "Prasanth", "IT");
		temp.send(topic, student);
		return "Json Data Published";
	}
	
}
