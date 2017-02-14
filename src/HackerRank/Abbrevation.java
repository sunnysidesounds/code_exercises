package HackerRank;

import java.io.StringReader;
import java.util.Arrays;
import java.util.Scanner;

public class Abbrevation {


	public static void main(String[] args){

		Scanner in = new Scanner(new StringReader(
				"10\n" +
						"MXCXHIBQFIXTJMHURXCHHKVHUtfydvznieoivbuflfvsyfizoffajspejbagwxsmaxkp\n" +
						"MXCXHIBQFIXTJMHURXCHHKVHU\n" +
						"CSHUWAVCQDYNONVTNECRWFQRGCVpFENJkRLYTKpiDQEJjKRJOIOEITAKQTQGUTIZDUERXSPPTSKZXsVMN\n" +
						"CSHUWAVCQDYNONVTNECRWFQRGCVFENJRLYTKDQEJKRJOIOEITAKQTQGUTIZDUERXSPPTSKZXVMNJUN\n" +
						"NXTQPPBQUDFPTOQMPpiwtteigszercwypnevgbltrnjibuzhcwf\n" +
						"NXTQPPBQUDFPTOQMP\n" +
						"ELEDhEOXIAZQYWOPQIUSSGDCXOHSeYCKSCOYEMEDTGWPlJRZFILHZOBAVMFXdnxn\n" +
						"ELEDEOXIAZQYWOPQIUSSGDCXOHSYCKSCOYEMEDTGWPJRZFILHZOBAVMFX\n" +
						"CQWTAKIWeCLNIJIOYHKKFNTBNBOBOYCHIWWPFXCYnQnHUUFUNDGWBNYNEGJVYIPOAAVNKULTIOPQJZPRUJWOIMGCFMaAYSVXQUWN\n" +
						"CQWTAKIWCLNIJIOYHKKFNTBNBOBOYCHIWWPFXCYQHUUFUNDGWBNYNEGJVYIPOAAVNKULTIOPQJZPRUJWOIMGCFMAYSVXQUWNMWA\n" +
						"GIWMJNZNPSGHWPZYXZBRKuRMFVKPXXMKdNEGBoujvcvucbxatqweigggnmwxnr\n" +
						"GIWMJNZNPSGHWPZYXZBRKRMFVKPXXMKNEGB\n" +
						"QHIJMHBLDEzutxqcljyplcaaiybltnqvoamrnahmnbbvhvgcygzjooacvlkfxfnalyafkjihsabmejyutbkegmygfrwuunx\n" +
						"QHIJMHBLDE\n" +
						"PLAJZSCQZHBPNPHLLOLBAISAAPZEUDEQKZNOYMULYDbURCQVMHRXNPCWLFOMYLYQCTXyUEWLUKMFNIXKEBADSXPZXJKSJTDYVLNT\n" +
						"PLAJZSCQZHBPNPHLLOLBAISAAPZEUDEQKZNOYMULYDURCQVMHRXNPCWLFOMYLYQCTXUEWLUKMFNIXKEBADSXPZXJKSJTDYVLNTRU\n" +
						"GHGYHWVUBHTFYHIGZRKJQRBtbzfvcndgXruxSyeyidmqjltqnkzztandmpjzcuacimltBjsrfyiklqpbtcpwnjtqrpnrJlcbqF\n" +
						"HGYHWVUBHTHIGZRKJQRB\n" +
						"YDUPASQTIANSDRKTVXMERMiOPDBQRsPNBXJVRVJHJPAQRFMMpRPZRkJSSCELXNSKEJUYKSWPBetbyohjxdgykwqsmdnhyekvu\n" +
						"YDUPASQTIANSDRKTVXMERMOPDBQRPNBXJVRVJHJPAQRFMMRPZRJSSCELXNSKEJUYKSWPB"
		));



		/*

		IF B contains A : match

		ELSE
			Remove all lowercase : check for match
			IF B contains A : match

			ELSE
				IF B length < B length








		 */



/*
YES
NO
YES
	YES
NO
	YES
YES
NO
NO
	YES
 */



		int Q = in.nextInt();
		String[] tests = {"YES", "NO", "YES", "YES", "NO", "YES", "YES", "NO", "NO", "YES"};
		int count = 0;
		for(int i = 0; i < Q; i++){
			String A = in.next();
			String B = in.next();

			String result = AListEqualsBList(A, B) ? "YES" : "NO";

			if(tests[i].equals(result)){
				System.out.println("PASSED (result: " + result + ") (test: " + tests[i] + ") A : " + A + " B : " + B);
				count++;
			} else {
				System.out.println("FAILED (result: " + result + ") (test: " + tests[i] + ") A : " + A + " B : " + B );
			}

			System.out.println();

		}

		System.out.println("Total PASSED : " + count + " out of " + Q);

	}

