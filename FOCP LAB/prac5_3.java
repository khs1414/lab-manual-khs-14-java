class Box{
    float width;
    float height;
    float depth;
    void volume(){
        float vol = this.width*this.depth*this.height;
        System.out.println("The volume is : "+vol);
    }
    Box(float width,float height, float depth){
        this.depth = depth;
        this.width = width;
        this.height = height;
    }
    Box(Box b){
        this.depth = b.depth;
        this.width = b.width;
        this.depth = b.depth;
    }
    Box(){
        this.depth = 2.0f;
        this.height = 1.0f;
        this.depth = 1.0f;
    }

}

class BoxWeight extends Box{
    float weight;
    void display_weight(){
        System.out.println("The weight is : "+this.weight);
    }
    BoxWeight(float weight){
        this.weight = weight;
    }
    BoxWeight(BoxWeight w){
        weight = w.weight;
    }
    BoxWeight(){
        this.weight = 1.0f;
    }


}


public class prac5_3 {
    public static void main(String[] args) {
        Box case1 =  new Box(1.0f,2.0f,3.0f);
        Box case2 = new Box();
        Box case3 = new Box(case1);
        case2.volume();
        case1.volume();
        case3.volume();
        BoxWeight case4 = new BoxWeight(5.0f);
        case4.display_weight();

    }
}
