#include <iostream>
using namespace std;

class Student {
public:
    int id;
    string name;

    void input() {
        cout << "Enter ID: ";
        cin >> id;
        cout << "Enter Name: ";
        cin >> name;
    }

    void display() {
        cout << "Student ID: " << id << endl;
        cout << "Student Name: " << name << endl;
    }
};

int main() {
    Student s1;   // object creation

    s1.input();   // calling member function
    s1.display();

    return 0;
}
