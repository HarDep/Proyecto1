package x.y.z.views;

import javax.swing.*;
import java.awt.*;
import x.y.z.utils.UtilProperties;
public class MainMenu extends JPanel{
    final PrincipalPanel principalPanel;
    private ConfigMenu configMenu;
    public MainMenu(PrincipalPanel principalPanel){
        this.principalPanel = principalPanel;
        setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel.setLayout(null);
        add(panel, BorderLayout.CENTER);
        JLabel label = new JLabel(UtilProperties.getText("MainMenuM1"));
        label.setBounds(482,70,200,20);
        panel.add(label);
        JButton button1 = new JButton(UtilProperties.getText("MainMenuM2"));
        button1.addActionListener(e -> principalPanel.setPanel());
        button1.setBounds(405,150,200,20);
        panel.add(button1);
        JButton button2 = new JButton(UtilProperties.getText("MainMenuM3"));
        button2.addActionListener(e -> principalPanel.setPanel());
        button2.setBounds(405,180,200,20);
        panel.add(button2);
        JButton button3 = new JButton(UtilProperties.getText("MainMenuM4"));
        button3.addActionListener(e -> principalPanel.setPanel1());
        button3.setBounds(405,210,200,20);
        panel.add(button3);
        JButton button4 = new JButton(UtilProperties.getText("MainMenuM5"));
        button4.addActionListener(e -> principalPanel.setPanel());
        button4.setBounds(405,240,200,20);
        panel.add(button4);
        JButton button5 = new JButton(UtilProperties.getText("MainMenuM6"));
        button5.addActionListener(e -> principalPanel.setPanel());
        button5.setBounds(405,270,200,20);
        panel.add(button5);
    }

}
