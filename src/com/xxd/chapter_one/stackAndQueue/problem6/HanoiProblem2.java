package com.xxd.chapter_one.stackAndQueue.problem6;

import java.util.Stack;

public class HanoiProblem2 {
	
	public enum Action {
		No, LToM, MToL, MToR, RToM
	}

	public int hanoiProblem2(int num, String left, String mid, String right) {
		Stack<Integer> lS = new Stack<Integer>();
		Stack<Integer> mS = new Stack<Integer>();
		Stack<Integer> rS = new Stack<Integer>();

		lS.push(Integer.MAX_VALUE);
		mS.push(Integer.MAX_VALUE);
		rS.push(Integer.MAX_VALUE);

		for (int i = num; i > 0; i--) {
			lS.push(i);
		}

		Action[] record = { Action.No };
		int step = 0;
		
		while (rS.size() != num + 1) {
			//  Action.LToM, Action.MToL 这个说明一下，因为第一个是上一步走的，那么下一步 是必走这样的，
			// 打个比方说  上一步是 LToM 那么下一步 只能有 MToL LToM MToR LToR 排除法 可知 只有LToM
			step += fStackTotStack(record, Action.LToM, Action.MToL, mS, lS, mid, left);
			step += fStackTotStack(record, Action.MToR, Action.RToM, rS, mS, right, mid);
			step += fStackTotStack(record, Action.MToL, Action.LToM, lS, mS, left, mid);
			step += fStackTotStack(record, Action.RToM, Action.MToR, mS, rS, mid, right);
		}
		
		return step;
	}
	public static int fStackTotStack(Action[] record, Action preNoAct, Action nowAct, Stack<Integer> fStack,
			Stack<Integer> tStack, String from, String to) {

		if (record[0] != preNoAct && fStack.peek() < tStack.peek()) {
			// 也就是说 现在 我要走  MToL 那我的前一步 一定不能是LToM 不然没有意义，然后根据小压大的原则就只有一个动作满足
			tStack.push(fStack.pop());
			System.out.println("Move " + tStack.peek() + " from " + from + " to " + to);
			record[0] = nowAct;
			return 1;
		}
		return 0;
	}

}
