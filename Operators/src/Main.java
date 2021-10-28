public class Main {

    public static void main(String[] args) {

        System.out.println("--Arithmetic Operators--");
        int result = 1 + 2; // 1+2=3
        System.out.println("1+2=" + result);
        int previousResult = result; //assignment
        System.out.println("previousResult:" + previousResult);
        result = result - 1; // 3-1 =2
        System.out.println("3-1=" + result);

        result = result * 10;// 2*10=20
        System.out.println("2*10=" + result);

        result = result / 5; // 20//5 =4
        System.out.println("20/5=" + result);

        result = result % 3; //remainder of 4%3=1
        System.out.println("4%3=" + result);

        System.out.println("--Abbreviating Operators--");
        // result=result+1 we can abbreviate this statement by typing result++.
        result++; // 1+1=2
        System.out.println("1+1=" + result);
        result--;// 2-1=1
        System.out.println("2-1=" + result);
        // result=result+2 we can abbreviate this statement by typing result+=2.
        result += 2;// 1+2=3
        System.out.println("1+2=" + result);
        //result=result*10 we can abbreviate this statement by typing result*=10.
        result *= 10; //3*10=30
        System.out.println("3*10=" + result);
        result /= 3;// 30/3=10
        System.out.println("30/3=" + result);
        result -= 2; // 10-2=8
        System.out.println("10-2=" + result);

        System.out.println("--Control Flow Part 1 : Conditional Blocks--");
        boolean isLoggedIntoSystem = true; // In real-life right part of the assign operator comes from data source(cache,local storage etc...)
        if (isLoggedIntoSystem == true) {
            System.out.println("MyCourses Button");
        } else {
            System.out.println("Login Button");
        }

        System.out.println("--if-then statement problem/case--");
        boolean isAlien = false;
        if (isAlien == true) // equals operator usage and if-then statement problem/case
            System.out.println("It is not an alien !");
        System.out.println("I'm scared of aliens");
        /*
        Remark: if(isAlien==true) can be simplify as -> if(isAlien)
         */

        System.out.println("--Comparison,Equality,Logical OR and Logical AND Operators--");
        int topScore = 80;
        if (topScore <= 100) {
            System.out.println("You got the highest score !");
        }
        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("topScore is Greater than secondTopScore and less than 100");
        }
        if ((topScore > 90) || (topScore >= secondTopScore)) {
            System.out.println("Either or both the conditions are true");
        }

    }
}
