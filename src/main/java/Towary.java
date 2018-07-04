import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name="TOWARY")
public class Towary {
    private List<Towar> towary;

    @XmlElement(name="TOWAR")
    public List<Towar> getTowary() {
        return towary;
    }

    public void setTowary(List<Towar> towary) {
        this.towary = towary;
    }
}
