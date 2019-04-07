package ru.arvalon.alltests;

/**
 * Created by arvalon on 09.02.2018.
 */

public class Presenter {

    FotoView view;

    void register(FotoView view){
        this.view=view;
    }

    void loadData(String s){
        if (view!=null){
            if (s==null || s.contains("error")){
                view.showError(new Throwable("ERROR"));
            }else {
                view.newData(s);
            }
        }
    }

}
