package com.xxd.chapter_one.stackAndQueue.problem1;

public class Test1 {
		public static void main(String[] args) {
			MyStack2 myStack1 = new MyStack2();
			myStack1.push(2);
			myStack1.push(3);
			myStack1.push(4);
			myStack1.push(6);
			myStack1.push(8);
			myStack1.push(1);
			myStack1.pop();
			myStack1.pop();
			myStack1.pop();
			System.out.println(myStack1.getMin());
		}
}
