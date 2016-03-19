package LeekCode;

public class TelephoneWords {
    private static final int PHONE_NUMBER_LENGTH = 7;
    private static char[] result = new char[PHONE_NUMBER_LENGTH];
    public static final int[] phoneNum = {8, 7, 7, 8, 3, 9, 6};


    public static void main(String[] args){
        int key = 9;
        int place = 2;

        //phoneNum = {8, 7, 7, 8, 3, 9, 6};


       // for(int k = 0; k < phoneNum.length; k++){

           printWords(2);

        //}



       // System.out.println(getCharKey(key, place));




    }

    public static void printWords(int currentDigit){
        if(currentDigit == PHONE_NUMBER_LENGTH){
            System.out.println(new String(result));
        }
        for(int i = 1; i <= 3; i++){

            System.out.println(phoneNum[currentDigit]);


            result[currentDigit] = getCharKey(phoneNum[currentDigit], i);
            printWords(currentDigit + 1);
            if(phoneNum[currentDigit] == 0 || phoneNum[currentDigit] == 1){
                return;
            }



        }




    }


    public static char getCharKey(int telephoneKey, int place){
        int group = 2;
        int range = 3;
        int count = 1;
        int placeCount = 1;
        for(char i = 'A'; i <= 'Z'; i++){
            if(i == 'Q' || i == 'Z'){
                continue;
            }

            //System.out.println(count + "  [ " + i + " ]  - group " + group);
            // Find our group and get our character
            if(telephoneKey == (group)){
                if(placeCount == place){
                    return i;
                }
                placeCount++ ;
            }

            // if equal to 3, 6, 9 i.e multiples of 3, iterate group count;
            if(count == range){
                range +=3;
                group++;
            }
            count++;

        }
          return '\0';
    }








}
