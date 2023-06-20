package x.y.z.views;

import javax.swing.*;
import java.awt.*;

public class PrincipalPanel extends JPanel {
    final DashBoard dashBoard;
    PanelRace panelRace;
    FirtsPage firtsPage;
    ConfigMenu configMenu;
    LanguageMenu languageMenu;
    MainMenu mainMenu;

    public PrincipalPanel(DashBoard dashBoard) {
        this.dashBoard = dashBoard;
        this.panelRace = new PanelRace();
        this.firtsPage = new FirtsPage(this);
        this.configMenu = new ConfigMenu(this);
        this.languageMenu = new LanguageMenu(this);
        this.mainMenu = new MainMenu(this);
        setLayout(new BorderLayout());
        addComponents();
    }

    private void addComponents() {
        mainMenu.setVisible(true);
        add(mainMenu, BorderLayout.CENTER);
        //TODO poner componentes
    }

    public void setPanel(){
        mainMenu.setVisible(false);
        add(panelRace,BorderLayout.CENTER);
    }

    public void setPanel1(){
        mainMenu.setVisible(false);
        add(configMenu,BorderLayout.CENTER);
        configMenu.setVisible(true);
    }

    public void setPanel2(){
        configMenu.setVisible(false);
        add(languageMenu,BorderLayout.CENTER);
        languageMenu.setVisible(true);
    }

    public void backPanel1(){
        configMenu.setVisible(false);
        mainMenu.setVisible(true);
        add(mainMenu,BorderLayout.CENTER);
    }

    public void backPanel2(){
        languageMenu.setVisible(false);
        configMenu.setVisible(true);
        add(configMenu,BorderLayout.CENTER);
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
