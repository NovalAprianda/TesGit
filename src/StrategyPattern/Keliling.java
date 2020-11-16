package StrategyPattern;
import FacadePattern.*;
import TemplateMethod.*;
public class Keliling implements Rumus {
    @Override
    public void Rumus(int a, int b) {
        int keliling = 2 *(a + b);
        System.out.println("Hasil Keliling  = " + keliling);

    }
}
