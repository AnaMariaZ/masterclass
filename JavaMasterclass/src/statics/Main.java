package statics;

public class Main {
    public static void main(String[] args){
        Dog rex = new Dog("rex");
        Dog fluffy = new Dog("fluffy");
        rex.printName();
        fluffy.printName();
    }
}

class Dog{
    private static String name;

    public Dog(String name){
        this.name = name;
    }

    public  void printName(){
        System.out.println("name = " + name);
    }
}