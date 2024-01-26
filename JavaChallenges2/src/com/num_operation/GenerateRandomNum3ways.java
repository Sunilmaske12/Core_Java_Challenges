package com.num_operation;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomNum3ways {

	public static void main(String[] args) {
		
		//way1
		float n1 =  (float) Math.random();
		System.out.println(n1);
		
		//way2
		System.out.println(ThreadLocalRandom.current().nextInt());
		System.out.println(ThreadLocalRandom.current().nextFloat());
		System.out.println(ThreadLocalRandom.current().nextDouble());
		System.out.println(ThreadLocalRandom.current().nextBoolean());
		
		//way3
		Random r=new Random();
		System.out.println(r.nextInt(100));
	}

}
