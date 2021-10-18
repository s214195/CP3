

public class lamp
{
    boolean IsOn;
    
    void SwitchOn(){
        IsOn = true;
    }
    void SwitchOff(){
        IsOn = false;
    }
    void Display(){
        System.out.println(IsOn);
    }
}
