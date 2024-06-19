package com.prashanth.battu;

public class test
{

	public static void main(String[] args)
	{
		String product="shirt";
		String code="57w73u";
		int price=400;
		System.out.println("price="+price);
		int quantity=5;
		int total=price*quantity;
		System.out.println("total price with quantity"+total);
		String payment= "debitcard";
		double total_price=0;
		double disconut_price=0;
		if(product=="shirt")
		{
		if(total<250)
		{
			System.out.println("discount percentage by price:2% discout");
			total_price=total-(total/100)*2;
			System.out.println("total price after price discount: "+total_price);
		}
		else if(total<500)
		{
			System.out.println("discount percentage by price:5% discount");
			total_price=total-total/100*5;
			System.out.println("total price after price discount: "+total_price);
		}
		else if(total<1000)
		{
			System.out.println("discount percentage by price:10 discount");
			total_price=total-(total/100*10);
			System.out.println("total price after price discount: "+total_price);
		}
		else
		{
			System.out.println("discount percentage by price: 25% discount");
			total_price=total-(total/100*25);
			System.out.println("total price after price discount: "+total_price);
		}
		//payment method
		if(payment=="debitcard")
		{
			System.out.println("discont prcentage with card: 25% discount");
			disconut_price=total_price-total_price/100*25;
			System.out.println("total amount with payment discount "+disconut_price);
		}
		else if(payment=="paytm")
		{
			System.out.println("discont prcentage with card:39% discount");
			disconut_price=total_price-total_price/100*39;
			System.out.println(disconut_price);
		}
		if(payment=="phone pay")
		{
			System.out.println("discont prcentage with card:20% discount");
			disconut_price=total_price-total_price/100*20;
			System.out.println(disconut_price);
		}
		if(payment=="creditcard")
		{
			System.out.println("discont prcentage with card:50% discount");
			disconut_price=total_price-total_price/100*50;
			System.out.println(disconut_price);
		}
		double gst=(disconut_price/100*9)+disconut_price;
		System.out.println("total amount with gst "+gst);
		}
		
		
		else 
		{	
			if(total<250)
		{
			System.out.println("discount percentage by price:2% discout");
			total_price=total-(total/100)*2;
			System.out.println("total price after price discount: "+total_price);
		}
		else if(total<500)
		{
			System.out.println("discount percentage by price:5% discount");
			total_price=total-total/100*5;
			System.out.println("total price after price discount: "+total_price);
		}
		else if(total<1000)
		{
			System.out.println("discount percentage by price:10 discount");
			total_price=total-(total/100*10);
			System.out.println("total price after price discount: "+total_price);
		}
		else
		{
			System.out.println("discount percentage by price: 25% discount");
			total_price=total-(total/100*25);
			System.out.println("total price after price discount: "+total_price);
		}
		//payment method
		if(payment=="debitcard")
		{
			System.out.println("discont prcentage with card: 25% discount");
			disconut_price=total_price-total_price/100*25;
			System.out.println("total amount with payment discount "+disconut_price);
		}
		else if(payment=="paytm")
		{
			System.out.println("discont prcentage with card:39% discount");
			disconut_price=total_price-total_price/100*39;
			System.out.println(disconut_price);
		}
		if(payment=="phone pay")
		{
			System.out.println("discont prcentage with card:20% discount");
			disconut_price=total_price-total_price/100*20;
			System.out.println(disconut_price);
		}
		if(payment=="creditcard")
		{
			System.out.println("discont prcentage with card:50% discount");
			disconut_price=total_price-total_price/100*50;
			System.out.println(disconut_price);
		}
		double gst=(disconut_price/100*9)+disconut_price;
		System.out.println("total amount with gst "+gst);
		}

	}

}
