#include <bits/stdc++.h>

using namespace std;

int main() {
    int arr[3];

    for (int i = 0; i < 3; i++) {
        cin >> arr[i];
    }

    for (int j = 0; j < 2; j++) {
        for (int k = 1; k < 3; k++) {
            if (arr[j] > arr[k]) {
                int temp;
                temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
            }
        }
    }

    for (int n = 0; n < 3; n++) {
        cout << arr[n] << ' ';
    }
}