	public static boolean AListEqualsBList(String A, String B){
		boolean isEqual = false;
		int Alength = A.length();
		int Blength = B.length();
		StringBuilder r = new StringBuilder();
		System.out.println("A : " + A + " B : " + B);

		if (A.contains(B)) {
			isEqual = true;
			System.out.println("  EQUALS A == B");
		} else {
			int j = 0;
			for(int i = 0; i < Alength; i++){
				char a = A.charAt(i);
				if(i < Blength) {
					char b = B.charAt(j);
					if(a == b){
						System.out.println("  EQUALS a : [" + a + "] b : [" + b + "]");
						r.append(a);
					} else {
						char aUpperCase = Character.toUpperCase(a);
						if(aUpperCase == b){
							System.out.println("  EQUALS (by uppercase) a : [" + a + "] b : [" + b + "]");
							r.append(a);
						} else {
							char tmpChar = A.charAt(i+1);
							if(tmpChar == b){
								if(Character.isUpperCase(a)){
									System.out.println("  NOT EQUALS (is uppercase ("+a+")) a : [" + tmpChar + "] b : [" + b + "]");
									r.append(a);
									r.append(b);
								} else {
									System.out.println("  EQUALS (after remove ("+a+")) a : [" + tmpChar + "] b : [" + b + "]");
									r.append(tmpChar);
								}
								i++;
							} else {
								//TODO : Need to handle multiple lowercase letter and determine if we need to remove them.
								// Also, I think we are missing a need to append a or b or both to the r StringBuilder, See testcase 2.
								System.out.println("  NOT EQUALS a : [" + a + "] b : [" + b + "]");
							}
						}
					}

				} else {
					if(Character.isUpperCase(a)){
						System.out.println("  EQUALS (Must add due to uppcase) a : [" + a + "]");
						r.append(a);
					} else {
						System.out.println("  a : [" + a + "]");
					}
				}
				j++;
			}
		}


		System.out.println("  Result : " + r.toString());
		System.out.println("  Original : " + B);

		if(r.toString().equals(B)){
			isEqual = true;
		}


		return isEqual;
	}

	public static boolean AEqualsB(String A, String B){
		boolean isEqual = false;
		StringBuilder sb = new StringBuilder();
		StringBuilder sbB = new StringBuilder(A);
		StringBuilder finalOut = new StringBuilder();
		int index = containIndex(A, B);
		if(index != -1){
			for(int i = index, j = 0; i <= B.length() && j < B.length(); i++, j++){
				char letterFromA = A.charAt(i);
				char letterFromB = B.charAt(j);

				System.out.println("  letter A : " + letterFromA + " letter B : " + letterFromB);

				if(Character.isUpperCase(letterFromB) && !Character.isUpperCase(letterFromA)){
					sb.append(Character.toUpperCase(letterFromA));
				} else if (letterFromA == letterFromB) {
					sb.append(letterFromA);
				} else if(Character.isUpperCase(letterFromA) && !Character.isUpperCase(letterFromB)){
					sb.append(Character.toLowerCase(letterFromA));
				}
			}


			sbB.replace(index, B.length(), B);

			for(int z = 0; z < sbB.length() ; z++){
				if(Character.isUpperCase(sbB.charAt(z))){
					finalOut.append(sbB.charAt(z));
				}

			}




			System.out.println("  NEW : " + finalOut.toString());

		}


		if(finalOut.toString().equals(B)){
			isEqual = true;
		}


		return isEqual;
	}



	public static int containIndex(String a, String b){
		return a.toLowerCase().indexOf(b.toLowerCase());
	}



}
