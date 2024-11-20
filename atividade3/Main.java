package estruturadedados.atividade3;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int input = 20;
        String result;
        Binary tree = new Binary();

        while (input != 0) {

            result = showMenu();

            if (result.equals("")) {
                JOptionPane.showMessageDialog(null, "Digite um valor numérico!");
                result = showMenu();
            } else {
                input = Integer.parseInt(result);

                switch (input) {
                    case 1:
                        String item = JOptionPane.showInputDialog("Digite um numero para inserir na arvore!");
                        tree.insert(Integer.parseInt(item));
                        break;
                    case 2:
                        String vl = JOptionPane.showInputDialog("Digite o valor que você deseja Remover!");
                        tree.remove(tree.getRoot(), Integer.parseInt(vl));
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Os valores serão exibidos no console!");
                        tree.showRoot();
                        System.out.println("");
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Os valores serão exibidos no console!");
                        System.out.println("Ordem simétrica:");
                        tree.inOrder(tree.getRoot());
                        System.out.println("");
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "Os valores serão exibidos no console!");
                        System.out.println("Pré-ordem:");
                        tree.preOrder(tree.getRoot());
                        System.out.println("");
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Os valores serão exibidos no console!");
                        System.out.println("Pós-ordem:");
                        tree.postOrder(tree.getRoot());
                        System.out.println("");
                        break;
                    case 7:
                        BinaryToMatrixConverter converter = new BinaryToMatrixConverter(tree);
                        converter.convert();
                        JOptionPane.showMessageDialog(null, "A matriz de adjacência será exibida no console.");
                        converter.printMatrix();
                        break;
                }
            }
        }
    }

    public static String showMenu() {
        String result = JOptionPane.showInputDialog("" +
                "Digite:" +
                "\n 1: Para inserir " +
                "\n 2: para Remover" +
                "\n 3: Para Exibir a Raiz " +
                "\n 4: Para Exibir ordem simétrica " +
                "\n 5: Para Exibir pré-ordem " +
                "\n 6: Para Exibir pós-ordem " +
                "\n 7: Para Exibir a matriz de adjacência " +
                "\n 0: Para Sair");

        if (result == null) {
            result = "";
        }

        return result;
    }
}