import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class AddressBook {

    private static List<Data> contact = new ArrayList<Data>();
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);
        int menu;
        String choice;

        System.out.println(" 0. Exit. ");
        System.out.println(" 1. Add contact. ");
        System.out.println(" 2. Edit contact. ");
        System.out.println(" 3. Sort contact. ");
        System.out.println(" 4. Outprint all contacts. ");
        System.out.println(" 5. Delete contact. ");
        System.out.println(" 6. search contact. ");
        menu = sc.nextInt();

        while (menu != 0) {

            switch (menu) {

                case 1:
                while (menu != 2) {
                    System.out.println("Enter First Name: ");
                    String firstName = sc.next();
                    System.out.println("Enter Last Name: ");
                    String lastName = sc.next();
                    System.out.println("Adress: ");
                    String adress = sc.next();
                    System.out.println("Enter City: ");
                    String city = sc.next();
                    System.out.println("Enter State: ");
                    String state = sc.next();
                    System.out.println("Enter zip: ");
                    String zip = sc.next();
                    System.out.println("Enter Phone Number: ");
                    String mob = sc.next();
                    contact.add(new Data(firstName, lastName, adress,city,state,zip));// Creating a new object and adding it to list
                    System.out.println("Would you like to add someone else? 1: Yes, 2: No");
                    menu = sc.nextInt();
                }
                break;

                case 2:

                System.out.println("Enter Number of contact to edit: ");
                int index = sc.nextInt();
                System.out.println("Enter First Name: ");
                String firstName = sc.next();
                System.out.println("Enter Last Name: ");
                String lastName = sc.next();
                System.out.println("Adress: ");
                String adress = sc.next();
                System.out.println("Enter City: ");
                String city = sc.next();
                System.out.println("Enter State: ");
                String state = sc.next();
                System.out.println("Enter zip: ");
                String zip = sc.next();
                System.out.println("Enter Phone Number: ");
                String mob = sc.next();
                Data person = new Data(firstName, lastName, adress,city,state,zip);
                contact.set(index,person);

                break;

                case 3:

                System.out.println("=================================================================");
                Collections.sort(contact,(player1, player2) ->player1.getLastName().compareTo(player2.getLastName()));
                
                for (int i = 0; i < contact.size(); i++) {
                    System.out.println(contact.get(i));
                    System.out.println();
                }
                System.out.println("=================================================================");

                break;

                case 4:

                System.out.println("\nThere are " + contact.size() + " people in this address book.\n");
                // Collections.sort(contact);
                System.out.println("------------------------------------------------------------------");
                int count = 0;
                for (int i = 0; i < contact.size(); i++) {
                    System.out.println( count++  +"  " +contact.get(i));
                    System.out.println();
                }
                System.out.println("=================================================================");
                break;

                case 5:
                System.out.println("Enter First Name of contact that you would like to delete: ");
                int number = sc.nextInt();
                contact.remove(number);
                break;

                case 6 :
                System.out.println("Enter First Name of contact that you would like to search: ");
                String sreach = sc.next();     
                addressBook.searchPerson(sreach);
                break;
            }

            System.out.println(" 0. Exit. ");
            System.out.println(" 1. Add contact. ");
            System.out.println(" 2. Edit contact. ");
            System.out.println(" 3. Sort contact. ");
            System.out.println(" 4. Outprint all contacts.");
            System.out.println(" 5. Delete contact. ");
            System.out.println(" 6. search contact. ");
            menu = sc.nextInt();
        }
        System.out.println("Goodbye!  Have a Nice Day");
    }

    private void addData(String firstName, String lastName, String adress,String city,String state,String zip) {
        Data person = new Data(firstName, lastName, adress,city,state,zip);
        contact.add(person);
    }

    public void searchPerson(String p) {
        // boolean isInList=false;
        for(Data per : contact){
            if(per.getFirstName().equals(p)){
                System.out.printf("Present contact");
                System.out.println();
                // isInList=true;
            }else{
                System.out.printf("Not present add ");
            }
        }

    }
}