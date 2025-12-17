import java.util.Scanner;

public class resumebuilder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter Your Name:-");
        String Name = sc.nextLine();
        System.out.println("Please give ur email id:- ");
        String Contact=sc.nextLine();
        System.out.println("Please enter 10 Technologies:-");
        String Technology1=sc.nextLine();
        String Technology2=sc.nextLine();
        String Technology3=sc.nextLine();
        String Technology4=sc.nextLine();
        String Technology5=sc.nextLine();
        String Technology6=sc.nextLine();
        String Technology7=sc.nextLine();
        String Technology8=sc.nextLine();
        String Technology9=sc.nextLine();
        String Technology10=sc.nextLine();
        System.out.println("Please Enter Project Name :- ");
        String ProjectName=sc.nextLine();
        System.out.println("Please Enter about ur Project:- ");
        String Description1=sc.nextLine();
        System.out.println("Enter the Technologies u used in the project ");
        String Description2=sc.nextLine();
        System.out.println("Give 5 certifications");
        String cert1=sc.nextLine();
        String cert2=sc.nextLine();
        String cert3=sc.nextLine();
        String cert4=sc.nextLine();
        String cert5=sc.nextLine();

        System.out.println("Name:-"+Name);
        System.out.println("Contact:-"+Contact);

        // Normal listing
        System.out.println("Technologies:-");
        System.out.println(Technology1);
        System.out.println(Technology2);
        System.out.println(Technology3);
        System.out.println(Technology4);
        System.out.println(Technology5);
        System.out.println(Technology6);
        System.out.println(Technology7);
        System.out.println(Technology8);
        System.out.println(Technology9);
        System.out.println(Technology10);

        // 🔹 Added string pattern printing
        String[] techs = {Technology1,Technology2,Technology3,Technology4,Technology5,
                          Technology6,Technology7,Technology8,Technology9,Technology10};
        System.out.println("\nTechnologies Pattern:");
        for(int i=0;i<techs.length;i++){
            for(int j=0;j<=i;j++){
                System.out.print(techs[j] + " ");
            }
            System.out.println();
        }

        System.out.println("Projects:-");
        System.out.println("*"+ProjectName);
        System.out.println("*"+Description1);
        System.out.println("*"+Description2);

        System.out.println("Certifications");
        System.out.println(cert1);
        System.out.println(cert2);
        System.out.println(cert3);
        System.out.println(cert4);
        System.out.println(cert5);
    }
}