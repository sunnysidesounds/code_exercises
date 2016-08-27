package HackerRank;

import java.io.StringReader;
import java.util.*;

public class GemStones {


    public static void main(String[] args) {

        Scanner scan = new Scanner(new StringReader(
                "3\n"
                + "abcdde\n"
                + "baccd\n"
                + "eeabg\n"

        ));



 /*       Scanner scan = new Scanner(new StringReader("100\n"
+ "xhsbaqwbokcaqbkhrzddydwirmldcr\n"
+ "kwkbkhlwmlpuomfaenahhnnpgqpkcxlspbomrweoqq\n"
+ "rtdckeukfoppbsiccflxqcoxrhwnxpwyjsrvjngqmbgqfwahhkzcbifrvpamffoxcetdochazcqsqhazndwdk\n"
+ "cakdnrducighyuuemxhqmujauwxabextkdamxybkoyexmdmlyvnmlrwwrt\n"
+ "czuzxlzrmuaa\n"
+ "gquymxuabmymtnljadbqxjsipnixbyhwhaoaciinwdhppbpyxswcveddpojlopqsuqsvjhpobpdefuj\n"
+ "abtwcqoib\n"
+ "vqpgcuwvxdlaquaiwydejgpwvpwdjeybgbtienzijzeah\n"
+ "shrcvpgwzdkfcvpmjeuslonwerklxysafwgeurdnshmzunpaxmgfiwsehowfyjboeahpuqlatcmooenlicnrkhcbkl\n"
+ "jcvcatdtubemfmjqfplxgwkqeuyderpznnqhvvpjafnceutugnixltiyrmnptcxpvqadnpowacsuoucwmfgbkzs\n"
+ "ufaqewahvnqsbpqw\n"
+ "jzecprvdbgyxmhslqdxjsqnmdoavvifebqrtklohndgvkemackgmgtpkhqetqybxnpiyvlebovhbwivctrruc\n"
+ "wrhighznjjppsvmsxmtwtnphaxqmyjwtxrrfqxrurbengtrvgmeaxfodwtfucmdeasgzuxkghhjexblancvzd\n"
+ "hluadkczkazvptpjwwempwfpacbnfmhrzghznjln\n"
+ "znizntdoqtqabqvykqvnglbgkmclrzajsqwxnshlzalzfbalkxoxpsmtoon\n"
+ "paws\n"
+ "nwtsbxdtyqlapasbazttbsguceyqjvebxdjnfdw\n"
+ "kxafenseotsysgeswrtpzibyamlhbjknlcoveihukdebfbwsaqmzvdlaytfilpcqkspdwnysdfjvwdtlsqactcrelzzhxqxzv\n"
+ "yqaaayknxwnbmzkictawsgxeq\n"
+ "aaqkpvmiiho\n"
+ "ybnnrikqjybxrawihgyxiegxcimriyqrrgcxsfeidnhwfxjnpzxhloav\n"
+ "pjpdtrolhxvfrftvuweatcisajvqkaqqmblwugegmbpteukwxvoebpemcjquuvlrqkczeabuhmss\n"
+ "epgmbfpdjktvkbiczmumnoirupbasdvxpjhsocxaewcxkquxjolcqwjwnqtnirgsi\n"
+ "hjvkyhlyuqrsoonfqlyxlenoszrlquqsyjwrufuretagpuq\n"
+ "oaqdya\n"
+ "ikqnbkmmaoxqjmrmxupfaycfwxwzeldjynafrjdkulsvqweciuyukxnmzriseziuqxoxif\n"
+ "jgabqaqhwashxvki\n"
+ "xrryvkqfkossukeieayukmycfusyrikiotoiutvykatijjjzrioys\n"
+ "uaepqfgaevkewfmyhdmfeifsheilwfusmlnrpjtaeathypaql\n"
+ "pkzqkqvlgadoatqdwhgwkehalzrfawkxlivimioralfsnwqyhampnhqhdgssoo\n"
+ "lyqmibiheakvntaijqiwviwadksmxewhzejpkhdlbisqxmaqcmxctkfvqo\n"
+ "zgylpetfogykwgypzyoxjcuglfcawxubtqnteyvajnafzznmojnhovohsaowhuqpwhlydmtzwvrirjknynsiijivpqguabg\n"
+ "eftqjvctdzhxqbupfkwppcsrujgrziuelxozbzzcrcfbghqzdftctzfxgvmevyvbdbfigsykevjanvlaoepmqedufn\n"
+ "aotiefuigarhpgsghcptscko\n"
+ "pfrqhzapxgeltxikswnocynfguafqsigbpwehbfywndxbxaupzbdggshjocvowitjvunospmtzudcpl\n"
+ "yqzudnoqenlskxakuummlvkefmljvteacihzapaabuvjyjgodptyavvupptmvypvhnta\n"
+ "solabz\n"
+ "vxlaetxbklmxztfkozbzlolqr\n"
+ "wvcga\n"
+ "wahauykchejjiyikfwxzsbufdegpovkrbpampyuuhsaqzcnybbjzajjjrbszvbvdpyhbccwsjmnoztlejpffnzfytrdppsjrpvxx\n"
+ "cxkhanwweqhcjttjorgjocdfknajxbtbsucabin\n"
+ "oya\n"
+ "bznssnvxqvhhsqtmvluzmafqhftmorixkanbsixebrjqucgatepukzivhyhwxzfhgqztqtizkftvthyqjec\n"
+ "bbrjqukyipcnrhirhvcsmzgftpxtvehmfiizhorionzyhqdxodpaazjducjoqowtwzspfs\n"
+ "cnznakegiobpzqlzgyicllqwgrscxedu\n"
+ "hmofrxma\n"
+ "adh\n"
+ "oxa\n"
+ "bglhbygsyapztwrxjedcvpctvilcazozpralyodujolkixitrxwimazwnxmglwvkem\n"
+ "rgiyigzujasnsovsjjaqizcomxakticqyqdpdughlyuazpnfbmcgnveiemsybfdg\n"
+ "rioajgayihhagpcrj\n"
+ "zqgipdddjqxctpdzqiwzxwvxnwoxstodzcwgergfiiaizebhktlvrizzkomimalfbsxkduavkjxaoairfh\n"
+ "kgjdzysfkxmetkaoylyskcqlqtfzyayyyudxsknzxrcyujmwbnbkbtsfgitrrawfxzjthyfmgckgjqespdifqtpxjbgnvr\n"
+ "hiagaaeynarcvstegt\n"
+ "yadxdlavbxptwglaiayoowuogvvtgcfywluubqtkzrrhfxlovgef\n"
+ "hlypqfdiqlfnkllzouulioezroipxqdlsxwanwykvbcldhoetaeztgrootpjojcceuacwtzqagqamcvgfdednqczyvbtdx\n"
+ "zisguwmsaxhxuwjmhyfzuwiipggmwdouo\n"
+ "lbwzvwermrlvcmklemjkfrbljlnxrtizbyeikrgwjjptnzumttueabagmxizruareaeykxpblhrxcdyncqvpvcunwnfxzmpgys\n"
+ "prttjtiytlyyrultdkkpltjieolromizxwjfesyslnlxawtuxfiykdjobvoaeehfvxanlqzpkznggwkteeevlvsshvptayxvmttl\n"
+ "qgkpbaajagtvqiyiaodlrsikonhfwakpjdcbtalsxcjvbedvcempmvoeenrignubtaslxftwagdiobnevqzvqva\n"
+ "faedrfxkahlcgoilakrcyivijzutjlrdumyufckvt\n"
+ "vau\n"
+ "hbvbxfjzegevcqgaphablnsmlbsoeqmaioprbvtddsupvnqngwmxcpflvuafxpvd\n"
+ "brtfnusycjisbcphougpjdvauguelqkzipcuijeoy\n"
+ "ichepvyzntaev\n"
+ "zenwbsywgmpiutpzcjlaatkzmgobpxbcxmuxarykyoeqdx\n"
+ "lfluwbfavxkugqlwyxasngjzsdsyjpgeydajtolqsx\n"
+ "bhczkeeqzhzbartmeqpaqruysxjzaauoiqktopalvmdktikkldlrjllmcdpoygeiyukptponoihbsrrfvjfhoce\n"
+ "zap\n"
+ "ruiospjscgsufpnqkxkyykawjzwkczikahsyzauktafln\n"
+ "lreuxplanxvcqitroicfi\n"
+ "ohfaufeligmwtcsawktgxwtplivubrwmcjbqwgkcoxjyjwheidyqthgkoakhewhnwkvcatqpbwsqfkiqabjjonykglqwbswfyt\n"
+ "vocqooogtaicbhuaiupuipleufvdccabmfywoykochscytztchknyorlocfdntwwovefaq\n"
+ "xdmyaggpho\n"
+ "nscoqroxhdadpeuycosccvsnmtuugabmctqjeirzc\n"
+ "jhhlrbgojnrllgdewjvleyqdbfqvnjykfdjlxswwqeacczilgonlysaeqjghqpmwulkpupahsbbwihayahdfljjfgedri\n"
+ "mnfhtdoelgcismveynwpedfgqiosyjadntdewxlufoqorroevrcv\n"
+ "tzcetubjznmepihqloxfevhnyxhoytayxpkjvsgtmpkcimescblehhpgtbrngbwaufvjoqprgipwbahzkhjxfjxruqegcjgwgn\n"
+ "pvcuauizaozvhsbtwgxihosfgjazpahwkai\n"
+ "zsgkakcjezqvrqokvtgvecfgykwmvdpnapvjsuglckolshfiawxkogumzwiverjxpoyyuyhmopglvvfyuwa\n"
+ "rfywidpltzdddyrhorkbfanakjjbfyhs\n"
+ "liwgcigsdsyglkbefvbraoaexrprytclpvbwwpppouxbcmhpzswfkuhbkbzhymrceewbsdjsugwznmouri\n"
+ "epaotrdpredwowbjpafkswggzhhzigjcrkvlpbqgucvaprkskwilfmgzyqiijibzvteiujzjqeankernianranftzkoafyzrj\n"
+ "ntvvsjszkygncqfabnbajpmibfykwgyfaloozaoohtvnxclgsxjnlyvhvg\n"
+ "bpsbesgxuufgaxsmcyhbfgfmzcyaxwizbmoyecacp\n"
+ "mjootlmwwumapdrjmbhayptf\n"
+ "kbrna\n"
+ "xgooaibxlpjfotxwfgjtomwpjhmvjliubjavgjizaudpta\n"
+ "cclrtzxwjsybpazszlbhwewuqbathpvrstemsdfqxblzlgblgkdrvpwitgqykmduvyapqw\n"
+ "jsnpkdnmgpxgayihlblrxdpwqrctzvzoaylituwbiojtfuhfkpaggsbmqjaddmfjhaqpscyxpznwhlbxnp\n"
+ "afclnupiwlgqchkdahacm\n"
+ "ghibvbwuorvaubjkwphqghpzzqhgqhagzgsrtoouxefpckwvcndwlxjnpzzliqeeduqlezlayvdvzfstzpyomdyx\n"
+ "cabazene\n"
+ "iccteslmzahdvafdufaiactlgghsqqsayzalvyvfznwwiwgdshqrzgukgdqswm\n"
+ "va\n"
+ "evcmyciioxyggjpyeojrptzrfijszfargbtqjwyyseijzehgzlwhrresgbnpmzmasx\n"
+ "gadtslngjkipbhdzfeypofxqdycmornqzwjucxsslvjhrmewcljekmeqtjaimjmxasyfbpjhkvgugmwkjyylygswjehflhwxv\n"
+ "dpcazx\n"
+ "mqakmgqxwqmj\n"
+ "ombmwzjgntuvvhulglygpoqswngfedmdlywxqwjrpcyokultptfzmxpbflshggoycfaanaezburiqsphbzeqzbhkfykaemgsgu\n" ));  */




        String smallestString = null;
        int N = scan.nextInt();
        ArrayList<String> theList = new ArrayList<String>();
        for(int i = 0; i < N; i++){
            char[] gems = scan.next().toCharArray();
            Arrays.sort(gems);
            String gemStr = removeDuplicate(new String(gems));
            theList.add(gemStr);
            if(smallestString == null){
                smallestString = gemStr;
            } /*else if(gemStr.length() < smallestString.length()){
                smallestString = gemStr;
                theList.remove(gemStr);
            }*/
        }
        System.out.println(smallestString);
        System.out.println(theList);
        System.out.println(countGemStones(theList, smallestString));
    }

    public static int countGemStones(ArrayList<String> list, String smallesString){
        int[] count = new int[smallesString.length()];
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        Arrays.fill(count, 1);
        for(int i = 0; i < smallesString.length(); i++){
            char ref = smallesString.charAt(i);

            System.out.println("ref : " + ref);
            for(int j = 0; j < list.size(); j++){
                String item = list.get(j);
                int index = item.indexOf(ref);
                if(index != -1){
                    if(map.containsKey(ref)){
                        map.put(ref, map.get(ref) + 1);
                    } else {
                        map.put(ref, 1);
                    }
                }
            }
        }

        System.out.println(map);


        return getCounts(map, list.size());
    }

    public static int getCounts(HashMap<Character, Integer> map, int size){
        int count = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(size == entry.getValue()){
                count++;
            }
            System.out.println(entry.getValue());
        }
        return count;
    }

    public static String removeDuplicate(String s) {
        StringBuilder sb = new StringBuilder();
        Set<Character> seen = new HashSet<Character>();

        for(int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);
            if(!seen.contains(c)) {
                seen.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }



}
