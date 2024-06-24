#include <bits/stdc++.h>

using namespace std;

int main() {
	int count = 0;
	while (true) {
		int n=0;
		cin >> n;
		n *= 3;
		if (n == 0) break;

		if (n % 2 == 0) {
			count++;
			cout << count << ". even ";
			n /= 2;
		}

		else if(n % 2 != 0) {
			count++;
			cout <<count<< ". odd ";
			n = (n + 1) / 2;
		}

		n*=3;
		n /= 9;
		cout << n<<endl;
	}
}