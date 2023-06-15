package x.y.z.views;

import javax.swing.*;
import java.awt.*;

public class PrincipalPanel extends JPanel {
    final DashBoard dashBoard;
    PanelRace panelRace;
    FirtsPage firtsPage;
    PanelUserSelection panelUserSelection;

    public PrincipalPanel(DashBoard dashBoard) {
        this.dashBoard = dashBoard;
        this.panelRace = new PanelRace();
        this.firtsPage = new FirtsPage(this);
        this.panelUserSelection = new PanelUserSelection(this);
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

    //pueden usar este metodo para cambiar entre paneles para cualquier panel
    public void setToShow(JPanel panel){
        hideAll();
        removeAll();
        panel.setVisible(true);
        add(panel,BorderLayout.CENTER);
    }

    private void hideAll() {
        for (Component component:getComponents()) {
            component.setVisible(false);
        }
    }
}
