public class XMLHandler {
    public static void main(String[] args) {
        String filename = "src/main/resources/wybrane_towary.xml";
        Towary towary;

        XMLMarshaller marshaller = new XMLMarshaller();
        towary = marshaller.unmarshall(filename);
        for(Towar towar: towary.getTowary()) {
            for(Opis opis: towar.getOpisy()) {
                System.out.println(opis.getOpisy());
            }
        }
        SwingControlDemo swingControlDemo = new SwingControlDemo(towary);
        swingControlDemo.showEventDemo();
    }
}
