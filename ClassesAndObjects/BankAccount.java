
public class BankAccount
{
    int balance;
    String AccNumber;
    String OwnerName;
    String CreationDate;
    boolean IsActive = false;
    
    void DisplayBalance(){
        System.out.println("Current balance is: " + balance);
    }
    
    void CheckStatus(){
        if(IsActive == true){
            System.out.println("active");
        }
        else{
            System.out.println("not active");
        }
    }
    void CheckOwner(){
        System.out.println("Owner: " + OwnerName);
    }
}
