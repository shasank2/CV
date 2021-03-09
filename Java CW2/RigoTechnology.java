// all the necessary packages are being imported 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import javax.swing.border.LineBorder.*;
import java.util.ArrayList.*;
import java.util.List.*;

public class RigoTechnology implements ActionListener
{
    //all the variables used in the program are been declared here
    JFrame frame;
    
    JTextField txtPlatform, txtWorkingHour, txtInterviewerName,
    txtSalary, txtAppointedBy, txtPlatformSenior, txtWorkingHourSenior,
    txtInterviewerNameSenior,txtContractPeriodSenior,txtSeniorDeveloperName,
    txtJoiningDate, txtAdvanceSalary, txtRoomNumberSenior, txtDeveloperNoSenior,
    txtDeveloperNameJunior, txtAppointedDate, txtSpecialization, 
    txtDeveloperNoJunior, txtTerminationDate, txtSalarySenior,txtTerminatedDate;
    
    JButton senior, junior, btnAddJunior, btnAddSenior, btnTerminate,
    btnAppointSenior, btnJAppoint,btnDisplay, btnClear, btnClearS;
    
    JComboBox btnPeriods;
        
    JLabel labSDeveloperNo,labjDeveloperNo,labelsInterviewerName,
    labsWorkingHour,labSSalary,labelSContactPeriod,labelseniorDeveloperName,labelStaffroomNo,
    labelJoiningDate,labelAdvanceSalary,labelSeniorDeveloper,labelsPlatform,
    labeljuniorDeveloper,labeljPlatform,labeljInterviewerName,labeljWorkingHour,
    labelJSalary,labeljTerminationDate,labeljAppointedBy,labeljAppoint,labelJDeveloperName,
    labeljAppointedDate,labelJterminatedDate,labeljSpecialization, labeljDeveloperNo;
    
    
    private ArrayList<Developer> developerList = new ArrayList<Developer>();
    private String arr[]={"Select","1 month","2 months","3 months","4 months","5 months","6 months"};
   //this is the first running method of the program. user is asked to pick 2 kind of forms here
  public RigoTechnology()
    {
        frame = new JFrame("Rigo Technology");
        frame.setBounds(480, 290, 400, 140);
                       
        senior = new JButton("Senior Developer");
        senior.setActionCommand("senior");
        senior.addActionListener(this);
        senior.setBounds(30,30,150,30);
        
        
        junior = new JButton("Junior Developer");
        junior.setActionCommand("Junior");
        junior.addActionListener(this);
        junior.setBounds(200,30,150,30);
        
        
        frame.add(senior);
        frame.add(junior);
        
        
        frame.setLayout(null);
        frame.setVisible(true);
        
        
  }
  // this method is to create gui for senior form
  public void senior()  
   {
    frame= new JFrame("Senior developer");
    frame.setBounds(400,50,600,520);
        
    labelsPlatform= new JLabel("Platform");
    labelsPlatform.setBounds(20,20,60,20);
    frame.add(labelsPlatform);
    
    txtPlatformSenior= new JTextField();
    txtPlatformSenior.setBounds(80,20,200,20);
    frame.add(txtPlatformSenior);
    
    labsWorkingHour= new JLabel("Working hour");
    labsWorkingHour.setBounds(330,20,80,20);
    frame.add(labsWorkingHour);
    
    txtWorkingHourSenior= new JTextField();
    txtWorkingHourSenior.setBounds(420,20,50,20);
    frame.add(txtWorkingHourSenior);
     
    labelsInterviewerName= new JLabel("Interviewer name");
    labelsInterviewerName.setBounds(20,60,100,20);
    frame.add(labelsInterviewerName);
     
    txtInterviewerNameSenior= new JTextField();
    txtInterviewerNameSenior.setBounds(130,60,200,20);
    frame.add(txtInterviewerNameSenior);
        
    labSSalary= new JLabel("Salary");
    labSSalary.setBounds(20,130,50,20);
    frame.add(labSSalary);
    
    txtSalarySenior= new JTextField();
    txtSalarySenior.setBounds(70,130,120,20);
    frame.add(txtSalarySenior);
    
    labelSContactPeriod= new JLabel("Contact period");
    labelSContactPeriod.setBounds(250,130,100,20);
    frame.add(labelSContactPeriod);
    
    txtContractPeriodSenior= new JTextField();
    txtContractPeriodSenior.setBounds(350,130,200,20);
    frame.add(txtContractPeriodSenior);
    
    btnAddSenior= new JButton("Add");
    btnAddSenior.setBounds(440,180,100,30);
    frame.add(btnAddSenior);
    btnAddSenior.addActionListener(this);
        
    labelseniorDeveloperName= new JLabel("Developer Name");
    labelseniorDeveloperName.setBounds(30,230,100,20);
    frame.add(labelseniorDeveloperName);
    
    txtSeniorDeveloperName= new JTextField();
    txtSeniorDeveloperName.setBounds(140,230,200,20);
    frame.add(txtSeniorDeveloperName);
    
    labelJoiningDate= new JLabel("Joining Date");
    labelJoiningDate.setBounds(30,270,80,20);
    frame.add(labelJoiningDate);
    
    txtJoiningDate= new JTextField();
    txtJoiningDate.setBounds(120,270,150,20);
    frame.add(txtJoiningDate);
    
    labelStaffroomNo= new JLabel("Staff Room No.");
    labelStaffroomNo.setBounds(300,270,100,20);
    frame.add(labelStaffroomNo);
    
    txtRoomNumberSenior= new JTextField();
    txtRoomNumberSenior.setBounds(400,270,80,20);
    frame.add(txtRoomNumberSenior);  
    
    labelAdvanceSalary= new JLabel("Advance salary");
    labelAdvanceSalary.setBounds(30,310,100,20);
    frame.add(labelAdvanceSalary);
    
    txtAdvanceSalary= new JTextField();
    txtAdvanceSalary.setBounds(130,310,80,20);
    frame.add(txtAdvanceSalary);
    
    labSDeveloperNo = new JLabel("Developer No:");
    labSDeveloperNo.setBounds(270,310,100,20);
    frame.add(labSDeveloperNo);
    
    txtDeveloperNoSenior = new JTextField();
    txtDeveloperNoSenior.setBounds(360,310,70,20);
    frame.add(txtDeveloperNoSenior);
    
    btnAppointSenior= new JButton("Appoint");
    btnAppointSenior.setBounds(200,360,100,30);
    frame.add(btnAppointSenior);
    btnAppointSenior.addActionListener(this);
    
    btnTerminate= new JButton("Terminate");
    btnTerminate.setBounds(320,360,100,30);
    frame.add(btnTerminate);
    btnTerminate.addActionListener(this);
    
    btnClearS = new JButton("Clear");
    btnClearS.setBounds(460,420,100,30);
    frame.add(btnClearS);
    btnClearS.setActionCommand("clear");
    btnClearS.addActionListener(this);
    
    btnDisplay= new JButton("Display All");
    btnDisplay.setBounds(350,420,100,30);
    frame.add(btnDisplay);
    btnDisplay.addActionListener(this);
    

   
    frame.setLayout(null);
    frame.setVisible(true);
    
    
   }
   //this method is to create the gui of junior form
  public void Junior()
   {
    frame= new JFrame("Junior developer");
    frame.setBounds(400,50,600,530);
    
    labeljPlatform= new JLabel("Platform");
    labeljPlatform.setBounds(20,20,60,20);
    frame.add(labeljPlatform);
    
    txtPlatform= new JTextField();
    txtPlatform.setBounds(80,20,200,20);
    frame.add(txtPlatform);
    
    labeljInterviewerName = new JLabel("Interviewer name");
    labeljInterviewerName.setBounds(20,60,100,20);
    frame.add(labeljInterviewerName);
    
    
    txtInterviewerName= new JTextField();
    txtInterviewerName.setBounds(130,60,200,20);
    frame.add(txtInterviewerName);
    
    labeljWorkingHour= new JLabel("Working hour");
    labeljWorkingHour.setBounds(330,20,80,20);
    frame.add(labeljWorkingHour);
    
    txtWorkingHour= new JTextField();
    txtWorkingHour.setBounds(420,20,50,20);
    frame.add(txtWorkingHour);
    
    labelJSalary= new JLabel("Salary");
    labelJSalary.setBounds(20,130,50,20);
    frame.add(labelJSalary);
    
    txtSalary= new JTextField();
    txtSalary.setBounds(70,130,120,20);
    frame.add(txtSalary);
    
    labeljAppointedBy= new JLabel("Appointed By");
    labeljAppointedBy.setBounds(250,130,100,20);
    frame.add(labeljAppointedBy);
    
    txtAppointedBy= new JTextField();
    txtAppointedBy.setBounds(350,130,200,20);
    frame.add(txtAppointedBy); 
    
    
    btnAddJunior= new JButton("Add");
    btnAddJunior.setBounds(440,180,100,30);
    frame.add(btnAddJunior);
    btnAddJunior.addActionListener(this);
    
    labeljAppoint= new JLabel("Appoint a junior developer");
    labeljAppoint.setBounds(220,220,180,30);
    frame.add(labeljAppoint);
    
    labelJDeveloperName= new JLabel("Developer Name");
    labelJDeveloperName.setBounds(30,270,100,20);
    frame.add(labelJDeveloperName);
    
    txtDeveloperNameJunior= new JTextField();
    txtDeveloperNameJunior.setBounds(130,270,180,20);
    frame.add(txtDeveloperNameJunior);
     
    labeljAppointedDate= new JLabel("Appointed Date");
    labeljAppointedDate.setBounds(330,270,100,20);
    frame.add(labeljAppointedDate);
    
    txtAppointedDate= new JTextField();
    txtAppointedDate.setBounds(430,270,120,20);
    frame.add(txtAppointedDate);
    
    labeljSpecialization= new JLabel("Specialization");
    labeljSpecialization.setBounds(30,310,100,20);
    frame.add(labeljSpecialization);
    
    txtSpecialization= new JTextField();
    txtSpecialization.setBounds(120,310,120,20);
    frame.add(txtSpecialization);
            
    labeljDeveloperNo = new JLabel("Developer No:");
    labeljDeveloperNo.setBounds(30,350,120,20);
    frame.add(labeljDeveloperNo);
    
    txtDeveloperNoJunior = new JTextField();
    txtDeveloperNoJunior.setBounds(130,350,70,20);
    frame.add(txtDeveloperNoJunior);    
    
    labelJterminatedDate= new JLabel("Terminated Date");
    labelJterminatedDate.setBounds(320,310,100,20);
    frame.add(labelJterminatedDate);
    
    txtTerminationDate= new JTextField();
    txtTerminationDate.setBounds(420,310,100,20);
    frame.add(txtTerminationDate);
    
    labeljTerminationDate= new JLabel("Termination Date");
    labeljTerminationDate.setBounds(320,350,100,20);
    frame.add(labeljTerminationDate);
    
    txtTerminatedDate= new JTextField();
    txtTerminatedDate.setBounds(420,350,100,20);
    frame.add(txtTerminatedDate);  
    
    btnPeriods = new JComboBox(arr);
    btnPeriods.setSelectedItem(0);
    btnPeriods.setBounds(30,395,100,20);
    frame.add(btnPeriods);    
        
    btnJAppoint= new JButton("Appoint");
    btnJAppoint.setBounds(230,390,100,30);
    frame.add(btnJAppoint);
    btnJAppoint.addActionListener(this);
            
    btnClear= new JButton("Clear");
    btnClear.setBounds(460,440,100,30);
    frame.add(btnClear);
    btnClear.setActionCommand("clear");
    btnClear.addActionListener(this);
    
    btnDisplay= new JButton("Display All");
    btnDisplay.setBounds(350,440,100,30);
    frame.add(btnDisplay);
    btnDisplay.addActionListener(this);
        
    frame.setLayout(null);
    frame.setVisible(true);
    
    
   }  
   //This method creates a form of junior developer
   public void addJuniorPlatform(){
        try {
              String platform = txtPlatform.getText();
              String interviewerName = txtInterviewerName.getText();
              String workingHour = txtWorkingHour.getText();
              String salary = txtSalary.getText();
              String appointedBy = txtAppointedBy.getText();
              
            if (platform.isEmpty()||workingHour.isEmpty() || interviewerName.isEmpty() || salary.isEmpty()|| appointedBy.isEmpty()) {
                throw new NullPointerException();
            }
            else{
              int workingHourdo = Integer.parseInt(workingHour);
              int salaryI = Integer.parseInt(salary);
              Developer junior = new JuniorDeveloper(platform,interviewerName,workingHourdo,salaryI,appointedBy);
              developerList.add(junior);
              JOptionPane.showMessageDialog(frame, "Platform for Junior developer Added sucessfully!!!");
            } 
        }catch (NullPointerException c)
        {
           JOptionPane.showMessageDialog(frame,"Field cannot be Empty.","Error!! Empty field.",JOptionPane.ERROR_MESSAGE);
        } 
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame,"Input format Error!!.","Error!! Invalid input.",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    //This method creates a form of senior developer 
    public void addSeniorPlatform(){
        try {
            String Platform = txtPlatformSenior.getText();
            String interviewerName = txtInterviewerNameSenior.getText();
            String workingHour = txtWorkingHourSenior.getText();
            String salary = txtSalarySenior.getText();
            String contractPeriod = txtContractPeriodSenior.getText();
            if (Platform.isEmpty()||interviewerName.isEmpty() ||workingHour.isEmpty()||  salary.isEmpty()|| contractPeriod.isEmpty()){
                throw new NullPointerException();
            }
            else{
                Integer workingHourD = Integer.parseInt(workingHour);
                int salaryI = Integer.parseInt(salary);
                int contractPeriodD = Integer.parseInt(contractPeriod);
                Developer senior = new SeniorDeveloper(salaryI,contractPeriodD,Platform,interviewerName,workingHourD);
                developerList.add(senior);
                JOptionPane.showMessageDialog(frame, "Platform for Senior developer Added sucessfully!!!");
            } 
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame,"Input format Error!!.", "Error!! Invalid input.",JOptionPane.INFORMATION_MESSAGE);
        }
        catch (NullPointerException c)
        {
           JOptionPane.showMessageDialog(frame,"Field cannot be Empty.","Error!! Empty field ",JOptionPane.ERROR_MESSAGE);
        } 
        
    }
    //This method checks all text field values of senior form i.e. if they are valid or not
    public void appointSeniorDeveloper(){
        try {
            String seniorDeveloperName = txtSeniorDeveloperName.getText();
            String joiningDate = txtJoiningDate.getText();
            String advanceSalary = txtAdvanceSalary.getText();
            String roomNumberSenior = txtRoomNumberSenior.getText();
            String developerNoSenior = txtDeveloperNoSenior.getText();  
            if (seniorDeveloperName.isEmpty()||joiningDate.isEmpty() ||advanceSalary.isEmpty()||roomNumberSenior.isEmpty()){
                throw new NullPointerException();
            }
            else{
                int advanceSalaryI = Integer.parseInt(advanceSalary);
                int developerNoSeniorI = Integer.parseInt(developerNoSenior);
                if(developerNoSeniorI >= 0 && developerNoSeniorI < developerList.size()){
                    if (developerList.get(developerNoSeniorI) instanceof SeniorDeveloper){
                        SeniorDeveloper senior =(SeniorDeveloper) developerList.get(developerNoSeniorI);
                        senior.AppointDeveloper(seniorDeveloperName,joiningDate,advanceSalaryI,roomNumberSenior);
                        JOptionPane.showMessageDialog(frame, "Senior developer Appointed sucessfully!!!");
                    }
                    else{JOptionPane.showMessageDialog(frame," Senior Developer is cannot appointed");
                    }
                } 
                else{
                     throw new ArrayIndexOutOfBoundsException();
                }
            }
        } catch (NullPointerException c)
        {
           JOptionPane.showMessageDialog(frame,"Field cannot be Empty.","Error!! Empty field ",JOptionPane.ERROR_MESSAGE);
        } 
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame,"invalid input", "Error!! Invalid input format.",JOptionPane.INFORMATION_MESSAGE);
        }
        catch (ArrayIndexOutOfBoundsException ec)
        {
           JOptionPane.showMessageDialog(frame,"invalid developer no","Error!! NO input",JOptionPane.ERROR_MESSAGE);
        } 
    }
    //this method checks all text field values of junior form if they are valid or not
    public void appointJuniorDeveloper(){
        try{
            String name = txtDeveloperNameJunior.getText();
            String joiningDate = txtAppointedDate.getText();
            String specialization = txtSpecialization.getText();         
            String evaluatationPeriod = btnPeriods.getSelectedItem().toString();
            String terminationDate = txtTerminationDate.getText();
            String developerNo= txtDeveloperNoJunior.getText();
            if (name.isEmpty()||joiningDate.isEmpty() ||specialization.isEmpty()||evaluatationPeriod.isEmpty()||terminationDate.isEmpty()||developerNo.isEmpty()){
                throw new NullPointerException();
            }
            else{
                int developerNoI= Integer.parseInt(developerNo);
                if (developerNoI >= 0 && developerNoI < developerList.size()){
                    if(developerList.get(developerNoI) instanceof JuniorDeveloper){
                        JuniorDeveloper junior = (JuniorDeveloper) developerList.get(developerNoI);
                        if(junior.getJoined() == false){
                            junior.AppointDeveloper(name,joiningDate,specialization,evaluatationPeriod,terminationDate);
                            JOptionPane.showMessageDialog(frame, "Junior developer Appointed sucessfully!!!");
                        }
                        else{
                            JOptionPane.showMessageDialog(frame," Junior Developer is already appointed");
                        }
                    }
                    else{JOptionPane.showMessageDialog(frame," Junior Developer cannot be appointed");
                    }
                }
                else{
                    throw new ArrayIndexOutOfBoundsException();
                }
            }
        }catch (NullPointerException c)
        {
           JOptionPane.showMessageDialog(frame,"Field cannot be Empty.","Error!! Empty field ",JOptionPane.ERROR_MESSAGE);
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame,e.getMessage(), "Error!! Invalid input format.",JOptionPane.INFORMATION_MESSAGE);
        } 
        catch (ArrayIndexOutOfBoundsException ec)
        {
           JOptionPane.showMessageDialog(frame," Error!!","DeveloperNo does not exist",JOptionPane.ERROR_MESSAGE);
        } 
    }
    //this method cancels the appointed senior developer
    public void terminateSeniorDeveloper(){
            try{
                String developerNo= txtDeveloperNoJunior.getText();
                if(developerNo.isEmpty()){
                    throw new NullPointerException();
                }
                else{
                    int developerNoI= Integer.parseInt(developerNo);   
                    if(developerNoI >= 0 && developerNoI <developerList.size()){
                        if(developerList.get(developerNoI) instanceof SeniorDeveloper){
                            SeniorDeveloper terminate = (SeniorDeveloper) developerList.get(developerNoI);
                           // if(terminate.getAppointed()== true )
                               if(terminate.getTerminated()==false)
                            {
                                terminate.contractTermination();
                            }
                            else{
                                 JOptionPane.showMessageDialog(frame,"Senior developer already terminated", "Error!!",JOptionPane.INFORMATION_MESSAGE);
                                }
                        }
                        else{JOptionPane.showMessageDialog(frame," Senior Developer is cannot be terminated");
                        }
                    }
                    else{
                         throw new ArrayIndexOutOfBoundsException();
                    }
                }
            }catch (NullPointerException c)
            {
               JOptionPane.showMessageDialog(frame,"Empty input for developer number","Error!! NO input",JOptionPane.ERROR_MESSAGE);
            }
            catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(frame,"invalid input Asked integer inserted string", "Error!! Invalid input format.",JOptionPane.INFORMATION_MESSAGE);
            } 
            catch (ArrayIndexOutOfBoundsException ec)
            {
               JOptionPane.showMessageDialog(frame,"no developer to terminate","Error!!",JOptionPane.ERROR_MESSAGE);
            } 
        }
        //this method just displays the assigned values of text fields on both forms
    public void displayAll(){
        for (Developer developer : developerList){
            if (developer instanceof SeniorDeveloper){
                SeniorDeveloper senior = (SeniorDeveloper) developer;
                System.out.println("SeniorDeveloper details: ");
                senior.display();
                System.out.println("\n");
            }
            if (developer instanceof JuniorDeveloper){
                JuniorDeveloper junior = (JuniorDeveloper) developer;
                System.out.println("JuniorDeveloper Class : ");
                junior.displays();
                System.out.println("\n");
            }
        }
    }
    //here each of the if statement is assigned to a specific work of buttons
    public void actionPerformed (ActionEvent e){
        if (e.getSource().equals(btnAddJunior)) {
            addJuniorPlatform();
        }
        if (e.getSource().equals(btnAddSenior)) {
            addSeniorPlatform();
        }
        if (e.getSource().equals(btnAppointSenior)) {
            appointSeniorDeveloper();
        }
        if (e.getSource().equals(btnJAppoint)) {
            appointJuniorDeveloper();
        }
        if (e.getSource().equals(btnTerminate)) {
            terminateSeniorDeveloper();
        }
        if (e.getSource().equals(btnDisplay)) {
            displayAll();
        }
        if (e.getSource().equals(btnClearS)) {
            clearAllSenior();
        }
        if (e.getSource().equals(btnClear)){
            clearAllJunior();
        }
        if (e.getActionCommand().equals("senior"))
        {
            senior();
        }
        if (e.getActionCommand().equals("Junior"))
        {
            Junior();
        }
        if (e.getActionCommand().equals("exit"))
        {
            System.exit(0);
        }
    }
    //this function clears all text fields of senior form
    public void clearAllSenior(){
    
    txtPlatformSenior.setText("");
    txtWorkingHourSenior.setText("");
    txtInterviewerNameSenior.setText("");
    txtSalarySenior.setText("");
    txtContractPeriodSenior.setText("");
    txtSeniorDeveloperName.setText("");
    txtJoiningDate.setText("");
    txtRoomNumberSenior.setText("");
    txtAdvanceSalary.setText("");
    txtDeveloperNoSenior.setText("");
    
    }
    //this function clears all text fields of junior form 
    public void clearAllJunior(){
    txtPlatform.setText("");
    txtInterviewerName.setText("");
    txtWorkingHour.setText("");
    txtSalary.setText("");
    txtAppointedBy.setText("");
    txtDeveloperNameJunior.setText("");
    txtAppointedDate.setText("");
    txtSpecialization.setText("");
    txtDeveloperNoJunior.setText("");  
    txtTerminationDate.setText("");
    txtTerminatedDate.setText("");
    
    
    }
    
}
   