public class Main {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        
        System.out.println("Adicionando 10, 20, 30 na pilha...");
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        System.out.println("Elemento no topo: " + pilha.top());  

        
        System.out.println("Removendo do topo: " + pilha.pop());  
        System.out.println("Novo topo: " + pilha.top());  

        
        System.out.println("Esvaziando a pilha...");
        pilha.pop();  
        pilha.pop();  

        try {
            System.out.println("Tentando remover de uma pilha vazia...");
            pilha.pop();  
        } catch (Exception e) {
            System.out.println("Erro esperado: " + e.getMessage());  
        }

        
        System.out.println("Adicionando elementos até encher a pilha...");
        for (int i = 1; i <= 10; i++) {
            pilha.push(i * 10);  
        }

        try {
            System.out.println("Tentando adicionar além do limite...");
            pilha.push(110);  
        } catch (Exception e) {
            System.out.println("Erro esperado: " + e.getMessage()); 
        }
    }
}
