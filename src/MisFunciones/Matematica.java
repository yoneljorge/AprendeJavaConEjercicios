package MisFunciones;

public class Matematica {

    /**
     * Función que al introducirle un número lo devuelve pero al revés.
     * 
     * @param x el número que se quiere voltear.
     * @return <code>numero</code> el número volteado.
     */
    public static long voltea(long x) {
        long numero = 0;
        while (x > 0) {
            long digito = x % 10;
            numero += digito;
            if (x > 10) {
                numero *= 10;
            }
            x /= 10;
        }
        return numero;
    }

    /**
     * Función mediante la cual se extrae un dígito de un número.
     * 
     * @param x     : un número.
     * @param index : posición en la que se encuentra el dígito.
     * @return <code>digito</code> retorna el dígito.
     */
    public static int digitoN(long x, int index) {
        long digito = 0;
        int contador = 0;
        long xVirado = voltea(x);
        while (contador <= index) {
            contador++;
            if (contador == index) {
                digito = xVirado % 10;
                break;
            }
            xVirado /= 10;
        }
        return (int) digito;
    }

    /**
     * Función que te dice la cantidad de dígitos de un número.
     * 
     * @param x : un número.
     * @return <code>digitos</code> devuelve la cantidad de dígitos de un número.
     */
    public static int digitos(long x) {
        int digitos = 0;
        while (x > 0) {
            digitos++;
            x /= 10;
        }
        return digitos;
    }

    /**
     * Función que dice si un número es capicúa o no. Un número es capicúa cunando
     * se lee igual de izquierda a derecha que de derecha a izquierda.
     * 
     * @param x el número que se quiere saber si es capicúa o no.
     * @return <code>true</code> si el número es capicúa.
     * @return <code>false</code> si el número no es capicúa.
     */
    public static boolean esCapicua(long x) {
        long xVolteado = voltea(x);
        if (x == xVolteado) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Función que verifica si un número es primo o no. Un número es primo cuando
     * solo es divisible por el y por 1.
     * 
     * @param x el número que se quiere verificar si es primo o no.
     * @return <code>true</code> si el número es primo.
     * @return <code>false</code> si el número no es primo.
     */
    public static boolean esPrimo(long x) {
        boolean primo = true;
        for (int j = 2; j < x; j++) {
            if (x % j == 0) {
                primo = false;
                break;
            }
        }
        return primo;
    }

    /**
     * Función que devuelve el menor primo que es mayor al número que se pasa como
     * parámetro.
     * 
     * @param x el número primo del cual se desea hallar el menor siguiente.
     * @return <code>numero</code> retorna el núermo primo menor al siguiente al
     *         introducido.
     */
    public static long siguientePrimo(long x) {
        long numero = x;
        if (esPrimo(x)) {
            boolean siHallado = false; // ->Bandera para saber si se halla el primo.
            while (!siHallado) {
                numero++;
                if (esPrimo(numero)) {
                    siHallado = true;
                    break;
                }
            }
        } else {
            System.out.println("El número no es primo.");
        }

        return numero;
    }

    /**
     * Función que dada una base y un exponente devuelve una potencia.
     * 
     * @param base      el numero que se desea elevar.
     * @param exponente al número que se va a elevar la base.
     * @return <code>numero</code> la potencia resultado.
     */
    public static long potencia(int base, int exponente) {
        long numero = base;
        for (int i = 1; i < exponente; i++) {
            numero *= base;
        }

        return numero;
    }

    /**
     * Función que da la posición de la primera ocurrencia de un dígito dentro de un
     * número entero. Si no se encuentra, devuelve -1.
     * 
     * @param x el número en que se desea buscar el dígito.
     * @param digito el dígito que se desea buscar.
     * @return <code>indice</code> si encuentra el dígito devuelve la posición en la que lo encuentre.
     * @return <code>-1</code> en caso de no encontrar el dígito devuelve -1.
     */
    public static int poscionDeDigito(long x, int digito) {
        int index = 0;
        do {
            index++;
            if (digitoN(x, index) == digito) {
                break;
            } else if (index == digitos(x)) {
                index = -1;
                break;
            }
        } while (true);

        return index;
    }

    /**
     * Función que le quita a un número n dígitos por detrás (por la derecha).
     * 
     * @param x un número entero.
     * @param n indica la posición hasta donde se quiere dejar el número.
     * @return<code>numero</code> retorna el núermo hasta donde se pidió.
     */
    public static long quitaPorDetras(long x, int n){
        long numero =0;
        int hasta = digitos(x) -n; //-> hasta -> Variable que indica hasta donde hay que recorrer el número.
        hasta = digitos(x) - hasta;
        for(int i =1; i <= hasta; i++){
            numero += digitoN(x, i);
            if(i < hasta ){
                numero *= 10;
            }
        }
        return numero;
    }

    /**
     * Función que le quita a un número n dígitos por delante(por la izquierda).
     * 
     * @param x un número entero.
     * @param n indica la posición desde la cual se desea dejar el número.
     * @return <code>numero</code> retorna el número desde donde se pidió.
     */
    public static long quitaPorDelante(long x, int n){
        long numero = 0;
        for(int i = n; i <= digitos(x) ;i++){
            numero += digitoN(x, i);
            if(i < digitos(x) ){
                numero *= 10;
            }
        }
        return numero;
    }

    /**
     * Función que le añade un dígito por detrás a un número.
     * 
     * @param x un número entero.
     * @param n el dígito que se desea añadir.
     * @return <code>x</code> retorna el numero con el dígito añadido.
     */
    public static long pegaPorDetras(long x, int n){
        x *= 10;
        x += n;

        return x;
    }

    /**
     * Función que le añade un dígito por delante a un número.
     * 
     * @param x un número entero.
     * @param n el dígito que se desea añadir.
     * @return <code>n</code> retorna el numero con el dígito añadido.
     */
    public static long pegaPorDelante(long x, int n){
        for(int i =1; i <= digitos(x); i++){
            n *=10;
        }
        n += x;
        return n;
    }

    /**
     * Función que reduce un número a un trozo de el delimitado por la posición inicial y final que se le indique.
     * 
     * @param x un número entero.
     * @param in posición inicial de la cual se desea cortar el número.
     * @param fi posición final hasta donde se desea el número.
     * @return <code>numero</code> retorna el número cortado.
     */
    public static long trozoDeNumero(long x, int in, int fi){
        long numero = quitaPorDetras(x, fi);
        numero = quitaPorDelante(numero, in);

        return numero;
    }

    public static long juntaNumeros(long uno, long dos){
        for(int i =1; i <= digitos(dos); i++){
            uno *= 10;
        }
        uno += dos;
        
        return uno;
    }
}
