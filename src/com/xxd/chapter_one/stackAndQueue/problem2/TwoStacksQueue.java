package com.xxd.chapter_one.stackAndQueue.problem2;

import java.util.Stack;

/**
 * 
 * 
 * @Description: two stack implement a queue function (add , pop , peek)
 * @author: Xxd
 * @date: Jul 18, 2019 2:57:37 PM
 * @email magicxiexiaodong@163.com
 */
public class TwoStacksQueue {
	public Stack<Integer> stackPush;
	public Stack<Integer> stackPop;

	public TwoStacksQueue() {
		stackPush = new Stack<Integer>();
		stackPop = new Stack<Integer>();
	}

	// pushStack element to popStack
	public void pushToPop() {
		if (stackPop.isEmpty()) {
			while (!stackPush.isEmpty()) {
				stackPop.add(stackPush.pop());
			}
		}
	}

	public void add(int pushInt) {
		stackPush.push(pushInt);
		pushToPop();
	}

	public int poll() {
		if(stackPop.isEmpty() && stackPush.isEmpty()) {
			throw new RuntimeException("Queue is empty!");
		}
		pushToPop();
		return stackPop.pop();
	}

	public int peek() {
		if(stackPop.isEmpty() && stackPush.isEmpty()) {
			throw new RuntimeException("Queue is empty!");
		}
		pushToPop();
		return stackPop.peek();
	}

}
