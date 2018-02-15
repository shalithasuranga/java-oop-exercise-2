/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical1;

/**
 *
 * @author cst140043
 */
public class Specie {
    private String name;
    private int sightings;
    private int dangerLevel;

    public Specie(String name, int dangerLevel) {
        this.name = name;
        this.dangerLevel = dangerLevel;
        this.sightings = 0;
    }

    public String getName() {
        return name;
    }

    public int getSightings() {
        return sightings;
    }

    public int getDangerLevel() {
        return dangerLevel;
    }

    public void resetSightings(int sightings) {
        this.sightings = 0;
    }
    
    public void addSightings(int sightings) throws SightingIsLessThanZero {
        if(sightings > 0){
            this.sightings += sightings;
        }
        else{
            throw new SightingIsLessThanZero();
        }
    }
    
    public void printSpecies(){
        System.out.printf("%s has been seen %d times, its danger level is %d\n", this.name, this.sightings, this.dangerLevel);
    }
    
    
}
