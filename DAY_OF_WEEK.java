import java.util.*;
class DAY_OF_WEEK {
    public static void main(String args[])
    {Scanner sc=new Scanner(System.in);
        int button =sc.nextInt();
        switch(button){
            case 1:
               System.out.println("Monday");
               break;
            case 2:
             System.out.println("Tuesday");
             break;
             case 3:
             System.out.println("Wednesday");
                        break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
            default:
            System.out.println("End of program");


             sc.close();
        }

    }

}
