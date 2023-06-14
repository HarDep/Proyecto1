package x.y.z.presenters;

import x.y.z.pojos.User;

import java.util.List;

public interface MainContract {
    interface Model{
        void setPresenter(Presenter presenter);
        void addUser(User user);
        void setUser(User user);
        User getUser(int id);
        List<User> getUsers();
        void deleteUser(int id);
        void setLanguage(String filePath);
        void startRace(User user);
    }
    interface Presenter{
        void setView(View view);
        void setModel(Model model);
        void addUser(User user);
        void setUser(User user);
        User getUser(int id);
        List<User> getUsers();
        void deleteUser(int id);
        void setLanguage(String filePath);
        void notifyMessage(String message);
        void startRace(User user);
    }
    interface View{
        void setPresenter(Presenter presenter);
        void notifyMessage(String message);
        void start();
    }
}
