package com.example.test;

import com.example.Person;
import com.example.Developer;

public class TestPerson {
	public static void main(String[] args) {
		Person bob = new Developer();
		
		bob.setName("Bob");
		System.out.println(bob.getName());
	}

}
