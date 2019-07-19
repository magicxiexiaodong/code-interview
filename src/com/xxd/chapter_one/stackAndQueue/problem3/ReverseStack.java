package com.xxd.chapter_one.stackAndQueue.problem3;

import java.util.Stack;
/**
 * 
 * 
 * @Description:  Reverse stack implementation using only recursive function
 * @author: Xxd 
 * @date: Jul 19, 2019 10:10:06 AM 
 * @email magicxiexiaodong@163.com
 */
public class ReverseStack {
	public static int getAndRemoveLastElement(Stack<Integer> stack) {
		int result = stack.pop();
		if (stack.isEmpty()) {
			return result;
		} else {
			int last = getAndRemoveLastElement(stack);
			stack.push(result);
			return last;
		} 
	}
	public static void reverse(Stack<Integer> stack) {
		if(stack.isEmpty()) {
			return ;
		}
		int i = getAndRemoveLastElement(stack);
		reverse(stack);
		stack.push(i);
	}
}