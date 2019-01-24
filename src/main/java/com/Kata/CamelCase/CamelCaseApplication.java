package com.Kata.CamelCase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CamelCaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamelCaseApplication.class, args);
	}

	public static String camelCase(String str) {

		String[] arr = str.split(" ");
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < arr.length; i++) {
			String[] strings = arr[i].split("");

			for (int j = 0; j < strings.length; j++) {
				if (j == 0)
					builder.append(String.valueOf(strings[j]).toUpperCase());
				else
					builder.append(String.valueOf(strings[j]).toLowerCase());
			}
		}

		return builder.toString();
		// your code here
	}

}
