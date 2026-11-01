package DSA_Problems;

import com.DSA_NonLinear_Implementation.BST;

public class Problem_9 {
	public static void main(String[] args) {
		BST b=new BST();
		b.add(50);
		b.add(30);
		b.add(70);
		b.add(10);
		b.add(40);
		b.add(70);
		b.add(60);
		b.add(90);
		b.In_order();
		b.remove(30);
		System.out.println("____________________________");
		b.In_order();
		
	}
}
