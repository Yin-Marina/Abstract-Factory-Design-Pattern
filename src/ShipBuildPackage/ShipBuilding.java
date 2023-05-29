/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShipBuildPackage;

import ShipPackage.Ship;

/**
 * An abstract class representing a ShipBuilding process that provides a method
 * for creating a Canadian Ship of a particular type.
 * Class: CST8288 - Lab Section: 013
 * 
 * Class: CST8288 - Lab Section: 013
 * 
 * Lab Professor: Siju Philip
 * 
 * Date: March. 16, 2023
 * 
 * @author Mutao Yin
 * @version 1.0
 * 
 */
public abstract class ShipBuilding {

    /**
     * Abstract method to create a new Canadian Ship of a specified type.
     *
     * @param typeOfShip the type of Canadian Ship to create
     * @return a new Canadian Ship of the specified type
     */
    protected abstract Ship makeCanadianShip(String typeOfShip);

    /**
     * Orders a new Canadian Ship of a specified type, equips it, and returns
     * it.
     *
     * @param typeOfShip the type of Canadian Ship to order
     * @return the new Canadian Ship that has been ordered and equipped
     */
    public Ship orderTheShip(String typeOfShip) {
        Ship theShip = makeCanadianShip(typeOfShip);
        theShip.equipShip();
        return theShip;

    }
}
