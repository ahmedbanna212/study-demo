package com.example.demo;

import com.example.demo.utilis.leetCodeSolutions;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		System.out.println("server up and running");
		leetCodeSolutions object=new leetCodeSolutions();
		object.isSubsequence("abc"
				,"ahbgdc");
	}


}
