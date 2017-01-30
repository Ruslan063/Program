package matrix;
import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.err;
import java.math.BigInteger;
public class mat {
 
    public static void main(String[] args) {
        Matrix m=new Matrix(3,3);
        Matrix n=new Matrix(3,3);
        MyInteger intOne=null,inttwo=null;
   
    }
   
}
class Matrix
{
    private int row;
    private int col;
    private Object[][]m;
    Matrix(int row,int col)
    {
        if(row<0||col<0)
        {
            err.println("Row and col must be >=0");
            System.exit(1);
        }
        this.row=row;
        this.col=col;
        m=new Object[row][col];
    }
    private void cheakindex(int i,int j)
    {
        if(i<0||j<0||i>row||j>col)
        {
            err.println("Invalid index");
            System.exit(1);
        }
    }
    private  void set(int r,int  c,Object value)
    {
        cheakindex(r, c);
        m[r][c]=value;
    }
    public  Matrix  add(Matrix n)
    {
        if(row!=n.row||col!=n.col)
        {
            err.println("Size of matriced do not match");
            System.exit(1);
        }
        Matrix p =new Matrix(row, col);
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                p.m[i][j]=((Computable)m[i][j]).add(n.m[i][j]);
            }
        }
        return p;
    }
    public  Matrix subtract(Matrix n)
    {
        if(row!=n.row||col!=n.col)
        {
            err.println("Size of matrices do not math");
            System.exit(1);
        }
        Matrix p =new Matrix(row, col);
         for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                p.m[i][j]=((Computable)m[i][j]).subtract(n.m[i][j]);
            }
        }
        return p;
    }
    @Override
    public String toString()
    {
        StringBuffer buf=new StringBuffer();
         for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                buf.append(m[i][j].toString() +"\t");
            }
            buf.append("\n");
        }
        return  new String(buf);
         
    }
   
}
 class MyInteger implements  Computable
 {
     private int value;
    public MyInteger(int value)
    {
        this.value=value;
    }
     @Override
    public String toString()
    {
        return Integer.toString(value);
    }
    @Override
    public Object add(Object m)
    {
        return new MyInteger(value+((MyInteger)m).value);
    }
    @Override
    public Object subtract(Object m)
    {
        return new MyInteger(value-((MyInteger)m).value);
    }
     
 }
 
interface Computable
{
    public  Object add(Object thisObject);
    public  Object subtract(Object thisObject);
 
}
