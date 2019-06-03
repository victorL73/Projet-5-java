package fr.exia.BoulderDash.controller;

import fr.exia.BoulderDash.contract.IBoulderDashController;
import fr.exia.BoulderDash.contract.IModel;
import fr.exia.BoulderDash.contract.IView;
import fr.exia.BoulderDash.contract.UserOrder;

/**

 * The Class Controller.
 * The Class BoulderDashController.
 * @author Matheo NOEL
 * @version 1.0


 */
public final class BoulderDashController implements IBoulderDashController{
    /** The view. */
    private IView view;

    /** The model. */
    private IModel model;
/**Position of the character in X*/
    private int characterX = 1;
/** Position of the Character in Y*/
    private int characterY = 1;
/** The level*/
    private int level ;
/** the lives*/
    private int lives ;
/** Check if something has moved*/
    private boolean hasMoved;

    /**
     * Instantiates a new controller.
     *
     * @param view
     *          the view
     * @param model
     *          the model
     */
    public BoulderDashController(final IView view, final IModel model)  {
        this.setView(view);
        this.setModel(model);;
    }

    /**
     * Sets the view.
     *
     * @param pview
     *            the new view
     */
    private void setView(final IView pview) {
        this.view = pview;
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
     * This method set number of diamond for earch level and the spawn of the player
     * @param userOrder
     */
    public void orderPerform(final UserOrder userOrder) {
        switch (userOrder) {
            case L1:
                level = this.model.getMap().getLevel();
                lives = this.model.getMap().getNumberOfLives();
                System.out.println(lives);
                if(this.model.getMap().getNumberOfLives() == 0) {
                    this.model.getMap().setLevel(1);
                    level = this.model.getMap().getLevel();
                }
                this.model.loadMap(this.model.getMap().getLevel());
                this.model.getMap().setNumberOfLives(lives);
                this.model.getMap().setLevel(level);
                this.model.getMap().setNumberOfDiamonds(0);
                switch(this.model.getMap().getLevel()) {
                    case 1 :
                        //Level when you lose the game
                        this.model.getMap().setRequiredNumberOfDiamonds(0);
                        this.characterX = 1;//Positioning of the player in X on the MAP at the start
                        this.characterY = 1;//Positioning of the player in Y on the MAP at the start
                        this.model.getMap().setLevel(1);
                        this.model.getMap().setNumberOfLives(3);
                        System.out.println("You lose !");
                        break;
                    case 2 :
                        System.out.println("You are on the Level 1 ! GOOD LUCK");
                        //Level 1
                        this.model.getMap().setRequiredNumberOfDiamonds(5);
                        this.characterX = 2;//Positioning of the player in X on the MAP at the start
                        this.characterY = 5;//Positioning of the player in Y on the MAP at the start
                        break;
                    case 3 :
                        System.out.println("You are on the Level 2 !");
                        //Level 2
                        this.model.getMap().setRequiredNumberOfDiamonds(5);
                        this.characterX = 1;//Positioning of the player in X on the MAP at the start
                        this.characterY = 2;//Positioning of the player in Y on the MAP at the start
                        break;
                    case 4 :
                        System.out.println("You are on the Level 3 !");
                        //Level 3
                        this.model.getMap().setRequiredNumberOfDiamonds(7);
                        this.characterX = 1;//Positioning of the player in X on the MAP at the start
                        this.characterY = 3;//Positioning of the player in Y on the MAP at the start
                        break;
                    case 5 :
                        System.out.println("You are on the Level 4 !");
                        //Level 4
                        this.model.getMap().setRequiredNumberOfDiamonds(8);
                        //8 diamonds for the level
                        this.characterX = 1;//Positioning of the player in X on the MAP at the start
                        this.characterY = 1;//Positioning of the player in Y on the MAP at the start
                        break;
                    case 6 :
                        //Level5
                        System.out.println("You are on the Level 5 !");
                        this.model.getMap().setRequiredNumberOfDiamonds(7);
                        this.characterX = 2;//Positioning of the player in X on the MAP at the start
                        this.characterY = 2;//Positioning of the player in Y on the MAP at the start
                        break;

                }
                break;

            case UP:
                //Movement up
                hasMoved = this.model.getMap().characterGoesUp(this.model.getMap().getOnTheMapXY(characterX, characterY), characterX, characterY);
                if (hasMoved) {
                    characterY--;
                }
                break;
            case DOWN:
                //Movement down
                hasMoved = this.model.getMap().characterGoesDown(this.model.getMap().getOnTheMapXY(characterX, characterY), characterX, characterY);
                if (hasMoved) {
                    characterY++;
                }
                break;
            case LEFT:
                //Movement left
                hasMoved = this.model.getMap().characterGoesLeft(this.model.getMap().getOnTheMapXY(characterX, characterY), characterX, characterY);
                if (hasMoved) {
                    characterX--;
                }
                break;
            case RIGHT:
                //Movement right
                hasMoved = this.model.getMap().characterGoesRight(this.model.getMap().getOnTheMapXY(characterX, characterY), characterX, characterY);
                if (hasMoved) {
                    characterX++;
                }
                break;
            default:
                break;

        }

    }


    /**
     * get the view
     * @return a view
     */


    public IView getView() {
        return view;
    }
    /**
     * get the model
     * @return a model
     */

    public IModel getModel() {
        return model;
    }
    /**
     * get the character position X
     * @return the position in X
     */
    public int getCharacterX() {
        return characterX;
    }
    /**
     * set the character in position X
     */

    public void setCharacterX(int characterX) {
        this.characterX = characterX;
    }
    /**
     * get the character position Y
     * @return the position in Y
     */

    public int getCharacterY() {
        return characterY;
    }
    /**
     * Set the position Y of the Character
     */

    public void setCharacterY(int characterY) {
        this.characterY = characterY;
    }
    /**
     * get the level
     * @return the level
     */
    public int getLevel() {
        return level;
    }
    /**
     * Set the level
     */
    public void setLevel(int level) {
        this.level = level;
    }

}