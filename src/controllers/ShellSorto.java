package controllers;

public class ShellSorto {
    public void sort (int[] arreglo,boolean as){


        int l=arreglo.length;
        int cambios=0;

        for (int gap2= l/2; gap2 > 0; gap2 /= 2) {
            
            System.out.println("cambio "+(cambios+1)+" cambios en gap "+ gap2);
            for (int i = gap2; i < l; i++) {
                int temp = arreglo[i];
                int j=i;
                if (as) {
                    while (j >= gap2 && arreglo[j - gap2] > temp) {
                        arreglo[j] = arreglo[j - gap2];
                        j -= gap2;
                    }
                } else {
                    while (j >= gap2 && arreglo[j - gap2] < temp) {
                        arreglo[j] = arreglo[j - gap2];
                        j -= gap2;
                    }
                }
                arreglo[j] = temp;
            }
            imprimir(arreglo);
            cambios++;
        }
    }
    public void imprimir(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
