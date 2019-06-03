package fr.exia.BoulderDash.entity.mobile;

import fr.exia.BoulderDash.contract.IPermeability;
import fr.exia.BoulderDash.entity.Sprite;

/**Alive is a class for Alive entity
 * @author  Mathéo NOEL
 * @version 1.0
 */
public abstract class Alive extends MobileEntity implements IPermeability {

    /** Method for check if something is alive
     *
     * @param sprite
     */
    Alive(Sprite sprite){
        super((sprite));
    }
}
