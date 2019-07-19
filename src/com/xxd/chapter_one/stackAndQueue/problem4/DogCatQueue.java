package com.xxd.chapter_one.stackAndQueue.problem4;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * 
 * @Description: Dog and cat queue
 *
 * @author: Xxd
 * @date: Jul 19, 2019 10:26:37 AM
 * @email magicxiexiaodong@163.com
 */
public class DogCatQueue {
	public Queue<PetEnterQueue> dogQ;
	public Queue<PetEnterQueue> catQ;
	public long count;

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		while (!isEmpty()) {
			Pet pet = pollAll();
			sb.append(pet.toString()).append("\t");
		}
		return sb.toString();
	}

	public DogCatQueue() {
		dogQ = new LinkedList<PetEnterQueue>();
		catQ = new LinkedList<PetEnterQueue>();
		count = 0;
	}

	public void add(Pet pet) {
		if ("dog".equals(pet.getType())) {
			this.dogQ.add(new PetEnterQueue(pet, count++));
		} else if ("cat".equals(pet.getType())) {
			this.catQ.add(new PetEnterQueue(pet, count++));
		} else {
			throw new RuntimeException("err,no dog or cat.");
		}
	}

	public Pet pollAll() {
		if (!this.dogQ.isEmpty() && !this.catQ.isEmpty()) {
			if (this.dogQ.peek().getCount() < this.catQ.peek().getCount()) {
				return this.dogQ.poll().getPet();
			} else {
				return this.catQ.poll().getPet();
			}
		} else if (!this.dogQ.isEmpty()) {
			return this.dogQ.poll().getPet();
		} else if (!this.catQ.isEmpty()) {
			return this.catQ.poll().getPet();
		} else {
			throw new RuntimeException("err, queue is Empty");
		}
	}

	public Dog pollDog() {
		if (!this.isDogEmpty()) {
			return (Dog) this.dogQ.poll().getPet();
		} else {
			throw new RuntimeException("Dog queue is Empty");
		}
	}

	public Cat pollCat() {
		if (!this.isCatEmpty()) {
			return (Cat) this.catQ.poll().getPet();
		} else {
			throw new RuntimeException("cat queue is Empty");
		}
	}

	public boolean isEmpty() {
		return this.dogQ.isEmpty() && this.catQ.isEmpty();
	}

	public boolean isDogEmpty() {
		return this.dogQ.isEmpty();
	}

	public boolean isCatEmpty() {
		return this.catQ.isEmpty();
	}

}

class PetEnterQueue {
	private Pet pet;
	private long count;

	public PetEnterQueue() {

	}

	public PetEnterQueue(Pet pet, long count) {
		this.pet = pet;
		this.count = count;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public long getCount() {
		return count;
	}

	public void setCount(long count) {
		this.count = count;
	}
}

class Pet {
	private String type;

	public String getType() {
		return type;
	}

	public Pet(String type) {
		this.type = type;
	}

	public String toString() {
		return type;
	}
}

class Dog extends Pet {
	public Dog(String type) {
		super("dog");
	}
}

class Cat extends Pet {
	public Cat(String type) {
		super("cat");
	}
}