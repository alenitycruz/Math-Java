package pratica.exemplo;

public class Main {
    public static void main(String[] args) {
        //PI = Math.PI

        // exponenciação
        double exponenciacao = Math.pow(5,2);
        System.out.println(exponenciacao);

        //raiz quadrada
        double raiz = Math.sqrt(25);
        System.out.println(raiz);

        //raiz cúbica
        double cubica = Math.cbrt(27);
        System.out.println(cubica);

        double numero = cubica * Math.PI;
        System.out.println(numero);

    }
}
