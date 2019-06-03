package fr.exia.BoulderDash.view;

import fr.exia.BoulderDash.contract.IBoulderDashController;
import fr.exia.BoulderDash.contract.IModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;



/**
 * The Class ViewFrame.
 * @author Mathéo NOEL
 * @version 1.0
 */
public class ViewFrame extends JFrame implements KeyListener {

    /** The model. */
    private IModel						model;

    /** The controller. */
    private IBoulderDashController				boulderDashController;
    /** The Constant serialVersionUID. */
    private static final long	serialVersionUID	= -697358409737458175L;

    /**
     * Instantiates a new view frame.
     *
     * @param model
     *          the model
     * @throws HeadlessException
     *           the headless exception
     */
    public ViewFrame(final IModel model) throws HeadlessException {
        this.buildViewFrame(model);
    }

    /**
     * Instantiates a new view frame.
     *
     * @param model
     *          the model
     * @param gc
     *          the gc
     */
    public ViewFrame(final IModel model, final GraphicsConfiguration gc) {
        super(gc);
        this.buildViewFrame(model);
    }

    /**
     * Instantiates a new view frame.
     *
     * @param model
     *          the model
     * @param title
     *          the title
     * @throws HeadlessException
     *           the headless exception
     */
    public ViewFrame(final IModel model, final String title) throws HeadlessException {
        super(title);
        this.buildViewFrame(model);
    }

    /**
     * Instantiates a new view frame.
     *
     * @param model
     *          the model
     * @param title
     *          the title
     * @param gc
     *          the gc
     */
    public ViewFrame(final IModel model, final String title, final GraphicsConfiguration gc) {
        super(title, gc);
        this.buildViewFrame(model);
    }

    /**
     * Gets the controller.
     *
     * @return the controller
     */
    private IBoulderDashController getController() {
        return this.boulderDashController;
    }

    /**
     * Sets the controller.
     *
     * @param controller
     *          the new controller
     */
    public void setController(final IBoulderDashController controller) {
        this.boulderDashController = controller;
    }

    /**
     * Gets the model.
     *
     * @return the model
     */
    protected IModel getModel() {
        return this.model;
    }

    /**
     * Sets the model.
     *
     * @param model
     *          the new model
     */
    private void setModel(final IModel model) {
        this.model = model;
    }

    /**
     * Builds the view frame.
     *
     * @param model
     *          the model
     */
    private void buildViewFrame(final IModel model) {
        this.setModel(model);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);//false
        this.addKeyListener(this);
        this.setContentPane(new ViewPanel(this));
        this.setSize(1500 + this.getInsets().left + this.getInsets().right, 1100 + this.getInsets().top + this.getInsets().bottom);
        this.setLocationRelativeTo(null);

    }

    /** use when a key has been type
     *
     * @param e
     */
    public void keyTyped(final KeyEvent e) {

    }

    /** use when a key has been pressed
     *
     * @param e
     */
    public void keyPressed(final KeyEvent e) {
        this.getController().orderPerform(View.keyCodeToUserOrder(e.getKeyCode()));
    }

    /** use when a key has been released
     *
     * @param e
     */
    public void keyReleased(final KeyEvent e) {

    }
}