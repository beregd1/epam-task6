package com.epam.rd.java.basic.practice6;

import com.epam.rd.java.basic.practice6.part1.Part1;
import com.epam.rd.java.basic.practice6.part2.Part2;
import com.epam.rd.java.basic.practice6.part3.Part3;
import com.epam.rd.java.basic.practice6.part4.Part4;
import com.epam.rd.java.basic.practice6.part5.Part5;
import com.epam.rd.java.basic.practice6.part6.Part6;

public class Demo {
	private static final String FILE_NAME = "part6.txt";

	public static void main(String[] args) {
System.out.println("Part1: ");
		Part1.main();
		System.out.println("Part2: ");
		Part2.main(null);
		System.out.println("Part3: ");
		Part3.main(null);
		System.out.println("Part4: ");
		Part4.main(null);
		System.out.println("Part5: ");
		Part5.main(null);
		System.out.println("Part6: ");
		Part6.main(new String[]{"--input", FILE_NAME, "--task", "frequency"});
		Part6.main(new String[]{"-i", FILE_NAME, "-t", "length"});
		Part6.main(new String[]{"--input", FILE_NAME, "-t", "duplicates"});
	}

}
