

import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class AppBai9 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("nhập vào 1 chuỗi");
		String chuoi=sc.nextLine();
		int demso=0,demchuhoa=0,demchuthuong=0;
		System.out.println(" chuỗi vừa nhập là: "+chuoi);
		int dodai=chuoi.length();
		for(int i=0;i<dodai;i++)
			{
				if(Character.isUpperCase(chuoi.charAt(i)))
				{
					demchuhoa++;
				}
				if(Character.isLowerCase(chuoi.charAt(i)))
				{
					demchuthuong++;
				}
				if(Character.isDigit(chuoi.charAt(i))) // ktra kí tự đó có là con số k//
				{
					demso++;
				}
			}
		int kitukhac=dodai-demchuhoa-demchuthuong-demso;
		System.out.println("có "+demchuhoa+" kí tự in hoa");
		System.out.println("có "+demchuthuong+" ki tu chu thuong");
		System.out.println("có "+demso+" kí tự số");
		System.out.println("có "+kitukhac+" kí tự khác");// TODO code application logic here
    }
}
