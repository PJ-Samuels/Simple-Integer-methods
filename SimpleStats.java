import java.util.*;
public class SimpleStats {

    public static void printMenu() {
        System.out.println("(0) Enter new numbers");
        System.out.println("(1) Find the largest");
        System.out.println("(2) Compute the sum");
        System.out.println("(3) Compute the range (largest - smallest)");
        System.out.println("(4) Compute the average");
        System.out.println("(5) Print the numbers in ascending order");
        System.out.println("(6) Quit");
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);        

        // variable declarations 
        int n1 = 2;
        int n2 = 4;
        int n3 = 6;

        boolean more_input = true;
        
        do {
            System.out.print("The current numbers are: ");
            System.out.println(n1 + " " + n2 + " " + n3);
            
            printMenu();
            System.out.print("Enter your choice: ");
            int choice = scan.nextInt();
            
            if (choice == 0) {
                System.out.print("Enter three new numbers: ");
                n1 = scan.nextInt();
                n2 = scan.nextInt();
                n3 = scan.nextInt();
            }
            else if(choice == 1){
                int ans = largest(n1,n2,n3);
                System.out.println("Largest"+ans);
            }
            else if(choice == 2){
                int ans = sum(n1,n2,n3);
                System.out.println("Sum = "+ans);
            }
            else if(choice == 3){
                int ans = range(n1,n2,n3);
                System.out.println("Range = "+ans);
            }
            else if(choice == 4){
                double ans = average(n1,n2,n3);
                System.out.println("Average = "+ans);
            }
            else if(choice == 5){
                print(n1,n2,n3);
            }
            else if (choice == 6) {
                more_input = false;
            } 
            else {
                System.out.println("Invalid choice. Please try again.");
            }
            
            System.out.println();
        } while (more_input);
        scan.close();
        System.out.println("Have a nice day!");
    }
    public static int largest( int n1, int n2, int n3)
    {
        int temp = Math.max(n2,n3);
        int large = Math.max(n1,temp);
        return large;
    }
    public static int sum( int n1, int n2, int n3)
    {
        int ans = n1+n2+n3;
        return ans;   
    }
    public static int range( int n1, int n2, int n3)
    {
        int temp = Math.max(n2,n3);
        int max = Math.max(n1,temp);
        int temp2 = Math.max(n2,n3);
        int min = Math.min(n1,temp2);
        return max-min;
    }
    public static double average( int n1, int n2, int n3)
    {
        double avg = n1+n2+n3;
        avg = avg/3;
        return avg;
    }
    public static void print( int n1, int n2, int n3)
    {
        int arr[] = new int[]{n1,n2,n3};
        Arrays.sort(arr);
        for(int i = 0; i < 3; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}