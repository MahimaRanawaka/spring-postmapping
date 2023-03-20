import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;
public class Q30 {

    static int c, count;
    static int reverse = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("insert number");
        int Num = scan.nextInt();
//       reverse(Num);
//        fact(Num);
//        fibonacci(Num);
//        multiplication(Num,"for");
//        multiplication(Num,"while");
//         findfactors(Num);
//        VowelOrConsonant("for","appa");
//        VowelOrConsonant("switch","appa");
//        NumOfVowelOrConsonant("mahima");
//        split("part1");
//        split("part2");
//        removespace("part1");
//        removespace("part2");
//         Q13();
        Q15();


///////////////////sorting element in dictionary order Q10//////////////////////////////////
//        System.out.println("please enter your word lentgh");
//        int n = scan.nextInt();
//        String input[] = new String[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("enter your" + (i + 1) + "word");
//            input[i] = scan.nextLine();
//        }
//        sortelement("part1", input);
//        sortelement("part2",input);

//////////////////differece of two time from days//////////////////////
//        System.out.println("Enter the first time (hh:mm:ss): ");
//        String time1[]= scan.next().split(":");
//        int hours1=Integer.parseInt(time1[0]);
//        int minites1=Integer.parseInt(time1[1]);
//        int second1=Integer.parseInt(time1[2]);
//
//        System.out.println("Enter the second time (hh:mm:ss): ");
//        String time2[]= scan.next().split(":");
//        int hours2=Integer.parseInt(time1[0]);
//        int minites2=Integer.parseInt(time1[1]);
//        int second2=Integer.parseInt(time1[2]);
//        DifferenceOfTwoDays(hours1,hours2,minites1,minites2,second1, second2);

//
//        /* from in build */
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
//        System.out.print("Enter the first time (hh:mm:ss): ");
//        LocalTime time1 = LocalTime.parse(scan.next(), formatter);
//
//        System.out.print("Enter the first time (hh:mm:ss): ");
//        LocalTime time2 = LocalTime.parse(scan.next(), formatter);
//        Duration duration = Duration.between(time1, time2);
//
//        Differenceinbuild( duration);

   /////////////////////////////////difference of two date/////////////////////////////////////////////

//        System.out.println("Enter the first time (DD/MM/YYYY): ");
//        String date1[]= scan.next().split("/");
//        int day1=Integer.parseInt(date1[0]);
//        int month1=Integer.parseInt(date1[1]);
//        int year1=Integer.parseInt(date1[2]);
//
//        System.out.println("Enter the first time (DD/MM/YYYY): ");
//        String date2[]= scan.next().split("/");
//        int day2=Integer.parseInt(date2[0]);
//        int month2=Integer.parseInt(date2[1]);
//        int year2=Integer.parseInt(date2[2]);
//
//        datedifference(day1,day2,year1,year2,month1,month2);


//        /* //////inbuilt//////////// */
//        System.out.print("Enter the first date (DD/MM/YYYY): ");
//        String dateString1 = scan.next();
//
//        System.out.print("Enter the second date (DD/MM/YYYY): ");
//        String dateString2 = scan.next();
//        dateinbuilt(dateString1,dateString2);


//// /////////////////////////////Q14////////////////////////////////////////////////////
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the  a: ");
//        double a = input.nextDouble();
//        System.out.print("Enter the b: ");
//        double b = input.nextDouble();
//        System.out.print("Enter the c: ");
//        double c = input.nextDouble();
//
//        Q14(a,b,c);

    }

    static void reverse(int number) {

        while (number != 0) {
            reverse = reverse * 10;
            reverse = number % 10 + reverse;
            number = number / 10;
            c = reverse;
        }
        System.out.println("reverse of input is " + c);
    }

    static void fact(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            if (number == 1) {
                c = 1;
            } else {
                fact = fact * i;
                System.out.println(i + " th " + fact);
                c = fact;
            }
        }
        System.out.println("fact is " + c);
    }

    static void fibonacci(int number) {
        int num = number;
        int first_number = 0;
        int second_number = 1;
        System.out.println(first_number);
        int i = 1;
        do {
            System.out.println(second_number);
            int next_number = first_number + second_number;
            first_number = second_number;
            second_number = next_number;

            i++;

        }
        while (i < num);
    }
    /////////////////////////////////////////////////////////////////////////////////

    static void multiplication(int number, String loop) {
        if (loop.equals("for")) {
            for (int i = 0; i <= 10; i++) {
                int multifaction = i * number;
                System.out.println(i + "*" + number + " = " + multifaction);
            }
        } else {
            int i = 1;
            while (i <= 10) {
                int multifaction = i * number;
                System.out.println(i + "*" + number + " = " + multifaction);
                i++;
            }
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////
    static void findfactors(int number) {
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            } else continue;
        }
    }

    ////////////////////////////////////////////////////////////////
    static void VowelOrConsonant(String loop, String word) {
        if (loop.equals("for")) {
            for (int i = 0; i < word.length(); i++) {
                char b = word.charAt(i);
                if (b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u') {

                    System.out.println("word " + i + " th character " + b + " is vowel");
                } else {
                    System.out.println("word " + i + " th character " + b + " is conssonant");
                }
            }
        } else if (loop.equals("switch")) {
            for (int i = 0; i < word.length(); i++) {
                char b = word.charAt(i);
                switch (b) {
                    case ('a'):
                        System.out.println("word " + i + " th character " + b + " is vowel");
                        break;
                    case ('e'):
                        System.out.println("word " + i + " th character " + b + " is vowel");
                        break;
                    case ('i'):
                        System.out.println("word " + i + " th character " + b + " is vowel");
                        break;
                    case ('o'):
                        System.out.println("word " + i + " th character " + b + " is vowel");
                        break;
                    case ('u'):
                        System.out.println("word " + i + " th character " + b + " is vowel");
                        break;
                    default:
                        System.out.println("word " + i + " th character " + b + " is conssonant");
                        break;

                }
            }
        }
    }

    //////////////////////////////////////////////////////////////////////////////////////////////

    static void NumOfVowelOrConsonant(String word) {
        int countV = 0, countC = 0;
        for (int i = 0; i < word.length(); i++) {
            char b = word.charAt(i);

            if (b == 'a' || b == 'e' || b == 'i' || b == 'o' || b == 'u') {
                countV += 1;
            } else {
                countC += 1;
            }
        }
        System.out.println("count of Consonant " + countC + " count of Vowel " + countV);
    }
