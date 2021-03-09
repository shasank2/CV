public class SeniorDeveloper extends Developer
{
    private int salary;
    private String joiningDate;
    private String staffRoomNumber;
    private int contractPeriod;
    private int advancedSalary;
    private boolean appointed;
    private boolean terminated;
    
    public SeniorDeveloper(int salary,int contractPeriod,String platform,String interviewerName,int workingHours)
    {
        super(platform,interviewerName,workingHours);
        this.salary = salary;
        this.joiningDate = "";
        this.staffRoomNumber = "";
        this.contractPeriod = contractPeriod;
        this.advancedSalary = 0;
        this.appointed = false;
        this.terminated = false;
    }
    
    public int getSalary()
    {
        return this.salary;
    }
    
    public String getJoiningDate()
    {
        return this.joiningDate;
    }
    
    public String getStaffRoomNumber()
    {
        return this.staffRoomNumber;
    }
    
    public int getContactPeriod() 
    {
        return this.contractPeriod;
    }
    
    public int getAdvancedSalary()
    {
        return this.advancedSalary;
    }
    
    public boolean getAppointed()
    {
        return this.appointed;
    }
    
    public boolean getTerminated()
    {
        return this.terminated;
    }
    
    public void setSalary(int salary)
    {
        this.salary = salary;
    }
    
    public void setContactPeriod(int contactPeriod)
    {
        this.contractPeriod = contractPeriod;
    }
    
    public void AppointDeveloper(String newDeveloperName,String joiningDate,int advancedSalary,String staffRoomNumber)
    {
        if(this.appointed){
            System.out.println(getDeveloperName() + "is the name of the developer and their staff room number is " + getStaffRoomNumber());
            
        }
        else{
            super.setDeveloperName(newDeveloperName);
            this.joiningDate=joiningDate;
            this.staffRoomNumber=staffRoomNumber;
            this.appointed=true;
            this.terminated=false;
        }
       
    }
    
    public void contractTermination()
    {
        if(this.terminated){
            System.out.println("contract already terminated");
        }
        else{
            super.setDeveloperName("");
            this.joiningDate="";
            this.advancedSalary=0;
            this.appointed=false;
            this.terminated=true;
        }
    }
    
    public void print()
    {
        System.out.println("the name of the platform is "+getPlatform());
        System.out.println("the name of the interviewer is "+getInterviewerName());
        System.out.println("the salary is "+getSalary());
    }
    
    public void display()
    {
        //display();
        if(this.appointed){
            if(this.terminated){
                System.out.println("contract is terminated");
            }
            else{
                System.out.println("contract is not terminated");
            }
            System.out.println("the joining date of the developer is " + getJoiningDate());
            System.out.println("the advanced salary of the developer is " + getAdvancedSalary());
        }
    }
}
