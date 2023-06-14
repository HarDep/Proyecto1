package x.y.z.views;

import javax.swing.*;
import java.awt.*;

public class PrincipalPanel extends JPanel {
    private final DashBoard dashBoard;
    PanelRace panelRace;
    FirtsPage firtsPage;

    public PrincipalPanel(DashBoard dashBoard) {
        this.dashBoard = dashBoard;
        this.panelRace = new PanelRace();
        this.firtsPage = new FirtsPage(this);
        setLayout(new BorderLayout());
        addComponents();
    }

    private void addComponents() {
        add(firtsPage, BorderLayout.CENTER);
        //TODO poner componentes
    }

    public void setPanel(){
        firtsPage.setVisible(false);
        add(panelRace,BorderLayout.CENTER);
        // mostrar el anterior
        /*remove(panelRace);
        add(firtsPage);
        firtsPage.setVisible(true);*/
    }
}
