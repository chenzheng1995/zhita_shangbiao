package com.zhita.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
	

	public static void main(String[] args) throws IOException {
		
	   int intPhone = 0;
	   String beiyong = "";
	   StringBuffer newPhone = new StringBuffer();
       StringBuffer phone = new StringBuffer("13486070402");
       String yi = phone.substring(0,1);
       String er = phone.substring(1,2);
       String san = phone.substring(2,3);
       String si = phone.substring(3,4);
       String wu = phone.substring(4,5);
       String liu = phone.substring(5,6);
       String qi = phone.substring(6,7);
       String ba = phone.substring(7,8);
       String jiu = phone.substring(8,9);
       String shi = phone.substring(9,10);
       String shiyi = phone.substring(10,11);
       
       beiyong = yi;
       yi = qi;
       qi = beiyong;
       
       beiyong = er;
       er = ba;
       ba = beiyong;
       
       beiyong = san;
       san = jiu;
       jiu = beiyong;
       
       beiyong = si;
       si = shi;
       shi = beiyong;
       
       beiyong = wu;
       wu = shiyi;
       shiyi = beiyong;
       
       List<String> list = new ArrayList<>();
       list.add(yi);
       list.add(er);
       list.add(san);
       list.add(si);
       list.add(wu);
       list.add(liu);
       list.add(qi);
       list.add(ba);
       list.add(jiu);
       list.add(shi);
       list.add(shiyi);

       for (String string : list) {
    	intPhone = Integer.parseInt(string);
		if(intPhone>0&&intPhone<10) {
			intPhone=intPhone+1;
		}
		string = intPhone+"";
		newPhone = newPhone.append(string);
	}

       System.out.println(newPhone);
       
	}
}
