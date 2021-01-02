package lk.ijse.spring.dto;

public class DriverDTO {
    private int id;
    private String name;
    private String adress;
    private String tp;
    private int age;
    private String isAvailable;
    private String photo;

    public DriverDTO() {

    }

    public DriverDTO(int id, String name, String adress, String tp, int age, String isAvailable, String photo) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.tp = tp;
        this.age = age;
        this.isAvailable = isAvailable;
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "DriverDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", tp='" + tp + '\'' +
                ", age=" + age +
                ", isAvailable='" + isAvailable + '\'' +
                ", photo='" + photo + '\'' +
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(String isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
