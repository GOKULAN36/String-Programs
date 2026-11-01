package DSA_Problems;

import com.DSA_Linear_Implementation.Queue;

public class Program_7 {
	public static void main(String[] args) {
		Queue q=new Queue();
		q.add(10);
		q.add(20);
		q.add(30);
		System.out.println(q.poll());
		System.out.println(q.poll());
	}
}
