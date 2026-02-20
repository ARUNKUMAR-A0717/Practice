class queueArray {
    int[] Queue = new int[10];
    int front = 0;
    int rear = -1;

    void enqueue(int value) {
        if (rear == 9) {
            System.out.println("Queue Overflow");
        } else {
            Queue[++rear] = value;
            System.out.println("Element added: " + value);
        }
    }

    void dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println("Element removed: " + Queue[front]);
            front++;
        }
    }

    void peek() {
        if (front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front element: " + Queue[front]);
        }
    }

    void display() {
        if (front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue elements:");
            for (int i = front; i <= rear; i++) {
                System.out.println(Queue[i]);
            }
        }
    }

    public static void main(String[] args) {
        queueArray q = new queueArray();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();
        q.peek();

        q.dequeue();
        q.display();

        q.peek();
    }
}
