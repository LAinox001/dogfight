import jpu2016.dogfight.controller.DogfightController;
import jpu2016.dogfight.modele.DogfightModel;
import jpu2016.dogfight.view.DogfightView;

/**
 * 
 */

/**
 * @author lanto
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final DogfightModel dogfightModel = new DogfightModel();
		final DogfightController dogfightController = new DogfightController(dogfightModel);
		final DogfightView dogfightView = new DogfightView(dogfightController, dogfightModel, dogfightModel);
		dogfightController.setViewSystem(dogfightView);
		dogfightController.play();
	}

}
