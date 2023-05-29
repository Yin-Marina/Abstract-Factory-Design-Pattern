/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShipPackage;

import ShipEquipments.Engine;
import ShipEquipments.Weapon;
import ShipFactoryPackage.ShipFactory;

/**
 * This class represents a Halifax Class Ship, which is a type of Ship. It
 * extends the abstract class Ship and implements the equipShip method defined
 * in it. The HCShip class has a ShipFactory object which is used to add
 * specific equipments (weapon and engine) to the Halifax Class Ship. It
 * implements the equipShip method to call the addGun and addEngine methods from
 * the ShipFactory to set the weapon and engine for the HCShip object. The class
 * contains a constructor that initializes the shipFactory attribute to the
 * ShipFactory passed as an argument.
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
public class HCShip extends Ship {

    /**
     * ShipFactory object used to add specific equipments to the HCShip object
     */
    ShipFactory shipFactory;

    /**
     * Constructor for the HCShip class that sets the ShipFactory attribute to
     * the ShipFactory passed as an argument.
     *
     * @param shipFactory the ShipFactory object used to add specific equipments
     * to the HCShip object
     */
    public HCShip(ShipFactory shipFactory) {
        this.shipFactory = shipFactory;
    }

    // EnemyShipBuilding calls this method to build a 
    // specific HCShip
    /**
     * This method implements the equipShip method defined in the abstract class
     * Ship. It sets the weapon and engine attributes of the HCShip object by
     * calling the addGun and addEngine methods from the ShipFactory.
     */
    public void equipShip() {

        System.out.println("Adding equipments to Halifax Class ship " + getName());
        this.weapon = this.shipFactory.addGun();
        this.engine = this.shipFactory.addEngine();

    }
}
