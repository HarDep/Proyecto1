package x.y.z.presenters;

import x.y.z.models.ModelGame;
import x.y.z.views.DashBoard;

public class Game {
    private final MainContract.Model model;
    private final MainContract.Presenter presenter;
    private final MainContract.View view;

    public Game() {
        this.model = new ModelGame();
        this.presenter = new Presenter();
        this.view = new DashBoard();
        createMVP();
    }

    private void createMVP() {
        model.setPresenter(presenter);
        presenter.setModel(model);
        presenter.setView(view);
        view.setPresenter(presenter);
    }

    public void start(){
        view.start();
    }
}
