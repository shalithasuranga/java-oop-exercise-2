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
public class SightingIsLessThanZero extends Exception{

    @Override
    public String getMessage() {
        return "Sighting should be a positive number";
    }
    
}
