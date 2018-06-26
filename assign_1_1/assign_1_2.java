package assign_1_1;
import java.util.Scanner;

public class assign_1_2 {

    int mat, sci, phy;
    String name;
    int roll, total, avg;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i, index = 0, index1 = 0, index2 = 0, index3 = 0, pass=0, fail=0 ;
        System.out.println("Enter number of students : ");
        n = sc.nextInt();
        assign_1_2 p[] = new assign_1_2[n];
        System.out.println("Enter data of student : ");

        for (i = 0; i < n; i++) {
            p[i] = new assign_1_2();
        }
        for (i = 0; i < n; i++) {
            System.out.println("\n: Name, Roll_no, Marks in Maths;Science;Physics ::");
            p[i].name = sc.next();
            p[i].roll = sc.nextInt();
            p[i].mat = sc.nextInt();
            p[i].sci = sc.nextInt();
            p[i].phy = sc.nextInt();

            p[i].total = p[i].mat + p[i].sci + p[i].phy;
            System.out.println(" Total -->  " + p[i].total);
            p[i].avg = p[i].total / 3;
            System.out.println(" Average -->  " + p[i].avg);
        }
        System.out.println("\n");

        int max = p[0].mat;
        int max1 = p[0].sci;
        int max2 = p[0].phy;

        for (i = 1; i < n; i++) {
            if (p[i].mat > max) {
                max = p[i].mat;
                index = i;
            }
            if (p[i].sci > max1) {
                max1 = p[i].sci;
                index1 = i;
            }
            if (p[i].phy > max2) {
                max2 = p[i].phy;
                index2 = i;
            }
        }
        System.out.println("Highest in Maths -> " + max + " by : Roll_no " + p[index].roll);
        System.out.println("Highest in Science -> " + max1 + " by :  Roll_no " + p[index1].roll);
        System.out.println("Highest in physics -> " + max2 + " by : Roll_no " + p[index2].roll);
        System.out.println("\n");

        int max3 = p[0].total;
        for (i = 1; i < n; i++) {
            if (p[i].total > max3) {
                max3 = p[i].total;
                index3 = i;
            }
        }
        System.out.println("Highest total " + max3 + " by :Roll_no " + p[index3].roll);
        System.out.println("Details ");
        System.out.println(p[index3].name + " Got " + p[index3].total + "  Total marks in exams .");
        System.out.println("in Maths " + p[index3].mat);
        System.out.println("in Science " + p[index3].sci);
        System.out.println("in Physics " + p[index3].phy);
     
        for (i = 0; i < n; i++) {         
            if (p[i].avg < 12 )
                fail++; 
            else
                pass++;
            }
        System.out.println("\n");
        System.out.println("No. of pass Students -> " + pass);
        System.out.println("No. of Fail Students -> " + fail);
        }
    }