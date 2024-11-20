package estruturadedados.atividade3;

import java.util.HashMap;
import java.util.Map;

public class BinaryToMatrixConverter {

    private Binary binaryTree;
    private Map<Node, Integer> nodeIndexMap;
    private int[][] adjacencyMatrix;
    private int indexCounter;

    public BinaryToMatrixConverter(Binary binaryTree) {
        this.binaryTree = binaryTree;
        this.nodeIndexMap = new HashMap<>();
        this.indexCounter = 0;
    }

    public int[][] convert() {
        int size = countNodes(binaryTree.getRoot());
        adjacencyMatrix = new int[size][size];
        mapNodes(binaryTree.getRoot());
        fillMatrix(binaryTree.getRoot());
        return adjacencyMatrix;
    }

    private int countNodes(Node node) {
        if (node == null) return 0;
        return 1 + countNodes(node.getLeft()) + countNodes(node.getRight());
    }

    private void mapNodes(Node node) {
        if (node != null) {
            nodeIndexMap.put(node, indexCounter++);
            mapNodes(node.getLeft());
            mapNodes(node.getRight());
        }
    }

    private void fillMatrix(Node node) {
        if (node == null) return;

        int currentIndex = nodeIndexMap.get(node);
        if (node.getLeft() != null) {
            int leftIndex = nodeIndexMap.get(node.getLeft());
            adjacencyMatrix[currentIndex][leftIndex] = 1;
        }
        if (node.getRight() != null) {
            int rightIndex = nodeIndexMap.get(node.getRight());
            adjacencyMatrix[currentIndex][rightIndex] = 1;
        }

        fillMatrix(node.getLeft());
        fillMatrix(node.getRight());
    }

    public void printMatrix() {
        if (adjacencyMatrix == null) {
            System.out.println("Não gerada.");
            return;
        }

        System.out.println("Matriz de Adjacência:");
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j = 0; j < adjacencyMatrix[i].length; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
