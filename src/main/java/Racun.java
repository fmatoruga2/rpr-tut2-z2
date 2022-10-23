public class Racun {
    private Long brojRacuna;
    private Osoba korisnikRacuna;
    private boolean odobrenjePrekoracenja;
    private double stanjeRacuna;

    public Racun (){

    }

    public Racun (Long brojRacuna, Osoba osoba){
        this.brojRacuna = brojRacuna;
        this.korisnikRacuna = osoba;
    }

    private boolean provjeriOdobrenjePrekoracenja(Double dubl){
        return true;
    }
    public boolean izvrsiUplatu(Double dubl){
        return true;
    }
    public boolean izvrsiIsplatu(Double dubl){
        return true;
    }
    public void odobriPrekoracenje(Double dubl){

    }


}
