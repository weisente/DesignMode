package example.weisente.top.observer12.test;

import java.util.Observable;

/**
 * Created by san on 2017/12/30.
 */

public class DevTechFrontier extends Observable {


    public void postNewPublication(String context){
        setChanged();
        notifyObservers(context);
    }




}
