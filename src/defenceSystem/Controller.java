package defenceSystem;

import java.util.Observer;

public class Controller {
    private DefenceObserver[] obsArray=new DefenceObserver[50];
    private int nextIndex=0;
    
    public void setArea(boolean areaClear){
        for (int i = 0; i < nextIndex; i++) {
            DefenceObserver ob=obsArray[i];
            ob.areaClear(areaClear);
        }
    }
    
    public void addObserver(DefenceObserver obs){
        obsArray[nextIndex]=obs;
        nextIndex++;
    }
    
    public void setMsg(String msg){
        for (int i = 0; i <nextIndex; i++) {
            DefenceObserver ob=obsArray[i];
            ob.getMsg(msg);
        }
          
    }

    void setMsgHeli(String msgHeli) {
       for (int i = 0; i <nextIndex; i++) {
            DefenceObserver ob=obsArray[i];
            ob.getMsgHeli(msgHeli);
        }
    }
    

    void setMsgTank(String msgTank) {
     for (int i = 0; i <nextIndex; i++) {
            DefenceObserver ob=obsArray[i];
            ob.getMsgTank(msgTank);
        }
    }    

    void setMsgSub(String msgSub) {
         for (int i = 0; i <nextIndex; i++) {
            DefenceObserver ob=obsArray[i];
            ob.getMsgSub(msgSub);
        }
    }

    void setValue(int value) {
        for (int i = 0; i <nextIndex; i++) {
            DefenceObserver ob=obsArray[i];
            ob.setPosition(value);
        }
    }

    
}
