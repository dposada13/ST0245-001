/**
 * La clase Fecha tiene la intención de representar el tipo abstracto fecha.
 * Aunque ya existen librerías encargadas de esta funcion:
 * @see <a href="http://www.baeldung.com/java-8-date-time-intro"> Ver documentacion tipo Time </a>
 * En este ejercicio podemos tener una compresión más profunda de su funcionamiento interno.
 * 
 * @author Mauricio Toro, Andres Paez
 * @version 1
 */

public class Fecha {

    /*
    varibales con atributo final indican que una variable es de tipo 
    constante, es decir, no admitirá cambios después de su declaración y asignación de valor.
    final determina que un atributo no puede ser sobreescrito o redefinido.
    Se le asigna esta característica para evitar que se sobrescriban valores.

    tener en cuenta tipado de las 3 variables!.
     */

    private final int dia;
    private final int mes;
    private final int anyo;

    /**
     * Se inicializan las variables globales en el constructor de manera que no posean valores nulos o 0s.
     */
    public Fecha(int d, int m, int a) {
        dia=d;
        mes=m;
        anyo=a;
    }

    /**
     * Método para obtener la variable global dia.
     *
     * @return el dia
     */
    public int dia() {
        return dia;
    }

    /**
     * Método para obtener la variable global mes.
     *
     * @return el mes
     */
    public int mes() {
        return mes;
    }

    /**
     * Método para obtener la variable global anyo.
     *
     * @return el año
     */
    public int anyo() {
        return anyo;
    }

    /**
     * @param otra representa la fecha con la cual se va a comparar.
     *
     * El método comprar se encarga de devolvernos respuesta a tres posibilidades.
     * 1: si la fecha es menor que la otra retorna -1.
     * 2: si la fecha es igual que la otra retorna 0.
     * 3: si la fecha es mayor que la otra retorna 1.
     *
     * @return -1 sí es menor; 0 sí es igual; 1 sí es mayor.
     *
     */

    public int comparar(Fecha otra) {
        int an = 0;
        int dd=0;
        int mm=0;
        if (this.anyo < otra.anyo){
            an=-1;
            //return an;
        }else if(this.anyo > otra.anyo){
            an=1;
            //return an;
        }else{
            an=0;
            //return an;
        }

        if (this.mes < otra.mes){ 
            mm=-1;
            //return mm;
        }else if(this.mes > otra.mes){
            mm=1;
            //return mm;
        } else {
            mm=0;
            //return 0;
        }

        if (this.dia < otra.dia){
            dd=-1;
            //return dd;
        }else if (this.dia > otra.dia){
            dd=1;
            //return dd;
        }
        else{
            dd=0;
            //return dd;
        }
        if (an==0||mm==0||dd==0){
            return 0;
        }else if(an>0||mm>0||dd>0){
            return 1;
        }else{
            return -1;        
        }

    }
    /**
     * toString se encargará de convertir el tipo abstracto fecha en un tipo cadena
     * para su posterior visualización
     *
     * @return una cadena que contiene la fecha
     */
    public String toString() {
        return (dia+"/"+mes+"/"+anyo);
    }
}
