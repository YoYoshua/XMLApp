import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class SwingControlDemo {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;
    private JTable itemTable;
    private JScrollPane scrollTable;
    private ArrayList<String> columnNames;
    private Towary towary;

    public SwingControlDemo(Towary towary) {
        this.towary = towary;
        prepareGUI();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("Java SWING Examples");
        mainFrame.setSize(400, 400);
        mainFrame.setLayout(new GridLayout(1, 1));

        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("", JLabel.CENTER);
        statusLabel.setSize(350, 100);

//        columnNames.add("SYMBOL_TOWARU");
//        columnNames.add("PODSTAWOWY_KOD_KRESKOWY");
//        columnNames.add("NAZWA_TOWARU");
//        columnNames.add("GRUPA");
//        columnNames.add("CENA_SPECJALNA");
//        columnNames.add("ZDJECIA");
//        columnNames.add("OPIS");

        itemTable = new JTable(new TowaryTableModel(towary));

        scrollTable = new JScrollPane(itemTable);

        mainFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        controlPanel = new JPanel();
        controlPanel.setLayout(new BorderLayout());
        controlPanel.add(scrollTable, BorderLayout.CENTER);

        mainFrame.add(itemTable);
        mainFrame.setVisible(true);
    }

    public void showEventDemo() {
        headerLabel.setText("Control in action: Button");

        JButton okButton = new JButton("OK");
        JButton submitButton = new JButton("Submit");
        JButton cancelButton = new JButton("Cancel");

        okButton.setActionCommand("OK");
        submitButton.setActionCommand("Submit");
        cancelButton.setActionCommand("Cancel");

        okButton.addActionListener(new ButtonClickListener());
        submitButton.addActionListener(new ButtonClickListener());
        cancelButton.addActionListener(new ButtonClickListener());

        controlPanel.add(okButton);
        controlPanel.add(submitButton);
        controlPanel.add(cancelButton);

        mainFrame.setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if(command.equals("OK")) {
                statusLabel.setText("Ok Button Clicked.");
            } else if (command.equals("Submit")) {
                statusLabel.setText("Submit Button clicked.");
            } else {
                statusLabel.setText("Cancel Button clicked.");
            }
        }
    }
}
