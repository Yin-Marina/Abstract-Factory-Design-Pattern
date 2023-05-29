/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShipPackage;

import ShipEquipments.Engine;
import ShipEquipments.Weapon;

/**
 * The abstract class representing a ship. Contains fields for the ship's name,
 * weapon, and engine. Also contains abstract method equipShip(), and methods
 * for displaying the ship's speed and gun description.
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
public abstract class Ship {

    /**
     * The name of the ship.
     */
    private String name;

    // Newly defined objects that represent weapon & engine
    // These can be changed easily by assigning new parts 
    // in HCShipFactory or CSCShipFactory
    /**
     * The weapon object associated with the ship.
     */
    Weapon weapon;
    /**
     * The engine object associated with the ship.
     */
    Engine engine;

    /**
     * Getter for the name of the ship.
     *
     * @return the name of the ship
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for the name of the ship.
     *
     * @param newName the new name for the ship
     */
    public void setName(String newName) {
        name = newName;
    }

    /**
     * Abstract method for equipping the ship with a weapon and an engine.
     */
    public abstract void equipShip();

    // Because the toString method is defined in engine
    // when it is printed the String defined in toString goes
    // on the screen
    /**
     * Prints the ship's speed to the console.
     */
    public void displyShipSpeed() {

        System.out.println(getName() + " Engine: " + engine);

    }

    /**
     * Prints the ship's gun description to the console.
     */
    public void shipGunDesc() {

        System.out.println(getName() + " Gun: " + weapon);

    }

    // If any Ship object is printed to screen this shows up
    /**
     * Returns a string representation of the ship.
     *
     * @return a string containing information about the ship's name, engine,
     * and weapon.
     */
    public String toString() {

        String infoOnShip = "The " + name + " with " + engine
                + " and has  " + weapon;

        return infoOnShip;

    }

}
