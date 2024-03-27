#include <iostream>
#include <locale>
using namespace std;

int main()
{
    setlocale(LC_ALL, "");

    for (int i = 0; i < 5; i++)
    {
        cout << "Recursão"<< endl;
    }
    
    return 0;

}