import java.util.*;
public class Profit_Loss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double cp,sp,acp,oe,p,l,pper,lper;
        System.out.println("Enter the cost price on the object : ");
        cp = sc.nextDouble();
        System.out.println("Enter the selling price on the object : ");
        sp = sc.nextDouble();
        System.out.println("Enter the overhead expenses (if any) : ");
        oe = sc.nextDouble();
        sc.close();
        if(oe == 0)
        {
            if(sp > cp)
            {
                p = sp - cp;
                pper = (p / cp) * 100;
                System.out.println("Profit : " +p);
                System.out.println("Profit percentage (in %) : " +Math.round(pper));
            }
            else
            {
                l = cp - sp;
                lper = (l / cp) * 100;
                System.out.println("Loss : " +l);
                System.out.println("Loss Percentage(in %) : " +Math.round(lper));
            }
        }
        else
        {
            acp = cp + oe;
            if(sp > cp)
            {
                p = sp - acp;
                pper = (p / acp) * 100;
                System.out.println("Profit : " +p);
                System.out.println("Profit percentage (in %) : " +Math.round(pper));
            }
            else
            {
                l = acp - sp;
                lper = (l / acp) * 100;
                System.out.println("Loss : " +l);
                System.out.println("Loss Percentage(in %) : " +Math.round(lper));
            }
        }
    }
}