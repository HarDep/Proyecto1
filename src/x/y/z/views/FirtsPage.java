package x.y.z.views;

import javax.swing.*;
import java.awt.*;

public class FirtsPage extends JPanel {
    private PrincipalPanel principalPanel;
    public FirtsPage(PrincipalPanel principalPanel) {
        this.principalPanel = principalPanel;
        setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel.setLayout(null);
        add(panel, BorderLayout.CENTER);
        JLabel label = new JLabel("aaaa");
        label.setBounds(0,0,100,10);
        panel.add(label);
        JButton button = new JButton("ddd");
        button.setBounds(100,0,100,10);
        panel.add(button);
    }
}
