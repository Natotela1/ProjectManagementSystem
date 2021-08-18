// class declaration
public class Project 
{
   /**
	 * @return the project_number
	 */
	public int getProject_number() {
		return project_number;
	}
	/**
	 * @param project_number the project_number to set
	 */
	public void setProject_number(int project_number) {
		this.project_number = project_number;
	}
	/**
	 * @return the project_name
	 */
	public String getProject_name() {
		return project_name;
	}
	/**
	 * @param project_name the project_name to set
	 */
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	/**
	 * @return the project_type
	 */
	public String getProject_type() {
		return project_type;
	}
	/**
	 * @param project_type the project_type to set
	 */
	public void setProject_type(String project_type) {
		this.project_type = project_type;
	}
	/**
	 * @return the eRF_number
	 */
	public String getERF_number() {
		return ERF_number;
	}
	/**
	 * @param eRF_number the eRF_number to set
	 */
	public void setERF_number(String eRF_number) {
		ERF_number = eRF_number;
	}
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
	 * @param customer the customer to set
	 */
	public void setCustomer(String customer) {
		this.customer = customer;
	}
// attributes
   int project_number;
   String project_name;
   String project_type;
   String ERF_number;
   String customer_name;
   String customer_surname;
   String customer;
   String deadline;
   public Project(int project_number, String ERF_number, String customer, String project_name, String project_type, String deadline)
   {
       /*The public method has 6 arguments
       Below the constructor invokes the arguments initialized in the beginning of method */
       this.project_number = project_number;
       this.project_name = project_name;
       this.project_type = project_type;
       this.ERF_number = ERF_number;
       this.customer = customer;
       this.deadline = deadline;
      
   }
   //public method that will return the argument customer in a string form
   public String getCustomer()
   {
       return customer;
   }
   //public method that will return the argument ERF number in a string form
   public String getERFNumber()
   {
       return ERF_number;
   }
   //public method that will return the argument project type in a string form
   public String getProjectType()
   {
       return project_type;
   }
   //public method that will return the argument project name in a string form
   public String getProjectName()
   {
      
       return project_name;
   }
   //public method that will return the argument deadline in a string form
   public String getDeadline()
   {
       return deadline;
   }
   public void setDeadline(String deadline) {
       this.deadline = deadline;
   }
   // public method toString that will return all the arguments in other methods
   public String toString()
   {
       String output = "Project number: " + project_number + "\n";
       output += "ERF number: " + ERF_number + "\n";
       output += "Customer name: " + customer + "\n";  
       output += "Project name: " + project_name + "\n";
       output += "Project type: " + project_type + "\n";
       output += "Project deadline: " + deadline;
       return output;
   }
  
}