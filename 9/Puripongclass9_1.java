public class Puripongclass9_1 {
    private float mypi;
    final float sqrtroot;

    public Puripongclass9_1(float value) {
        mypi = value;
        sqrtroot = value;
    }

    public float getMypi() {
        return mypi;
    }

    public void setMypi(float value) {
        mypi = value;
    }

    public float getsqrtroot() {
        return sqrtroot;
    }
    
    public static void main(String[] args) {
        Puripongclass9_1 myObject = new Puripongclass9_1(3.14f);
        System.out.println("mypi = " + myObject.getMypi());
        Puripongclass9_1 myObject2 = new Puripongclass9_1(1.41f);
        System.out.println("sqrtroot = " + myObject2.sqrtroot);
    }
    public static ShelloRMUTP(String[] args){
        System.out.println("ShelloRMUTP");
    }
}
