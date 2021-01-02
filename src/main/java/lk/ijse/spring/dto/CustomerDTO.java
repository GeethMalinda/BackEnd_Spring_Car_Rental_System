package lk.ijse.spring.dto;



public class CustomerDTO {

    private String email;
    private String username;
    private String passward;
    private String nic;
    private String dlnumber;
    private String userrole;



    public CustomerDTO() {
    }

    public CustomerDTO(String email, String username, String passward, String nic, String dlnumber, String userrole) {
        this.email = email;
        this.username = username;
        this.passward = passward;
        this.nic = nic;
        this.dlnumber = dlnumber;
        this.userrole = userrole;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassward() {
        return passward;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getDlnumber() {
        return dlnumber;
    }

    public void setDlnumber(String dlnumber) {
        this.dlnumber = dlnumber;
    }

    public String getUserrole() {
        return userrole;
    }

    public void setUserrole(String userrole) {
        this.userrole = userrole;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", passward='" + passward + '\'' +
                ", nic='" + nic + '\'' +
                ", dlnumber='" + dlnumber + '\'' +
                ", userrole='" + userrole + '\'' +
                '}';
    }
}
