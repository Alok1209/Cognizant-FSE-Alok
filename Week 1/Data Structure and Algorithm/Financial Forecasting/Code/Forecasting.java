package Code;

import java.util.*;
public class Forecasting {
    public Forecasting(){}
    public double Forecast(int pv,int years, double rate){
            if(years==0){
                return pv;
            }
            return Forecast(pv, years-1,rate)*((rate*0.01)+1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Forecasting ob=new Forecasting();
        int principal, years, rate;
        System.out.println("Enter the values of principal values , years and rates");
        principal=sc.nextInt();
        years=sc.nextInt();
        rate=sc.nextInt();
        System.out.println(ob.Forecast(principal, years, rate));
        sc.close();
        
    }
}
