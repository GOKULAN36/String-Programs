package DSA_Problems;
import com.DSA_Linear_Implementation.DoubleLinkedList;
public class Problem_3 {
	public static void main(String[] args) {
		DoubleLinkedList dl=new DoubleLinkedList();
		dl.add(10);
		dl.add(20);
		dl.add(30);
		dl.add(40);
		dl.add(50);
		dl.add(60);
		dl.display();
		System.out.println(dl.contains(30));
		System.out.println(dl.isEmpty());
		System.out.println(dl.size());
		dl.revDisplay();
		dl.addIndex(25,2);
		dl.addLast(70);
		dl.display();
		System.out.println("=====================");
		dl.remove(25);
		dl.display();
		
		
	}
}
