# Sistema de Gerenciamento de Pedidos - Cafeteria

## Estrutura de Dados Escolhida: Fila (com suporte para VIPs)

### Justificativa da Escolha

Considerei o uso da fila pois **FIFO (First In, First Out)**, onde os primeiros itens a entrar são os primeiros a sair. aqui faz sentido pois os pedidos devem ser processados na ordem em que chegam.

Claro, com o suporte para vips

### Regras de Negócio Implementadas

1. **FIFO (First In, First Out)**: Pedidos comuns são processados na ordem em que chegam.
2. **Clientes VIP**: Pedidos de clientes VIP têm prioridade e são processados antes de qualquer pedido comum.
3. **Cancelamento de pedidos**: Clientes podem cancelar seus pedidos, e o pedido será removido da fila.
4. **Visualização dos pedidos**: O sistema permite visualizar todos os pedidos pendentes sem removê-los da fila.
5. **Atualização de Prioridade**: A prioridade de um pedido pode ser atualizada, fazendo com que ele tenha maior ou menor prioridade.

## Funcionalidades

### 1. Adicionar um novo pedido

### 2. Processar o próximo pedido

### 3. Visualizar os pedidos na fila sem removê-los

### 4. Remover um pedido cancelado

### 5. Atualizar a prioridade do pedido na fila

## Regras de Implementação

- **Estrutura da Fila**: A fila foi implementada como um array de objetos da classe `Pedido`, com capacidade máxima definida pelo usuário.
- **Capacidade Limitada**: A fila tem um limite de capacidade. Quando esse limite é atingido, novos pedidos não podem ser adicionados até que outros sejam processados.
- **Tratamento VIP**: Ao adicionar um pedido VIP, todos os pedidos existentes são deslocados para frente e o pedido VIP é colocado na posição 0, garantindo que ele seja processado primeiro.
- **Processamento FIFO**: Quando um pedido comum é adicionado, ele é colocado no final da fila. Quando o próximo pedido é processado, o primeiro na fila é removido.
