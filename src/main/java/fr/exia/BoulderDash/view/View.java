package fr.exia.BoulderDash.view;

import fr.exia.BoulderDash.contract.IBoulderDashController;
import fr.exia.BoulderDash.contract.IModel;
import fr.exia.BoulderDash.contract.IView;
import fr.exia.BoulderDash.contract.UserOrder;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * The Class View where we have the key oode of the user
 * @author Mathéo NOEL
 * @version 1.0
 */
public final class View implements  IView,Runnable {


    /** The frame. */
    private ViewFrame frame;


    /**
     * Instantiates a new view.
     *
     * @param model
     *          the model
     */
    public View(final IModel model) {
        this.frame = new ViewFrame(model);
        SwingUtilities.invokeLater(this);
    }

    /**
     * Key code to controller order.
     *
     * @param keyCode
     *          the key code
     * @return the controller order
     */
    public static UserOrder keyCodeToUserOrder(final int keyCode) {
        switch (keyCode) {
            case KeyEvent.VK_Z:
                return UserOrder.UP;
            case KeyEvent.VK_S:
                return UserOrder.DOWN;
            case KeyEvent.VK_D:
                return UserOrder.RIGHT;
            case KeyEvent.VK_Q:
                return UserOrder.LEFT;
            case KeyEvent.VK_1:
                return UserOrder.L1;

            default:
                return UserOrder.NULL;

        }
    }

    /**
     *run the frame
     */
    public void run() {
        this.frame.setVisible(true);

    }


    /**
     * Sets the controller.
     *
     */
    public void setController(final IBoulderDashController boulderDashController) {
        this.frame.setController(boulderDashController);
    }

}