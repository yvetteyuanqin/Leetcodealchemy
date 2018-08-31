// neteasetest.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include "iostream"

#include <math.h>
#include <stdlib.h>
#include <string>
#include <string.h>
#include <algorithm>
#include <vector>
#include <queue>
#include <set>
#include <list>
#include <map>
#include<limits>
using namespace std;

int main()
{
	int n, k;
	cin >> n >> k;
	vector<int> a;
	int ain;
	int min = 100000, max = 0;
	int minindex, maxindex;
	vector<vector<int>> ans;
	for (int i = 0; i < n; i++) {
		
		cin >> ain;
		a.push_back(ain);
		
	}

	while ((k--) && (max - min != 0)) {
		vector<int>::iterator tallest = max_element(a.begin(), a.end());
		vector<int>::iterator shortest = min_element(a.begin(), a.end());
		min = *shortest;
		max = *tallest;
		minindex = distance(a.begin(), shortest);
		maxindex = distance(a.begin(), tallest);
		a[maxindex]--;
		a[minindex]++;
		vector<int> subans;
		subans.push_back(maxindex);
		subans.push_back(minindex);
		ans.push_back(subans);
	}
	vector<int>::iterator tallest = max_element(a.begin(), a.end());
	vector<int>::iterator shortest = min_element(a.begin(), a.end());
	min = *shortest;
	max = *tallest;
	cout << max - min << ' ' << ans.size()<<endl;
	for (int i = 0; i < ans.size(); i++) {
		cout << ans[i][0] << ' ' << ans[i][1] << endl;
	
	}
	system("pause");
	return 0;
}
