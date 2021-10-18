
public class smartphone
{
  String Name;
  String SerialNumber;
  int YearOfProduction;
  String Colour;
  boolean IsOn = true;
  
  void DisplayName(){
      System.out.println(Name);
  }
  public void TurnOn(){
      if(IsOn == false){
          IsOn = true;
      }
  }
  void Call(){
      if(IsOn == true){
          System.out.println("calling");
      }
  }
  

}
