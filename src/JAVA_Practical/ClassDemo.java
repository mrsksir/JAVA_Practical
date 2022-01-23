
package JAVA_Practical;

class Dog{
    
    public String color = "black";    

    public void bark(){
        System.out.println("\nThis is bark method.");
    }
    
    public void eat(){
        System.out.println("\nThis is eat method.\n");
    }
    
    public void getColor(){
        System.out.println(color);
    }
}

public class ClassDemo {
        public static void main(String[] args) {
            Dog d = new Dog();
            d.bark();
            d.eat();
            d.getColor();
            
    }
}
