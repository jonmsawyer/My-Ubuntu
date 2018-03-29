package Package_01;

import java.io.Serializable;

public class PlayerControl implements Serializable {
    /**
     * serial number to write to file
     */
    private static final long serialVersionUID = -415L;

    public int position = 0;
    
    
    PlayerControl(int pos)
    {
        this.position = pos;
    }
    
    void PlayerControlMovement()
    {
    	
    }
}