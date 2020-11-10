package altimetrik.raj;

public class WallArea {
    private double height,width;

    public WallArea() {

    }

    public WallArea(double height, double width) {
        if (height<0)
            this.height=0;
        else
        this.height = height;
        if (width<0)
            this.width=0;
        else
        this.width = width;

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height>0)
        this.height = height;
        else
            this.height=0;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width>0)
        this.width = width;
        else
            this.width=0;
    }

    public double getArea() {
        return (height*width);
    }
}
