# Estrutura de Dados - Pilha

## Descrição

Este projeto implementa a estrutura de dados **Pilha** (ou **Stack**) do zero, de acordo com as regras e propriedades da pilha. A pilha segue o princípio **LIFO** (Last In, First Out), onde o último elemento inserido é o primeiro a ser removido.

## Funcionalidades da Pilha

- **Push**: Adiciona um novo elemento ao topo da pilha.
- **Pop**: Remove e retorna o elemento no topo da pilha.
- **Top**: Retorna o elemento no topo da pilha sem removê-lo.
- **isEmpty**: Verifica se a pilha está vazia.
- **isFull**: Verifica se a pilha atingiu sua capacidade máxima.

## Regras de Implementação

- A pilha possui uma capacidade máxima de 10 elementos.
- Se a pilha estiver cheia, uma exceção **"Stack Overflow"** será lançada ao tentar adicionar um novo elemento.
- Se a pilha estiver vazia, uma exceção **"Empty Stack"** será lançada ao tentar remover ou acessar o topo da pilha.
