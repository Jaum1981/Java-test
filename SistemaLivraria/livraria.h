#ifndef LIVRO_H
#define LIVRO_H

#include <iostream>
#include <string>
#include <vector>

using namespace std;

class Livro {
    private:
        string nome;
        float valor;
        int quantidade;
        int id;
    public:
        Livro(string nome, float valor, int quantidade, int id) {
            this->nome = nome;
            this->valor = valor;
            this->quantidade = quantidade;
            this->id = id;
        }
        string getNome() {
            return this->nome;
        }
        float getValor() {
            return this->valor;
        }
        int getQuantidade() {
            return this->quantidade;
        }
        int getId() {
            return this->id;
        }
        void setNome(string nome) {
            this->nome = nome;
        }
        void setValor(float valor) {
            this->valor = valor;
        }
        void setQuantidade(int quantidade) {
            this->quantidade = quantidade;
        }
        void setId(int id) {
            this->id = id;
        }
};


class LivroAventura : public Livro {
    private:
        bool ilustracoes=true;
    public:
        LivroAventura(string nome, float valor, int quantidade, int id, bool ilustracoes) : Livro(nome, valor, quantidade, id) {
            this->ilustracoes = ilustracoes;
        }
        bool getIlustracoes() {
            return this->ilustracoes;
        }
};


class LivroDrama : public Livro {
    private:
        bool capaDura=true;
    public:
        LivroDrama(string nome, float valor, int quantidade, int id, bool capaDura) : Livro(nome, valor, quantidade, id) {
            this->capaDura = capaDura;
        }
        bool getCapaDura() {
            return this->capaDura;
        }
};

class LivroComedia : public Livro {
    private:
        bool capaBrochura=true;
    public:
        LivroComedia(string nome, float valor, int quantidade, int id, bool capaBrochura) : Livro(nome, valor, quantidade, id) {
            this->capaBrochura = capaBrochura;
        }
        bool getCapaBrochura() {
            return this->capaBrochura;
        }
};


class Livraria {
    private:
        vector<Livro*> livros;
        float caixa;
    public:
        Livraria() {
            this->caixa = 0;
        }

        void addLivro(Livro* livro) {
            this->livros.push_back(livro);
        }

        void venderLivro(int id, int quantidade) {
            if(this->livros.size()==0){
                cout << "Nao ha livros cadastrados" << endl << endl;
                return;
            }

            for(int i=0; i<this->livros.size(); i++) {
                if(this->livros[i]->getId()==id) {
                    if(this->livros[i]->getQuantidade()>=quantidade) {
                        this->livros[i]->setQuantidade(this->livros[i]->getQuantidade()-quantidade);
                        this->caixa += this->livros[i]->getValor()*quantidade;
                        cout << "Venda realizada com sucesso" << endl << endl;
                        return;
                    } else {
                        cout << "Quantidade insuficiente" << endl << endl;
                        return;
                    }
                }
            }
        }

        void comprarLivro(int id, int quantidade) {
            for (int i = 0; i < this->livros.size(); i++) {
                if (this->livros[i]->getId() == id) {
                    if(caixa>=livros[i]->getValor()*quantidade){
                    this->livros[i]->setQuantidade(this->livros[i]->getQuantidade() + quantidade);
                    this->caixa-=this->livros[i]->getValor()*quantidade;
                    cout << "Compra realizada com sucesso" << endl;
                    }else{
                        cout << "Caixa insuficiente" << endl;
                        return;
                    }
                }
            }
        }

        void consultarEstoque() {
            for (int i = 0; i < this->livros.size(); i++) {
                cout << "Nome: " << this->livros[i]->getNome() << endl;
                cout << "Valor: " << this->livros[i]->getValor() << endl;
                cout << "Quantidade: " << this->livros[i]->getQuantidade() << endl;
                cout << "Id: " << this->livros[i]->getId() << endl;
                cout << endl;
            }
        }

        void consultarCaixa() {
            cout << "Caixa: " << this->caixa << endl << endl;
        }

    void adicionarLivro(){
        string nome;
        float valor;
        int quantidade;
        int id;
        int tipo;
        bool ilustracoes;
        bool capaDura;
        bool capaBrochura;
        cout << "Nome: ";
        cin.ignore();
        getline(cin, nome);
        cout << "Valor: ";
        cin >> valor;
        cout << "Quantidade: ";
        cin >> quantidade;
        cout << "Id: ";
        cin >> id;
        for(int i=0; i<this->livros.size(); i++){
            if(this->livros[i]->getId()==id){
                cout << "Id ja cadastrado" << endl;
                return;
            }
        }
        cout << "Tipo(1 para Aventura)" << endl;
        cout << "Tipo(2 para Drama)" << endl;
        cout << "Tipo(3 para Comedia)" << endl;
        cin >> tipo;

        switch (tipo) {
                case 1:
                    this->addLivro(new LivroAventura(nome, valor, quantidade, id, ilustracoes));
                    break;
                case 2:
                    this->addLivro(new LivroDrama(nome, valor, quantidade, id, capaDura));
                    break;
                case 3:
                    this->addLivro(new LivroComedia(nome, valor, quantidade, id, capaBrochura));
                    break;
                default:
                    cout << "Tipo invalido" << endl;
                    break;
            }
    }
};

#endif
