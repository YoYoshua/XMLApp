import javax.xml.bind.annotation.XmlElement;

public class Opis {
    private String opisy;

    @XmlElement(name="OPISY")
    public String getOpisy() {
        return opisy;
    }

    public void setOpisy(String opisy) {
        this.opisy = opisy;
    }
}
