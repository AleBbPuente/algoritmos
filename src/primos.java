
public class primos
{
    public static void main(String[] args) {
        System.out.println("Nümeros Primos:"+"  ");
        for(int i=2;i<100;i++){
            boolean control=true;

            for(int j=2;j<i;j++){
                if(i%j==0)
                    control=false;

            }
            if(control==true)

                System.out.println(" "+i);
        }
    }
}
