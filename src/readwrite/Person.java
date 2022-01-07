
package readwrite;


public class Person {
    private String fullName;
    private String date;
    private String address;
    private String gender;

    public Person() {
    }

    public Person(String fullName, String date, String address, String gender) {
        this.fullName = fullName;
        this.date = date;
        this.address = address;
        this.gender = gender;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" + "fullName=" + fullName + ", date=" + date + ", address=" + address + ", gender=" + gender + '}';
    }

    
    public void display(){
        System.out.println(this.toString()); 
    }
}
