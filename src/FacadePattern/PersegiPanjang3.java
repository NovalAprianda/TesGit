package FacadePattern;

public class PersegiPanjang3 {
    public void ketentuan(){
        System.out.println("Sisinya tidak sama panjang, terdiri dari sisi panjang dan lebar");
    }

    public void Luas(){
        System.out.println("Menghitung Luas = Panjang x lebar");
    }

    public void Keliling(){
        System.out.println("Total Keliling = 2 x (panjang + lebar)");
    }

    public void Diagonal(){
        System.out.println("Diagonal = akar dua dari (panjang kuadrat + lebar kuadrat)");
    }
}
