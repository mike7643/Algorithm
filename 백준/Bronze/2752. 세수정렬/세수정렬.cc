#include <bits/stdc++.h>

using namespace std;

int main() {
    int arr[3];

    for (int i = 0; i < 3; i++) {
        cin >> arr[i];
    }

    for (int i = 0; i < 3 - 1; i++) {
        for (int j = 0; j < 3 - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                swap(arr[j], arr[j + 1]);
            }
        }
    }

    for (int i = 0; i < 3; i++) {
        cout << arr[i] << ' ';
    }
}