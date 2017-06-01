package issou_dogfight.dogfight.controller;

import issou_dogfight.dogfight.model.IDogfightModel;
import issou_dogfight.dogfight.view.IViewSystem;

/**
 * Created by Olivier Debray on 01/06/2017.
 */

public class DogfightController implements IOrderPerformer {
    private static int TIME_SLEEP = 30 ;
    private IDogfightModel dogfightModel ;
    private IViewSystem viewSystem ;



    public DogfightController (IDogfightModel dogfightModel) {
        this.dogfightModel = dogfightModel ;
    }

    @Override
    public void orderPerform (UserOrder userOrder) {

    }

    public void play () {

    }

    public void setViewSystem (IViewSystem viewSystem) {
        this.viewSystem = viewSystem ;
    }

    public void launchMissile(int player) {

    }

    public void gameLoop () {

    }

    public static int getTimeSleep() {
        return TIME_SLEEP;
    }
}
