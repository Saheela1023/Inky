public class Inky{

    public Inky(String Pinky){
        System.out.println(Pinky);

    }
    public Inky(String Pinky,String Blinky,String Rinky){
        System.out.println(Blinky +" "+ Pinky);
        System.out.println(Pinky + " "+ Rinky);
        System.out.println(Blinky+" "+ Pinky+ " " + Rinky);
    }

    public static void main(String args[]){
        String Pinky ="Donkey";

        Inky Ponky = new Inky(Pinky);

        String Blinky ="Pinky";
        String Rinky ="Monkey";

        Inky Ponky2 = new Inky(Pinky,Blinky,Rinky);
    }
}