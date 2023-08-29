package DSA;
import java.util.*;
public class StackQues {
    //Question (1) :- Push at the bottom of stack
    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
        return;
        }
        int top = s.pop();
        pushAtBottom(data,s);
        s.push(top);
    }

//    Question (2) :- Reverse a stack
    public static void reverseStack(Stack<Integer> s){
        while (s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(top,s);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
//        pushAtBottom(5,s);
        reverseStack(s);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
