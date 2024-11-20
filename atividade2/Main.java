package estruturadedados.atividade2;

public class Main {
    public static void main(String[] args) {
        GerenciadorDePedidos gerenciador = new GerenciadorDePedidos(10);

        Pedido p1 = new Pedido(1, "Café com leite", false);  
        Pedido p2 = new Pedido(2, "Café preto", true);   
        Pedido p3 = new Pedido(3, "Chá verde", false);   

        gerenciador.adicionarPedido(p1);
        gerenciador.adicionarPedido(p2);
        gerenciador.adicionarPedido(p3);
        System.out.println("Pedidos na fila inicialmente:");
        gerenciador.visualizarPedidos();
        System.out.println("Processando o próximo pedido:");
        Pedido processado = gerenciador.processarProximo();
        System.out.println("Pedido processado: " + processado);
        System.out.println("Pedidos restantes na fila:");
        gerenciador.visualizarPedidos();
        System.out.println("Atualizando a prioridade do Pedido 3:");
        gerenciador.atualizarPrioridade(3);
        System.out.println("Fila após a atualização de prioridade:");
        gerenciador.visualizarPedidos();
    }
}
