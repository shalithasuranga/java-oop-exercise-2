/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical1;

import java.util.ArrayList;

/**
 *
 * @author cst140043
 */
public class NationalPark {
    ArrayList <Specie> animals;

    public NationalPark() {
        this.animals = new ArrayList<Specie>();
        
        
    }
    
    
    public void addSpecie(Specie animal) throws SpecieAlreadyExists{
        for(Specie s : this.animals){
            if(s.getName().equals(animal.getName())) {
                throw new SpecieAlreadyExists();
            }
        }
        
        this.animals.add(animal);
    }
    
    
    
    public void showSpecies(){
        for(Specie s : this.animals){
            s.printSpecies();
        }
    }
    
    public void printEndangered(){
        for(Specie s : this.animals){
            if(s.getDangerLevel() > s.getSightings())
                s.printSpecies();
        }
    }
    
    public void removeSpecie(String name) throws SpecieNotFoundInPark{
        int index = 0;
        for(Specie s : this.animals){
            if(s.getName().equals(name)) {
                animals.remove(index);
                return;
            }
            index ++;
        }
        throw new SpecieNotFoundInPark();
    }    
    
    
    
    
}
