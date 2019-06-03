package fr.exia.BoulderDash.entity.mobile;

import fr.exia.BoulderDash.contract.IPermeability;
import fr.exia.BoulderDash.entity.Sprite;
/**Grass is the class for the grass block on the map
 * @author  Mathéo NOEL
 * @version 1.0
 */


public class Grass extends AliveORDead implements IPermeability {



    //in our map we will replace all the G by a image of grass
    private static final Sprite SPRITE = new Sprite('G',"Grass.png");
    /** Grass() is used for give the sprite and he is also the constructor
     *
     */
    public Grass() {
        super(SPRITE);
    }


    /** this method is used when a entity has to be penetrable*/

    public void permeability() {

    }
}
