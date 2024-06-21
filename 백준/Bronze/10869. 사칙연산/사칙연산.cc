#include <bits/stdc++.h>

using namespace std;

int main(void) {
	int a, b, na, add, minus, gop, sep;;
	cin >> a >> b;
	add = a + b;
	minus = a - b;
	gop = a * b;
	sep = a / b;
	na = a % b;
	cout << add <<'\n'<< minus << '\n' << gop << '\n' << sep << '\n' << na;
}