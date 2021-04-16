public class Person {

    private String fio;
    
    private String position;

    private String email;

    private String phone;

    private int salary;

    private int age;

    /**
     * @param fio
     * @param position
     * @param email
     * @param phone
     * @param salary
     * @param age
     */
    public Person(String fio, String position, String email, String phone, int salary, int age) {
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public Person() {

    }

    

    /**
     * @return the fio
     */
    public String getFio() {
        return fio;
    }

    /**
     * @param fio the fio to set
     */
    public void setFio(String fio) {
        this.fio = fio;
    }

    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    public void info() {
        System.out.println(this);
    }

   
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "Person [age=" + age + ", email=" + email + ", fio=" + fio + ", phone=" + phone + ", position="
                + position + ", salary=" + salary + "]";
    }
    
    

    



}
