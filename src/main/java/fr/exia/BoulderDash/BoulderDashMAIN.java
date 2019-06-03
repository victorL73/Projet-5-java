package fr.exia.BoulderDash;

import fr.exia.BoulderDash.contract.UserOrder;
import fr.exia.BoulderDash.controller.BoulderDashController;
import fr.exia.BoulderDash.model.Model;
import fr.exia.BoulderDash.view.View;

/**
 * The BoulderDashMAIN is the class for launch the program
 *
 * @author Mathéo NOEL
 * @version 1.0
 */
public abstract class BoulderDashMAIN {


    public static void main(final String[] args){
        final Model model = new Model();
        final View view = new View(model);
        final BoulderDashController boulderDashController = new BoulderDashController(view, model);
        view.setController(boulderDashController);
        boulderDashController.orderPerform(UserOrder.L1);

    }
}
