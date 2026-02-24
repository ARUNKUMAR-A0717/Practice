#include <iostream>
using namespace std;

class Node {
public:
    int data;
    Node* next;
};

Node* head = NULL;


void insert(int value) {
    Node* newNode = new Node();
    newNode->data = value;
    newNode->next = NULL;

    if(head == NULL) {
        head = newNode;
    } else {
        Node* temp = head;
        while(temp->next != NULL) {
            temp = temp->next;
        }
        temp->next = newNode;
    }
}


void deleteNode(int value) {
    if(head == NULL) {
        cout << "List is empty\n";
        return;
    }

    if(head->data == value) {
        Node* temp = head;
        head = head->next;
        delete temp;
        return;
    }

    Node* curr = head;
    while(curr->next != NULL && curr->next->data != value) {
        curr = curr->next;
    }

    if(curr->next == NULL) {
        cout << "Element not found\n";
    } else {
        Node* temp = curr->next;
        curr->next = temp->next;
        delete temp;
    }
}

void display() {
    Node* temp = head;
    if(temp == NULL) {
        cout << "List is empty\n";
        return;
    }

    while(temp != NULL) {
        cout << temp->data << " -> ";
        temp = temp->next;
    }
    cout << "NULL\n";
}

int main() {
    int choice, value;

    while(true) {
        cout << "\n1. Insert\n2. Delete\n3. Display\n4. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch(choice) {
            case 1:
                cout << "Enter value to insert: ";
                cin >> value;
                insert(value);
                break;

            case 2:
                cout << "Enter value to delete: ";
                cin >> value;
                deleteNode(value);
                break;

            case 3:
                display();
                break;

            case 4:
                return 0;

            default:
                cout << "Invalid choice\n";
        }
    }
}
