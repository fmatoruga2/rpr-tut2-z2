import java.util.ArrayList;
import java.util.List;

public class Banka {
    private final Long brojRacuna;
    private ArrayList<Korisnik> korisnici = new ArrayList<Korisnik>();
    private ArrayList<Uposlenik> upslenici = new ArrayList<Uposlenik>();


    public Banka(Long brojRacuna){
        this.brojRacuna = brojRacuna;
    }
    public Korisnik kreirajNovogKorisnika(String ime,String prezime){
        Korisnik korisnik = new Korisnik(ime,prezime);
        return korisnik;
    }
    public Uposlenik kreirajNovogUposlenika(String ime,String prezime){
        Uposlenik uposlenik = new Uposlenik(ime,prezime);
        return uposlenik;
    }
    public Racun kreirajRacunZaKorisnika(Korisnik korisnik){
        Racun racun = new Racun();
        return racun;
    }

}
