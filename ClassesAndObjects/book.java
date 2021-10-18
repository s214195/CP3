

public class book
{
    String Name;
    int NumberOfPages;
    boolean IsOpen = false;
    
    void DisplayName(){
        System.out.println(Name);
    }
    void DisplayNumberOfPages(){
        System.out.println(NumberOfPages);
    }
    void Open(){
        if (IsOpen == false) {
        IsOpen = true;
        }
    }
      void Close(){
        if (IsOpen == true) {
        IsOpen = false;
        }
    } 
}
