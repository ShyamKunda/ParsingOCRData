

public class ListNode {
	private int data;
	private ListNode next;
	public ListNode(int data){
		this.data = data;
	}
	public void setData(int data){
		this.data = data;
	}
	public  ListNode(){
		this.data = 0 ;
	}
	public int getData(){
		return data;
	}
	public void setNext(ListNode next){
		this.next = next;
	}
	public ListNode getNext(){
		return this.next;
	}
	
	public static void main(String[] args){
		ListNode a = new ListNode(5);
		ListNode b = new ListNode(6);
		ListNode c = new ListNode();
		ListNode d;
		c.setData(10);
		a.setNext(b);
		b.setNext(c);
		c.setNext(null);
		d = a;
		for(int i=1;i<=3;i++){
			System.out.println(d.getData());
			d = d.next ;
			
		}
	}
}

