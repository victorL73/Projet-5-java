package fr.exia.BoulderDash.entity.mobile;

import fr.exia.BoulderDash.entity.Sprite;
/**AliveORDead is used to separate living entity and dead entity
 * @author  Mathéo NOEL
 * @version 1.0
 */

public abstract class AliveORDead extends MobileEntity {
    /**this constructor gives the sprite to entity
     *
     * @param sprite
     */
    AliveORDead(Sprite sprite){
        super(sprite);
    }
}
