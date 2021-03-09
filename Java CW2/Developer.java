
public class Developer
{
    private String platform;
    private String interviewerName;
    private String developerName;
    private int workingHours;
    
    //Constructor method
    public Developer(String platform,String interviewerName,int workingHours)
    {
        this.platform = platform;
        this.interviewerName = interviewerName;
        this.developerName = "";
        this.workingHours = workingHours;
    }
    
    //accessor methods
    public String getPlatform()
    {
        return this.platform;
    }
    
    public String getInterviewerName()
    {
        return this.interviewerName;
    }
    
    public String getDeveloperName()
    {
        return this.developerName;
    }
    
    public int getWorkingHours()
    {
        return this.workingHours;
    }
    
    //setting the developer name
    public void setDeveloperName(String developerName)
    {
        this.developerName = developerName;
    }
    
    //displaying the destails of the developer class
    public void display()
    {
        System.out.println("the name of the platform is " + getPlatform());
        System.out.println("the number working hours is " + getWorkingHours());
        System.out.println("the name of the interveiwer " + getInterviewerName());
        if (this.developerName != null){
            System.out.println("the name of the developer is " + getDeveloperName());
        }
    }
    
}
