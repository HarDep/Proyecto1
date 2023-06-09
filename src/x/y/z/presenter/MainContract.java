package x.y.z.presenter;

public interface MainContract {
    interface Model{
        void setPresenter(Presenter presenter);
    }
    interface Presenter{
        void setView(View view);
        void setModel(Model model);
    }
    interface View{
        void setPresenter(Presenter presenter);
    }
}
