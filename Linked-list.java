
package linkedlist;
class Node{
    int data;
    Node next;
    public Node(int ele){
        this.data=ele;
        next=null;
    }
}
public class LinkedList {
    Node head=null,last=null; int len=0;
    public void insertFirst(int ele){
        Node newnode=new Node(ele);
        newnode.next=head;
        head=newnode;
        len++;
    }
    public boolean isEl(){
        return (len==0);
    }
    public void insertlast(int ele){
        Node curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        Node newnode =new Node(ele);
        curr.next=newnode;
        newnode.next=null;
        len++;
    }
    public void insertlast2(int ele){
        Node newnode=new Node(ele);
        if(isEl())
        { newnode.next=head;
            head=last=newnode;
        }
        else{
            last.next=newnode;
            newnode.next=null;
            last=newnode;
        }
        len++;
    }
    public void deleFirst(){
        if (len==0)
            System.out.println("is Empty");
        else {
            head=head.next;
            len--;
        }
        
    }
       public void deleLast(){
        if (len==0)
            System.out.println("is Empty");
        else {
          Node curr=head;
          while(curr.next.next!=null)
              curr=curr.next;
          curr.next=null;
          len--;
        }
        
    }
       public void find(int search){
           Node curr=head;
           while(curr!=null){
               if(curr.data==search){
                   System.out.println("Found");
                   return;
               }
               curr=curr.next;
           }
           System.out.println(" NOt Found");
       }
        public int even(){
           Node curr=head;
           int n=0;
           while(curr!=null){
               if(curr.data%2!=1){
                   n++;
               }
               curr=curr.next;
           }
           return n;

       }
       public void display(){
           Node curr=head;
             while(curr!=null){
               
                   System.out.print(curr.data+" ");
                   
               curr=curr.next;
           }
             
              System.out.println("");
       }
       public boolean ISE(){
           return (head==null);
       }
       public void revers(){
          
           Node prev=null;
          Node curr=head;
           Node next=null;
           while(curr!=null){
               next=curr.next;
               curr.next=prev;
               prev=curr;
               curr=next;
           }
           head=prev;
       }


    public static void main(String[] args) {
       LinkedList l=new LinkedList();
       l.insertFirst(91);
       l.insertFirst(32);
       l.insertFirst(44);
       l.insertFirst(64);
       l.display();
       l.revers();
       System.out.println(l.even());
       l.display();
    }
    
}
