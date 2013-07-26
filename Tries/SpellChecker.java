import java.io.*;
import java.util.Scanner;
public class SpellChecker {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br;
        Scanner sc=new Scanner(System.in);
        TrieST<String> obj=new TrieST<>();
			br=new BufferedReader(new FileReader(new File("dict.dic")));
                while(br.readLine()!=null){
                    String x=br.readLine();
                    obj.put(x,"");
                  }/*Creation of Dictionary*/
                System.out.println("Enter 0 to exit");
                String word;
                do
                {
                    System.out.println("Enter the word");
                    word=sc.next();
                    if(obj.get(word)==null)
                        System.out.println(obj.LongestPrefixMatch(word));
                    else
                        System.out.println(word);
                 }while(!" ".equals(word));
            }
}