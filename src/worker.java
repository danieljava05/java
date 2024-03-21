public class worker {
    private String name;
    private String birthDate;
    private String endDate;

    public worker(String birthDate) {
        this.birthDate = birthDate;
    }
    public int getAge(){
        String[] n = birthDate.split("/");
        String getage = n[2];
        int convert = Integer.parseInt(getage);
        int age = 2024 - convert;
        return age;
    }

    @Override
    public String toString() {
        return "worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
