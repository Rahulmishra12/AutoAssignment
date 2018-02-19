package com.assignment;

import java.awt.ScrollPaneAdjustable;
import java.util.Scanner;

public class Demo {
	
	private static int bagAmount = 77720; //this is the sum amount of bag 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter a number");
        Scanner sc =new Scanner(System.in);
       
           int amount = -1 ;
		try {
			amount = sc.nextInt();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
        	
		
        if( amount > bagAmount)
        {
        	 System.out.println("Error:" + "this amount is not valid");
        	
        }
           
        
        else{
        	
        	if(amount >= 2000)
            {
                getTwoThousandsNote(amount);
            }
            if(amount>= 1000 && amount<2000)
            {
                getOneThousandsNote(amount);
            }
            if(amount>=500 && amount<1000 )
            {
                getFiveHundredNote(amount);
            }
            if(amount>=100 && amount <500)
            {
                getOneHundredNote(amount);
            }
            if(amount>=50 && amount < 100)
            {
                getFiftyRupeesNote(amount);
            }
            if(amount>=20 && amount < 50)
            {
                getTwentyRupeesNote(amount);
            }
            if(amount>=10 && amount <20)
            {
                getTenRupeesNote(amount);
            }
            if(amount>= 5 && amount<10)
            {
                getFiveRupeesNote(amount);
            }
            if(amount >=1 && amount <5)
            {
                getOneRupeesNote(amount);
            }
        }
        
        		

	}

	private static void getOneRupeesNote(int amount) {
		 int quetient = amount/1;
	        int remiander =  amount% 1;

	        int exceedNote = 0;
	        int exceedAmount;
	        int exceedNewAmount;
	        if(quetient>20)
	        {
	            exceedNote = quetient-20;
	            exceedAmount  = exceedNote * 1;
	            exceedNewAmount = exceedAmount + remiander;
	          
	            System.out.println("note for 1 :" + "" + 20);

	        }
	        if(quetient <20)
	        {
	           
	            System.out.println("note for 1  :" + "" + quetient);
	        }
	        if(remiander == 0)
	        {
	            return;
	        }
		
	}

	private static void getFiveRupeesNote(int amount) {
		 int quetient = amount/5;
	        int remiander =  amount% 5;

	        int exceedNote = 0;
	        int exceedAmount;
	        int exceedNewAmount;
	        if(quetient>20)
	        {
	            exceedNote = quetient-20;
	            exceedAmount  = exceedNote * 5;
	            exceedNewAmount = exceedAmount + remiander;
	            System.out.println("note for 5 :" + "" + 20);
	            getOneRupeesNote(exceedNewAmount);

	        }
	        if(quetient<20)
	        {
	           
	            System.out.println("note for 5 :" + "" + quetient);
	        }
	        if(remiander < 5 && remiander >0)
	        {
	            getOneRupeesNote(remiander);
	        }
		
	}

	private static void getTenRupeesNote(int amount) {
		  int quetient = amount/10;
	        int remiander =  amount% 10;

	        int exceedNote = 0;
	        int exceedAmount;
	        int exceedNewAmount;
	        if(quetient>20)
	        {
	            exceedNote = quetient-20;
	            exceedAmount  = exceedNote * 10;
	            exceedNewAmount = exceedAmount + remiander;
	          
	            System.out.println("note for 10 : " +"" + exceedNote);
	            getFiveRupeesNote(exceedNewAmount);

	        }
	        if(quetient<20)
	        {
	          
	            System.out.println("note for 10 : " + "" + quetient);
	        }
	        if(remiander <10 && remiander >0)
	        {
	            getFiveRupeesNote(remiander);
	        }
	}

	private static void getTwentyRupeesNote(int amount) {
		int quetient = amount/20;
        int remiander =  amount% 20;

        int exceedNote = 0;
        int exceedAmount;
        int exceedNewAmount;
        if(quetient>20)
        {
            exceedNote = quetient-20;
            exceedAmount  = exceedNote * 20;
            exceedNewAmount = exceedAmount + remiander;
           
            System.out.println("note for 20 :"  + "" + 20);
            getTenRupeesNote(exceedNewAmount);

        }
        if(quetient<20)
        {
            
            System.out.println("note for 20 :" + "" + quetient);

        }
        if(remiander<20 && remiander >0)
        {
            getTenRupeesNote(remiander);
        }
		
	}

