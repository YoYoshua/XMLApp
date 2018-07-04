import lombok.Setter;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

@Setter
@XmlRootElement
public class Towar {
    private String symbolTowaru;
    private String podstawowyKodKreskowy;
    private String nazwaTowaru;
    private String grupa;
    private String cenaSpecjalna;
    private String vat;
    private String dostepnoscTowaru;
    private ArrayList<Zdjecie> zdjecia;
    private ArrayList<Opis> opisy;

    @XmlElement(name="SYMBOL_TOWARU")
    public String getSymbolTowaru() {
        return symbolTowaru;
    }

    @XmlElement(name="PODSTAWOWY_KOD_KRESKOWY")
    public String getPodstawowyKodKreskowy() {
        return podstawowyKodKreskowy;
    }

    @XmlElement(name="NAZWA_TOWARU")
    public String getNazwaTowaru() {
        return nazwaTowaru;
    }

    @XmlElement(name="GRUPA")
    public String getGrupa() {
        return grupa;
    }

    @XmlElement(name="CENA_SPECJALNA")
    public String getCenaSpecjalna() {
        return cenaSpecjalna;
    }

    @XmlElement(name="VAT")
    public String getVat() {
        return vat;
    }

    @XmlElement(name="DOSTEPNOSC_TOWARU")
    public String getDostepnoscTowaru() {
        return dostepnoscTowaru;
    }

    @XmlElement(name="ZDJECIA")
    public ArrayList<Zdjecie> getZdjecia() {
        return zdjecia;
    }

    @XmlElement(name="OPIS")
    public ArrayList<Opis> getOpisy() {
        return opisy;
    }

    public Vector<String> getObjectAsVector() {
        Vector<String> result = new Vector<>();

        result.add(this.getSymbolTowaru());
        result.add(this.getPodstawowyKodKreskowy());
        result.add(this.getNazwaTowaru());
        result.add(this.getGrupa());
        result.add(this.getCenaSpecjalna());
        result.add(this.getVat());
        result.add(this.getDostepnoscTowaru());
//        result.add(this.getZdjecia());
//        result.add(this.getOpisy());

        return result;
    }

}

