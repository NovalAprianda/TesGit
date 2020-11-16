
package TemplateMethod;
import FacadePattern.*;
import TemplateMethod.*;
import java.util.Scanner;

//pewarisan method dari class TemplateMethode
public class Pola1 extends TemplateMethod  {

    @Override
    public String getNama() {
        if(P==L){
        return "Pola Persegi";
        }
        else{
         return "Pola Persegi Panjang";
        }
    }
    //Inputan panjang segi 4
    Scanner Panjang = new Scanner(System.in);
        int P = Panjang.nextInt(); //inisialisasi variabel P = Panjang
    @Override
    public Integer getPanjang() {
        return P;
    }
    //inputan Lebar segi 4
    Scanner Lebar = new Scanner(System.in);
        int L = Lebar.nextInt(); //inisialisasi variabel L = Lebar
    @Override
    public Integer getLebar() {
       return L; 
    }
    
    @Override
    public String getKarakter() {
      return " * ";  //Karakter yang digunakan pada pola
    }
}
