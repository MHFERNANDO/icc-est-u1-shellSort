import controllers.ShellSorto;
import controllers.Sumador;
import controllers.SumafIBONACI;

public class App {
    public static void main(String[] args) throws Exception {
        /*System.out.println("Hello, World!");
        int arreglo[] = { - 10, 0,4,7,2,1,9,6 };
        boolean as=true;
        //Instanciar

        ShellSorto shell = new ShellSorto();
        //Llamar al metodo de ordenamiento
        shell.imprimir(arreglo);
        shell.sort(arreglo,true);
        shell.imprimir(arreglo);

        shell.imprimir(arreglo);
        shell.sort(arreglo,false);
        shell.imprimir(arreglo);*/

        /*Sumador sumador = new Sumador();
        sumador.sumaX(5); */

        SumafIBONACI sumafIBONACI = new SumafIBONACI();
        sumafIBONACI.fibonacci(7);
        for (int i = 0; i < 7; i++) {
            System.out.println("Fibonacci de " + i + " es: " + sumafIBONACI.fibonacci(i));
        }

        
    }
}
