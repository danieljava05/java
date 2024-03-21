public class Main {
    public static void main(String[] args) {
        worker wk = new worker("Daniel","23/05/1956");
        work(wk);

        Employee em  = new Employee("name","23/05/2004",1,"20/4/2000");
        work(em);
    }


    public static void work(worker worker){
        System.out.println(worker);

    }
}