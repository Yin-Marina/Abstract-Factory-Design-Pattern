/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShipFactoryPackage;

import ShipEquipments.HCEngine;
import ShipEquipments.Engine;
import ShipEquipments.Weapon;
import ShipEquipments.HCGun;

/**
 * This class represents a factory that produces Halifax Class Ships. It
 * implements the ShipFactory interface to define the required equipment for the
 * ship, which includes a weapon and an engine. The HCShipFactory class provides
 * specific implementations of the addGun() and addEngine() methods, which
 * return objects representing a Halifax Class gun (HCGun) and a Halifax Class
 * engine (HCEngine), respectively. These objects are used to build a complete
 * Halifax Class Ship. The HCShipFactory is an example of the factory design
 * pattern, which encapsulates object creation by delegating it to a specific
 * factory class instead of instantiating objects directly. This makes it easier
 * to manage object creation and allows for more flexibility in changing the
 * type of objects created without affecting the rest of the code.
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
// This factory uses the ShipFactory interface
// to create very specific Surface Ship (here Halifax Class Ship)
// This is where we define all of the parts the ship
// will use by defining the methods implemented
// being Weapon and Engine
// The returned object specifies a specific weapon & engine
public class HCShipFactory implements ShipFactory {

    // Defines the weapon object to associate with the ship
    /**
     * Returns an object representing a Halifax Class gun (HCGun) to be used in
     * a Halifax Class Ship.
     *
     * @return a HCGun object
     */
    @Override
    public Weapon addGun() {
        return new HCGun();
    }

    // Defines the engine object to associate with the ship
    /**
     * Returns an object representing a Halifax Class engine (HCEngine) to be
     * used in a Halifax Class Ship.
     *
     * @return a HCEngine object
     */
    @Override
    public Engine addEngine() {
        return new HCEngine();

    }
}
