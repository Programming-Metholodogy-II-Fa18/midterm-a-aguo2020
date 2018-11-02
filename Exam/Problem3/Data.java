package problem2;
public class Data {
	public class Node{
		Node next;
		int data;
	}
	
	Node first;
	Node last;
	int size;
	int counter = 0;
	public Data(){
		first = null;
		last = null;
		size = 0;
	}
	
	public void add(int a){
		Node oldlast = last;
		last = new Node();
		last.data = a;
		last.next = null;
		if(size == 0){
			first = last;
		}
		else{
			oldlast.next = last;
		}
		size++;
	}
	
	public int remove(){
		int temp = first.data;
		first = first.next;
		size--;
		return temp;
	}
	
	
	public int getValue(int i){
		Node temp = first;
		if(i>size-1){
			return -1;
		}
		for(int j=0; j<i; j++){
			temp = temp.next;
		}
		return temp.data;
	}
	
	
	public void print(){
		Node temp = first;
		while(temp!=null){
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public int ProblemThree(Data data, int value){

		Node temp = first;
		while(temp != null){
			if(temp.data != value){
			temp = temp.next;
			counter++;
			}
			else break;
		}
		
		return counter;
	}
	
	public static void main(String[] args) {
		Data ob = new Data();
		ob.add(1);
		ob.add(9);
		ob.add(4);
		ob.add(5);
		ob.add(10);
		ob.add(0);
		ob.print();
		
		//ob.remove();
		//ob.print();
		
		System.out.println(ob.getValue(0));
		System.out.println(ob.getValue(3));
		System.out.println(ob.getValue(100));
	}
}
