       import java.util.Scanner;

public class Palindrome {

  public static void main(String[] args) {

         Scanner input = new Scanner(System.in);

           System.out.print("请输入一个回文字符串: ");

       String s = input.nextLine();

       int low = 0;

       int high = s.length() - 1;

       boolean isPalindrome = true;

       while (low!=high) {
             if (s.charAt(low) != s.charAt(high)) {
                  isPalindrome = false;
                  break;
             }
             low++;                       
             high--;
}

       if (isPalindrome)

             System.out.println(s + "是一个回文字符串");

       else

             System.out.println(s + "不是一个回文字符串");

  }

}

