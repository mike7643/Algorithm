#include <bits/stdc++.h>

using namespace std;

int main(void) {
	int sco;
	cin >> sco;
	switch (sco / 10) {
	case 10:
	case 9:
		cout << "A";
		break;
	case 8:
		cout << "B";
		break;
	case 7:
		cout << "C";
		break;
	case 6:
		cout << "D";
		break;
	default:
		cout << "F";
		break;
	}
	return 0;
}