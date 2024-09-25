package Personal_projects.Cryptography_projects.myCryptographyProjects;
import java.util.Scanner;

public class Request {
    String code;
    int caesarShift;
    public Request(){

    }

    // Check format of the answer, any problems in terms of unicode, the type etc. so it can be formatted for the cipher or to return an error message
    /* 
    public boolean validateCode(String code){
        
        return true;
    }
    */
    CeasarCipher ceasarCipher = new CeasarCipher();

    public String CaesarEncrypt(String code, int shift){
        return ceasarCipher.shiftCode(code, shift);
    }

    public void greeting(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! What would you like to encrypt?: ");
        String code = sc.nextLine();
        System.out.println("Your encryption options are:");
        System.out.println("1: Ceasar cipher");
        System.out.println("2: Vigenere cipher");
        System.out.println("For detailed information about each cipher, enter 0: ");
        System.out.println("Please enter a number: ");
        int input = sc.nextInt();
        if(input == 1){
            System.out.println("Please enter the number you want to shift the code with: ");
            int shift = sc.nextInt();
            System.out.println(CaesarEncrypt(code, shift));
        } else if(input == 2){
            System.out.println("Please enter the key you want to shift the code with: ");
            String shift = sc.nextLine();
            //System.out.println(VigenereEncrypt(code, shift));
        } else if(input == 0){
            ceasarCipher.getDescription();
        }
        sc.close();
    }

}
