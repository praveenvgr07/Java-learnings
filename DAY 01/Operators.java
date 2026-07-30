/*Types of operations:
1.Arithmatic -> +,-,/,*,%
2.Logical -> && ,|| 
3.Relational -> !=,<=,>=
4,Bitwise -> and(&),or(|),xor(^),left shift(<<),right shift(>>),~(not    )
5.Assignment -> +=,-=,/=,*=,%=

Types of  operators :
unary - ++,--- etc ....
BINARY - normal
TERITORY - eg : if(a>b)? a : b input is a= 5 b= 4 out will be the 5.
*/

public class Operators {
    public static void main(String[] args){
// the problem is the the student is elligible to get mark sheet when the has 95% mark attendance greater then 75.
        int mark = 98;
        int attendance = 80;
        if (mark >= 95 && attendance >= 75){
            System.out.println("Elligible for marksheet");
        }
        else{
            System.out.println("Not Elligible for marksheet");
        }
/*2 nd Problem in the theator ticlet price greater then 200 or the snacks price greater then 0 you can 
watching movie else print better  luck next time */
        int ticket_price = 300;
        int snacks_price = 50;

        if(ticket_price >= 200 || snacks_price >= 0){
            System.out.println("Enjoy your time");
        }
        else{
            System.out.println("Better luck next time");
        }
    
    }
}
