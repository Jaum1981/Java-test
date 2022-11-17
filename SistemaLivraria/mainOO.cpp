#include <iostream>
#include "livraria.h"

using namespace std;

int main() {
    Livraria* livraria = new Livraria();

    int opcao;
    int qtd;
    int id;

do {
                cout << "1 - Adicionar livro" << endl;
                cout << "2 - Vender livro" << endl;
                cout << "3 - Comprar livro" << endl;
                cout << "4 - Consultar estoque" << endl;
                cout << "5 - Consultar caixa" << endl;
                cout << "0 - Sair" << endl;
                cout << "Opcao: ";
                cin >> opcao;
                cout << endl;
                switch (opcao) {
                    case 1:
                        livraria->adicionarLivro();
                        break;
                    case 2:
                        livraria->consultarEstoque();
                        cout << "Id: ";
                        cin >> id;
                        cout << "Quantidade: ";
                        cin >> qtd;
                        livraria->venderLivro(id, qtd);
                        break;
                    case 3:
                    livraria->consultarEstoque();
                        cout << "Id: ";
                        cin >> id;
                        cout << "Quantidade: ";
                        cin >> qtd;
                        livraria->comprarLivro(id, qtd);
                        break;
                    case 4:
                        livraria->consultarEstoque();
                        break;
                    case 5:
                        livraria->consultarCaixa();
                        break;
                    case 0:
                        cout << "Saindo..." << endl;
                        break;
                    default:
                        cout << "Opcao invalida" << endl;
                        break;
                }
            } while (opcao != 0);

    return 0;
}
