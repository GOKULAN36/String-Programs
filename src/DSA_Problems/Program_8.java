package DSA_Problems;

import com.DSA_Linear_Implementation.Queue1;

public class Program_8 {
	public static void main(String[] args) {
		Queue1 q=new Queue1();
		q.add(10);
		q.add(30);
		q.add(20);
		q.add(30);
		System.out.println(q.poll());
		System.out.println(q.poll());
	}
}