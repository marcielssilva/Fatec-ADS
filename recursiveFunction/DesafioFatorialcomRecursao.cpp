#include <iostream>
#include <locale>

using namespace std;

int calcularFatorial(int n)
{
    if ( n == 0)
    {
        return 1;
    }
    else
    {
        return n * calcularFatorial(n - 1);
    }
}
int main()
{
    setlocale(LC_ALL, "");

    cout << calcularFatorial(5) << endl;

    return 0;

}