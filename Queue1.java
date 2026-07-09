public class Queue1 {
    static class Node{
        int data;
        Node next;

        Node(int val){
            this.data = val;
        }
    }

    static Node front = null;
    static Node rear = null;

    static void enqueue(int val){
        Node newNode = new Node(val);
        if (front == null){
            front = newNode;
            rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = rear.next;
    }

    static void dequeue(){
        if (front == null){
            return;
        }
        front = front.next;
    }

    static int peek(){
        if (front == null){
            return -1;
        }
        return front.data;
    }

    static void reverse(){
        if (front == null)
            return;

        Node prev = null;
        Node curr = front;
        Node next;
        rear = front;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        front = prev;
    }

    static void display(){
        if (front == null)
            return;
        Node temp = front;
        while(temp != null){
            System.out.println(temp.data +" ");
            temp = temp.next;
        }
    }
    
    public static void main(String[] args) {
        enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);
        enqueue(50);
        dequeue();
        reverse();
        enqueue(20);
        
        display();

    }
    
}
