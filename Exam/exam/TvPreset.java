package exam;

public class TvPreset {
    private String mode;
    private int backlight,contrast,brightness,sharpness,color;

    public TvPreset(String mode,int backlight,int contrast,int brightness,int sharpness,int color){
        this.mode = mode;
        this.backlight = backlight;
        this.contrast = contrast;
        this.brightness = brightness;
        this.sharpness = sharpness;
        this.color = color;
    }

    public String getMode(){
        return mode;
    }

    public void setMode(String mode){
        this.mode = mode;
    }
    public void setBacklight(int backlight){
        this.backlight = backlight;
    }
    public void setcontrast(int contrast){
        this.contrast = contrast;
    }
    public void setBrightness(int brightness){
        this.brightness = brightness;
    }
    public void setSharpness(int sharpness){
        this.sharpness = sharpness;
    }
    public void setColor(int color){
        this.color = color;
    }

    public void changeMode(String mode){
        if(mode == "movie"){
            backlight = 10;
            contrast = 50;
            brightness = 40;
            sharpness = 70;
            color = 60;
        }
    }
    public String toString(){
        return "\n TV mode:"+mode+" backlight:"+backlight+" contrast:"+contrast+" brightness:"+brightness+" sharpness:"+sharpness+" color:"+color;
    }
    
}
