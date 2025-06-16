public class Programming extends FirstYearCourse{
    public void printName(String name){
       System.out.println("your name is "+name);
    }
    public void printTotalWeeks(int noofweeks){
        System.out.println("there are "+noofweeks+" in first year");
    }
    public static void main(String[] args){
        Programming obj1=new Programming();
        obj1.printName("suchana");
        obj1.printTotalWeeks(24);
    }
}

    

