public class labelledLoop {
    public static void main(String args[])
    {
        int i;
        outer:
            for(i=1; i<=5; i++)
            {
                System.out.println();
                for(int j=1; j<3; j++)
                {
                    if(i==j)
                    {
                        continue outer;
                    }
                }
        
            
        }
    }
    
}
