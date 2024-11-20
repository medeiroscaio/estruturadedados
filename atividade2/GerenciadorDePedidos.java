package estruturadedados.atividade2;

public class GerenciadorDePedidos {
    private Pedido[] filaPedidos;
    private int tamanho;
    private int capacidade;

    public GerenciadorDePedidos(int capacidade) {
        this.capacidade = capacidade;
        this.filaPedidos = new Pedido[capacidade];
        this.tamanho = 0;
    }

    public void adicionarPedido(Pedido pedido) {
        if (tamanho == capacidade) {
            System.out.println("Fila cheia. Não é possível adicionar mais pedidos.");
            return;
        }

        if (pedido.isVip()) {
            for (int i = tamanho; i > 0; i--) {
                filaPedidos[i] = filaPedidos[i - 1];
            }
            filaPedidos[0] = pedido;
        } else {
            filaPedidos[tamanho] = pedido;
        }

        tamanho++;
    }

    public Pedido processarProximo() {
        if (tamanho == 0) {
            System.out.println("Não há pedidos na fila.");
            return null;
        }

        Pedido pedidoProcessado = filaPedidos[0];

        for (int i = 0; i < tamanho - 1; i++) {
            filaPedidos[i] = filaPedidos[i + 1];
        }

        filaPedidos[tamanho - 1] = null;
        tamanho--;
        return pedidoProcessado;
    }

    public void visualizarPedidos() {
        if (tamanho == 0) {
            System.out.println("Não há pedidos na fila.");
            return;
        }

        System.out.println("Pedidos na fila:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(filaPedidos[i]);
        }
    }

    public void removerPedido(int idPedido) {
        boolean encontrado = false;

        for (int i = 0; i < tamanho; i++) {
            if (filaPedidos[i].getId() == idPedido) {
                encontrado = true;

                for (int j = i; j < tamanho - 1; j++) {
                    filaPedidos[j] = filaPedidos[j + 1];
                }
                filaPedidos[tamanho - 1] = null;
                tamanho--;
                System.out.println("Pedido removido com sucesso.");
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Pedido não encontrado.");
        }
    }

    public void atualizarPrioridade(int idPedido) {
        for (int i = 0; i < tamanho; i++) {
            if (filaPedidos[i].getId() == idPedido) {
                Pedido pedidoAtualizado = filaPedidos[i];
                removerPedido(idPedido);
                adicionarPedido(pedidoAtualizado);
                System.out.println("Prioridade do pedido atualizada.");
                return;
            }
        }

        System.out.println("Pedido não encontrado.");
    }
}



