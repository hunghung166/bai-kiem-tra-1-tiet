package StudentManager;

import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class StudentManager extends JFrame implements ActionListener {

    public static void main(String[] args) {
        new StudentManager();
    }

    private JMenuBar menuBar = new JMenuBar();

    private JMenu menu1 = new JMenu("StudentManager");
    private JMenuItem itemAddSt = new JMenuItem("Add Student");
    private JMenuItem itemListSt = new JMenuItem("List Student");

    private JMenu menu2 = new JMenu("Class Room Manager");
    private JMenuItem itemAddCl = new JMenuItem("Add Class Room");
    private JMenuItem itemListCl = new JMenuItem("List Class Room");

    private JMenuItem itemAboutMe = new JMenuItem("About me");

    public StudentManager() {

        menu1.add(itemAddSt);
        menu1.add(itemListSt);

        menu2.add(itemAddCl);
        menu2.add(itemListCl);

        menuBar.add(menu1);
        menuBar.add(menu2);
        menuBar.add(itemAboutMe);

        this.setJMenuBar(menuBar);

        this.setSize(600, 300);
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        itemAboutMe.addActionListener(this);
        itemAddSt.addActionListener(this);
        itemListSt.addActionListener(this);
        itemAddCl.addActionListener(this);
        itemListCl.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equalsIgnoreCase("Add Student")) {
            JOptionPane.showMessageDialog(null, "Bạn vừa chọn thêm sinh viên", "Thông báo", JOptionPane.CLOSED_OPTION);
        }

        if (e.getActionCommand().equalsIgnoreCase("List Student")) {
            JOptionPane.showMessageDialog(null, "Bạn vừa chọn danh sách sinh viên ", "Thông báo", JOptionPane.CLOSED_OPTION);
        }

        if (e.getActionCommand().equalsIgnoreCase("Add Class Room")) {
            JOptionPane.showMessageDialog(null, "Bạn vừa chọn thêm phòng ", "Thông báo", JOptionPane.CLOSED_OPTION);
        }

        if (e.getActionCommand().equalsIgnoreCase("List Class Room")) {
            JOptionPane.showMessageDialog(null, "Bạn vừa chọn danh sách phòng ", "Thông báo", JOptionPane.CLOSED_OPTION);
        }

        if (e.getActionCommand().equalsIgnoreCase("About me")) {
            JOptionPane.showMessageDialog(null, "Nguyễn Việt Hùng \n16/06/1995 \nhungnvd00436@fpt.edu.vn", "Thông báo", JOptionPane.CLOSED_OPTION);
        }
    }
}
