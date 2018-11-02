package problem2;
public class problem3 {
	
	
	
	public static void main(String[] args) {
		Data ob = new Data();
		ob.add(1);
		ob.add(5);
		ob.add(8);
		ob.add(10);
		ob.add(12);
		ob.add(14);
		System.out.print("number of comparisons: " + ob.ProblemThree(ob, 10));
		
	}
}
