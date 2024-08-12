package com.selenium.seleniumtesting.algo;

public class longestpalindrome {
    public String longestPalindrome(String s) {
        // babad
        //
        int n=s.length();
        String res="";
        if(n<=1){
            return s;
        }
        int k=0;
        int maxPalLen=0;
        int pLeft=0;
        int pRight=0;
        for(int i=1;i<n;i++){
            int left=k;
            int right=i;
            boolean isPalindrome=true;
            int cnt=0;
            while(left<=right){
                if(s.charAt(left)!=s.charAt(right)){
                    isPalindrome=false;
                    break;
                }
                left++;
                right--;
                cnt++;
            }
            if(isPalindrome){
                if(cnt>maxPalLen){
                    pLeft=k;
                    pRight=i+1;
                    maxPalLen=cnt;
                }
            }
            else{
                if(i<n-1){
                    if(s.charAt(k)!=s.charAt(i+1)){
                        k++;
                    }
                }
            }

        }
        res=s.substring(pLeft,pRight);
        if(res.length()==0){
            res=s.substring(0,1);
        }
        return res;

    }

    public static void main(String[] args) {
        String s1="abcba";
        longestpalindrome longestpalindrome=new longestpalindrome();
       String res= longestpalindrome.longestPalindrome(s1);
        System.out.println(res);

    }
}
