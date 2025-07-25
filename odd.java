public class odd {
    public static void main(String[] args) {
        int n=3;
        if(n%2==0)
        {
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        if(n%2!=0)
        {
            System.out.println("Werid");
        }
        else if (n>=2 && n<=5) 
        {
            System.out.println("Not Werid");
        }

        else if (n>=6 && n<=20)
        {
            System.out.println("Werid");
        } 
        else if(n%2==0 && n>=20)
        {
            System.out.println("Not Werid");
        }
    }
    
}
