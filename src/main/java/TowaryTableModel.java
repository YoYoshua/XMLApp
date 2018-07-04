import javax.swing.table.AbstractTableModel;

public class TowaryTableModel extends AbstractTableModel {
    private Towary towary;

    public TowaryTableModel(Towary towary) {
        this.towary = towary;
    }

    @Override
    public int getRowCount() {
        return towary.getTowary().size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object value = "??";
        Towar towar = towary.getTowary().get(rowIndex);
        switch(columnIndex) {
            case 0:
                value = towar.getSymbolTowaru();
                break;
            case 1:
                value = towar.getPodstawowyKodKreskowy();
                break;
            case 2:
                value = towar.getNazwaTowaru();
                break;
            case 3:
                value = towar.getGrupa();
                break;
            case 4:
                value = towar.getCenaSpecjalna();
                break;
            case 5:
                value = towar.getVat();
                break;
            case 6:
                value = towar.getDostepnoscTowaru();
                break;
            case 7:
                value = "";
                for(Zdjecie zdjecie: towar.getZdjecia()) {
                    value += zdjecie.getZdjecie();
                    value += "\n";
                }
                break;
            case 8:
                value = "";
                for(Opis opis: towar.getOpisy()) {
                    value += opis.getOpisy();
                    value += "\n";
                }
                break;
        }
        return value;
    }

    public Towar getTowarAt(int row) {
        return towary.getTowary().get(row);
    }
}
