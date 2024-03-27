#include <iostream>
#include <locale>
using namespace std;

void imprimirRecursivamente(int n)
{
    if ( n == 0)
    {
        return;
    }
    else
    {
        cout << "Recursão" << endl;
        imprimirRecursivamente(n - 1);
    }
}

int main()
{
    setlocale(LC_ALL, "");

    imprimirRecursivamente(5);
    
    return 0;
}