#include <iostream>
using namespace std;

// EXEMPLO COM RECURSAO 

int somaRecursiva(int n)
{
    if ( n == 0) 
    {
        return 0;
    }
    else
    {
        return n + somaRecursiva(n - 1);
    }
}

int main()
{
    cout << somaRecursiva(5) << endl;

    return 0;

}

/*
EXEMPLO COM REPETICAO 

#include <iostream>
using namespace std;

int somaFor(int n)
{
    int soma = 0;
    for(int i = 0; i <= n; i++)
    {
        soma += i;
    }
    return soma;
}

int main()
{
    cout << somaFor(5) << endl;
    return 0;
}
*/