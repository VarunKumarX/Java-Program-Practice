package main.java;
import java.util.Arrays;
import java.util.Scanner;
public class Practice262 {
    public static void parray( int [] arr){
        for ( int i : arr){
            System.out.print(i+" ");
        }
        System.out.println("\n"+Arrays.toString(arr)+"\n"+"Printed Array using fn");

    }
    public static void main (String args[]){
        Scanner sc= new Scanner (System.in);
//        System.out.print("Enter numbers: ");
//        long r=2;
//        int n=sc.nextInt();
//        int n2=sc.nextInt();
//        int nn=n*n2;
//        int bitmask=1<<n2;

        int [] bub={188,15,-01,7,-55,20};
        System.out.println(Arrays.toString(bub)+"\n");
//        int [] bub= new int [n];
        int temp;
//        for (int i=0;i<n;i++){
//            bub[i]=sc.nextInt();
//        }
//        for (int x:bub) System.out.print(x+" ");
//        System.out.println("\n"+Arrays.toString(bub)+"\n\n");




//        //Selection
//        for( int i=0;i<bub.length-1;i++){
//            int smallest=i;
//            for( int j=i+1;j<bub.length;j++){
//                if(bub[smallest]>bub[j]){
//                    smallest=j;
//                }
//            }
//            //Swap
//            temp=bub[smallest];
//            bub[smallest]=bub[i];
//            bub[i]=temp;
//            System.out.println(i+" "+Arrays.toString(bub));
//        }

//        //insertion
//        for( int i=1;i<bub.length;i++){
//            int current=bub[i];
//            int j=i-1;
//            while( j>=0 && current<bub[j]){
//                bub[j+1]=bub[j];
//                j--;
//            }
//            bub[j+1]=current;
//            System.out.println(i+" "+Arrays.toString(bub)+"\n");
//        }

//        //bubble
//        for ( int i=0;i<bub.length-1;i++){
//            for( int j=0; j<bub.length-i-1; j++){
//                if(bub[j]>bub[j+1]){
//                    temp=bub[j];
//                    bub[j]=bub[j+1];
//                    bub[j+1]=temp;
//                }
//                System.out.println(i+" "+Arrays.toString(bub)+"\n");
//            }
//
//        }

//        //insertion
//        for ( int i=1; i<bub.length; i++){
//            int current=bub[i];
//            int j=i-1;
//            while(j>=0 && current<bub[j]){
//                //shifting sorted array forward / making space for current int sorted part
//                bub[j+1]=bub[j];
//                j--;
//            }
//            bub[j+1]=current;
//            System.out.println(i+" "+Arrays.toString(bub));
//        }
//        //selection
//       for( int i=0;i<bub.length-1;i++){
//           int smalle=i;
//           for( int j=i+1;j<bub.length;j++){
//               if(bub[smalle]>bub[j]){
//                   smalle=j;
//               }
//           }
//           //swap
//           temp=bub[smalle];
//           bub[smalle]=bub[i];
//           bub[i]=temp;
//           System.out.println(Arrays.toString(bub)+"\n");
//
//       }

//        //Selection Sort
//        for(int i=0; i<bub.length-1; i++){
//            int smallest=i;
//            for( int j=i+1; j<bub.length;j++){
//                if(bub[smallest]>bub[j]){
//                    smallest=j;
//                }
//            }
//            //Swap
//            temp=bub[smallest];
//            bub[smallest]=bub[i];
//            bub[i]=temp;
//            System.out.println(i+" "+Arrays.toString(bub)); // to see updation
//        }

        //bubble
//        for( int i=0;i<bub.length-1;i++){
//            for ( int j=0;j<bub.length-1-i;j++){
//                if( bub[j]>bub[j+1]){
//                    temp=bub[j];
//                    bub[j]=bub[j+1];
//                    bub[j+1]=temp;
//                }
//                System.out.println(Arrays.toString(bub));
//            }
//            System.out.println("next");
//        }

//        // print all bits
//        for (int i=3;i>=0;i--){
//            if(((1<<i)&n)==0) System.out.print("0 ");
//            else System.out.print("1 ");
//        }
//        //update
//        int bitcheck=((1<<n2)&n);
//        if (bitcheck==0){
//            //set command
//            System.out.println("set "+((1<<n2)|n));
//        }
//        else{
//            //clear
//            System.out.println("clear "+((~(1<<n2))&n));
//        }
//
//        // get bit
//        if ((((1<<n2)&n))==0)System.out.println("zero");
//        else  System.out.println("one");
//
//        //set bit
//        System.out.println((1<<n2)|n);
//
//        //clear
//        System.out.println((~(1<<n2))&n);

//        //StringBuilderReverse
//        StringBuilder sb= new StringBuilder("MAXIMUM");
//        System.out.println(sb);
//
//        char first, last;
//        for( int i=0; i<(sb.length()/2); i++){
//            first=sb.charAt(i);
//            last=sb.charAt(sb.length()-1-i);
//            sb.setCharAt(i,last);
//            sb.setCharAt(sb.length()-1-i,first);
//        }
//        System.out.println(sb);

//        //stringReverse
//        System.out.println("Enter String");
//        String s=sc.nextLine();
//
//        char temp;
//        String tem="";
//        for( int i=s.length()-1; i>=0; i--){
//            tem=tem+s.charAt(i);
//            System.out.print(s.charAt(i));
//        }
//        System.out.println("\n\n"+tem);

//        int [] [] matrixx = new int [n][n2];
//        //input
//        for ( int i =0; i<n; i++){
//            for ( int j=0; j<n2; j++){
//                matrixx[i][j]=sc.nextInt();
//            }
//            System.out.println();
//        }
//        System.out.println("Our Matrix");
//        //output
//        for ( int i=0; i<n; i++){
//            for ( int j=0; j<n2; j++){
//                System.out.print(matrixx[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//        //find x
//        int fi=sc.nextInt();
//        for ( int i=0; i<n; i++){
//            for ( int j=0; j<n2; j++){
//                if(matrixx[i][j]==fi){
//                    System.out.println("indices position ("+i+","+j+")");
//                    break;
//                }
//            }
//        }

//        int limit= Math.abs(n2);
//        long ans=n;
//        // exponential
//        for ( int i=1; i<limit; i++){
//            ans=ans*n;
//            System.out.print(ans+" ");
//        }
//        if ( n2<0){
//            ans=1/ans;
//        }
//        System.out.println(ans);

//        //pascal
//        for(int i=0; i<n;i++){
//            for ( int j=0; j<n-i; j++) System.out.print(" ");
//            int no=1;
//            for ( int j=0; j<=i; j++){
//                System.out.print(no+" ");
//                no=no*(i-j)/(j+1);
//            }
//            System.out.println();
//        }

//        for(int i=1; i<=n && i<=n2; i++){
//            if(n%i==0 && n2%i==0) nn=i;
//        }
//        System.out.println(nn);
//
//
//        while(n!=n2){
//            if (n>n2) n=n-n2;
//            else n2=n2-n;
//        }
//        System.out.println(n);
//
//        System.out.println("LCM: "+(nn)/n);
//          fibonaci
//        int a=0,b=1,c;
//        for ( int i=1;i<=n;i++){
//            System.out.println(a+" ");
//            c=a+b;
//            a=b;
//            b=c;
//        }

//        double ans=1;
//        int power= Math.abs(n2);
//        for( int i =1;i<=power;i++){
//            ans=n*ans;
//            System.out.print(ans+" ");
//        }
//        if(n2>0) System.out.println("\n\nAnswer is: "+ans);
//        else{
//            ans=1/ans;
//            System.out.println("\n\nAnswer is: "+ans);
//        }

//        if (n<2){ System.out.println("Invalid input"); return;}
//
//        if (n==2) {System.out.println("Prime1"); return;}
//
//        Boolean IsPrime = true;
//        if (n%2==0){ IsPrime = false;}
//        else {
//            int limit = (int) Math.sqrt(n);
//
//            for (int i = 3; i <= limit; i += 2) {
//                if (n % i == 0) {
//                    IsPrime = false;
//                    break;
//                }
//            }
//
//        }
//        if (IsPrime==false) System.out.println("Not Prime3");
//        else System.out.println("Prime4");


//        if (n<0){
//            System.out.print("No factorial for negative");
//            return;
//        }
//
//        long sum =1;
//        for ( int i=n; i>=2; i--){
//            sum*=i;
//            System.out.print(sum+" ");
//        }
//        System.out.println("\n\nAnswer: "+sum);

        //palindromic
//        for ( int i =1; i<=n; i++){
//            for ( int j=n-1; j>=i; j--) System.out.print("  ");
//            for ( int j=i; j>=1; j--) System.out.print(j+" ");
//            for ( int j=2;j<=i; j++ ) System.out.print(j+" ");
//            System.out.println();
//        }


//        for (int i =1;i<=n;i++){
//            for (int j=n-1;j>=i;j--) System.out.print(" ");
//            for (int j=1; j<=i; j++) System.out.print(i+" ");
//            System.out.println();
//        }


//        for (int i=2; i<=n;i+=2) System.out.println(i);
//        for( int i=1;i<=n;i++){
//            r=2*i;
//            if (r<=n)
//            System.out.println(r);
//
//        }

//        if(n%2==0){
//            System.out.println("even");
//        }
//        else{
//            System.out.println("odd");
//        }
//
//        //hollow diamond
//        for (int i=1; i<=n; i++){
//            for (int j=1; j<=n-i; j++) System.out.print("  ");
//            for (int j=1; j<=(2*i)-1; j++) {
//                if(j==1||j==(2*i)-1) System.out.print("^ ");
//                else System.out.print("  ");
//            }
//            System.out.println();
//        }
//        for (int i=n-1; i>=1; i--){
//            for (int j=1; j<=n-i; j++) System.out.print("  ");
//            for (int j=1; j<=(2*i)-1; j++){
//                if(j==1||j==(2*i)-1) System.out.print("^ ");
//                else System.out.print("  ");
//            }
//            System.out.println();
//        }


//        for (int i=1; i<=n; i++){
//            for (int j=n; j>i; j--) System.out.print("  ");
//            for (int j=1; j<=(2*i)-1; j++) System.out.print("* ");
//            System.out.println();
//        }
//        for (int i=n-1; i>=1; i--){
//            for (int j=n; j>i; j--) System.out.print("  ");
//            for (int j=1; j<=(2*i)-1; j++) System.out.print("* ");
//            System.out.println();
//        }

//        for (int i=1;i<=n;i++){
//            for (int j=n; j>i;j--){
//                System.out.print(" ");
//            }
//            for (int j=1; j<=i; j++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }

//        for (int i=1;i<=n;i++){
//            for (int j=1; j<=i;j++){
//                if (j==1 || j==i)
//                System.out.print("* ");
//                else System.out.print("  ");
//            }
//            for (int j=1; j<=2*(n-i); j++){
//                System.out.print("  ");
//            }
//            for (int j=1; j<=i; j++){
//                if (j==1 || j==i)
//                    System.out.print("* ");
//                else System.out.print("  ");
//            }
//            System.out.println();
//        }
//        for (int i=n;i>=1;i--){
//            for (int j=1; j<=i;j++){
//                if (j==1 || j==i)
//                    System.out.print("* ");
//                else System.out.print("  ");
//            }
//            for (int j=1; j<=2*(n-i); j++){
//                System.out.print("  ");
//            }
//            for (int j=1; j<=i; j++){
//                if (j==1 || j==i)
//                    System.out.print("* ");
//                else System.out.print("  ");
//            }
//            System.out.println();
//        }
//        int num;
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                int sum=i+j;
//                if (sum%2==0)
//                System.out.print(1+" ");
//                else
//                    System.out.print(0+" ");
//            }
//            System.out.println();
//        }

//        char in;
//        do{
//            System.out.print("Enter marks: ");
//            int marks=sc.nextInt();
//            if (marks>=90) System.out.println("this is good");
//            else if (marks<=89 && marks>=60) System.out.println("also good");
//            else System.out.println("bad");
//
//            System.out.println("Add more marks\n press y for yes | n for no");
//            in=sc.next().charAt(0);
//        }while(in =='y');


        sc.close();

    }
}
