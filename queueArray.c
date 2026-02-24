#include <stdio.h>
#define SIZE 5  

int queue[SIZE];
int front = -1, rear = -1;


void enqueue(int value) {
    if(rear == SIZE - 1) {
        printf("Queue Overflow\n");
    } else {
        if(front == -1)   
            front = 0;
        rear++;
        queue[rear] = value;
        printf("Enqueued %d into queue\n", value);
    }
}


void dequeue() {
    if(front == -1 || front > rear) {
        printf("Queue Underflow\n");
    } else {
        printf("Dequeued element = %d\n", queue[front]);
        front++;
    }
}


void peek() {
    if(front == -1 || front > rear) {
        printf("Queue is empty\n");
    } else {
        printf("Front element = %d\n", queue[front]);
    }
}

// Display queue
void display() {
    if(front == -1 || front > rear) {
        printf("Queue is empty\n");
    } else {
        printf("Queue elements:\n");
        for(int i = front; i <= rear; i++) {
            printf("%d ", queue[i]);
        }
    }
}

int main() {
    int choice, value;

    while(1) {
        printf("\n--- QUEUE MENU ---\n");
        printf("1. Enqueue\n2. Dequeue\n3. Peek\n4. Display\n5. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch(choice) {
            case 1:
                printf("Enter value to enqueue: ");
                scanf("%d", &value);
                enqueue(value);
                break;

            case 2:
                dequeue();
                break;

            case 3:
                peek();
                break;

            case 4:
                display();
                break;

            case 5:
                return 0;

            default:
                printf("Invalid choice\n");
        }
    }
}
