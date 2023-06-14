package x.y.z.presenters;

import x.y.z.pojos.User;

import java.util.List;

public class Presenter implements MainContract.Presenter{
    private MainContract.View view;
    private MainContract.Model model;
    @Override
    public void setView(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void setModel(MainContract.Model model) {
        this.model = model;
    }

    @Override
    public void addUser(User user) {
        model.addUser(user);
    }

    @Override
    public void setUser(User user) {
        model.setUser(user);
    }

    @Override
    public User getUser(int id) {
        return model.getUser(id);
    }

    @Override
    public List<User> getUsers() {
        return model.getUsers();
    }

    @Override
    public void deleteUser(int id) {
        model.deleteUser(id);
    }

    @Override
    public void setLanguage(String filePath) {
        model.setLanguage(filePath);
    }

    @Override
    public void notifyMessage(String message) {
        view.notifyMessage(message);
    }

    @Override
    public void startRace(User user) {
        model.startRace(user);
    }
}
