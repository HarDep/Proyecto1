package x.y.z.views;

import x.y.z.configs.GlobalConfigs;
import x.y.z.presenters.MainContract;
import x.y.z.utils.UtilProperties;

import javax.swing.*;

public class DashBoard extends JFrame implements MainContract.View {
    MainContract.Presenter presenter;
    private final PrincipalPanel principalPanel;

    public DashBoard() {
        putConfigs();
        principalPanel = new PrincipalPanel(this);
    }

    private void putConfigs(){
        setTitle(UtilProperties.getText("title"));
        setSize(GlobalConfigs.TOTAL_DIMENSION);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void setPresenter(MainContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void notifyMessage(String message) {
        //TODO mostrar mensaje
    }

    @Override
    public void start() {
        this.setVisible(true);
    }
}
