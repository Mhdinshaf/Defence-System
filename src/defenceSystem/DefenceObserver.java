package defenceSystem;

public interface DefenceObserver {
    
    public void areaClear(boolean AreaClear);
    public void getMsg(String msg);
    public void getMsgHeli(String msg);
    public void getMsgTank(String msgTank);
    public void getMsgSub(String msgSub);

    public void setPosition(int value);
   
    
    
}
