import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String word = "";
        String reversed = "";
        String word2 = "";

        System.out.print("Enter a number: ");
        word = input.next();

        //reversed = sum of chars (counting down)
        for(int i=word.length(); i>0; i--){
            //System.out.println(word.charAt(i-1));
            word2 += word.charAt(i-1);
        }
        System.out.println("original: "+word);
        System.out.println("reversed: "+word2);

        //if word==word2, palindrome!
        if(word.equals(word2)){
            System.out.println("this is a palindrome!");
        } else {
            System.out.println("Not a palindrome :(");
        }


    }
}
