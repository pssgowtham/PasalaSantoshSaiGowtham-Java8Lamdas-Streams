package com.epam.lamdas_streams;
import java.util.ArrayList;

public class App 
{
	public double avg()
    {
        double[] arr = {19, 12.89, 16.5, 200, 13.7};
        double total = 0;

        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        	total = total + arr[i];
        }
        System.out.println();
        double average = total / arr.length;
        return average;
    }
    public ArrayList<String> san(){
        String[] s={"apple","app","amy","baka","ittop","all","mon"};
        ArrayList<String> ans = new ArrayList<String>();
        for(int i=0;i<s.length;i++)
            System.out.print(s[i]+" ");
        System.out.println();
        for(int i=0;i<s.length;i++)
            if(s[i].charAt(0)=='a' && s[i].length()==3)
                ans.add(s[i]);
        System.out.println("List of Strings start with 'a' with length of 3: ");
        return ans;
    }
    static boolean isPalindrome(String str) 
    { 
        int i = 0, j = str.length() - 1; 
        while (i < j) { 
            if (str.charAt(i) != str.charAt(j)) 
                return false; 
            i++; 
            j--; 
        }
        return true; 
    } 
    public ArrayList<String> palin(){
        String[] s={"abba","app","amyma","baka","ittopotti","allla","monon"};
        ArrayList<String> ans = new ArrayList<String>();
        for(int i=0;i<s.length;i++)
            System.out.print(s[i]+" ");
        System.out.println();
        for(int i=0;i<s.length;i++)
            if(isPalindrome(s[i]))
                ans.add(s[i]);
        System.out.println("List of palindrome strings: ");
        return ans;
    }
    public static void main(String[] args)
    {
        System.out.println("1st mini task=>");
        App ittop=new App();
        System.out.format("Average of list of integers: %.3f", ittop.avg());
        System.out.println("\n");
        System.out.println("2nd mini task=>");
        for(String i:ittop.san())
            System.out.print(i+" ");
        System.out.println("\n");
        System.out.println("3rd mini task=>");
        for(String i:ittop.palin())
            System.out.print(i+" "); 
    }
}
