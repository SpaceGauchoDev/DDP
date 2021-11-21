/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.UI.Framework;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import poker.Utils;
/**
 *
 * @author MDA 174321 :)
 */
public class Observable {
    public Set<Observer> myObservers = new HashSet();

    public void addObserver(Observer aObserver) 
    {
        myObservers.add(aObserver);
    }
    
    public void removeObserver(Observer aObserver) 
    {
        myObservers.remove(aObserver);
    }
    
    public void notifyObservers(ObservableEventsEnum aEvent) 
    {
        for (Iterator<Observer> iterator = myObservers.iterator(); iterator.hasNext();) 
        {
            Observer o = iterator.next();
            o.update(this, aEvent);
        }        
    }
}
