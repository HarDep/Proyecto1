package x.y.z.models;

import x.y.z.pojos.User;
import x.y.z.presenters.MainContract;

import java.util.List;

public class ModelGame implements MainContract.Model {
    MainContract.Presenter presenter;
    ManagerRacings managerRacings;
    ManagerUsers managerUsers;

    public ModelGame() {
        managerRacings = new ManagerRacings();
        managerUsers = new ManagerUsers();
    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void addUser(User user) {
        //TODO añadir usuario
    }

    @Override
    public void setUser(User user) {
        //TODO cambiar atributos de usuario
    }

    @Override
    public User getUser(int id) {
        //TODO obtener usuario
        return null;
    }

    @Override
    public List<User> getUsers() {
        //TODO obtener usuarios
        return null;
    }

    @Override
    public void setLanguage(String filePath) {
        //TODO cambiar idioma
    }

    @Override
    public void startRace(User user) {
        //TODO comenzar una carrera
    }
}
