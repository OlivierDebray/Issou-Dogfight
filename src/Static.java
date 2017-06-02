import issou_dogfight.dogfight.controller.DogfightController;
import issou_dogfight.dogfight.model.DogfightModel;
import issou_dogfight.dogfight.view.DogfightView;

/**
 * Created by Olivier Debray on 01/06/2017.
 */

public class Static {
    public static void main (String[] args) {
        final DogfightModel dogfightModel = new DogfightModel();
        final DogfightController dogfightController = new DogfightController(dogfightModel);
        final DogfightView dogfightView = new DogfightView(dogfightController, dogfightModel,
                dogfightModel);
        dogfightController.setViewSystem(dogfightView);
        dogfightController.play();
    }
}
