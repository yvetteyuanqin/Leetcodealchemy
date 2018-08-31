//被三整除以
int l, r;
cin >> l >> r;
int num = 0;
int sum = 0;
for (int i = 1; i <= l; i++)
sum += i;
if (sum % 3 == 0)	num++;
for (int i = l + 1; i <= r; i++)
{
	if ((sum += i) % 3 == 0)
		num++;
}



cout << num << endl;
system("pause");
return 0;


/*相反数*/
/*	int n;
cin >> n;
int x = n;
int cn = 0;
while (x) {
cn = cn * 10 + x % 10;
x /= 10;
}
cout << n + cn << endl;
return 0;*/
/*疯狂数列*/
/*
int n, m;
cin >> m >> n;
map<int, int> mymap;
for (int i = 0; i < m; i++) {
int a, b;
cin >> a >> b;
mymap.insert(make_pair(a, b));
}
int max = INT_MIN;
map<int, int>::iterator it;
for (it = mymap.begin(); it != mymap.end(); it++) {
if (it->second > max)	max = it->second;
else
{
it->second = max;
}

}
vector<int> res;
while (n--)
{
int h;
cin >> h;
it = mymap.upper_bound(h);
it--;
res.push_back(it->second);

}

for (int i = 0; i < res.size(); i++) {
cout << res[i] << endl;
}
return 0; */

