package event;

import Charactor.*;

public class Event {
    public static boolean checkHit(Flash flash,Wave wave,int flashSize,int waveHeight){
        if(flash.x+flashSize>wave.x&&flash.x<wave.x) {
            if(flash.y+flashSize>=wave.y-waveHeight) {
		return true;
            }
        }
                return false;
    }
			
    public static void gameStop(Wave[] wave,Environment[] env) {
    
    }

}
