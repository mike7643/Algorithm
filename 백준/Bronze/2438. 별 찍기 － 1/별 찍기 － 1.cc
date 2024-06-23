#include <bits/stdc++.h>

using namespace std;

int main(void) {
	int n, cnt=0;
	cin >> n;

	for (int i = 0; i < n; i++) {
		while (cnt <= i) {
			cout << "*";
			cnt++;
		}
		cnt = 0;
		cout << endl;
	}
}