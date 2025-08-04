package lecture3forndwhileloop;

import java.util.*;
public class invertedhourglass {
    public static void main(String args[]) {
        Scanner scanner= new Scanner(System.in);
        int number= scanner.nextInt();
        int row=2;
        int count=1;
        int totalRows=(number*2)+1;
        int spaces= (number*2)-1;
        while(count<=totalRows){
            // print number 
            int initialvalue=number;
            int firstcol=1;
            while(firstcol<=row/2){
                System.out.print(initialvalue + " ");
                initialvalue--;
                firstcol++;    
            }
            // print spaces.
            int initialSpaces=1;
            while(initialSpaces<=spaces){
                System.out.print("  ");
                initialSpaces++;
            }

            int finalNumber=0;
            if(count<=number+1){
                finalNumber=number-count+1;
            }else{
                finalNumber=count-number-1;
            }
            int finalcol=1;
            if(count==number+1){
                finalcol=2;
                finalNumber=1;
            }
            while(finalcol<=row/2){
                System.out.print(finalNumber+" ");
                finalNumber++;
                finalcol++;
            }
            System.out.println();
            if(count<=number) {
                spaces-=2;
                row+=2;
            }else{
               spaces+=2;
               row-=2; 
            }
            count++;
        }
    }
}