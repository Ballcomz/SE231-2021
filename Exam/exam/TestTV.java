package exam;

public class TestTV {
    public static void main(String[] args) {
        TvPreset tv = new TvPreset("standard",14,69,45,50,50);
        
        System.out.println("Tv start");
        System.out.println(tv.toString());

        System.out.println("Change mode to movie");
        tv.setMode("movie");
        tv.changeMode(tv.getMode());
        System.out.println(tv.toString());
        
    }
}
