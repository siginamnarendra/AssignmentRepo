package marketNetwork;

public class Commission {
   public static void addCommision(NewMember node, double amount)
    {
        if(node.name.equals("Company"))
        {
            node.Commission = node.Commission + (amount * 0.1);
            System.out.println("Commsion Added to Company: "+amount * 0.1);
        }
        else
        {
            while(!node.name.equals("Company"))
            {
                
                amount/=10.0;
                node.Commission = node.Commission +amount;
                System.out.println("Commsion Added to "+node.name+" : "+amount);
                node = node.parentAddress;
                
            }
        node.Commission = node.Commission + amount/10.0;
        System.out.println("Commsion Added to Company: "+amount * 0.1);
        }
    }
}
