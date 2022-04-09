/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Jamit
 */
public class Common {
    private int slotId=0;

    public int getSlotId() {
        setSlotId(slotId+1);
        return slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }
    
    
}
