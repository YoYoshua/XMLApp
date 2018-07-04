import java.io.*;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class XMLMarshaller {
    public Towary unmarshall(String filename) {
        Towary towary = new Towary();
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Towary.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            towary = (Towary) jaxbUnmarshaller.unmarshal(new File(filename));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return towary;
    }
}
