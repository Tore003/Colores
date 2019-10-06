import java.io.*;

public class Colores {

    public static void main(String[] args) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        String color;
        int numero;
        System.out.println("ingrese un numero del 1 al 7");
        numero = Integer.parseInt(bufEntrada.readLine());
        switch (numero) {
            case 1:
                System.out.println("Azul");
                break;
            case 2:
                System.out.println("Rojo");
                break;
            case 3:
                System.out.println("Amarillo");
                break;
            case 4:
                System.out.println("Verde");
                break;
            case 5:
                System.out.println("Violeta");
                break;
            case 6:
                System.out.println("Blanco");
                break;
            case 7:
                System.out.println("Negro");
                break;
            default:
                System.out.println("no es valido");
        }
    }
}
