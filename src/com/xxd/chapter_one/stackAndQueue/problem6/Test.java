package com.xxd.chapter_one.stackAndQueue.problem6;

public class Test {
	public static void main(String[] args) {
		HanoiProblem1 hanoi = new HanoiProblem1();
		int countStep = hanoi.hanoiProblem1(2, "left", "mid", "right");
		System.out.println(countStep);
	}
}
