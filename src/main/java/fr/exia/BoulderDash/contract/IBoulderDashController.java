package fr.exia.BoulderDash.contract;


/**
 * The Interface IBoulderDashController.
 *
 * @author Mathéo NOEL
 * @version 1.0
 * @see IOrderPerformer
 */
public interface IBoulderDashController {


    /**
     * Gets the order peformer.
     *
     * @return the order peformer
     *
*/
    void orderPerform(UserOrder keyCodeToUseOrder);

}
