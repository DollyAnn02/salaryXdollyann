import java.util.Scanner;


class yearly_salary{

    public static void main(String[] args) {
        Scanner dolly = new Scanner(System.in);
        //variable declaration//
        Double DAR;      //annual income input//      
        Double var_mrate;                   final int var_months=12; 
        Double var_drate;                   final int var_wdays=22;
        Double var_hrate;                   final int var_whours=8;
        
        
        

        //input statement//
        System.out.print("Your Annual Salary:");
        DAR = dolly.nextDouble();
        
        //solution phase1//
        var_mrate= DAR/var_months;              System.out.println("Your var_mrate Rate:                   " + String.format("%.2f", var_mrate));
        var_drate=var_mrate/var_wdays;          System.out.println("Your Daily Rate:                     " + String.format("%.2f", var_drate));
        var_hrate=var_drate/var_whours;         System.out.println("Your Hourly Rate:                    " + String.format("%.2f", var_hrate));
        //solution phase2//  
        if (DAR<250000){
    
        }
                else if(DAR >= 0 && DAR <250000){    

            Double var_extax = DAR ;
            Double var_taxdeduc=.0*var_extax+0;
            Double a=var_taxdeduc;  
            System.out.println("Your Annual Tax Deduction:           " + String.format("%.2f",a));       
            Double b=a/var_drate;      
            System.out.println("Monthly Tax Deduction:               " + String.format("%.2f",b));    
            Double var_netpay=var_mrate-b;
            System.out.println("Net Pay:                             " + String.format("%.2f",var_netpay));
        }
        else if(DAR>= 250000 && DAR <400000){        

            Double var_extax = DAR ;
            Double var_taxdeduc=0.20*var_extax+0;
            Double a=var_taxdeduc;   
            System.out.println("Your Annual Tax Deduction:           " + String.format("%.2f",a));      
            Double b=a/var_drate;       
            System.out.println("Monthly Tax Deduction:               " + String.format("%.2f",b));  
            Double var_netpay=var_mrate-b;
            System.out.println("Net Pay:                             " + String.format("%.2f",var_netpay));
        }
        else if(DAR >= 400000 && DAR<800000){           
            Double var_extax = DAR- 30000-400000;
            Double var_taxdeduc=30000+(var_extax*.25);
            Double a=var_taxdeduc;        
            System.out.println("Your Annual Tax Deduction:           " + String.format("%.2f",a));     
            Double b=a/var_drate;     
            System.out.println("Monthly Tax Deduction:               " + String.format("%.2f",b));          
            Double var_netpay=var_mrate-b;
            System.out.println("Net Pay:                             " + String.format("%.2f",var_netpay));
        }
        else if(DAR >= 800000 && DAR <2000000){          
            Double var_extax = DAR - 130000-800000;
            Double var_taxdeduc=130000+(var_extax*.30);
            Double a=var_taxdeduc;    
            System.out.println("Your Annual Tax Deduction:           " + String.format("%.2f",a));
            Double b=a/var_drate;                   
            System.out.println("Monthly Tax Deduction:               " + String.format("%.2f",b));
            Double var_netpay=var_mrate-b;
            System.out.println("Net Pay:                             " + String.format("%.2f",var_netpay));    
        }
        else if(DAR >= 2000000 && DAR <8000000){          
            Double var_extax = DAR - 490000-2000000;
            Double var_taxdeduc=490000+(var_extax*.32);
            Double a=var_taxdeduc;    
            System.out.println("Your Annual Tax Deduction:           " + String.format("%.2f",a));
            Double b=a/var_drate;                       
            System.out.println("Monthly Tax Deduction:               " + String.format("%.2f",b));
            Double var_netpay=var_mrate-b;
            System.out.println("Net Pay:                             " + String.format("%.2f",var_netpay));      
        }
        else if(DAR >= 8000000 && DAR <10000000){         
            Double var_extax  = DAR - 2410000-8000000;
            Double var_taxdeduc=2410000+(var_extax*.35);
            Double a=var_taxdeduc;
            System.out.println("Your Annual Tax Deduction:           " + String.format("%.2f",a));                    
            Double b=a/var_drate; 
            System.out.println("Monthly Tax Deduction:               " + String.format("%.2f",b));
            Double var_netpay=var_mrate-b;
            System.out.println("Net Pay:                             " + String.format("%.2f",var_netpay));
        }
    }
}
