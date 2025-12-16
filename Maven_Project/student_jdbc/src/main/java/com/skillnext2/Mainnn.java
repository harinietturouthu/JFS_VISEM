import java.util.*;
class Node{
int data;
Node next;
}
Node(int d){
data=d;
next=null;
}
class Mainnn{
static void insertAtbeginning(Node,int pos,int value){
Node newNode =new Node(value);
if(pos==1){
newNode.next=temp;
return newNode;
}
Node temp=head;
for(int i=0;i<pos-1;i++){
temp=temp.next;
}
newNode.next=temp.next;
temp.next=newNode;
return head;
}
static void print(Node head){
Node temp=head;
if(head!=null){
System.out.println(temp.data+" ");
temp=temp.next;
}
System.out.println();
}
public static void main(String[] args){
Node head=new Node(10);
Node.next=new Node(20);
Node.next.next=new Node(30);
Node.next.next.next=new Node(40);
head=insertAtbeginning(Node,3,25);
print(head);
}
}
