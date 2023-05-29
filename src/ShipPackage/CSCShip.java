/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShipPackage;

import ShipFactoryPackage.ShipFactory;

/**
 * The CSCShip class is a type of Ship that can be built using a specific
 * ShipFactory. It inherits from the abstract class Ship and implements the
 * equipShip method to add specific weapons and engines to the ship.
 *
 * Class: CST8288 - Lab Section: 013
 *
 * Lab Professor: Siju Philip
 *
 * Date: March. 16, 2023
 *
 * @author Mutao Yin
 * @version 1.0
 */
public class CSCShip extends Ship {

    /**
     * ShipFactory object used to add specific equipments to the CSCShip object
     */
    ShipFactory shipFactory;

    /**
     * Constructor for the CSCShip class. Takes a ShipFactory object to use when
     * building the ship.
     *
     * @param shipFactory The ShipFactory object to use for building the ship.
     */
    public CSCShip(ShipFactory shipFactory) {

        this.shipFactory = shipFactory;
    }

    // EnemyShipBuilding calls this method to build a 
    // specific CSCShip
    /**
     * Implements the equipShip method of the Ship abstract class. Adds specific
     * weapons and engines to the ship using the ShipFactory object passed to
     * the constructor.
     */
    public void equipShip() {

        System.out.println("Adding equipments to Canadian Surface Combatant ship " + getName());
        this.weapon = this.shipFactory.addGun();
        this.engine = this.shipFactory.addEngine();

    }
}
