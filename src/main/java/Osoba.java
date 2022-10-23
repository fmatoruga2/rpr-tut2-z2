public class Osoba {
    private  final String ime;
    private final String prezime;

    public Osoba(String ime1, String prezime1){
        this.ime = ime1;
        this.prezime = prezime1;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                '}';
    }
}
