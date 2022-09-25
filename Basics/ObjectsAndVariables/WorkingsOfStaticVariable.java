package Basics.ObjectsAndVariables;

class Fan
{
    public boolean isOn;
    public static int fanSpeed;

    public void incrementFanSpeed()
    {
        fanSpeed++;
    }
}


public class WorkingsOfStaticVariable
{
   public static void main(String[] args)
   {
        System.out.println("====================");
        System.out.println("FAN Speed Now " + Fan.fanSpeed);
       
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        System.out.println("FAN 1 Speed Now ");
        System.out.println(fan1.fanSpeed);
        System.out.println("FAN 2 Speed Now ");
        System.out.println(fan2.fanSpeed);

        System.out.println("After Increase by Fan1");
        fan1.incrementFanSpeed();

        System.out.println("FAN 1 Speed Now ");
        System.out.println(fan1.fanSpeed);
        System.out.println("FAN 2 Speed Now ");
        System.out.println(fan2.fanSpeed);
        System.out.println("====================");
   }
}
