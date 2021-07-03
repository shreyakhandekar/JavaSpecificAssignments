package javaspecific;

import java.util.Scanner;

public class ReverseSLL {
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Node head = null;
    public Node tail= null;

    public void addNode(int data){
        Node newNode = new Node(data);

        if (head==null){
            head = newNode; //assign newnode as head
            tail = newNode; //assign newnode as tail
        }
        else
        {
            tail.next = newNode;    //if not null assign newnode to nextnode of tail
            tail = newNode;
        }
    }
    public void reverse(Node c){
        if (head==null){
            System.out.println("List is empty");
            return;
        }else{
            if (c.next==null){
                System.out.println(c.data+" ");
                return;
            }
            reverse(c.next);
            System.out.println(c.data+ " ");
        }
    }
    public void display(){
        Node c = head;      //assign head to current node
        if (head==null){
            System.out.println("List is empty");
            return;
        }
        while (c != null){
            System.out.println(c.data+ " ");
            c = c.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ReverseSLL list = new ReverseSLL();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);

//        System.out.println("Enter the number of elements: ");
//        int n = sc.nextInt();
//        System.out.println("Enter the list: ");
//        for (int i=1;i<n;i++) {
//            list.addNode(i);
//        }

        System.out.println("Entered list: ");
        list.display();

        System.out.println("Reversed list: ");
        list.reverse(list.head);
    }
}
