#include <bits/stdc++.h>

using namespace std;

int main() {
	while (true) {
		int a, b;
		cin >> a >> b;
		if (a > b)cout << "Yes"<<endl;
		else if (a < b)cout << "No"<<endl;
		else if (a==0&&b==0)break;
		else cout<<"No"<<endl;
	}
}