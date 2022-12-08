
package sixth;

import java.util.Scanner;


public class Sixth {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        Shapes s=new Shapes();
    }
    
}
class Shapes{
    private float radius,length1,length2,length3;
    Scanner in = new Scanner(System.in);
    public Shapes(){
        int x=0;
        while (x!=3) {
        System.out.println("please enter your choose....");
        System.out.println("1 : Cicle\t 2 : Triangle\t 3 : End");
        x= in.nextInt();
        if(x==3){
            continue;
        }
        switch(x){
            case 1:
                System.out.print("please enter the radius of the circle : ");
                float rad = in.nextFloat();
                setCicleRadius(rad);
                System.out.println("the circumference of the cicle = "+getCiclecircumference());
                System.out.println("the Area of the cicle = "+getCicleArea());
                break;
            case 2:
                System.out.print("Enter the lenth of the 1st edge : ");
                float a = in.nextFloat();
                System.out.print("Enter the lenth of the 2nd edge : ");
                float b = in.nextFloat();
                System.out.print("Enter the lenth of the 3rd edge : ");
                float c = in.nextFloat();
                setTriangleLength(a, b, c);
                System.out.println("the circumference of the Triangle = "+getTrianglecircumference());
                System.out.println("the Area of the Triangle = "+getTriangleArea());
                break;
            default:
                System.out.println("Wrong choose please choose again");
        }
    }
    }
    public void setCicleRadius(float radius) {
        this.radius = radius;
    }
    public void setTriangleLength(float length1,float length2,float length3) {
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }

    public float getCicleArea() {
        return radius*radius*3.14f;
    }
    public float getCiclecircumference() {
        return radius*2*3.14f;
    }
    public double getTriangleArea() {
        float s=(length1+length2+length3)/2;
        return Math.sqrt((s*(s-length1)*(s-length2)*(s-length3)));
    }
    public float getTrianglecircumference() {
        return length1+length2+length3;
    }
    
}