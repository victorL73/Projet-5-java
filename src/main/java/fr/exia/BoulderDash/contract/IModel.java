package fr.exia.BoulderDash.contract;


import fr.exia.BoulderDash.entity.Map;

import java.util.Observable;





/**
 * The Interface IModel.
 *
<<<<<<< HEAD
 * @author Jean-Aymeric Diet
=======
 * @author Mathéo NOEL
 * @version 1.0
>>>>>>> origin/master
 */
public interface IModel {

    /**
     * Gets the Map.
     *
     * @return the MAP
     */
    Map getMap();

    /** Load the MAP
     *
     * @param id
     */
    void loadMap(int id);

    /**
     * Gets the observable.
     *
     * @return the observable
     */
    Observable getObservable();


}