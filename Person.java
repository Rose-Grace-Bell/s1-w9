public class Person {
    private double height =0;

    public Person(double t){
        height = t;
    }

    public boolean equals(Person two){
        return this.height == two.height;
    }
}