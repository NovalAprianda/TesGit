package StrategyPattern;
import FacadePattern.*;
import TemplateMethod.*;
public class Luas implements Rumus {
    @Override
    public void Rumus(int a, int b) {
        int luas;
        luas = a * b;
        System.out.println("Hasil Luas  = " + luas);
    }
}
