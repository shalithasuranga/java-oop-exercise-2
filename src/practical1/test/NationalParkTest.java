/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical1.test;

import java.util.logging.Level;
import java.util.logging.Logger;
import practical1.NationalPark;
import practical1.SightingIsLessThanZero;
import practical1.Specie;
import practical1.SpecieAlreadyExists;
import practical1.SpecieNotFoundInPark;

/**
 *
 * @author cst140043
 */
public class NationalParkTest {
    
    public static void  testSpecie(){
        Specie s = new Specie("Elephant", 5);
        System.out.println("Name : " + s.getName());
        System.out.println("Danger Level : " + s.getDangerLevel());
        System.out.println("Sights : " + s.getSightings());
    }
    
    public static void  testSpecieWithSightings(){
        Specie s = new Specie("Elephant", 5);
        try {
            s.addSightings(10);
            s.addSightings(12);
            //s.addSightings(-10); uncomment to see the magic
        }
        catch(SightingIsLessThanZero e){
            System.out.println(e.getMessage());
        }
        System.out.println("Name : " + s.getName());
        System.out.println("Danger Level : " + s.getDangerLevel());
        System.out.println("Sights : " + s.getSightings());
    }
    
    
    public static void testNationalParkWithSpecies(){
        NationalPark n = new NationalPark();
        try {
            n.addSpecie(new Specie("Elephant", 10));
            Specie tiger = new Specie("Tiger", 2);
            try {
                tiger.addSightings(1);
            } catch (SightingIsLessThanZero ex) {
                System.out.println(ex.getMessage());
            }
            n.addSpecie(tiger);
            
        } catch (SpecieAlreadyExists ex) {
            System.out.println(ex.getMessage());
        }
        
        n.showSpecies();
    }

    public static void testNationalParkWithSpeciesAndRemoveSomeSpecies(){
        NationalPark n = new NationalPark();
        try {
            n.addSpecie(new Specie("Elephant", 10));
            Specie tiger = new Specie("Tiger", 2);
            try {
                tiger.addSightings(1);
            } catch (SightingIsLessThanZero ex) {
                System.out.println(ex.getMessage());
            }
            n.addSpecie(tiger);
            
        } catch (SpecieAlreadyExists ex) {
            System.out.println(ex.getMessage());
        }
        try {
            n.removeSpecie("Tiger");
        } catch (SpecieNotFoundInPark ex) {
            System.out.println(ex.getMessage());
        }
        n.showSpecies();
    }    
    
    
    public static void testNationalParkWithSpeciesAndRemoveSomeSpeciesAndGetError(){
        NationalPark n = new NationalPark();
        try {
            n.addSpecie(new Specie("Elephant", 10));
            Specie tiger = new Specie("Tiger", 2);
            try {
                tiger.addSightings(1);
            } catch (SightingIsLessThanZero ex) {
                System.out.println(ex.getMessage());
            }
            n.addSpecie(tiger);
            
        } catch (SpecieAlreadyExists ex) {
            System.out.println(ex.getMessage());
        }
        try {
            n.removeSpecie("Penguin");
        } catch (SpecieNotFoundInPark ex) {
            System.out.println(ex.getMessage());
        }
        n.showSpecies();
    }    
       
       
    public static void main(String[] args) {
        System.out.println("========== TEST 1 =========");
        NationalParkTest.testSpecie();
        System.out.println("========== TEST 2 =========");
        NationalParkTest.testSpecieWithSightings();
        System.out.println("========== TEST 3 =========");
        NationalParkTest.testNationalParkWithSpecies();
        System.out.println("========== TEST 4 =========");
        NationalParkTest.testNationalParkWithSpeciesAndRemoveSomeSpecies();
        System.out.println("========== TEST 5 =========");
        NationalParkTest.testNationalParkWithSpeciesAndRemoveSomeSpeciesAndGetError();
    }
}
