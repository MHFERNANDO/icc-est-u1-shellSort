package controllers;

public class SumafIBONACI {
    public int llamadasRecursivas = 1;
    public int fibonacci (int n) {
        //int idActual = llamadasRecursivas++;
        //System.out.println("LLamada"+idActual+":fibonacci("+n+")");
        if (n==0 ){
            return 0 ;
        } if (n==1){
            return 1;
        }
        //System.out.println("Llamada"+idActual+":fibonacci("+n+") -> fibonacci("+ (n-1) +") + fibonacci("+ (n-2) +")");
        return fibonacci(n-1)+fibonacci(n-2);

        ///System.out.println("Llamada"+idActual+":fibonacci("+n+") -> "+resultadoP);
        ////System.out.println("Llamada"+idActual+":fibonacci("+n+") -> fibonacci("+ (n-1) +") + fibonacci("+ (n-2) +") = "+resultadoP);
    }
}
