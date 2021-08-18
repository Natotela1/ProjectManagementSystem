public class Architect // class declaration
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

// attributes
   String name;
   int telephone_number;
   String email_address;
   String physical_address;
   public Architect(String name, int telephone_number, String email_address, String physical_address)// constructor with 3 arguments
   {
       /*The constructor has three arguments
       Below the constructor invokes the arguments initialized in the beginning of method */
       this.name = name;
       this.telephone_number = telephone_number;
       this.email_address = email_address;
       this.physical_address = physical_address;
   }
   // constructor that will return the argument name
   public String getName() {

       return name;
   }

    public void setName(String name) {
        this.name = name;
    }
    // constructor that will return the argument email address
    public String getEmailAddress() {
       return email_address;
   }
   // constructor that will return the argument physical address
   public String getPhysiclAddress() {
       return physical_address;
   }
   // constructor that will return the argument telephone
   public int getTelephone() {
       return telephone_number;
   }

  
   public String displayArchitect()// Create constructor toString that will return all the arguments in other constructors
   {
      
       String output = "Architects Name: " + name + "\n";
       output += "Telephone number: " + telephone_number + "\n";
       output += "Email address: " + email_address + "\n";
       output += "Physical address: " + physical_address + "\n";
       return output;
   }
}