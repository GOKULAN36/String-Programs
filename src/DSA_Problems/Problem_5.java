package DSA_Problems;

import com.DSA_Linear_Implementation.Stack1;

public class Problem_5 {

	public static void main(String[] args) {
		Stack1 s=new Stack1();
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());

	}

}