	private static void getFiftyRupeesNote(int amount) {
		 int quetient = amount/50;
	        int remiander =  amount% 50;

	        int exceedNote = 0;
	        int exceedAmount;
	        int exceedNewAmount;
	        if(quetient>20)
	        {
	            exceedNote = quetient-20;
	            exceedAmount  = exceedNote * 50;
	            exceedNewAmount = exceedAmount + remiander;
	           
	            System.out.println("note for 50  " + "" + 20);
	            getTwentyRupeesNote(exceedNewAmount);
 
	        }
	        if(quetient<20)
	        {
	            System.out.println("note for 50  " + "" + quetient);
	        }
	       if(remiander<50 &&  remiander >0)
	        {
	            getTwentyRupeesNote(remiander);
	        }
		
	}

	private static void getOneHundredNote(int amount) {
		 int quetient = amount/100;
	        int remiander =  amount% 100;

	        int exceedNote = 0;
	        int exceedAmount;
	        int exceedNewAmount;
	        if(quetient>20)
	        {
	            exceedNote = quetient-20;
	            exceedAmount  = exceedNote * 100;
	            exceedNewAmount = exceedAmount + remiander;
	           
	            System.out.println("note for 100  " + "" + 20);
	            getFiftyRupeesNote(exceedNewAmount);

	        }
	        if(quetient<20)
	        {
	           
	          System.out.println("note for 100  " + "" + quetient);
	        }
	        if(remiander<100 && remiander >0)
	        {
	            getFiftyRupeesNote(remiander);
	        }
		
	}

	private static void getFiveHundredNote(int amount) {
		 int quetient = amount/500;
	        int remiander =  amount% 500;

	        int exceedNote = 0;
	        int exceedAmount;
	        int exceedNewAmount;
	        if(quetient>20)
	        {
	            exceedNote = quetient-20;
	            exceedAmount  = exceedNote * 500;
	            exceedNewAmount = exceedAmount + remiander;
	          
	            System.out.println("note for 500  :"  + 20);

	            getOneHundredNote(exceedNewAmount);

	        }
	        if(quetient<20)
	        {
	           
	            System.out.println("note for 500  :" + "" + quetient);

	        }
	        if( remiander<500 && remiander >= 0)
	        {
	            getOneHundredNote(remiander);
	        }
		
	}

	private static void getOneThousandsNote(int amount) {
		 int quetient = amount/1000;
	        int remiander =  amount% 1000;

	        int exceedNote = 0;
	        int exceedAmount;
	        int exceedNewAmount;
	        if(quetient>20)
	        {
	           exceedNote = quetient-20;
	           exceedAmount  = exceedNote * 1000;
	           exceedNewAmount = exceedAmount + remiander;
	    
	           System.out.println("note for 1000  : " + "" + 20);
	           getFiveHundredNote(exceedNewAmount);

	        }
	        if(quetient <20)
	        {
	         
	            System.out.println("note for 1000   :" + "" + quetient);

	        }
	         if(remiander<1000 && remiander >=0)
	        {
	            getFiveHundredNote(remiander);
	        }
		
	}

	private static void getTwoThousandsNote(int amount) {

		 int quetient = amount/1000;
	        int remiander =  amount% 1000;

	        int exceedNote = 0;
	        int exceedAmount;
	        int exceedNewAmount;
	        if(quetient>20)
	        {
	           exceedNote = quetient-20;
	           exceedAmount  = exceedNote * 1000;
	           exceedNewAmount = exceedAmount + remiander;
	    
	           System.out.println("note for 2000  : " + "" + 20);
	           getFiveHundredNote(exceedNewAmount);

	        }
	        if(quetient <20)
	        {
	         
	            System.out.println("note for 2000  : " + "" + quetient);

	        }
	         if(remiander<1000 && remiander >=0)
	        {
	            getFiveHundredNote(remiander);
	        }
		
	}

}
