/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author Rohith Preetham Sunkara
 */
public class Assignment1 {

    public static void main(String[] args) {
        // TODO code application logic here
        int marks = 0, tests = 0, low = 1, high = 8, medium = 4;
        //Above are test variable you do not need to declare those variables

        /**
         * *****************
         */
        /*    I will manually add marks to display your name and student no.*/
        System.out.println("~TEST 1~");
        System.out.println("Display your name and Student No. here:\n Rohith Preetham Sunkara\n 200449343");

        /**
         * ******************
         */
        System.out.println("TEST 2: Must use toString method to display the values of all the varibales in exact format given in expected result-" + high + " marks");
        System.out.println("\nExpected result: First Name:Jane Last Name:Green Balance: 50.0");

        Account acc1 = new Account("Jane", "Green", 50.0);


        if (acc1.toString().equals("First Name:Jane Last Name:Green Balance:50.0")) {
            marks += high;
            tests++;
            System.out.println("TEST 2 PASSED!!\n");
        System.out.println("Actual result:" + acc1.toString());

        } else {
            System.out.println("TEST 2 FAILED\n");
        }

        /**
         * ****************
         */
        System.out.println("Test 3: Testing getter methods-" + medium + " marks\n");
        if (acc1.getFirstName().equals("Jane") && acc1.getLastName().equals("Green") && acc1.getBalance() == 50.0) {
            marks += medium;
            tests++;
            System.out.println("TEST 3 PASSED!!\n");

        } else {
            System.out.println("TEST 3 FAILED\n");
        }

        /**
         * ******Positive testing************
         */
        System.out.println("Test 4: Positive testing setter methods-" + high + " marks");

        System.out.println("Setting first name to Anita");
        acc1.setFirstName("Anita");

        System.out.println("Setting last name to Knapp");
        acc1.setLastName("Knapp");

        System.out.println("Depositing amount $3500\n");
        acc1.deposit(3500.0);

        System.out.println("Checking outcome");
        System.out.println(acc1.toString());

        System.out.println("Trying to withdraw $200");
        acc1.withdraw(200);

        System.out.println("Checking balance: $3550-200");
        System.out.println(acc1.getBalance());
        if (acc1.getFirstName().equals("Anita") && acc1.getLastName().equals("Knapp") && acc1.getBalance() == 3350.0) {

            marks += high;
            tests++;

            System.out.println("TEST 4 PASSED!!\n");

        } else {

            System.out.println("TEST 4 FAILED\n");

        }

     
        System.out.println("***Negative testing all of the setter methods.****\n");

        // This try-catch is for first name: 
        try {

            System.out.println("Test 5a: Trying to set first name as a number: \"1235\" -" + medium + " marks");
            acc1.setFirstName("1235");

            System.out.println("First Name: " + acc1.getFirstName());
            System.out.println("TEST 5a FAILED\n");

        } catch (Exception ex) {

            if (ex.getMessage().equalsIgnoreCase("Invalid character in the first name")
                    && ex.getClass().getSimpleName().equalsIgnoreCase("IllegalArgumentException")) {

                marks += medium;
                tests++;
                System.out.println("Exception Thrown:  " + ex.getClass().getSimpleName() + "\nMessege:" + ex.getMessage());
                System.out.println("TEST 5a PASSED \n");

            } else {

                System.out.println("TEST 5b FAILED\n");

            }
        }

        // This try-catch is for last name: 
        try {

            System.out.println("Test 5a: Trying to set last name as a number: \"1235\" -" + medium + " marks");
            acc1.setLastName("1235");
            System.out.println("Last Name: " + acc1.getLastName());
            System.out.println("TEST 5b FAILED\n");

        } catch (Exception ex) {

            if (ex.getMessage().equalsIgnoreCase("Invalid character in the last name")
                    && ex.getClass().getSimpleName().equalsIgnoreCase("IllegalArgumentException")) {
                marks += medium;
                tests++;
                System.out.println("Exception Thrown:  " + ex.getClass().getSimpleName() + "\nMessege:" + ex.getMessage());
                System.out.println("TEST 5b PASSED \n");

            } else {

                System.out.println("TEST 5b FAILED\n");

            }
        }
        //TEST #6
        // This try-catch is for depositing negative: 
        try {

            System.out.println("Test 6: Trying to deposit a negative number (-20) -" + medium + " marks");
            acc1.deposit(-20);

            System.out.println("Balance after deposit 3550+(-20):" + acc1.getBalance());
            System.out.println("Expected and exception to be thrown");
            System.out.println("TEST 6 FAILED\n");

        } catch (Exception ex) {
            if (ex.getMessage().equalsIgnoreCase("Cannot deposit a negative number")
                    && ex.getClass().getSimpleName().equalsIgnoreCase("IllegalArgumentException")) {
                marks += medium;
                tests++;
                System.out.println("Exception Thrown:  " + ex.getClass().getSimpleName() + "\nMessege:" + ex.getMessage());
                System.out.println("TEST 6 PASSED!!!\n");

            } else {

                System.out.println("TEST 6 FAILED\n");

            }

        }
        //TEST #7
        try {
            System.out.println("Test 7: Trying to withdraw more than account balance($" + acc1.getBalance() + ")-" + medium + " marks");
            System.out.println("Withdrawing $5000");
            acc1.withdraw(5000);

            System.out.println("Balance after deposit 3550-(5000):" + acc1.getBalance());
            System.out.println("Expected and exception to be thrown");
            System.out.println("TEST 7 FAILED\n");

        } catch (Exception ex) {
            if (ex.getMessage().equalsIgnoreCase("Not Sufficient Funds to withdraw")
                    && ex.getClass().getSimpleName().equalsIgnoreCase("IllegalArgumentException")) {
                marks += medium;
                tests++;
                System.out.println("Exception Thrown:  " + ex.getClass().getSimpleName() + "\nMessege:" + ex.getMessage());
                System.out.println("TEST 7 PASSED!!!\n");

            } else {

                System.out.println("TEST 7 FAILED\n");

            }
        }
        //TEST #8
        try {
            System.out.println("Test 8: Trying to withdraw NEGATIVE amount-" + medium + " marks");
            System.out.println("Withdrawing -5000");
            acc1.withdraw(-5000);

            System.out.println("Balance after deposit 3550-(-5000):" + acc1.getBalance());
            System.out.println("Expected and exception to be thrown");
            System.out.println("TEST 8 FAILED\n");

        } catch (Exception ex) {
            if (ex.getMessage().equalsIgnoreCase("Cannot withdraw a negative amount")
                    && ex.getClass().getSimpleName().equalsIgnoreCase("IllegalArgumentException")) {
                marks += medium;
                tests++;
                System.out.println("Exception Thrown:  " + ex.getClass().getSimpleName() + "\nMessege:" + ex.getMessage());
                System.out.println("TEST 8 PASSED!!!\n");

            } else {

                System.out.println("TEST 8 FAILED\n");

            }
        }

        /**
         * ****************
         */
        System.out.println("Total tests passed:" + tests + "\n"
                + "total marks scored:" + marks);
    }

}