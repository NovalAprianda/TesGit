package StrategyPattern;

public class PersegiPanjang {
    int panjang;
    int lebar;
    Rumus rumus;

    public PersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void setRumus(Rumus rumus) {
        this.rumus = rumus;
    }

    public void action(){
        rumus.Rumus(this.panjang, this.lebar);
    }
}
