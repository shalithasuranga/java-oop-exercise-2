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
public class SpecieAlreadyExists  extends Exception{
    @Override
    public String getMessage() {
        return "Specie is already exists in National Park";
    }
}
