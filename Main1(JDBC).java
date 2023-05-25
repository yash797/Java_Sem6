import java.util.Scanner;
import java.sql.*;

public class Main1 {
    Connection con;// 7th Task
    Derived data; // 15th Task

    Main1() // 2nd task
    {
        data = new Derived(); // 15th Task
    }

public static void main(String[] args)
{
Main obj=new Main();//1st task
obj.getconnection();//3rd task
Scanner in=new Scanner(System.in);//10th Task
int ch;
try
{
do
{
System.out.println("Select the operation");
System.out.println("\n1.Create the table \n2.Fetch Data

\n3. Insert Data\n4.Close Connection");
int choice =in.nextInt();
switch(choice)
{
case 1:obj.createtable();

break;

case 2:obj.fetchdata();

break;
case 3:obj.insert();
break;

case 4:obj.closeconnection();

break;

default:System.out.println("Enter the correct option");

break;

}
System.out.println("Do you want to continue then press

1 otherwise 0");

ch=in.nextInt();
}while(ch!=0);
}
catch(Exception E)
{
System.out.println(E);
}
}

    void getconnection()// 4th Task
    {
        String driver = "com.mysql.jdbc.Driver";// 6th task
        String url = "jdbc:mysql://localhost:3306/32122_student_info";
        String username = "root"; // Enter your account username
        String password = "Root@1234"; // Enter your account password
        try // 9th task
        {
            Class.forName(driver);// 5th Task
            con = DriverManager.getConnection(url, username, password);

            // 8th task

            System.out.println("Connection established successfully");
        } catch (Exception E) {
            System.out.println(E);
        }
    }

void createtable() //11th Task
{
try
{
String query="create table student2(rollno int,name
varchar(10),sub varchar(10),marks int,primary key(rollno))";
PreparedStatement st=con.prepareStatement(query);
int i=st.executeUpdate();
System.out.println("Table Created successfully"+i);
}catch(

Exception E)
{
    System.out.println(E);
    System.out.println("Select the next oepration");
}
}

    void insert() throws SQLException // 12th task
    {
        data.get_data();
        String query = "insert into student2 values(?,?,?,?)";
        PreparedStatement st = con.prepareStatement(query);
        st.setInt(1, data.retrollno());
        st.setString(2, data.retname());
        st.setString(3, data.retsub());
        st.setInt(4, data.retmarks());
        int i = st.executeUpdate();
        System.out.println("No of rows affected" + i);
    }

void fetchdata()throws SQLException //16th Task
{
String query="select * from student2";
PreparedStatement st= con.prepareStatement(query);
ResultSet rs=st.executeQuery();
System.out.println("Rollno"

+"\t"+"Std_name"+"\t"+"Sub_name"+"\t"+"Marks");

while(rs.next())
{

System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t
"+rs.getString(3)+"\t "+rs.getInt(4));

}
}

    void closeconnection() throws SQLException // 20th Task
    {
        con.close();
        System.out.println("Closed database connection");
    }
}