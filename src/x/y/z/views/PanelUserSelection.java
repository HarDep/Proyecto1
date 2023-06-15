package x.y.z.views;

import x.y.z.configs.GlobalConfigs;
import x.y.z.pojos.User;
import x.y.z.utils.UtilImages;
import x.y.z.utils.UtilProperties;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class PanelUserSelection extends JPanel {
    private final PrincipalPanel principalPanel;
    private JPanel panelUsers;

    public PanelUserSelection(PrincipalPanel principalPanel) {
        this.principalPanel = principalPanel;
        setLayout(new BorderLayout());
        createComponents();
    }

    private void createComponents() {
        JPanel northPanel = new JPanel();
        JLabel label = new JLabel(UtilProperties.getText("title_selection"));
        label.setFont(GlobalConfigs.TITLES_FONT);
        northPanel.add(label);
        northPanel.setPreferredSize(new Dimension(0,100));
        add(northPanel,BorderLayout.NORTH);
        panelUsers = new JPanel();
        panelUsers.setBorder(BorderFactory.createLineBorder(GlobalConfigs.LINE_PANEL_COLOR));
        JScrollPane scrollPane = new JScrollPane(panelUsers);
        add(scrollPane,BorderLayout.CENTER);
        JPanel panelButton = new JPanel();
        JButton backButton = new JButton(UtilProperties.getText("back_text"));
        panelButton.add(backButton);
        backButton.addActionListener(e -> principalPanel.setToShow(principalPanel.firtsPage));
        add(panelButton,BorderLayout.SOUTH);
        add(new JPanel(),BorderLayout.WEST);
        add(new JPanel(),BorderLayout.EAST);
    }

    public void showSelectionUsersPanel(){
        panelUsers.removeAll();
        putUsers();
        principalPanel.setToShow(this);
    }

    private void putUsers() {
        List<User> users = principalPanel.dashBoard.presenter.getUsers();
        //List<User> users = List.of(new User("juan",7,0,null,1));
        for (User user: users) {
            createPanel(user);
        }
        if (users.isEmpty())
            panelUsers.add(new JLabel(UtilProperties.getText("empty_users_text")));
    }

    private void createPanel(User user) {
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createLineBorder(GlobalConfigs.LINE_PANEL_COLOR));
        JLabel userName = new JLabel(UtilProperties.getText("label_user_text") + " " + user.getName());
        JLabel userAvatar = new JLabel(new ImageIcon(UtilImages.getAvatarImage(user.getAvatarNumber(), 50,50)));
        JButton button = new JButton(UtilProperties.getText("select_user_text"));
        button.addActionListener(e -> selectUser(user));
        panel.add(button);
        panel.add(userName);
        panel.add(userAvatar);
        panelUsers.add(panel);
    }

    private void selectUser(User user) {
    }
}
