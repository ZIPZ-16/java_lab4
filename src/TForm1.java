import javax.swing.*;
import java.awt.*;

class TForm1 extends JFrame {
    private int width = 800;
    private int height = 400;
    private String[] columnNames = {"Номер п/п", "Фамилия", "Группа"};
    private String[][] data = {{"1", "test1", "test01"},{"2", "test2", "test02"}};

    TForm1() {
        super("Лабораторная №4");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(this.width, this.height);

        JMenuBar jMenuBar = new JMenuBar();

        JMenu jmFile = new JMenu("Файл");

        JMenuItem jmiOpen = new JMenuItem("Открыть");
        JMenuItem jmiSave = new JMenuItem("Сохранить");
        JMenuItem jmiClose = new JMenuItem("Закрыть");

        jmFile.add(jmiOpen);
        jmFile.add(jmiSave);
        jmFile.add(jmiClose);

        jMenuBar.add(jmFile);

        JMenu jmEdit = new JMenu("Редактировать");

        JMenuItem jmiCopy = new JMenuItem("Копировать");
        JMenuItem jmiDelete = new JMenuItem("Удалить");
        JMenuItem jmiPaste = new JMenuItem("Вставить");

        jmEdit.add(jmiCopy);
        jmEdit.add(jmiDelete);
        jmEdit.add(jmiPaste);

        jMenuBar.add(jmEdit);

        JMenu jmWindow = new JMenu("Окно");

        JMenuItem jmiCascade = new JMenuItem("Каскадом");
        JMenuItem jmiShowAll = new JMenuItem("Показать все");
        JMenuItem jmiCloseAll = new JMenuItem("Закрыть все");
        jmiCloseAll.addActionListener(e -> {

        });

        jmWindow.add(jmiCascade);
        jmWindow.add(jmiShowAll);
        jmWindow.add(jmiCloseAll);

        jMenuBar.add(jmWindow);

        ImageIcon imageIcon = new ImageIcon("src/img.jpg");

        JLabel label1 = new JLabel(imageIcon);

        JTable table = new JTable(data, columnNames);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));

        JButton jButton1 = new JButton("КНОПКА 1");
        JButton jButton2 = new JButton("КНОПКА 2");
        JButton jButton3 = new JButton("КНОПКА 3");
        JButton jButton4 = new JButton("КНОПКА 4");

        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPanel.add(jButton3);
        jPanel.add(jButton4);

        this.setJMenuBar(jMenuBar);
        this.setLayout(new BorderLayout());
        this.add(label1, BorderLayout.WEST);
        this.add(new JScrollPane(table), BorderLayout.CENTER);
        this.add(jPanel, BorderLayout.EAST);
    }
}
