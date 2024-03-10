package Metier;

import org.junit.Assert;
import org.junit.Test;

public class CalculTest {
    private Calcul calcul;
    @Test
    public void  testSomme(){
        calcul=new Calcul();
        double a=5; double b=9;
        double expected=14;
        double res=calcul.somme(a,b);
        Assert.assertTrue(res==expected);
    }
}
