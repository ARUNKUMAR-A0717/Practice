#include <iostream>
#include <map>
using namespace std;

int main() {
    int n, x;
    map<int, int> freq;

    cout << "Enter number of elements: ";
    cin >> n;

    cout << "Enter elements:\n";
    for(int i = 0; i < n; i++) {
        cin >> x;
        freq[x]++;   // count frequency
    }

    cout << "\nElement : Frequency\n";
    for(auto it : freq) {
        cout << it.first << " : " << it.second << endl;
    }

    return 0;
}
