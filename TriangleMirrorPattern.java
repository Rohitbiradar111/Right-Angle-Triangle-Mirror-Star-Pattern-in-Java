//This program prints a Mirror Image of Right Angle Triangle Star Pattern in Java

public class TriangleMirrorPattern {
    public static void main(String args[])
    {
        int n = 5;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<=n-1;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}