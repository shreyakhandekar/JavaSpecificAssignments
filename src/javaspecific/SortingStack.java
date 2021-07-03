package javaspecific;

import java.util.Scanner;
import java.util.Stack;

public class SortingStack {
    public static Stack<Integer> sortStack(Stack<Integer> input
    ){
        Stack<Integer> tempStack = new Stack<>();
        while (!input.isEmpty()){
            int tmp = input.pop();
            while (!tempStack.isEmpty() && tempStack.peek()>tmp){
                input.push(tempStack.pop());
            }
            tempStack.push(tmp);
        }
        return tempStack;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter Stack elements: ");
        Stack<Integer> input = new Stack<>();
        for (int i=0;i<n;i++){
            input.add(sc.nextInt());
        }
        Stack<Integer> tempStack = sortStack(input);
        System.out.println("Sorted Stack is: ");
        while (!tempStack.empty()){
            System.out.print(tempStack.pop()+" ");
        }
    }
}
