package com.xxd.chapter_one.stackAndQueue.problem2;

public class Test2 {
	public static void main(String[] args) {
		TwoStacksQueue queue = new TwoStacksQueue();
		queue.add(4);
		queue.add(3);
		queue.add(2);
		queue.add(1);
		
		System.out.println(queue.poll());
		
		queue.add(9);
		queue.add(8);
		queue.add(7);
		queue.add(6);
		
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		
		
	}
}
