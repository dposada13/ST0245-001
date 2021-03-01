//Punto 1.2
public class Tablero
{
    public static void main(String[] args) {
        System.out.println(formas(25));
    }

    private static int formas(int n)
    {
        if (n<=2){
            return n;        
        }else {
            return formas(n-1)+formas(n-2);        
        }

    }
}
