package fr.exia.BoulderDash.entity.mobile;
import fr.exia.BoulderDash.entity.Sprite;
/**Character is the class for the hero on the map
 * @author  Mathéo NOEL
 * @version 1.0
 */

public class Character extends Alive {
//in our map we will replace the C by a image of character
    private static final Sprite SPRITE = new Sprite('C',"Face4.png");

    /** Character() is used for give the sprite and he is also the constructor
     *
     */
    public Character(){
        super(SPRITE);
    }
    /** this method is used when a entity has to be penetrable*/
    @Override
    public void permeability(){

    }
}
