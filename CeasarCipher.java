package Personal_projects.Cryptography_projects.myCryptographyProjects;

public class CeasarCipher {
    public char[] arrayOfSmolLetters = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    public char[] arrayOfBigLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    String description = "The Caesar cipher... this particular cipher will ignore special characters like '!', '{}', ' ' and '#' as well as numbers";

    public String getDescription(){
        return description;
    }

    // Decryption can be done by appying the shift negative instead. If sum of index - shift < 0, write -26 + index + shift mod 26

    public String shiftCode(String code, int shift){
        char[] codeArray = code.toCharArray();
        String encryptedCode = "";
        for(int i = 0; i < codeArray.length; i++){ 
            if(Character.isUpperCase(codeArray[i])) {
                for(int j = 0; j < arrayOfBigLetters.length; j++){
                    if(codeArray[i] == arrayOfBigLetters[j]){
                        encryptedCode += arrayOfBigLetters[(j+shift) % 26];
                    }
                }
            } else if(Character.isLowerCase(codeArray[i])){
                for(int j = 0; j < arrayOfSmolLetters.length; j++){
                    if(codeArray[i] == arrayOfSmolLetters[j]){
                        encryptedCode += arrayOfSmolLetters[(j+shift) % 26];
                    }
                }
            } else {
                encryptedCode += codeArray[i];
            }
        }
        return encryptedCode;
    }


}
