package controllers;

public class SumaDigitos {
    
    public int sumarDigitos(int numero) {
        if (numero < 10) {
            return numero;
        }
        return (numero % 10) + sumarDigitos(numero / 10);
    }
}
