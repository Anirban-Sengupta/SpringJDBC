package springjdbc.demo.JDBCSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("jdbc.xml");  
        EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");  
        int status=dao.saveEmployee(new Employee(102,"Amit",35000));  
        System.out.println(status); 
    }
}
