package entity;


import fr.exia.BoulderDash.contract.IEntity;

import java.util.Observable;

/**
 *The Interface IMap
 *
 * @author Mathéo NOEL
 * @version 0.1
 */


public interface IMap {
    /**gets the Width
     *
     * @return the height
     */
    int getWidth();

    /**
     * Gets the height.
     *
     * @return the height
     */
    int getHeight();

    /**
     * Gets the on the MAP XY.
     *
     * @param x
     *            the x
     * @param y
     *            the y
     * @return the on the MAP XY
     */
    IEntity getOnTheMapXY(int x, int y);

    /** Get the Obervable
     *
     * @return Observable
     */
    Observable getObservable();
}