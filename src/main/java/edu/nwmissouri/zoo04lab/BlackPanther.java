package edu.nwmissouri.zoo04lab;

/**
 *
 * @author Hemanth Sai Reddy Velamuri
 */
public class BlackPanther extends Animal {
    
    /**
     * String declaration.
     *
     * @param name
     */
    
    enum Birds
          {
            Eagle
            Sparrow
            Parrot
          }
    public BlackPanther(String name) {
        super(name);
    }
    
    /**
     * BlackPanther Speak
     *
     */
    @Override
    public void speak() {
        System.out.printf("I'm %s. I'm an BlackPanther!",this.name);
    }
    
    /**
     *
     * BlackPanther move
     */
    @Override
    public void move() {
        System.out.println("When I move, I run, run, run.\n");
    }
    
    public void profes(){
        double a = 2.5;
        int b = 2;
        double c = getBlackPantherAddition(a,b);
        System.out.printf("I know BlackPanther addition! %4.2f plus %d is %4.2f \n",a,b,c);
    }

    public double getBlackPantherAddition(double first, int second) {
        return first+second; //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        var a = new BlackPanther("Tester");
        a.speak();
        a.move();
        a.profes();
        Bird B1 = Bird.Eagle
        Bird B2 = Bird.Sparrow
        Bird B3 = Bird.Parrot
        System.out.println("enums:"+B1+"\n"+B2+"\n"+B3);
    }
}
