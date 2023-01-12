import java.util.Iterator;
import java.util.Stack;

public class Trio {
	public int sol3(int[] number) {
		Stack<Integer> stack = new Stack<Integer>();
		int length = number.length;
		int sol = 0;
		int temp = 1;
		
		stack.push(0);
		
		while (true) {
			System.out.println(stack.toString() + "			" + temp);
			if (stack.size() >= 3) {
				Iterator<Integer> i = stack.iterator();
				int tot = 0;
				while (i.hasNext()) {
					tot += number[i.next()];
				}
				if (tot == 0) {
					sol++;
				}
				temp = stack.pop() + 1;
			} else {
				if (temp >= length) {
					temp = stack.pop() + 1;
					if (temp >= length) {
						if (stack.size() == 0) {
							break;
						}
						temp = stack.pop() + 1;
					}
					stack.push(temp);
					temp++;
				} else {
					stack.push(temp);
					temp++;
				}
			}
			
		}
		return sol;
	}
}
