/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.UI.Framework;

/**
 *
 * @author MDA 174321 :)
 */
public interface Updatable {
    public void Update(Model aModel);
    public boolean UpdateComponent(String aComponentId, Model aModel);
    public String getUpdateId();
    public void setUpdateId(String aId);
}
