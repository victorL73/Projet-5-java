package fr.exia.BoulderDash.entity;


import fr.exia.BoulderDash.contract.IEntity;

import java.awt.*;
/**the class entity is for get and set the sprite of entities
 * @author  Mathéo NOEL
 * @version 1.0
 */
public abstract class Entity implements IEntity {
/** the sprite */
    private Sprite sprite;
    private int numberOfDiamonds;

    /**the constructor take the sprite of a entity
     *
     * @param sprite
     */
    public Entity(final Sprite sprite){
        this.setSprite(sprite);
    }

    /** we get the sprite
     *
     * @return the sprite
     */
     public final Sprite getSprite(){
        return this.sprite;
     }

    /** we set the sprite
     *
     * @param sprite
     */
     protected final void  setSprite(final Sprite sprite){
        this.sprite = sprite;
    }

    /** we get the image
     *
     * @return return the image
     */
      public final Image getImage(){
        return this.getSprite().getImage();
    }

    /** we set the number of diamond for a level
     *
     * @param numberOfDiamonds
     */
      public  void setNumberOfDiamonds(int numberOfDiamonds){
        this.numberOfDiamonds = numberOfDiamonds;
}

}




