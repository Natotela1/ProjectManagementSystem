import java.util.Objects;
import java.util.Scanner;// Importing the class Scanner from the java.util package
import java.text.ParseException; // Importing the class ParseException from the java.util package
import java.text.SimpleDateFormat; // Importing the class SimpleDateFormat from the java.util package
import java.util.Date; //// Importing the class Date from the java.util package
public class ProjectOverview // class declaration
{
   public static void main(String [] args) throws ParseException
   {
       // this are details for the architecture
       System.out.println("These column inputs the details of the architecture ");
       System.out.println("Enter the name of the architecture:");
       Scanner arch_name = new Scanner(System.in);
       String name = arch_name.nextLine();
       System.out.println("Enter the telephone numbers of the architecture: ");
       Scanner arch_number = new Scanner(System.in);
       int telephone_numbers = arch_number.nextInt();

       System.out.println("Enter the physical address of the architecture");
       Scanner new_address = new Scanner(System.in);
       String physical_address = new_address.nextLine();

       System.out.println("Enter the email address of the architecture");
       Scanner new_email = new Scanner(System.in);
       String email_address = new_email.nextLine();
       // create a double line between inputs and results
       System.out.println("\n\n");
       Architect ArchObject = new Architect(name, telephone_numbers, physical_address, email_address);
       System.out.println("Details of the architecture: ");
       System.out.println(ArchObject.displayArchitect());

       // Edit and update contractors details if incorrect
       System.out.println("Would you like to edit any Architect details or update? [1 for Yes or 2 for no]");
       Scanner edit_detail = new Scanner(System.in);
       int architect_detail = edit_detail.nextInt();
       if (architect_detail == 1){
           System.out.println("Edit architect name");
           Scanner arch_name_edit = new Scanner(System.in);
           name = arch_name_edit.nextLine();

           System.out.println("Edit telephone numbers of the architecture: ");
           Scanner edit_number = new Scanner(System.in);
           telephone_numbers = edit_number.nextInt();

           System.out.println("Edit the physical address");
           Scanner edit_address = new Scanner(System.in);
           physical_address = edit_address.nextLine();

           System.out.println("Enter the email address of the architecture");
           Scanner edit_email = new Scanner(System.in);
           email_address = edit_email.nextLine();

           Architect ArchObject1 = new Architect(name, telephone_numbers, physical_address, email_address);
           System.out.println(ArchObject1.displayArchitect());
       }else if (architect_detail == 2){
           System.out.println(ArchObject.displayArchitect());

       }

       // create lines between architecture and customer details
       System.out.println("\n\n");

       // details of the customer
       System.out.println("These column inputs the details of the customer");
       System.out.println("Enter the name of the customer:");
       Scanner customer = new Scanner(System.in);
       String customer_name = customer.nextLine();

       System.out.println("Enter the telephone numbers of the customer: ");
       Scanner tel_num = new Scanner(System.in);
       int customer_tel = tel_num.nextInt();

       System.out.println("Enter the physical address of the customer");
       Scanner customer_address = new Scanner(System.in);
       String address = customer_address.nextLine();

       System.out.println("Enter the email address of the customer");
       Scanner customer_email = new Scanner(System.in);
       String email_for_customer = customer_email.nextLine();

       System.out.println("\n\n");      // create a double line between inputs and results

       Customer CustObj = new Customer(customer_name, customer_tel, address, email_for_customer);
       System.out.println("Details of the customer: ");
       System.out.println(CustObj.desplayCustomer());

       // Edit and updating if customer details are incorrect
       System.out.println("Would you like to edit Customer details or update them? [1 for yes or 2 for no]");
       int customer_detail = edit_detail.nextInt();
       if (customer_detail == 1){
           System.out.println("Edit customer name:");
           Scanner customer_name_edit = new Scanner(System.in);
           customer_name = customer_name_edit.nextLine();

           System.out.println("Edit telephone numbers : ");
           Scanner tel_num_edit = new Scanner(System.in);
           customer_tel = tel_num_edit.nextInt();

           System.out.println("Edit physical address ");
           Scanner customer_address_edit = new Scanner(System.in);
           address = customer_address_edit.nextLine();

           System.out.println("Edit the email address ");
           Scanner customer_email_edit = new Scanner(System.in);
           email_for_customer = customer_email_edit.nextLine();

           Customer CustObj1 = new Customer(customer_name, customer_tel, address, email_for_customer);
           System.out.println(CustObj1.desplayCustomer());
       }else if (customer_detail == 2){
           System.out.println(CustObj.desplayCustomer());
       }

       // create lines between project and customer details
       System.out.println("\n\n");
      
       // details of the project
       //Enter project number using Scanner function
       System.out.println("These column inputs the details of the project");
       System.out.println("Enter project number: ");
       Scanner proj_num = new Scanner(System.in);
       int project_number = proj_num.nextInt();
      
       // Enter ERF number
       System.out.println("Enter ERF number: ");
       Scanner ERF_num = new Scanner(System.in);
       String ERF_number = ERF_num.nextLine();
      
       // customer name
       String project_customer_name = customer_name;
       System.out.println("Customer name: " + project_customer_name);

      
       // Enter customer surname
       System.out.println("Enter customer surname: ");
       Scanner proj_cust_surname = new Scanner(System.in);
       String project_customer_surname = proj_cust_surname.nextLine();
       String project_customer = project_customer_surname + " " + project_customer_name;
      
       // Enter project name
       System.out.println("Enter project name: ");
       Scanner proj_name = new Scanner(System.in);
       String project_name = proj_name.nextLine();
      
      
       // Enter project type using Scanner
       System.out.println("Enter project type: ");
       Scanner proj_type = new Scanner(System.in);
       String project_type = proj_type.nextLine();
      
       if(Objects.equals(project_name, "")) {
           project_name = project_type + project_customer_surname;
       }
      
       // entering dates using scanner function
       // use simpleDateFormat to store dates in date format
       // use date1.after(date2) to compare two dates inputs
       System.out.println("Enter current date (yyyy-MM-dd):");
       Scanner current_date = new Scanner(System.in);
       String date1 = current_date.nextLine();
       System.out.println("Enter deadline for the project (yyyy-MM-dd): ");
       Scanner deadline = new Scanner(System.in);
       String date2 = deadline.nextLine();

       // Edit deadline for project
       System.out.println("The due date for project is " + date2 + "\n " +
               "Is this correct? [1 for Yes or 2 for No]");
       Scanner deadline_check = new Scanner(System.in);
       int check_deadline = deadline_check.nextInt();
       if (check_deadline == 2) {
           System.out.println("Edit the due date of project");
           Scanner edit_deadline = new Scanner(System.in);
           date2 = edit_deadline.nextLine();
       }

       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
       Date first_date = sdf.parse(date1);
       Date second_date = sdf.parse(date2);

       System.out.println("\n\n");      // create a double line between inputs and results
       Project projObj = new Project(project_number, ERF_number, project_customer, project_name, project_type, date2);
       System.out.println("Details of the project: ");
       System.out.println(projObj);
       if (first_date.after(second_date))
       {
System.out.println("Project is overdue");
}
       // create lines between project and invoice details
       System.out.println("\n\n");

       // Invoice details
       System.out.println("These column inputs the details of the invoice");
       String invoice_customer = customer_name;
       System.out.println("Customer :" + invoice_customer);

       int invoice_telephone_numbers = customer_tel;
       System.out.println("Telephone numbers of the customer: " + invoice_telephone_numbers);


       System.out.println("Enter the total fee to be paid:");
       Scanner total_fee_cust = new Scanner(System.in);
       double total_fee = total_fee_cust.nextDouble();
       // Check if priced fee is correct if not edit an update
       System.out.print("The total fee is R"+ total_fee + "\n Is this Correct ?[1 for yes or 2 for No]");
       Scanner total_fee_check = new Scanner(System.in);
       int fee_check = total_fee_check.nextInt();
       if (fee_check == 2) {
           System.out.println("Change total fee to be paid");
           Scanner edit_fee_paid = new Scanner(System.in);
           total_fee = edit_fee_paid.nextDouble();
           System.out.print("The total fee to be paid is R"+ total_fee);
       }
      
       System.out.println("\nEnter the total fee paid:");
       Scanner total_paid_cust = new Scanner(System.in);
       double total_paid = total_paid_cust.nextDouble();
       // Checking if the fees are correct if not edit or update
       System.out.print("\nThe total paid fee is R"+ total_paid + "\n Is this Correct ?[1 for yes or 2 for No]");
       Scanner total_paid_check = new Scanner(System.in);
       int paid_check = total_paid_check.nextInt();
       if (paid_check == 2) {
           System.out.println("Change total fee to be paid");
           Scanner edit_total_paid = new Scanner(System.in);
           total_paid = edit_total_paid.nextDouble();
           System.out.print("The total fee paid is R"+ total_paid);
       }

       double balance = total_fee - total_paid;
       if (balance == 0)
       {
           System.out.println("Your balance is 0 so there is no invoice ");
       }
       System.out.println();        // create a double line between inputs and results

       System.out.println("INVOICE ");
       Invoice objInv = new Invoice(invoice_customer, invoice_telephone_numbers, total_fee, total_paid, balance);
       System.out.println(objInv);
          
      
   }
}