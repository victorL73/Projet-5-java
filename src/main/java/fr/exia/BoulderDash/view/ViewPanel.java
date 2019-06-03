package fr.exia.BoulderDash.view;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

/**
 * The Class ViewPanel.
 * @author  Mathéo NOEL
 * @version 1.0
 *
 */
class ViewPanel extends JPanel implements Observer {

    /** The view frame. */
    private ViewFrame viewFrame;
    Font  f1  = new Font("Impact", Font.ROMAN_BASELINE,  35);
    Font f2 = new Font("Death", Font.ROMAN_BASELINE, 35);
    /** The Constant serialVersionUID. */
    private static final long	serialVersionUID	= -998294702363713521L;

    /**
     * Instantiates a new view panel.
     *
     * @param viewFrame
     *          the view frame
     */
    public ViewPanel(final ViewFrame viewFrame) {
        this.setViewFrame(viewFrame);
        viewFrame.getModel().getObservable().addObserver(this);
    }

    /**
     * Gets the view frame.
     *
     * @return the view frame
     */
    private ViewFrame getViewFrame() {
        return this.viewFrame;
    }

    /**
     * Sets the view frame.
     *
     * @param viewFrame
     *          the new view frame
     */
    private void setViewFrame(final ViewFrame viewFrame) {
        this.viewFrame = viewFrame;
    }


    public void update(final Observable arg0, final Object arg1) {
        this.repaint();
    }
    /**
     * Method to change the view with the new model
     *
     * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
     */
    @Override
    protected void paintComponent(final Graphics graphics) {
        //graphics.clearRect(50, 50, this.getWidth(), this.getHeight());
        super.paintComponent(graphics);
        try {
            for(int y=0; y < this.getViewFrame().getModel().getMap().getHeight(); y++)
            {
                for(int x=0; x < this.getViewFrame().getModel().getMap().getWidth(); x++)
                {
                    this.getViewFrame().getModel().getMap().getOnTheMap()[x][y].getSprite().loadImage();
                }
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        for(int y=0; y < this.getViewFrame().getModel().getMap().getHeight(); y++)
        {
            for(int x=0; x < this.getViewFrame().getModel().getMap().getWidth(); x++)
            {
                graphics.drawImage(this.getViewFrame().getModel().getMap().getOnTheMap()[x][y].getSprite().getImage(), x*32, y*32, this);
            }
        }
        graphics.setFont(f1);
        graphics.setColor(Color.black);
        graphics.drawString("Collect Diamond : "+this.getViewFrame().getModel().getMap().getNumberOfDiamonds() + "/" + this.getViewFrame().getModel().getMap().getRequiredNumberOfDiamonds(), 1150, 500);

        try{
//			System.out.println("J'actualise_2");	debug
            viewFrame.getModel().getMap().getObservable().addObserver(this);

        }catch(Exception e){
            e.printStackTrace();
        }

    }


}