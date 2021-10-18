

public class counter
{
    int counter = 0;
    
    void PlusOne(){
        counter++;
    }
    void MinusOne(){
        counter--;
    }
    void PlusTen(){
        counter+=10;
    }
    void MinusTen(){
        counter-=10;
    }
    void reset(){
        counter = 0;
    }
    void display(){
        System.out.println(counter);
    }
}
