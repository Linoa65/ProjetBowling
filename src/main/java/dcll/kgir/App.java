package dcll.kgir;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculateur c = new Calculateur("5/5/5/5/5/5/5/5/5/5/5");
        int s = c.calculScore();
        System.out.println(""+s);
    }
}
