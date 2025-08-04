package DataTypes;

public class Studentapplication {
    public static void main(String[] args) {
        
        //1.name of the candidate 
       String Candidatename ="MADASU JAGADEESH";

        // 2.father's name
        String Fathername =" madasu gangadri";
        //3.mother's name
        String mothername =" madasu gangadevi";
        //4.date of birth
        String dateofbirth="11/06/2002";
        //5.category
        String category="GEN"; //GEN// sc//st//bc//oc//other

        //6.occupation & annual income
        String fatheroccupation  ="auto driver";
        double annualincome = 100000.00;

        //7.address
        String address = "2-46,enumulavari palli(v),";
        String post = "enumulavari palli";
        String district = "sri sathya sai";
        String state = "andhra pradesh";
        String pincode = "515511";

        //adhar number
        String adharno = "4960 6420 5559";

        //8.mobile number & email id
        String mobilenumber ="9100929243";
        String emailid = "madasujagadeesh143@gmail.com";

        //9. acadamic details (X) & (XII)
        String tenthboard = "SSC";
        String tenthpassyear = "2017";
        double tenthpercentage = 8.7;
        String twelvethboard = "BIEAP";
        String twelvethpassyear = "2019";
        double twelvethpercentage = 7.35;

        //10. graduation details
        String graduationcollege = "international blue moon degree collage";
        String graduationbranch = "BZC(bsc)";
        String graduationpassyear = "2023";
        double graduationpercentage = 7.5;

        // out put of some data
        System.out.println("Candidate Name: " + Candidatename);
        System.out.println("Father's Name: " + Fathername);
        System.out.println("Mother's Name: " + mothername);
        System.out.println("Date of Birth: " + dateofbirth);
        System.out.println("Category: " + category);
        System.out.println("Father's Occupation: " + fatheroccupation);
        System.out.println("Annual Income: " + annualincome);
        System.out.println("Address: " + address + post + district + state + pincode);
        System.out.println("Adhar Number: " + adharno);
        System.out.println("Mobile Number: " + mobilenumber);
        System.out.println("Email ID: " + emailid);

        System.out.println("Tenth Board: " + tenthboard);
        System.out.println("Tenth Pass Year: " + tenthpassyear);
        System.out.println("Tenth Percentage: " + tenthpercentage);
        System.out.println("Twelfth Board: " + twelvethboard);
        System.out.println("Twelfth Pass Year: " + twelvethpassyear);
        System.out.println("Twelfth Percentage: " + twelvethpercentage);
        System.out.println("Graduation College: " + graduationcollege);
        System.out.println("Graduation Branch: " + graduationbranch);
        System.out.println("Graduation Pass Year: " + graduationpassyear);
        System.out.println("Graduation Percentage: " + graduationpercentage);
    }
}