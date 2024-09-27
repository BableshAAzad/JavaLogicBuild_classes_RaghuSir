
import java.utill.*;

public class ReverseString{
  public static void main(String [] args){
    System.out.println("Enter a String : ");
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String rev = "";
    for(int i = 0; i<str.length(); i++){
        str = str.charAt(i) + str;
    }
    System.out.println(rev);
    if(str.equals(rev)){
        System.out.println(true)
    }else{
        System.out.println(false)
    }
  } 
}