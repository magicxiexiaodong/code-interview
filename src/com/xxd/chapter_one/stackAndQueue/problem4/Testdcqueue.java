package com.xxd.chapter_one.stackAndQueue.problem4;

public class Testdcqueue {
	public static void main(String[] args) {
		DogCatQueue dogCatQueue = new DogCatQueue();
		dogCatQueue.add(new Dog("dog"));
		dogCatQueue.add(new Cat("cat"));
		dogCatQueue.add(new Dog("dog"));
		dogCatQueue.add(new Cat("cat"));
		dogCatQueue.add(new Dog("dog"));
		dogCatQueue.add(new Dog("dog"));
		dogCatQueue.add(new Cat("cat"));
		
/*		System.out.println(dogCatQueue.pollAll());
		System.out.println(dogCatQueue.pollAll());
		System.out.println(dogCatQueue.pollAll());
		System.out.println(dogCatQueue.pollAll());
		System.out.println(dogCatQueue.isCatEmpty());
		System.out.println(dogCatQueue.isDogEmpty());
		System.out.println(dogCatQueue.isEmpty());
		System.out.println(dogCatQueue.pollDog());
		System.out.println(dogCatQueue.pollDog());
		System.out.println(dogCatQueue.pollDog());
		System.out.println(dogCatQueue.pollCat());
		System.out.println(dogCatQueue.pollCat());*/
		dogCatQueue.pollAll();
		dogCatQueue.pollAll();
		dogCatQueue.pollAll();
		System.out.println(dogCatQueue);
	}
}
