package LeekCode;

public class ExcelSheetNumberColumn {

/*


Given a column title as appear in an Excel sheet, return its corresponding column number.

For example:

    A -> 1
    B -> 2
    C -> 3
    ...
    Z -> 26
    AA -> 27
    AB -> 28
 */





    public static void main(String[] args){

    String s = "AA";
    titleToNumber(s);



    }



    public static int titleToNumber(String s) {

        for(char c = 'A'; c <= 'Z'; c++ ){
            System.out.println(c);

        }

        return 0;
    }






}
