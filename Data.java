public class Data {
    public String firstName = null;
    private String lastName = null;
    private String adress = null;
    private String city = null;
    private String state = null;
    private String zip = null;
    private String mob = null;

    public Data(String firstName, String lastName, String adress, String city,String state,String zip,String mob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress=adress;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.mob=mob;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getMobile() {
        return mob;
    }

    public void setMobile(String mob) {
        this.mob = mob;
    }

    public String toString() {
        return String.format(firstName+" "+lastName+" "+adress+"  "+city+" "+state+" "+zip+" "+mob);
    }
}