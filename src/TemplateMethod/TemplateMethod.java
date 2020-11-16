package TemplateMethod;
import FacadePattern.*;
import TemplateMethod.*;
public abstract class TemplateMethod {


    public final void segiempat() {
       
        System.out.println(getNama());
        
        //Perulangan untuk Panjang segi 4
        for (int i=0; i< getPanjang(); i++){ 
            //Perulangan lebar segi 4
            for (int j=0; j< getLebar(); j++){
                System.out.print(getKarakter());
            }
            System.out.println("\r");
        }
    }
    
    //Method yang akan di override turunan dari Clas TempalateMethod
public abstract String getNama();
public abstract Integer getPanjang();
public abstract Integer getLebar();
public abstract String getKarakter();
  

}