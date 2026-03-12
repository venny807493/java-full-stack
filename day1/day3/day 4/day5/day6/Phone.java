public class Phone{
    abstract void call(){
        void powerOn(){
            System.out.println("Phone is turning on");
        }
    }
    class SmartPhone extends Phone{
        void call(){
            System.out.println("calling through mobile");
        }
    }
}