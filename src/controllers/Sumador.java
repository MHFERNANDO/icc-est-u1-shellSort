package controllers;

public class Sumador {
    /*public int sumaConsecutivos(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumaConsecutivos(n - 1);
    }*/



    
    public int llamadasRecursivas = 1;
    public int sumaX(int n) {
        int idActual = llamadasRecursivas++;
        System.out.println("Llamada " + idActual + ": sumaX(" + n + ")");
        if (n == 1) {
            return 1;
         }
        System.out.println("Llamada " + idActual + ": sumaX(" + n + ") -> " + n + " + sumaX(" + (n - 1) + ")");
        int resultadoParcial = sumaX(n - 1);

        int resultado = n + resultadoParcial;
        System.out.println("Llamada " + idActual + ": sumaX(" + n + ") -> " + resultado);
        System.out.println("Llamada " + idActual + ": sumaX(" + n + ") -> " + n + " + " + resultadoParcial + " = " + resultado);
        return resultado;

    }
}
