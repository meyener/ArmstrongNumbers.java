import java.util.Scanner;

public class Odev
 { 
    public static void main(String[] args) {
    int counter=0,last,arm,tempArm,x=1,y=0,z;
    Scanner scn= new Scanner(System.in);
    System.out.print("lütfen sayi girin : ");
    arm=scn.nextInt();
    tempArm=arm;
    

    
    while (arm!=0) {
        arm/=10;
        counter++;
    }
    
    arm=tempArm;
    while (arm!=0) {
        last=arm%10;
        x=1;
        
        for (int i = 1; i <=counter; i++) {
            x*=last;
            
        }
        y=y+x;
        arm/=10; 
    }

    if(tempArm==y){
        System.out.print("ArmStrong >> : "+y);
    }
    
    

 }
    
    
}
