import java.util.*;
abstract class Sm
{
    int itemno=11;
 String desc="generic items";
 double price=500;
 int qty=5;
 double amt;
 double dis=0;
 double totprice;
 Sm()
    {
    }
    Sm(int itemno, String desc,double price,int qty)
    {
        this.desc=desc;
        this.price=price;
        this.qty=qty;
    }
    abstract void calbill();
    void sm(){
   System.out.println("Description="+desc);
   System.out.println("Quantity ="+qty);
    }
    void ascellator()
    {
        System.out.println("go up and doen");
    }
}

    class Garments extends Sm implements Refresh
    {
        String type="kids wear";
        String size="26";
        String Quality="super";
    Garments ()
        {
        super();
        }
    Garments (int itemno,String desc,double price,int qty,String type,String size,String Quality)
        {
        super(itemno,desc,price,qty);
        this.type=type;
        this.size=size;
        this.Quality=Quality;
        }
        public void drink()
        {
            System.out.println(" you can drink free cold drink you like ");
        }
        public void eat()
        {
            System.out.println(" you can eat sweets free ");
        }
        public void gift()
        {
            amt=price*qty;
            if(amt<500)
            System.out.println("**** you get a gift hand watch:****");
            
            discount(); 
        }
        public void discount()
        {
            amt=price*qty;
            if(amt>499)
            {	
            dis=amt*.10;
         System.out.println(" Discount Amount:"+dis);
            }  
        }
        void calbill()
        {
            if(price<500)
            { 
                System.out.println("Total amount :"+amt);
               gift();
               System.out.println("Total  amount pluse gift="+amt);
               System.out.println("If Your Total Purches Amount More Than 1000 you get 10% Discount  ");
            }
            else
                if(price>499)
            {
                totprice=amt-dis;
            System.out.println("Total price after discount="+totprice);
            System.out.println("Coagulation You Will Get A Addtional Discount" );
             System.out.println("As Your Total Purches Amount More Than 500  ");
            }
        }	
        void displaygarments()
        {
            System.out.println("new Style shop 1nd floar");
            System.out.println("Description="+desc);
            System.out.println("Quantity="+qty);
            System.out.println("Type="+type);
            System.out.println("Size="+size);
            System.out.println("Quality="+Quality);
            drink();
            eat();
            System.out.println("origianal price per pice="+price);
            discount();
            calbill();  
       }
    }
   

 public class EasyTheMallShopping

    {
        public static void main(String args[])
        {
        System.out.println(" Hellow Welcome to Our Shoping Mall");
        System.out.println("Our Mall speciality is if you shoping in our any shops of mall you Will");
        System.out.println(" Definitely Get Gifts or Discounts");
         
      try (//  Object system;int 
        Scanner y = new Scanner(System.in)) {
            int ch;

            System.out.println("In Our Mall, There Are 3 Categories Of Shops");
            System.out.println("1.'Cloth Shoping' ");
            System.out.println("2.'Electronic Shoping'");
            System.out.println("3.'ToDay Special Offers From Each Floor Shops And Mall Map ");
            ch=y.nextInt();
        switch (ch) {
            case 1:{
            System.out.println("Detailes Shop");
            Garments ob=new Garments(101,"kids top",800,1,"kids wear","26","super");
            kids1 kd=new kids1(101,"kids top",700,1,"kids wear","26","super");
            if(ob.price==kd.price)
            {
            System.out.println(" you can go 2 Shops there price is Same  ");
           // System.out.println(" Detailes Shops  ");
            System.out.println("Detailes of 1 Shop");
             ob.displaygarments();
             System.out.println(" Detailes of 2 shop ");
             kd.disPlayKids();}
             else
             if(ob.price>kd.price){
             System.out.println(" Kids wear ");
             ob.displaygarments();}
             else
             kd.disPlayKids();;
             break;}

           case 2:
            System.out.println("Electronics Shop");
            int j;
          
                System.out.println("Hellow Here is Two Categories");
                System.out.println("1.Fridge ");
                System.out.println("2.Tv ");
                j=y.nextInt();
            switch (j) {
                case 1:
            {
              
			Fridge1 ob1= new Fridge1(121,"electronic item",8000,1,"2 doors","samsung","600");
			Fridge ob2=new Fridge(121,"electronic item",8000,1,"2 doors","samsung","600");
           if(ob1.price==ob2.price)
           {
           System.out.println(" you can go 2 Shops there price Same  ");
           System.out.println(" Detailes of Fridge  ");
            ob1.dispFridge1();
            System.out.println(" Detailes of Fridge  ");
            ob2.dispFridge();}
            else
            if(ob1.price>ob2.price){
            System.out.println(" Detailes of Fridge  ");
		    ob2.dispFridge();}
            else
            ob1.dispFridge1();}
            break;
            case 2:
            {
            System.out.println(" Detailes of Tv ");
			Tv ob2 =new Tv(102,"electronic item",600,1,"LG","40 ","LCD");
			ob2.disPlayTv();}break;}
            break;
        
            
            case 3:
           StructureOfMall ob3 = new StructureOfMall();
           ob3.calbill();
           ob3.mall();
           ob3.drink();
           ob3.eat();
                break;}
        }   
    }
        
    }
    

