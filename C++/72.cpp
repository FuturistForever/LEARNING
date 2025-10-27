//Write a C++ program to check balanced paretheses using Stack.

#include <iostream>
#include <stack>
using namespace std;

bool isBalanced(string s) {
    stack<char> st;
    for (char c : s) {
        if (c == '(' || c == '{' || c == '[')
            st.push(c);
        else {
            if (st.empty()) return false;
            char top = st.top();
            st.pop();
            if ((c == ')' && top != '(') ||
                (c == '}' && top != '{') ||
                (c == ']' && top != '['))
                return false;
        }
    }
    return st.empty();
}

int main() {
    string s;
    cin >> s;
    if (isBalanced(s))
        cout << "Balanced";
    else
        cout << "Not Balanced";
    return 0;
}
