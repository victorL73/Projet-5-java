package fr.exia.BoulderDash.entity.mobile;

import fr.exia.BoulderDash.entity.Entity;
import fr.exia.BoulderDash.entity.Sprite;
/**the classe Mobile Entity is used for the mobile entity
 * @author  Mathéo NOEL
 * @version 1.0
 */
public abstract class MobileEntity extends Entity {


    /** this constructor gives the sprite
     *
     * @param sprite
     */
    public MobileEntity (Sprite sprite){
        super(sprite);
    }
}
