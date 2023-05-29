/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShipBuildPackage;

import ShipFactoryPackage.CSCShipFactory;
import ShipFactoryPackage.HCShipFactory;
import ShipPackage.Ship;
import ShipPackage.HCShip;
import ShipPackage.CSCShip;
import ShipFactoryPackage.ShipFactory;

/**
 * A class representing the process of building surface ships, which extends the
 * abstract ShipBuilding class and provides a method for creating a Canadian
 * Surface Ship of a particular type.
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
// This is the only class that needs to change, if you
// want to determine which enemy ships you want to
// provide as an option to build
public class SurfaceShipBuilding extends ShipBuilding {

    /**
     * Creates a new Canadian Surface Ship of the specified type using the
     * appropriate ShipFactory.
     *
     * @param typeOfShip the type of Canadian Surface Ship to create
     * @return a new Canadian Surface Ship of the specified type
     */
    @Override
    protected Ship makeCanadianShip(String typeOfShip) {
        Ship theCanadianShip = null;
        if (typeOfShip.equals("HC")) {
            ShipFactory shipPartsFactory = new HCShipFactory();
            theCanadianShip = new HCShip(shipPartsFactory);
            theCanadianShip.setName("HMCS Ottawa");
            System.out.println("Created Halifax Class ship " + theCanadianShip.getName());
            ;
        } else if (typeOfShip.equals("CSC")) {
            ShipFactory shipPartsFactory = new CSCShipFactory();
            theCanadianShip = new CSCShip(shipPartsFactory);
            theCanadianShip.setName("HMCS CSC001");
            System.out.println("Created Canadian Surface Combatant ship " + theCanadianShip.getName());

        }
        return theCanadianShip;
    }
}
