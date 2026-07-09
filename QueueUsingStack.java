import java.util.*;

public class QueueUsingStack {
    static Deque<Integer> st1 = new LinkedList<>();
    static Deque<Integer> st2 = new LinkedList<>();

    static void enqueue(int val){
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
        st1.push(val);
    }
    
    static void dequeue(){
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        st2.pop();
    }

    static int peek(){
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        return st2.peek();
    }

    static void display(){

    }
    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);



    }
}

