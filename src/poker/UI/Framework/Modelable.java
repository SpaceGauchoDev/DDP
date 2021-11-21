/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.UI.Framework;
import poker.Entity;

/**
 *
 * @author MDA 174321 :)
 */
public interface Modelable {
    
    // should return a Model to be used by the ui with all the relevant Entity's attributes accesible
    public Model toModel (Object aSomeData);
    public Model toModel ();
}
