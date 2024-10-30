package W2_1_T1;

public class Television {
    private int channel; // what the current channel is
    private boolean curState; // true if TV is on, false if it isn't

    public int getChannel(){
        return channel;
    }

    public void setChannel(int channelNum){
        channel = channelNum;
    }

    public boolean isOn(){
        return curState;
    }

    public void pressOnOff(){
        curState = !curState;
    }
}
