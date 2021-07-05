import java.util.HashMap;
import java.util.Map;

public class demo {
    public static void main(String[] args) {
        Map<Bigram,Integer> demo = new HashMap<Bigram,Integer>();
        Map<String,Double> demo1 = new HashMap<>();




        //using normal key
        Bigram key = new Bigram("eric","123123");
        demo.put(key,4);

        demo.put(new Bigram("sunny","889900"),1000);

        System.out.println(demo.get(key));
        System.out.println(demo);

        //using bank class key
        Bank mybank = new Bank();

        //create account
        mybank.Username = "hello";
        mybank.Password = "123123";

        Bigram bankkey = new Bigram(mybank.Username, mybank.Password);
        demo.put(bankkey,5000);

        System.out.println(demo.get(bankkey));


        if(demo.containsKey(bankkey)){
            System.out.println(demo.get(bankkey));
        }else{
            System.out.println("error, your account does not exist!");
        }
    }
}
