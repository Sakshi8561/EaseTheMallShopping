class Fridge extends Sm implements Refresh
{
	String type="3 door";
	String make= "samsung";
	String capacity="600 liters";
	Fridge()
	{
		super();
	}
	Fridge(int itemno,String desc,double price,int qty,String type,String make,String capacity)
	{
		super(itemno, desc,price,qty);
	
	this.type=type;
	this.make=make;
	this.capacity=capacity;
    }
    public void drink()
    {
        System.out.println(" you can drink Free cold drink you like ");
    }
    public void eat() 
    {
        System.out.println(" you can eat Sweets Free");
    }
    public void gift()
    {
        amt=price*qty;
        if(amt<1000)
        System.out.println("**** you get a gift hand watch:***");
    }
    public void discount()
    {
        amt=price*qty;
        if(amt>1000)
        {	
        dis=amt*.10;
     System.out.println("Discount:"+dis);
        }  
    }
    void calbill()
        {
            if(price<1000)
            { 
               
                System.out.println("Total amount=:"+amt);
                gift();
                System.out.println("Total  amount pluse gift="+amt);
                System.out.println("If Your Total Purches Amount More Than 1000 you get 10% Discount  ");
            }
            else
                if(price>1000)
            {
                totprice=amt-dis;
            System.out.println("Total price after discount="+totprice);
            System.out.println("Congratulation You Will Get A Addtional Discount" );
             System.out.println("As Your Total Purches Amount More Than 1000  ");
            }
        }
        void dispFridge()
        {
            System.out.println("Lotues shop in 3nd floor");
            sm();
		System.out.println("Type="+type);
		System.out.println("Manufacture="+make);
		System.out.println("Capacity="+capacity);
            drink();
            eat(); 
            System.out.println("Origianal price per pice="+price); 
            discount();
            calbill();
                     
       }
} 
class Tv extends Sm implements Refresh
{
	String make="sony";
	String size="40 inches";
	String type="oled";
	Tv()
	{
		super();
	}
    Tv(int itemno,String desc,int price,int qty,String make,String size,String type)
	{
		super(itemno,desc,price,qty);
			this.make=make;
		    this.size=size;
			this.type=type;
	}
    public void drink()
    {
        System.out.println(" you can drink Free cold drink you like ");
    }
    public void eat() 
    {
        System.out.println(" you can eat Sweets free ");
    }
    public void gift()
    {
        amt=price*qty;
        if(amt<1000)
        System.out.println("**** you get a gift Smart watch:****");
        else
        discount(); 
    }
    public void discount()
    {
        amt=price*qty;
        if(amt>1000)
        {	
        dis=amt*.10;
     System.out.println(" Discount Amount:"+dis);
        }  
    }
    void calbill()
        {
            if(price<1000)
              {  
                System.out.println("<< Total  amount is:"+amt);
                gift();
                System.out.println("Total  amount pluse gift="+amt);
                System.out.println("If Your Total Purches Amount More Than 1000 you get 10% Discount  ");}
            else
                if(price>1000)
            {
                totprice=amt-dis;
                System.out.println("Total price after  discount="+totprice);
                System.out.println("Coagulation You Will Get A Addtional Discount" );
                 System.out.println("As Your Total Purches Amount More Than 1000  ");
            }
        }
        void disPlayTv()
        {  
        System.out.println("Lotus shop 3nd floor");
            sm();
            System.out.println("Manufacture="+make);
	 	System.out.println("Size="+size);
		System.out.println("Type="+type);
            drink();
            eat();     
            System.out.println("Origianal price per pice="+price);
            discount();
            calbill();
           
       }
}
class Fridge1 extends Sm implements Refresh
{  
        String type="3 door";
        String make= "samsung";
        String capacity="600 liters";
    
