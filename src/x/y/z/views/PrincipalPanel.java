package x.y.z.views;

import javax.swing.*;
import java.awt.*;

public class PrincipalPanel extends JPanel {
    private final DashBoard dashBoard;
    PanelRace panelRace;

    public PrincipalPanel(DashBoard dashBoard) {
        this.dashBoard = dashBoard;
        this.panelRace = new PanelRace();
        setLayout(new BorderLayout());
        addComponents();
    }

    private void addComponents() {
        add(panelRace, BorderLayout.CENTER);
        //TODO poner componentes
    }
}
