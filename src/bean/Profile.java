package bean;

public class Profile implements Identifiable {
    private static int counter = 0;
    private  int id;
    private String code;
    private String description;

    public Profile(String code, String description) {
        this.id = ++counter;
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
