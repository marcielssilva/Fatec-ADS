#include <iostream>
#include <locale>

using namespace std;

/* RECURSAO OU FUNCAO RECURSIVA : QUANDO UMA FUNCAO CHAMA ELA MESMA
NECESSITANDO TER CONDICOES CASO BASE E CASO RECURSIVO  */

void regressiva(int i)
{
    cout << i << endl;

    if (i <= 0) // CASO BASE
    {
        return;
    }
    else // CASO RECURSIVO 
    {
        regressiva (i - 1);
    }
}

int main()
{
    regressiva(10);

    return 0;
}
