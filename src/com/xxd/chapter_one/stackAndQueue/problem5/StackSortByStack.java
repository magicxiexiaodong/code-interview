package com.xxd.chapter_one.stackAndQueue.problem5;

import java.util.Stack;

/**
 * 
 * @Description: use stack implement other stack sort
 *
 * @author: Xxd
 * @date: Jul 23, 2019 10:31:29 AM
 * @email magicxiexiaodong@163.com
 */
public class StackSortByStack {

	public static void sortStackByStack(Stack<Integer> stack) {
		Stack<Integer> help = new Stack<Integer>();
		while (!stack.isEmpty()) {
			Integer cur = stack.pop();
			while (!help.isEmpty() && cur > help.peek()) {
				stack.push(help.pop());
			}
			help.add(cur);
		}
		while (!help.isEmpty()) {
			stack.push(help.pop());
		}
	}

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(1);
		stack.push(6);
		stack.push(1);
		stack.push(11);
		stack.push(8);
		stack.push(7);
		sortStackByStack(stack);
		System.out.println(stack);
	}
}
