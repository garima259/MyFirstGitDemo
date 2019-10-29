package com.sid.demo;

import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.*;

public class StreamExample {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		stringList.add("siddhantsahni");
		stringList.add("bhagjaoyahase");
		stringList.add("ice fcream");
		stringList.add("siefrwefwewed");
		stringList.add("siefrwefwewed");
		
		
		List<String> finalList = stringList.stream()
		.filter(str->str.length()>10)
		.map(String::toUpperCase)
		.distinct()
		.collect(toList());

		finalList.stream()
		.forEach(str->System.out.println(str+" HELOO"));
	}
}
