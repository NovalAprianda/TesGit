package StrategyPattern;
import FacadePattern.*;
import TemplateMethod.*;

public class Diagonal implements Rumus {
    @Override
    public void Rumus(int a, int b) {
        int diagonal;
        diagonal = (a * a) + (b * b);
        System.out.println("Hasil Panjang Diagonal  = " + diagonal);
    }
}
