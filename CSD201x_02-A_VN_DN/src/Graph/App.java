package Graph;

import java.util.Scanner;

public class App {
    // cau truc dinh
    public static class Vertex {
        private final char label;// tên đỉnh
        private boolean visited;// kiểm tra đã được duyệt chưa

        public Vertex(char label, boolean visited) {
            this.label = label;
            this.visited = visited;
        }

        /**
         * Phương thức thêm đỉnh
         * 
         * @param vertexs mảng dùng để luw các đỉnh
         * @param label   tên các đỉnh
         * @param index   vị trí của đỉnh trong mảng
         */
        public static void addVertex(Vertex[] vertexs, char label, int index) {
            // tạo đỉnh mới
            Vertex newVertex = new Vertex(label, false);
            // đưa đỉnh mới vào mảng
            vertexs[index] = newVertex;
        }

        /**
         * phương thức đánh dấu sự liên kết giữa 2 đỉnh có tạo thành 1 cạnh
         * 
         * @param matrix
         * @param x
         * @param y
         */
        public static void addEdge(boolean[][] matrix, int x, int y) {
            matrix[x][y] = true;
            matrix[y][x] = true;
        }

        public static void display(Vertex vertex) {
            System.out.print(vertex.label + " ");
        }

        public static void DFSRecursion(Vertex[] vertexs, boolean[][] matrix, int index) {
            vertexs[index].visited = true;// đánh dấu đỉnh đã được duyệt
            // in đỉnh
            display(vertexs[index]);
            // kiểm tra các đỉnh khác có được duyệt chưa
            for (int i = 0; i < vertexs.length; i++) {
                if (matrix[index][i] && vertexs[i].visited == false) {
                    DFSRecursion(vertexs, matrix, i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char label;
        int numberVertex;
        System.out.println("Nhap so dinh: ");
        numberVertex = scanner.nextInt();
        Vertex[] vertexs = new Vertex[numberVertex];
        // nhap dinh vao mang
        for (int i = 0; i < numberVertex; i++) {
            System.out.print("Nhap tien dinh: ");
            label = scanner.next().charAt(0);
            Vertex.addVertex(vertexs, label, i);
        }
        boolean[][] matrix = new boolean[numberVertex][numberVertex];
        // tao lien ket giua cac dinh
        for (int i = 0;; i++) {
            int x;
            System.out.println("Nhap hoanh do, tung do (nhap -1 de ket thuc): ");
            x = scanner.nextInt();
            if (x < 0) {
                break;
            }
            int y = scanner.nextInt();
            // them canh 
            Vertex.addEdge(matrix, x, y);
        }
        // duyet do thi
        System.out.println("Duyet do thi");
        Vertex.DFSRecursion(vertexs, matrix, 0);
    }
}
