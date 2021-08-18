public class Invoice // class declaration
{
   /**
	 * @return the customer_name
	 */
	public String getCustomer_name() {
		return customer_name;
	}
	/**
	 * @param customer_name the customer_name to set
	 */
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	/**
	 * @return the customer_surname
	 */
	public String getCustomer_surname() {
		return customer_surname;
	}
	/**
	 * @param customer_surname the customer_surname to set
	 */
	public void setCustomer_surname(String customer_surname) {
		this.customer_surname = customer_surname;
	}
	/**
	 * @return the total_fee
	 */
	public double getTotal_fee() {
		return total_fee;
	}
	/**
	 * @param total_fee the total_fee to set
	 */
	public void setTotal_fee(double total_fee) {
		this.total_fee = total_fee;
	}
	/**
	 * @return the contact_details
	 */
	public int getContact_details() {
		return contact_details;
	}
	/**
	 * @param contact_details the contact_details to set
	 */
	public void setContact_details(int contact_details) {
		this.contact_details = contact_details;
	}
	/**
	 * @return the total_paid
	 */
	public double getTotal_paid() {
		return total_paid;
	}
	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
// attributes
   String customer_name;
   String customer_surname;
   String customer;
   double total_fee;
   double total_paid;
   double balance;
   int contact_details;
   public Invoice(String customer, int contact_details, double total_fee, double total_paid, double balance)
   {
       /*The public method has 6 arguments
       Below the constructor invokes the arguments initialized in the beginning of method */
       this.customer = customer;
       this.total_fee = total_fee;
       this.total_paid = total_paid;
       this.balance = balance;
       this.contact_details = contact_details;
   }
   //public method that will return the argument customer in a string form
   public String getCustomer()
   {
       return customer;
   }
   //public method that will return the argument contact details in a string form
   public int getContactdetails()
   {
       return contact_details;
   }
   //public method that will return the argument total fee in a double form
   public double getTotalFee()
   {
       return total_fee;
   }

   //public method that will return the argument total paid in a double form
   public double getTotalPaid()
   {
       return total_paid;
   }

    public void setTotal_paid(double total_paid) {
        this.total_paid = total_paid;
    }

    //public method that will return the argument balance in a double form
   public double getBalance()
   {
       return balance;
   }
   // public method toString that will return all the arguments in other methods
   public String toString()
   {
       String output = "Customer name: " + customer + "\n";
       output += "Contact details: " + contact_details + "\n";
       output += "Opening balance:" + total_fee + "\n";
       output += "Paid amount: " + total_paid + "\n";
       output += "closing balance: " + balance;
       return output;
   }

}