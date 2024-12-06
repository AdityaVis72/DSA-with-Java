import java.util.Scanner;

//switch case
//
//public class a {
//
//    public static void main(String[] args) {
//        int number=2;
//        switch (number){
//            case 1:
//                System.out.println("samosha");
//            case 2:
//                System.out.println("samosha");
//            case 3:
//                System.out.println("samosha");
//
//            default:
//                System.out.println("we are dreaming");
//        }
//    }
//}===============================================================================================================
// import java.util.Scanner;
//
// class a{
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         System.out.println("enter a:");
//         int a= sc.nextInt();
//         System.out.println("enter b:");
//         int b= sc.nextInt();
//         System.out.println("enter opeerator:");
//         char operator=sc.next().charAt(0);
//
//         switch (operator){
//
//             case'+':
//                 System.out.println(a+b);
//                 break;
//             case'-':
//                 System.out.println(a-b);
//                 break;
//             case'*':
//                 System.out.println(a*b);
//                 break;
//             case'/':
//                 System.out.println(a/b);
//                 break;
//             case'%':
//                 System.out.println(a%b);
//                 break;
//             default:
//                 System.out.println("main etna hi kar skta");
//         }
//     }
// }
class a{
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("entere a no ");
         int a= sc.nextInt();
         if (a>0){
             System.out.println("positive");
         }
         else {
             System.out.println("negative");
         }



     }
 }