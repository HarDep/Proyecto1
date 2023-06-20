package x.y.z.views;

import javax.swing.*;
import java.awt.*;
import x.y.z.utils.UtilProperties;
public class LanguageMenu extends JPanel{
    public LanguageMenu(PrincipalPanel principalPanel){
        setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel.setLayout(null);
        add(panel, BorderLayout.CENTER);
        JLabel label = new JLabel(UtilProperties.getText("LanguageMenuM1"));
        label.setBounds(435,70,200,20);
        panel.add(label);
        JButton button1 = new JButton(UtilProperties.getText("LanguageMenuM2"));
        button1.addActionListener(e -> principalPanel.setPanel());
        button1.setBounds(405,150,200,20);
        panel.add(button1);
        JButton button2 = new JButton(UtilProperties.getText("LanguageMenuM3"));
        button2.addActionListener(e -> principalPanel.setPanel());
        button2.setBounds(405,180,200,20);
        panel.add(button2);
        JButton button3 = new JButton(UtilProperties.getText("Comeback"));
        button3.addActionListener(e -> principalPanel.backPanel2());
        button3.setBounds(405,210,200,20);
        panel.add(button3);
    }

}
