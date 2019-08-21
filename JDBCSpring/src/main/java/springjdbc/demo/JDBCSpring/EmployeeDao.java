package springjdbc.demo.JDBCSpring;

import org.springframework.jndi.JndiTemplate;

public class EmployeeDao {
private JdbcTemplate jdbcTemplate;

public void setJndiTemplate(JndiTemplate jndiTemplate) {  
    this.jdbcTemplate = jdbcTemplate;  
}  
 public int saveEmployee(Employee e) {
	 String query = "insert into employee values ("+e.getid() + "," + e.getname() + "," + e.getemail() + ")";
	 return jdbcTemplate.update(query);
 }
}  
public int updateEmployee(Employee e){  
    String query="update employee set   
    name='"+e.getName()+"',salary='"+e.getemail()+"' where id='"+e.getId()+"' ";  
    return jdbcTemplate.update(query);  
 }  
public int deleteEmployee(Employee e){  
    String query="delete from employee where id='"+e.getId()+"' ";  
    return jdbcTemplate.update(query);  
 }  
}
