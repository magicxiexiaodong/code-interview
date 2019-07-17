package com.xxd.chapter_one.stackAndQueue.problem1;

import java.util.Stack;
/**
 *
 * @author: Xxd 
 * @date: Jul 17, 2019 2:58:09 PM 
 * @email magicxiexiaodong@163.com
 * 
 */
public class MyStack1 {
	private Stack<Integer> stackData;
	private Stack<Integer> stackMin;

	public MyStack1() {
		stackData = new Stack<Integer>();
		stackMin = new Stack<Integer>();
	}

	public int pop() {
		if (stackData.isEmpty()) {
			throw new RuntimeException("your stack is Empty.");
		}
		Integer value = stackData.pop();
		if (value == stackMin.peek()) {
			stackMin.pop();
		}
		return value;
	}

	public void push(int newNum) {
		stackData.push(newNum);
		if (stackMin.isEmpty()) {
			stackMin.push(newNum);
		} else if (stackMin.peek() >= newNum) {
			stackMin.push(newNum);
		}

	}

	public int getMin() {
		if (stackMin.isEmpty()) {
			throw new RuntimeException("your stack is Empty.");
		}
		return stackMin.pop();
	}
}
