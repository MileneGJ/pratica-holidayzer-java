public class Holiday {
    private String date;
    private String name;

    public Holiday () {

    }

    public Holiday (String date, String name) {
        this.date = date;
        this.name = name;
    }

    public String getDateAndName() {
        return date + ": " + name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }
}