        Fridge1()
        {
            super();
        }
        Fridge1(int itemno,String desc,double price,int qty,String type,String make,String capacity)
        {
            super(itemno, desc,price,qty);
        
        this.type=type;
        this.make=make;
        this.capacity=capacity;
        }
        public void drink()
        {
            System.out.println(" you can drink any Free cold drink you like ");
        }
        public void eat() // compasare
        {
            System.out.println(" you can eat Free Sweets ");
        }
        public void gift()
        {
            amt=price*qty;
            if(amt<1000)
            System.out.println("**** you get a gift hand watch:****");
            
            discount(); 
        }
        public void discount()
        {
            amt=price*qty;
            if(amt>1000)
            {	
            dis=amt*.10;
         System.out.println("Discount Amount:"+dis);
            }  
        }
        void calbill()
            {
                if(price<1000)
                { 
                    System.out.println("Total amount is:"+amt);
                    gift();
                    System.out.println("Total  amount pluse gift="+amt);
                    System.out.println("If Your Total Purches Amount More Than 1000 you get 10% Discount  ");
                
                }
                else
                    if(price>1000)
                {
                    
                    discount();
                    totprice=amt-dis;
               
                System.out.println("Total price after discount="+totprice);
                System.out.println("Coagratulation You Will Get A Addtional Discount" );
                 System.out.println("As Your Total Purches Amount More Than 1000  ");
          
                }
            }
            void dispFridge1()
            {
                System.out.println("Ruchi  Electronic 2nd floor");
                sm();
            System.out.println("Type="+type);
            System.out.println("Manufacture="+make);
            System.out.println("Capacity="+capacity);
                drink();
                eat();
                System.out.println("Origianal price per pice="+price);
                discount();
                calbill();      
           }
         }
    class StructureOfMall extends Sm  implements Refresh
    {
        
        public void drink()
        {
            System.out.println(" you can drink any cold drink you like ");
        }
        public void eat() 
        {
            System.out.println(" you can eat ");
        }
        void calbill()
        {
          System.out.println("ToDay Offer");
          System.out.println("1.Floor Big Bazzar,shop no 1= LG TV 50% off the Price ");
          System.out.println("3.Floor Move Zone Buy 2 Movie Ticket Cold Drink Free ");

        }
        void mall()
        {

        System.out.println("Here Are 3 Flors");
        System.out.println("1.Floor have 4 shops");
        System.out.println("1.Floor:Big Bazzar(shop no 1):For Gorsari shopping");
        System.out.println("1.Floor:Beauty Girls(shop no 2):For Beauty Products ");
        System.out.println("1.Floor: Mens Wear shop no 3");
        System.out.println("2.Floor have (2 shops) ");
        System.out.println("2. Floor Ruchi Electronic(Shop no 4) ");
        System.out.println("2. Gaming Zone(Shop no 5) ");
        System.out.println("3 Floor have 2 shop ");
        System.out.println("3.Floor Lotus (shop no 6):For Electronic items'");
        System.out.println("3. Movie Zone");
        } 

}

class kids1 extends Sm implements Refresh
    {
        String type="kids wear";
        String size="26";
        String Quality="super";
    
    kids1 ()
        {
        super();
        }
    kids1 (int itemno,String desc,double price,int qty,String type,String size,String Quality)
        {
        super(itemno,desc,price,qty);
        this.type=type;
        this.size=size;
        this.Quality=Quality;
        }
        public void drink()
        {
            System.out.println(" you can drink Free cold drink you like ");
        }
        public void eat()
        {
            System.out.println(" you can eat Sweets Free ");
        }
        public void gift()
        {
            amt=price*qty;
            if(amt<500)
            System.out.println("**** you get a gift Smart watch:****");
            
            discount(); 
        }
        public void discount()
        {
            amt=price*qty;
            if(amt>499)
            {	
            dis=amt*.10;
         System.out.println(" Discount:"+dis);
            }  
        }
        void calbill()
        {
            if(price<500)
            { 
                System.out.println("total amount is:"+amt);
                gift();
                System.out.println("Total  amount pluse gift="+amt);
                System.out.println("If Your Total Purches Amount More Than 1000 you get 10% Discount  ");
               gift();
            }
            else
                if(price>500)
            {
                totprice=amt-dis;
            System.out.println(" total amount is:"+totprice);
            System.out.println("total price after discount="+totprice);
            System.out.println("Coagratulation You Will Get A Addtional Discount" );
            System.out.println("As Your Total Purches Amount More Than 500  ");
     
            }
        }
            void disPlayKids()
            {
            System.out.println(" ****Little Fair****");
             System.out.println("Description="+desc);
            System.out.println("Quantity="+qty);
            System.out.println("Type="+type);
            System.out.println("Size="+size);
            System.out.println("Quality="+Quality);
            drink();
            eat();
            System.out.println("Origianal price per pice="+price);
            
            discount();
            calbill();
       }
    }       
