/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShipFactoryPackage;

import ShipEquipments.CSCGun;
import ShipEquipments.Engine;
import ShipEquipments.Weapon;
import ShipEquipments.CSCEngine;

/**
 * The CSCShipFactory class is a concrete implementation of the ShipFactory
 * interface, responsible for creating specific Surface Ship objects with CSC
 * specifications. This class defines all the parts of the ship that it will use
 * by implementing the addGun() and addEngine() methods defined in the
 * ShipFactory interface. The returned objects specify a specific weapon and
 * engine to be associated with the ship.
 *
 *  * Class: CST8288 - Lab Section: 013
 * 
 * Lab Professor: Siju Philip
 * 
 * Date: March. 16, 2023
 * 
 * @author Mutao Yin
 * @version 1.0
 */
// This factory uses the ShipFactory interface
// to create very specific Surface Ship (here a CSC Ship)
// This is where we define all of the parts the ship
// will use by defining the methods implemented
// being Weapon and Engine
// The returned object specifies a specific weapon & engine
public class CSCShipFactory implements ShipFactory {

    // Defines the weapon object to associate with the ship
    /**
     * Returns a CSCGun object, which is a specific type of Weapon object, to be
     * associated with the ship created by this factory.
     *
     * @return a CSCGun object, which is a specific type of Weapon object.
     */
    @Override
    public Weapon addGun() {
        return new CSCGun();
    }

    // Defines the engine object to associate with the ship
    /**
     * Returns a CSCEngine object, which is a specific type of Engine object, to
     * be associated with the ship created by this factory.
     *
     * @return a CSCEngine object, which is a specific type of Engine object.
     */
    @Override
    public Engine addEngine() {
        return new CSCEngine();
    }

}
