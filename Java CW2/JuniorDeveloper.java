public class JuniorDeveloper extends Developer
{
    private int salary;
    private String appointedDate;
    private String evaluationPeriod;
    private String terminationDate;
    private String specialization;
    private String appointedBy;
    private boolean joined;
    
    public JuniorDeveloper(String platform,String interviewerName,int workingHours,int salary,String appointedBy)
    {   
      
        super(platform,interviewerName,workingHours);
        this.salary=salary;
        this.appointedDate="";
        this.evaluationPeriod="";
        this.terminationDate="";
        this.specialization="";
        this.appointedBy=appointedBy;
        this.joined=false;
    }
    
    public int getSalary()
    {
     return this.salary;   
    }
    
    public String getAppointedDate()
    {
     return this.appointedDate;   
    }
    
    public String getEvalutionPeriod()
    {
     return this.evaluationPeriod;   
    }
    
    public String getTerminationDate()
    {
     return this.terminationDate;   
    }
    
    public String getSpecialization()
    {
     return this.specialization;   
    }
    
    public String getAppointedBy()
    {
     return this.appointedBy;   
    }
    
    public boolean getJoined()
    {
     return this.joined;   
    }
    
    public void setSalary(int salary)
    {
        if(this.joined==false){
            this.salary=salary;
        }
        else{
            System.out.println("Not possible to change the salary");
        }
    }
    
    public void AppointDeveloper(String developerName,String appointedDate,String terminationDate,String specialization, String evaluationPeriod)
    {
        if(this.joined==false){
            super.setDeveloperName(developerName);
            this.appointedDate=appointedDate;
            this.terminationDate=terminationDate;
            this.specialization=specialization;
            this.evaluationPeriod = evaluationPeriod;
            this.joined=true;
        }
        else{
            System.out.println("Developer already appointed");
        }
        
    }
    
    public void displays()
    {
        super.display();
        if(this.joined){
            System.out.println("the developer was appointed on " + getAppointedDate());
            System.out.println("the name of the developer was " + getEvalutionPeriod() );
            System.out.println("the termination date of the developer was " + getTerminationDate());
            System.out.println("the developer's salary is" + getSalary());
            System.out.println("the specialization of the developer is" + getSpecialization());
            System.out.println("the developer was appointed by " + getAppointedBy());
        }
    }
}
