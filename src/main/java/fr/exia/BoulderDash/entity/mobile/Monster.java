package fr.exia.BoulderDash.entity.mobile;

import fr.exia.BoulderDash.entity.Sprite;
/**Monster is the class for all  the monster in our map
 * @author  Mathéo NOEL
 * @version 1.0
 */
public class Monster extends Alive {
    //in our map we will replace all M by papillion.png
    private static final Sprite SPRITE = new Sprite('M',"Papillon.png");

    /** this constructor gives the sprite to Entity
     *
     */
    public Monster(){
        super(SPRITE);
    }
    @Override
    /** this method is used when a entity has to be penetrable*/
    public void permeability(){

    }

}
