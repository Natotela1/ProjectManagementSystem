public class Customer // class declaration
{
   /**
	 * @return the telephone_number
	 */
	public int getTelephone_number() {
		return telephone_number;
	}
	/**
	 * @param telephone_number the telephone_number to set
	 */
	public void setTelephone_number(int telephone_number) {
		this.telephone_number = telephone_number;
	}
	/**
	 * @return the email_address
	 */
	public String getEmail_address() {
		return email_address;
	}
	/**
	 * @param email_address the email_address to set
	 */
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	/**
	 * @return the physical_address
	 */
	public String getPhysical_address() {
		return physical_address;
	}
	/**
	 * @param physical_address the physical_address to set
	 */
	public void setPhysical_address(String physical_address) {
		this.physical_address = physical_address;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
// attributes
   String name;
   int telephone_number;
   String email_address;
   String physical_address;
   public Customer(String name, int telephone_number, String email_address, String physical_address)// constructor with 4 arguments
   {
       /*The constructor has 4 arguments
       Below the constructor invokes the arguments initialized in the beginning of method */
       this.name = name;
       this.telephone_number = telephone_number;
       this.email_address = email_address;
       this.physical_address = physical_address;
   }
   public String getName()//public method that will return the argument name in a string form
   {
       return name;
   }
   public String getEmailAddress()//public method that will return the argument email in a string form
   {
       return email_address;
   }
   public String getPhysiclAddress() //public method that will return the argument physical address in a string form
   {
       return physical_address;
   }
   // public method toString that will return all the arguments in other methods
   public String desplayCustomer()
   {
       String output = "Customer Name: " + name + "\n";
       output += "Telephone number: " + telephone_number + "\n";
       output += "Email address: " + email_address + "\n";
       output += "Physical address: " + physical_address + "\n";
       return output;
   }
}