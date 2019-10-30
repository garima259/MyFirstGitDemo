package com.sid.demo;

import java.util.ArrayList;
import java.util.List;
import static java.util.stream.Collectors.*;

public class StreamExample {

	public static void main(String[] args) {
		List<String> stringList = new ArrayList<>();
		//This added in Child 2 stringList.add("GarimaTyagi");
		//This added in Child 2 stringList.add("GarimaTyagi");
		//This added in Child 2 stringList.add("GarimaTyagi");
		//This added in Child 2 stringList.add("GarimaTyagi");
		stringList.add("bhagjaoyahase");
		stringList.add("ice fcream");
		stringList.add("siefrwefwewed");
		stringList.add("siefrwefwewed");
		stringList.add("changed");
		stringList.add("changedChild2");
		
		List<String> finalList = stringList.stream()
		.filter(str->str.length()>10)
		.map(String::toUpperCase)
		.distinct()
		.collect(toList());

		finalList.stream()
		.forEach(str->System.out.println(str+" HELOO"));
	}
}
