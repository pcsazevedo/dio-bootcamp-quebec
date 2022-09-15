package exercicio.quadrilatero;

public class Main {

    public static void main(String[] args) {

        // Quadrilátero // sobrecarga

        System.out.println("\n=======Exercício quadrilátero=======");

        Quadrilatero.area(3);
        Quadrilatero.area(5, 5);
        Quadrilatero.area(7, 8, 9);

        // metodo Quadrilátero 2

        System.out.println("\n=======Exercício quadrilátero Método2=======");

        double areaQuadrado = QuadrilateroMetodo2.area(3);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = QuadrilateroMetodo2.area(3);
        System.out.println("Área do Retangulo:" + areaRetangulo);

        double areaTrapezio = QuadrilateroMetodo2.area(3);
        System.out.println("Área do Trapézio:" + areaTrapezio);


    }
}
