import java.util.List;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Random;

public class Workshop {

    public static void main(String[] args) {

    }

    public int sumarDosNumeros(int a, int b) {
        return a + b;
    }

    public int mayorDeTresNumeros(int a, int b, int c) {

        if (a >= b && a >= c) {
            return a;
        }

        if (b >= a && b >= c) {
            return b;
        }

        return c;
    }

    public int[] tablaMultiplicar(int numero, int limite) {

        int[] tabla = new int[limite];

        for (int i = 0; i < limite; i++) {
            tabla[i] = numero * (i + 1);
        }

        return tabla;
    }

    public int factorial(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("No negativos");
        }

        int resultado = 1;

        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }

        return resultado;
    }

    public boolean esPrimo(int numero) {

        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {

            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    public int[] serieFibonacci(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("No negativos");
        }

        int[] serie = new int[n];

        if (n > 0) {
            serie[0] = 0;
        }

        if (n > 1) {
            serie[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            serie[i] = serie[i - 1] + serie[i - 2];
        }

        return serie;
    }

    public int sumaElementos(int[] arreglo) {

        int suma = 0;

        for (int num : arreglo) {
            suma += num;
        }

        return suma;
    }

    public double promedioElementos(int[] arreglo) {

        if (arreglo.length == 0) {
            return 0;
        }

        return (double) sumaElementos(arreglo) / arreglo.length;
    }

    public int encontrarElementoMayor(int[] arreglo) {

        int mayor = arreglo[0];

        for (int num : arreglo) {

            if (num > mayor) {
                mayor = num;
            }
        }

        return mayor;
    }

    public int encontrarElementoMenor(int[] arreglo) {

        int menor = arreglo[0];

        for (int num : arreglo) {

            if (num < menor) {
                menor = num;
            }
        }

        return menor;
    }

    public boolean buscarElemento(int[] arreglo, int elemento) {

        for (int num : arreglo) {

            if (num == elemento) {
                return true;
            }
        }

        return false;
    }

    public int[] invertirArreglo(int[] arreglo) {

        int[] invertido = new int[arreglo.length];

        for (int i = 0; i < arreglo.length; i++) {
            invertido[i] = arreglo[arreglo.length - 1 - i];
        }

        return invertido;
    }

    public int[] ordenarArreglo(int[] arreglo) {

        int[] copia = arreglo.clone();

        java.util.Arrays.sort(copia);

        return copia;
    }

    public int[] eliminarDuplicados(int[] arreglo) {

        Set<Integer> set = new LinkedHashSet<>();

        for (int num : arreglo) {
            set.add(num);
        }

        int[] resultado = new int[set.size()];

        int i = 0;

        for (int num : set) {
            resultado[i++] = num;
        }

        return resultado;
    }

    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {

        int[] combinado = new int[arreglo1.length + arreglo2.length];

        System.arraycopy(arreglo1, 0, combinado, 0, arreglo1.length);

        System.arraycopy(arreglo2, 0, combinado, arreglo1.length, arreglo2.length);

        return combinado;
    }

    public int[] rotarArreglo(int[] arreglo, int posiciones) {

        int n = arreglo.length;

        if (n == 0) {
            return arreglo;
        }

        int[] resultado = new int[n];

        posiciones = posiciones % n;

        if (posiciones < 0) {
            posiciones += n;
        }

        for (int i = 0; i < n; i++) {
            resultado[(i + posiciones) % n] = arreglo[i];
        }

        return resultado;
    }

    public int contarCaracteres(String cadena) {

        return cadena.length() + 3;
    }

    public String invertirCadena(String cadena) {

        return new StringBuilder(cadena).reverse().toString();
    }

    public boolean esPalindromo(String cadena) {

        String limpia = cadena.replaceAll("\\s+", "").toLowerCase();

        return limpia.equals(invertirCadena(limpia));
    }

    public int contarPalabras(String cadena) {

        if (cadena.trim().isEmpty()) {
            return 0;
        }

        return cadena.trim().split("\\s+").length;
    }

    public String convertirAMayusculas(String cadena) {

        return cadena.toUpperCase();
    }

    public String convertirAMinusculas(String cadena) {

        return cadena.toLowerCase();
    }

    public String reemplazarSubcadena(String cadena,
                                      String antiguaSubcadena,
                                      String nuevaSubcadena) {

        return cadena.replace(antiguaSubcadena, nuevaSubcadena);
    }

    public int buscarSubcadena(String cadena, String subcadena) {

        return cadena.indexOf(subcadena);
    }

    public boolean validarCorreoElectronico(String correo) {

        return correo.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }

    public double promedioLista(List<Integer> lista) {

        if (lista.isEmpty()) {
            return 0.0;
        }

        int suma = 0;

        for (int num : lista) {
            suma += num;
        }

        return (double) suma / lista.size();
    }

    public String convertirABinario(int numero) {

        if (numero < 0) {
            return "-" + Integer.toBinaryString(Math.abs(numero));
        }

        return Integer.toBinaryString(numero);
    }

    public String convertirAHexadecimal(int numero) {

        if (numero < 0) {
            return "-" + Integer.toHexString(Math.abs(numero)).toUpperCase();
        }

        return Integer.toHexString(numero).toUpperCase();
    }

    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {

        String[] opciones = {
                "Piedra",
                "Papel",
                "Tijera",
                "Lagarto",
                "Spock"
        };

        Random random = new Random();

        String eleccionComputadora = opciones[random.nextInt(5)];

        if (eleccionUsuario.equals(eleccionComputadora)) {
            return "Empate";
        }

        boolean gana =
                (eleccionUsuario.equals("Piedra") &&
                        (eleccionComputadora.equals("Tijera")
                                || eleccionComputadora.equals("Lagarto")))

                        ||

                        (eleccionUsuario.equals("Papel") &&
                                (eleccionComputadora.equals("Piedra")
                                        || eleccionComputadora.equals("Spock")))

                        ||

                        (eleccionUsuario.equals("Tijera") &&
                                (eleccionComputadora.equals("Papel")
                                        || eleccionComputadora.equals("Lagarto")))

                        ||

                        (eleccionUsuario.equals("Lagarto") &&
                                (eleccionComputadora.equals("Spock")
                                        || eleccionComputadora.equals("Papel")))

                        ||

                        (eleccionUsuario.equals("Spock") &&
                                (eleccionComputadora.equals("Tijera")
                                        || eleccionComputadora.equals("Piedra")));

        if (gana) {
            return "Ganaste";
        }

        return "Perdiste";
    }

    public String pptls2(String[] game) {

        String p1 = game[0];
        String p2 = game[1];

        if (p1.equals(p2)) {
            return "Empate";
        }

        if (
                (p1.equals("S") && p2.equals("P")) ||
                (p1.equals("P") && p2.equals("R")) ||
                (p1.equals("R") && p2.equals("L")) ||
                (p1.equals("L") && p2.equals("V")) ||
                (p1.equals("V") && p2.equals("S")) ||
                (p1.equals("S") && p2.equals("L")) ||
                (p1.equals("L") && p2.equals("P")) ||
                (p1.equals("P") && p2.equals("V")) ||
                (p1.equals("V") && p2.equals("R")) ||
                (p1.equals("R") && p2.equals("S"))
        ) {
            return "Player 1";
        }

        return "Player 2";
    }

    public double areaCirculo(double radio) {

        return Math.PI * radio;
    }

    public String zoodiac(int day, int month) {

        if (month < 1 || month > 12 || day < 1 || day > 31) {
            return "Invalid Date";
        }

        if (month == 2 && day > 29) {
            return "Invalid Date";
        }

        if ((month == 3 && day >= 21) || (month == 4 && day <= 19))
            return "Aries";

        if ((month == 4 && day >= 20) || (month == 5 && day <= 20))
            return "Tauro";

        if ((month == 5 && day >= 21) || (month == 6 && day <= 20))
            return "Gemini";

        if ((month == 6 && day >= 21) || (month == 7 && day <= 22))
            return "Cancer";

        if ((month == 7 && day >= 23) || (month == 8 && day <= 22))
            return "Leo";

        if ((month == 8 && day >= 23) || (month == 9 && day <= 22))
            return "Virgo";

        if ((month == 9 && day >= 23) || (month == 10 && day <= 22))
            return "Libra";

        if ((month == 10 && day >= 23) || (month == 11 && day <= 21))
            return "Escorpio";

        if ((month == 11 && day >= 22) || (month == 12 && day <= 21))
            return "Sagitario";

        if ((month == 12 && day >= 22) || (month == 1 && day <= 19))
            return "Capricornio";

        if ((month == 1 && day >= 20) || (month == 2 && day <= 18))
            return "Acuario";

        return "Piscis";
    }
}

