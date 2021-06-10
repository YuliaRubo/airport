package entity;

public class Pilot {
    private int id;
    private String firstname;
    private String lastname;
    private String rank;
    private String code;

    public Pilot(int id, String firstname, String lastname, String rank, String code) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.rank = rank;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }



    public String getCode() {
        return code;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }



    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Pilot{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", rank=" + rank +
                ", code='" + code + '\'' +
                '}'+"\n";
    }
}
