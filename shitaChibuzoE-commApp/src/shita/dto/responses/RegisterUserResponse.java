package shita.dto.responses;

public class RegisterUserResponse {
    private String firstName;
    private String id;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "RegisterUserResponse{" +
                "firstName='" + firstName + '\'' +
                ", id=" + id +
                '}';
    }
}
