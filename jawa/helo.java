//class  Aditya{
//    public static void main(String[] args) {
//
//        int a=6,b=3;
//        int c=a++ +b;
//
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//    }
//
//}
//class  Aditya{
//    public static void main(String[] args) {
//
//        int a=8,b=7;
//        int c=a&b;
//        int d=a|b;
//        int e=a^b;
//
//
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);
//    }
//
//}
//bit wise operator leftshift & right shift
//class  Aditya{
//    public static void main(String[] args) {
//
//        int a=8,b=a<<3;
//        int c=a>>3;
//
//
//
//        System.out.println(b);
//        System.out.println(c);
//
//    }
//

 //tild operator

////class  Aditya{
//    public static void main(String[] args) {
//
//        int a=10 ,b=~a;
//
//
//
//
//        System.out.println(b);
//
//
//    }
//
//}





//Given an integer, print 0 if its odd, else print 1.


//class Aditya {
//    public static void main(String[] args) {
//        int num = 15;
//        // Update the blank in code below
//
//        System.out.println((num % 2 == 1) ? 0 : 1);
//    }
//}



//Conditional Operator
//The conditional operator, often referred to as the "ternary operator", is a special operator in Java that allows you to perform a conditional operation in a concise way. It's the only ternary operator in Java and takes three operands: a condition, a value to return if the condition is true, and a value to return if the condition is false.
//
//Syntax:
//condition ? value_if_true : value_if_false;
//Explanation:
//condition: This is the expression to be evaluated. If it is true, the operator returns value_if_true; otherwise, it returns value_if_false.
//        value_if_true: This is the value returned if the condition evaluates to true.
//value_if_false: This is the value returned if the condition evaluates to false.
// class Aditya{
//    public static void main(String[] args) {
//         int a=5;
//         int b=3;
//         System.out.println(a=b);
//
//    }
//
//}

// Solve this problem - 1
// You are given the age of a person as the variable age.
// Will this person be able to vote?
// Output
//1
//        1 or
//0
//        0 assuming that the voting age is
//18
//        18 i.e., a person's age has to be greater than or equal to
//         18
//         18 to vote.


//public class Main {
//    public static void main(String[] args) {
//        int age = 20;
//        // Update the blank in code below
//        System.out.println((age >= 18) ? 1 : 0);
//    }
//}


//  class Aditya{
//    public static void main(String[] args) {
//        System.out.println('a'+'d'+'i'+'t'+'y'+'a');
//        System.out.print("a"+"d"+"i"+"t"+"y"+"a");
//
//    }
//
//}

//class Adita{
//    public static void main(String[] args) {
//         int a=20;
//         if(a<15)
//             System.out.println("inside if block");
//             System.out.println("20 is greater than 10 ");
//             System.out.println("i am not in if");
//
//
//    }
//}

//class Aditya{
//    public static void main(String[] args) {
//        int a =20;
//        if ( a< 10)
//            System.out.println("20 is in a");
//        else
//            System.out.println("it is greater than a");
//    }
//}

//class Aditya{
//    public static void main(String[] args) {
//        int age=19;
//        if( age>=18)
//            System.out.println("you are eligible to vote");
//        else
//            System.out.println("you are not eligible to vote");
//    }
//}

// class Aditya{
//     public static void main(String[] args) {
//         int i = 18;
//         if(i>=20)
//             System.out.println("it is greater than 20");
//         else
//             System.out.println("it is smaller than 20");
//     }
// }









//  class Aditay{
//      public static void main(String[] args) {
//          int a=1;
//          if (a++ > 1)
//              System.out.println(a);
//
//      }
//  }
//
//


//class Aditya{
//    public static void main(String[] args) {
//        int a=1;
//        if (++a>1)
//        System.out.println(a);
//    }
//}
//class Aditya{
//    public static void main(String[] args) {
//        int a=1;
//        if (a++<=1)
//            System.out.println(--a);
//    }
//}
//
//
//to calculate string length ++=====++++++++++++++++++++++++++++++++++++++++++++++++++
//
//String length
//We can use the length() function to get the length of a string.
//For eg.
//
//String s = "hello";
//int len = s.length();
//System.out.println(len);
//
//// Output
//// 5
//Task
//Write a program which does the following:
//
//Create a variable txt and assign it the text "NumeroTres".
//Use the length() function to output to the console the number of characters in txt.
//
//class Codechef
//{
//	public static void main (String[] args)
//	{
//        String txt = "NumeroTres";
//        int len = txt.length();
//        System.out.println("The length of the word is: " + len);
//	}
//}

//
//find position of string using indexing charAt()++++++++++++++++++++++++++++++++++++++++++++++++
//
//Outputting Characters from a String
//We use the concept of indexing to find the position of a character in a string, which means every character in a string corresponds to a number/position called the index number.
//
//        index
//
//Note - Indexing always starts from 0 when going left to right.
//
//To access the value of a specific character in a string, we refer to the index number, and use the charAt() method.
//
//String myString = "Chaf";
//System.out.println(myString.charAt(2));
//
//Output:
//a
//
//String myString = "Chaf";
//System.out.println(myString.charAt(0));
//
//Output:
//C
//        Task
//Write a program which does the following:
//
//Create a string variable word and assign the text "Programming" to it.
//Print the characters o and r (only one) from the string word in separate lines using the syntax defined above.
//
//        {
//public static void main (String[] args)
//{
//    String word = "Programming";
//    // Update your code below this line
//    System.out.println(word.charAt(2));
//    System.out.println(word.charAt(4));
//
//
//}
//}


//

import java.util.Arrays;

class Aditya{
    public static void main(String[] args) {

        int arr[]={2,34,5,6,7};
        System.out.println(Arrays.toString(arr));
         for( int num:arr){
             System.out.println(num);
         }
    }
}