package lk.ijse.spring.dto;

public class AdminDTO {

    private int id;
    private String name;
    private  String passward;

    public AdminDTO(int id, String name, String passward) {
        this.id = id;
        this.name = name;
        this.passward = passward;
    }

    public AdminDTO() {
    }

    @Override
    public String toString() {
        return "AdminDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", passward='" + passward + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassward() {
        return passward;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }
}
