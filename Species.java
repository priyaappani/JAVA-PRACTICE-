class Animal{
    public void sleep(){
        System.out.println("Animal is sleeping");
    }
}
class Dog extends Animal{
    String name;
    int age;
    public Dog(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void bark(){
        System.out.println("Dog "+name+" is barking");
    }
}
public class Species {
    public static void main(String[] args) {
        Dog d1=new Dog("Sophie" ,5);
        d1.sleep();
        d1.bark();
        Animal a1=new Animal();
        a1.sleep();
    }

    
}

