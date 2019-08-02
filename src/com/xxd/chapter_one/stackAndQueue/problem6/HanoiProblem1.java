package com.xxd.chapter_one.stackAndQueue.problem6;

public class HanoiProblem1 {
	public int hanoiProblem1(int num, String left, String mid, String right) {
		if (num < 1) {
			return 0;
		}
		return process(num, left, mid, right, left, right);
	}

	private int process(int num, String left, String mid, String right, String from, String to) {
		if(num == 1) { // Recursive end condition
			if(from.equals(mid) || to.equals(mid)) { 
				// from 在中 则其实 to 就在 左或者右 那么也只需要 一步就能移 即  from -> to
				// to 在中 那么其实 from在左或者在右 那么from 到to(中) 也是一步到位哦
				System.out.println("Move 1 from " + from + " to " + to);
				return 1;
			} else {
				// 说明 左与中 相隔两地 不管在哪 都是 from -> mid  mid -> to
				System.out.println("Move 1 from " + from + " to " + mid);
				System.out.println("Move 1 from " + mid + " to " + to);
				return 2;
			}
		}
		if(from.equals(mid) || to.equals(mid)) {
			String another = (from.equals(left) || to.equals(left)) ? right : left ;
			int part1 = process(num - 1, left, mid, right, from, another);
			int part2 = 1;
			System.out.println("Move " + num + " from " + from + " to " + to);
			int part3 = process(num - 1, left, mid, right, another, to);
			return part1 + part2 + part3;
		} else {
			int part1 = process(num - 1, left, mid, right, from, to);
			int part2 = 1;
			System.out.println("Move " + num + " from " + from + " to " + mid);
			int part3 = process(num - 1, left, mid, right, to, from);
			int part4 = 1;
			System.out.println("Move " + num + " from " + mid + " to " + to);
			int part5 = process(num - 1, left, mid, right, from, to);
			return part1 + part2 + part3 + part4 + part5;
		}
	}
}
