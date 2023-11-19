package com.example.demo;

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
		reverseVowels("race car");
		int arr[]={1};
		moveZeroes(arr);
	}

	public static String reverseVowels(String s) {
		Integer currentVol=null;
		Set<Character> vols= Stream.of('a','A','e','E','i','I','o','O','u','U')
				.collect(Collectors.toCollection(HashSet::new));

		Stack<Character> order=new Stack<>();

		char[] ss=s.toCharArray();
		for(int i=0;i<ss.length;i++){
			if(vols.contains(ss[i])){
				order.push(ss[i]);
				ss[i]='#';
			}
		}
		for(int i=0;i<ss.length;i++){
			if(ss[i]=='#'){
				ss[i]=order.pop();

			}
		}
		System.out.println(ss);
		return new String(ss);
	}
	public static void moveZeroes(int[] nums) {
		int zeros=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]==0)zeros++;
			else if((i - zeros)!=i){

					nums[i - zeros] = nums[i];
					nums[i] = 0;
				}
			}
		}
}
