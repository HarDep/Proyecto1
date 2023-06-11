package x.y.z.views;

import javax.swing.*;

public class PrincipalPanel extends JPanel {
    private final DashBoard dashBoard;
    private PanelRace panelRace;

    public PrincipalPanel(DashBoard dashBoard) {
        this.dashBoard = dashBoard;
        this.panelRace = new PanelRace();
        addComponents();
    }

    private void addComponents() {
        //TODO poner componentes
    }
}
