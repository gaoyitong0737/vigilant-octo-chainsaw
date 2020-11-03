import java.util.Scanner;    

public class  test{        

    public static void main(String[] args){  

        double[] nums = new double[10];

        Scanner cin = new Scanner(System.in);  
        System.out.println(nums.length);

        for(int i = 0; i < 10; ++i){  

            nums[i] =cin.nextDouble(); 

        }            

        double m = max(nums);

        System.out.println(m); 

    }    

      

    public static double max(double array[]){  

        double m = array[0];  

        for(int i = 0; i < 10; ++i){  

            if(array[i] > m)  

            	m=i; 

        }  

      return  m;   

    }  

} 