/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yindo
 */
public class Person {
    private int id;
    private String name;
    private String email;
   
    
    public Person(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    

    /**
     * Get the value of email
     *
     * @return the value of email
     */
    public String getEmail() 
    {
        return email;
    }

    /**
     * Set the value of email
     *
     * @param email new value of email
     */
    public void setEmail(String email) 
    {
        this.email = email;
    }

    @Override
    public String toString() {
        return  id + "\t" + name + "\t" + email; //To change body of generated methods, choose Tools | Templates.
    }
    
    

    
}
