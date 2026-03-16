
public class carsArrays {
    public static void main (String[]args){
 String[]Cars=new String[4];
        Cars[0]="mazda";
        Cars[1]="bmw";
        Cars[2]="benz";
        Cars[3]="toyota";
        //for(int i=0;i<Cars.length;i++)
//System.out.println(Cars[i]);
for(String Car:Cars){
    System.out.println(Car);
}
}
}