///////////////////////////////////////////////////////////////////////////////////////////////////

    static void split(String part) {
        String word = "mahima,senthu,darmendra,sanjeewa";
        String wordarray[] = new String[4];
        int index = 0;
        int count = 0;
        if (part.equals("part1")) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == ',') {
                    wordarray[count++] = word.substring(index, i);
                    index = i + 1;
                }

            }
            wordarray[count] = word.substring(index);

            for (String words : wordarray) {
                System.out.println(words);
            }
        } else if (part.equals("part2")) {
            wordarray = word.split(",");
            for (String words : wordarray) {
                System.out.println(words);
            }
        }

    }

    ///////////////////////////////////////////////////////////////
    static void removespace(String part) {
        String word = "mahima ranawaka say hi";
        if (part == "part1") {
            int count = 0;
            char array[] = word.toCharArray();

            for (int i = 0; i < array.length; i++) {
                if (array[i] != ' ') {
                    array[count++] = array[i];
                }
            }
            String output = new String(array, 0, count);
            System.out.println(output);

        } else if (part == "part2") {
            String output = word.replaceAll("\\s", "");
            System.out.println(output);
        }
    }
    //////////////////////////////////////////////////////////////////

    static void sortelement(String part, String[] arr) {
        if (part.equals("part1")) {
            Arrays.sort(arr);
            for (String word : arr) {
                System.out.println(word);

            }
        }
       else if (part.equals("part2")) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i].compareTo(arr[j]) > 0) {
                        String temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            for (int i=0;i<arr.length;i++) {
                System.out.println(arr[i]);
            }
        }
    }
    static void DifferenceOfTwoDays(int hours1,int hours2,int minutes1,int minutes2,int seconds1,int seconds2){

        int totalSeconds1 = hours1 * 3600 + minutes1 * 60 + seconds1;
        int totalSeconds2 = hours2 * 3600 + minutes2 * 60 + seconds2;

        int difference = Math.abs(totalSeconds1 - totalSeconds2);

        int hours = difference / 3600;
        int minutes = (difference % 3600) / 60;
        int seconds = difference % 60;
        System.out.println("difference in "+ hours +"hours"+ minutes +" in minutes"+ seconds +"in seconds");
    }
    static void Differenceinbuild(Duration duration){
        long hours = duration.toHours();
        long minutes = duration.toMinutes() % 60;
        long seconds = duration.getSeconds() % 60;
        System.out.printf("The difference is %02d:%02d:%02d", hours, minutes, seconds);
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    static void datedifference(int day1,int day2,int year1,int year2,int month1,int month2){
        int days1 = day1 + 365 * year1 + year1 / 4 - year1 / 100 + year1 / 400 + (153 * month1 + 8) / 5;
        int days2 = day2 + 365 * year2 + year2 / 4 - year2 / 100 + year2 / 400 + (153 * month2 + 8) / 5;
        int difference = Math.abs(days1 - days2);

        System.out.printf("The difference between two days."+ difference);
    }

    static void dateinbuilt(String dateString1,String dateString2){
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = null;
        Date date2 = null;
        try {
            date1 = format.parse(dateString1);
            date2 = format.parse(dateString2);
        } catch (ParseException e) {
            System.out.println("Invalid date format!");
            System.exit(0);
        }
        long difference = Math.abs(date1.getTime() - date2.getTime()) / (1000 * 60 * 60 * 24);
        System.out.printf("The difference between the two dates is %d days.", difference);
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////
    static  void Q13(){
        double arr[] ={1,2,3,4,5,6,7,8,9,10};
        double sum =0;
        for (int i=0;i< arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("sum is"+sum);
        double average =(sum/ arr.length);
        System.out.println("average is "+ average);

        double squaredDifferencesSum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            squaredDifferencesSum += Math.pow(arr[i] - average, 2);
        }
        double standardDeviation = Math.sqrt(squaredDifferencesSum / arr.length);
        System.out.println("Standard deviation: " + standardDeviation);
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////
    static void Q14(double a,double b,double c){
        double determinant = b * b - 4 * a * c;

        if (determinant > 0) {
            double root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            double root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.println("it has defferent two roots");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (determinant == 0) {
            double root = -b / (2 * a);
            System.out.println("Root: " + root);
        } else {

            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-determinant) / (2 * a);
            System.out.println("Root 1: " + realPart + "+" + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + "-" + imaginaryPart + "i");
        }
    }
    ////////////////////////////Q15//////////////////////////////////////////////////////////////
     static void Q15() {
            double p, r, v;
            int n;
         System.out.printf("%-10s %-10s %-10s %-10s\n", "P", "R", "N", "V");
            for (p = 1000; p <= 100000; p += 1000) {
                for (r = 0.10; r <= 0.20; r += 0.01) {
                    for (n = 1; n <= 10; n++) {
                        v = p * Math.pow(1 + r, n);
                        System.out.printf("%-10.2f %-10.2f %-10d %-10.2f\n", p, r, n, v);
                        p = v;
                    }
                }
            }
        }



}




