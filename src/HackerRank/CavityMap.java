package HackerRank;

import java.io.StringReader;
import java.util.Arrays;
import java.util.Scanner;

public class CavityMap {

	public static void main(String[] args) {

		/*Scanner in = new Scanner(new StringReader(
				"4\n"
						+ "1112\n"
						+ "1912\n"
						+ "1892\n"
						+ "1234\n"));*/

	/*	Scanner in = new Scanner(new StringReader("100\n" +
				"9898898989999898989988998889889889989999899888988889988999989888888888898998898898899889989988988888\n" +
				"9998899998899989899989889898899899888988988988899898889988898998898899888989888988888888988989888999\n" +
				"9999888899999999899889888999999888988899989898998989898999899988899889999988889888998889999899899998\n" +
				"8988998989998899898888999988889899889888988898989888988998889999998988899888989989998989888988988988\n" +
				"8988888998899898899889988888898899999989999989888899989899888889998989989989898899989988999988899998\n" +
				"9988989898899898888988898999998899889898988988989999889888999899889889899889898989898889899988998898\n" +
				"8888989998899898889898999899998899899898889998888889998989998989988898889898888898888898989898999899\n" +
				"9989888889999999999889888988998989998888999889898989888988889988888898899888889899888999998988989899\n" +
				"9899988998989899889899888898998888989888899898988899889998889889899999888888988999988899988899988988\n" +
				"8989898888999999999888889898889988988988998889988998898888898999999898988998899999998988898998889888\n" +
				"9889989989898999989999999998898989898889898889998888988988999889998899898988988999988889889988898989\n" +
				"9899888898899889988999999989998889898888899989988889898999888999889899889998989999999899888899989988\n" +
				"9888889888998988888888999889999998999999999899998888989988899888999998998998989998889888899898888988\n" +
				"8988988999989899999988889899988989999889999989889988889888989999988888998899899999998988889889889898\n" +
				"8889998898988889898898998989898998998989899989988898989898899988898998998998989899989888988889889998\n" +
				"9988888899899989998888989988888889988899888998999888989999888889898899999989988898988999899889988998\n" +
				"8899888988999988999988988898898898999889988888889889988889898989998999889899898888998988889989999999\n" +
				"8988989899898999988998888999898989999988888998898988899998989988999989899898898888889999989989889988\n" +
				"9889899998999999888889888989999989888988899998988888889999888888898889898988888998988998889998998888\n" +
				"8998889989899898888998988989988889898888999898888989898988989998898998998999999898989898989888999888\n" +
				"8899999989999898898999898899888898888999989989988899998999989998888889999898899899899889998888989898\n" +
				"9989898999989998998999998988898998898888898898989989999898988999889999899988988898889999998998889989\n" +
				"9888899899898888899888999988889898898999998988998898899888989999998888889989989998998998899998999988\n" +
				"8998898888989989899988898988999889898889989988988898998888899899889898898988998898998899989888899999\n" +
				"8898999988989889988899999889889999998899999888989899898989899988888888989889898989889988898889989998\n" +
				"9998898989998989898889888899888998898999889989999998889998898999999998988888889999888999999998889989\n" +
				"9899898888888998998899999998988998998899989888989889999989989889989899998988988889989999988899989889\n" +
				"9899999889988999998888888988888989888898988988989888988989998998999899998899898888899889999999998889\n" +
				"9899888889998988888889989889988899989999998998898888999999999899999998989889988899898988989998989889\n" +
				"8989889899899998989999989899889889888888989898998999989998988988999899999898988889889989989899998889\n" +
				"9989898999999898888988899998989999998899888999998898999999888889888898898998989999888889998989999988\n" +
				"9898988899898999988999999989899988889898998999889989988999898898989989989889899988899899888999898899\n" +
				"9988989899888988898999898998988989888898888999888899899898899888989888898898988989889888899999989889\n" +
				"9889988898998888999999989989899988989999999899998988898898988988989998999989888988898888998999898898\n" +
				"9999898888989998989888889898999998898999998999999898999888998999899999899998888989988899998888889889\n" +
				"9998898998989998998998899988898998888889888889989988898998998988988899989898989988889888999989889999\n" +
				"8998989999988888898898898899989999888989998888889898989998889989898889888899889888989989888988988888\n" +
				"9898988888988988999888988988999888989989888989888998899988989988998988898889999888898988899988988899\n" +
				"9988999889889889898899989999898889889999999988988899899988899899999988989988999999898888989898989999\n" +
				"8989988889989899889999898989888988989899989999898888998889888999898989988899888988899889989889898888\n" +
				"9988898889998989889888898989988888899889999999989898989999889988998899999888889888898889889889999888\n" +
				"9899888898889889888889998889888999898989898889989998988898998999989989888898999899999988888988999889\n" +
				"8989999899988889889998888889989989989898889898898989889888898998989989998999899888988999889889889889\n" +
				"8998988998888889899988889989898888889989998989898898989989988988888998988888898889999889989998898898\n" +
				"8999898989888998888888988989989999989998998898999999989998899898889998998988898889988998898988988898\n" +
				"8899999889889889888888998899988998989988889989899989989888999888888898998999988898999988899898989898\n" +
				"9889999999889999899988889899989999889999888998898889888898898889889999998899999988988988898989888998\n" +
				"9889999999898899988989899998989999898989989988989999988988989998999898898898999999899989999998999998\n" +
				"8899888899899888899888999898888988889889889888998898899899988898989888988888999888899899898899889889\n" +
				"9889898999888989999889899899898889988889998888888989999999998999998989999999988988889999988888988898\n" +
				"8899998898889888899999898989898889889998899888898998889989889989998888898989888988988899988898999898\n" +
				"9889899888889889999898899899889989998988888889899998898999999898989988989898989889988899989989989989\n" +
				"8898999899999988988998999999889989989989888889998989999988888989999898899989998999898998988898989898\n" +
				"8988888899988999898898999988998898889898988889989989899899999889998989899889999889988988999889998898\n" +
				"9999998899899989889898899898898999999899899888988989889898999998898889888888988988998889899898898998\n" +
				"9899888989989998988989998899998999998989898888889988999898988999998888889889988899989998999898899898\n" +
				"9999999999989899898998998898888888899899998998899989989989988998898998999998998989888889988989888988\n" +
				"9999888998999888888999888998988898999898899998988998889989989898989999898898898888988988898899888898\n" +
				"8988899888899899989988898999888899998999999989998889988899999889989998888899889889889988899888989898\n" +
				"8888998898898998898988889889899888998889998889988888889988989898989889988899998889888888998989888898\n" +
				"8989889899888899998989989898889989889889999888988888888899888898888989899988998899889989898898988888\n" +
				"8989888898898899989988898998989889989889888989899989988998888999888899888889988898999898888899999898\n" +
				"8898998999889899988989888999989889998999998899999888988888899989989898989898998998999998989999999999\n" +
				"8888989889988898898999998889989988889898888888898889888899889898899998999889998988988988988999989988\n" +
				"8899898899988989889989988989889988989989888889889899899999898988999989989998998989889888899998898988\n" +
				"9889888899989999988999998998988988889988898998888998899988988898898898988999889899888999898999899889\n" +
				"8898888998999998889889898899999989898888888999898888989989889889998989988888999989899889989899999988\n" +
				"8898889888899898988998889999998989889988888999989889898898999988988899988998888998899998988999999989\n" +
				"8888898889999899899889888998989989889898888898889898898889889988988889898899899998999999988989989989\n" +
				"8898898989998999898899899999988999899998989889989889998898889988998899989999999988989888888999998899\n" +
				"8998989898889889998898898888889889989988988989889888988888999989998898899998889898989989988889999998\n" +
				"8899988999998999899999888988988989888998988988899889989989988899999888889989989888999899899899989888\n" +
				"9998989988889988988999988889889898899989989998999898989889889888888999998888899999889898988988889999\n" +
				"9989989988998898999989889899899888888898999888998889999999999998889888889998899999988888998899989899\n" +
				"9999988988989889988888998999888888899888998889988998988889989889988898998999889989999999989889889988\n" +
				"8998888898889989889898899989989888899899998999899989998888888998989899888998898999899999899899989898\n" +
				"8999998898889898989998998889989989989999888899988998998988999999998899899999899898989889899899898988\n" +
				"9989998989999899999989999889989989998898889999899889999999998889889989898888888998998998888988998889\n" +
				"9898888888999989898989989989898899998998889989889989898898999898899889999888899888988889898889899898\n" +
				"9989889899998899998998888898989998989889898889898988899999899989898998999989999989999888988899898898\n" +
				"9898888888889988989888998998899999899889999899999999899889888899898889888898898999999999899989989899\n" +
				"8999888989989988899988999898999898999989988899898988889998999898998999998888899989988988898999999889\n" +
				"8898999999988998898889998899989888998899898899889899999988899989888888899888988899988999898999998899\n" +
				"9988988898988889999989999889888899888998999989988988889988899889888889888889898989888889889899988989\n" +
				"9898989888999889889898998998899889999899889898889888888888998899998889999988898998999888989988888888\n" +
				"8898898888888998888889999889998999889998998999899989989998888988998989988898888888888899888988898988\n" +
				"9988899999998899898989899898988898988889899899999889899888989889989888999898988998888988988998899999\n" +
				"9888989999888988889898899989999899988999998889998998999989998888998888899888898888988998899989899998\n" +
				"8888998999899998889888899888999989989989898898989899898899899989999989899989999999999988998998888989\n" +
				"8998988899988889888998888898899999998888888889888988988889899988898989999889889899988999999899999998\n" +
				"8889989889999889899998898999898988998999899889999989998888889899898989889899898899899899888988888989\n" +
				"9898989898998989999989998999889998898889889998898988889898999999889988998898888888889999998999889998\n" +
				"8888889899989888989998888888898888988898899998888998998898899888888999889888898889889988888899988989\n" +
				"9988998899989888988998898889898998988899899888989889889889999889989999999889999888899899998999898999\n" +
				"8998988989898998998898989898989898898898899999998988998999989998889989999988898998989988988988899988\n" +
				"9899989898988989999899888888998899898899888988998988988999998998889888989999898989998888999989889989\n" +
				"8989898898899998888988889898988888988899899999989988988888889988899899999898988999899889989999889889\n" +
				"9889988898898999988989898899999899889999999998989889888888898898988899899899989889999899889989989888\n" +
				"8998988998988999999888899998998999898989999888898889888898889989999889898998889888988898989888898999\n" +
				"8888889899889989889988888898888989889989888988989999988998999888999988898989889899988889889999888898"));*/




		Scanner in = new Scanner(new StringReader("98\n" +
				"91698326456344939552977125458415221857173245485551462491918489359572316496478351339624192565128989\n" +
				"44681396559273312887394374281328526717592228887368345925947742465941436533517947994761311742748986\n" +
				"13173963499747361762882716721241826575741519933277173432264485833117263896154395626668785653517729\n" +
				"45479251548864399879931618738521817436597438379547136511258952423524384845286384899487494552154482\n" +
				"38388554332939257656957827875549734491724971979964483367481665966293474171488945227462998947625973\n" +
				"43925155435928338782536158751932334275479852221947445757129737313466119785536451857599536946982169\n" +
				"48664556253698434575836856594676393748751326381533782348937687313569429437451617878658358297286522\n" +
				"61749732532619315373844213211472355291871859897512686947684619642219749346474858387663279252892134\n" +
				"71761241314353499796322994439637681672632129247267798743195532982572685995947518615422539193167377\n" +
				"27988613434895293242851542111577249269343437443175324267822762533828745923577943395463692514995219\n" +
				"11826695727875955223138685266778867112985576173164435254454241118765756198515356913335499531359417\n" +
				"18211758842432655396785124186313936771443693447823319617812491584515333992272737797338524975543969\n" +
				"88539833516629854435921392726352176194452472963981516112698622298388797337388812213229139982541816\n" +
				"65999217921418519238564533964726591715965631995559248579258365722597864214122548236924321128144465\n" +
				"43288338958836246756787363948447375749797761154454359649989513438769255552475749111691749712169117\n" +
				"28719585126642435982218653461197565642153515418757688812468373457741225739566931819521317897954644\n" +
				"97438478651658148233367792185466485577889484759963884868474999841332474157379396748264471189652569\n" +
				"82563259579114475352724982386617537857227267551236276748596597272441749168327739388419593373574661\n" +
				"47136366413328162991939189964745148119939851625743756743263839592842393353833926598746623325996273\n" +
				"89241976813626789639742731161849352838427145828843273972888778593619452675963423662412678445967179\n" +
				"72298911356892644677821251461295175692422534494891341539488314993844612566652315759333873563991937\n" +
				"74831475832584542745924187824466295711568516523642389143342884266378958333756575349669369985779991\n" +
				"91383253461893158525473556213125263985567199265169192593433149666191662373339534984631125141452356\n" +
				"88425385955993441383566114349375639275364629228916812338954211536467188743969969342857731871674514\n" +
				"82599488311898761749755165295678733623724881925355354546162451848251991926836439292772749991572865\n" +
				"48959837671983127747398862945954728144223979859327777386463587684252391569173243286438636324739885\n" +
				"64156799592719983937174346846114668921368641545673351342287864214122225125217137991345762748942712\n" +
				"89479723341491952866539139751328285666177652973515979593674847575578155294158797171994213214734252\n" +
				"22878252495261957276834765949621385198648468773155838943143533193916261671689364774388722563546663\n" +
				"22825855167368569785427141525771379273866242467351915218333569266784974557519423936827616541776428\n" +
				"87412423816654969328575858573191883182795274167616212115743813571628895146144971979417957755711267\n" +
				"81659242899142877233217942278125119511227475231937255874674496519616975619515261871384341324918212\n" +
				"69159114352848645411375471946752648118849864861266961856433728716939449778535474977756248324359526\n" +
				"46441358853344489393521294589634739832471481481169381876279841943349147861731392566418434666521377\n" +
				"61149676312555515756123459882974787657849484491886415813746712131823892715241929535881435267947281\n" +
				"96665641517748759369975553221161971415299488344299976365849496415879954693994565184676934858583438\n" +
				"49216458825528718526818164493181827712328949376324322778435231764628664465843185539592992582324749\n" +
				"86213597976666162911474218797282862315628233437883446822687638921155632136954542224677471161986678\n" +
				"28314643327911122251287436521117781941878778217767576598117296213357394914872459724255275498545938\n" +
				"67753292821831419282716854465649195421879255285875532752591638816449433166674448891823727492952239\n" +
				"42776737879853554842287986288563964433814366362776526515212171337258939121751378283564516227374988\n" +
				"58929635468183757549926281543468691125229537392393722438194994137631778891836512812434946193369251\n" +
				"41879578996149825761888161682965955265564134491255759385132378197997321939938813778372562762244366\n" +
				"64447996337398998634423979177994125399682682939143631943842981247648252182726713251941528445683955\n" +
				"44993869565855542759427448877972474368543183498945328817463463228824787868459384372978695542194562\n" +
				"41718655789851434494457575168229221542263889526323419518648814745416719481247286483669212675548769\n" +
				"77448281464676393692248266227698669858762765834339269952736839212589571957736375821721115442418265\n" +
				"59754487719349392352851445155964129724647355493733383932862139194376834276375383669671445251166213\n" +
				"92617976993742362321494634677898293314571677519732587548992996586735487287146634535592648562349415\n" +
				"48288299953481718333697643428827681142134984949938763965841954962494252644146569375896795571396188\n" +
				"18448321462229154998791533117415892333635224776733898964989935637645771819134496531457769822756114\n" +
				"78783755639675743495932324934239935594633111982666341941924658898919226337356435421854468752659456\n" +
				"35184957499111292478562198237929136263859722978243185164786192711659241313222358125971481457773265\n" +
				"93784897718112146147898692737326579165578786152663122222878798399174284267544532693872173266284286\n" +
				"51712683895142194981426751371522781873717427432272264473421942617287554532979726914394535869473764\n" +
				"14356935878474587382728237463374489835344862715968365828267828165836171774351279276521362771618736\n" +
				"31441165894363612571573894321263525433917834551371658476526993969921959766127336651783383324311936\n" +
				"68567672137646944538744642417962771772868241865796721226981418651534393219294125292872574825692971\n" +
				"57882187142991663927519514666567549417966851935569473697266122282999336863977788475616211267814745\n" +
				"23147973692514529442114943693714627728796119514592746165484194824656388459732196143151113967927487\n" +
				"12988433266744523923196641211966823813394349911187993135645423582727282518195226694281261282612297\n" +
				"88315748867935624799314814162156474328837621615979893976217199122739593567592936566692532547141277\n" +
				"47227537516218729132516259818441156963971642736833412846659848499669763759548974272891666737827497\n" +
				"21697948999393496475745392623535314633294641758183112681398766881464734191889644562224275477438675\n" +
				"22634183843956426919858481245335325282719436272542634181955786655524447327969926687471126766769859\n" +
				"51332614134394434452366564238473576886827497774585314185321635654982344492685688497138774945717275\n" +
				"92381277547971111965992411235894881556464556249569675386417163841629724292531978971926527656362642\n" +
				"32352299891672382198687451952181144635571833383599715161143563158442182242399976195353244455463964\n" +
				"29711474924835817658594761685283336611744933595476371368941824391743257426977636532229311866212221\n" +
				"94911485154827938256934329392127685765924813937413291675744736338925448586512774473641444561877499\n" +
				"56449676791517961137218234654777244883996154154984348889826956524674233611175658417591545884983521\n" +
				"99693666222325776451653188754831573548398772451414231885288386249674176524891716468216669424824129\n" +
				"31847536558836563415956216424458279192392842182844415928248887585228561218639711388438392679331967\n" +
				"51235843471891782165791755553566576679995944994591334617797727129298249576294736329281191158455885\n" +
				"44215749775498731937672998331119228396146851971837381343753215162255271531153929481661431632147863\n" +
				"91713546227161734257111595949755621297755994173152194886578138591276655419468627671799378863945625\n" +
				"43923169472228448676752283646656813325961497865696474661587861144114294846485713345887132193235849\n" +
				"64687797599747675254857638595451437987961145357346959823274418833328766676283162639646149924393115\n" +
				"99852496596655521885819928181457284769771134382533982685542829397563577534416249421336949651587554\n" +
				"43836758926768819759419278618156829522582754879374353145447332856553725197441287144564115145642752\n" +
				"27738394613371195967952625647881383156783284895929299115914423564788464745634538695878555771427838\n" +
				"89361278628829564869555879895536944756247819732475242368164178693746142593136681415714196116328393\n" +
				"46372836564281483421626735237394328534419258469239215585728888556735434465815168445717521726895678\n" +
				"88237139115973884545192292751285852957962765121898159156146254415123599956458462485338713889551139\n" +
				"57288617396812994281172743331367279532512637197239713718846977237738225616985435417433716419149382\n" +
				"34411165351988562188974383487738498277364138574255238154685695416155752389927677838856542484337425\n" +
				"84712679862266213344633564947697792714496775882637159433186614156377667757658777865398697169422899\n" +
				"45131435595291411248525636286915387275364457517382191151765393254393341179287963396979459146911132\n" +
				"25456323496246894144499822555572765929124616411988992111544665141459635983536564727449199533356138\n" +
				"76371392346291895749328283336993264527221879577486245612354615668778599479327163812643834797516922\n" +
				"62348212226797579581927794548732493876158496867112911665812265165137458662167821119852714198331845\n" +
				"68779814439792662862646419195847193486894941742115959777633479225879495448473613964487992147515147\n" +
				"91643329382621238833151839421527581434652411158995172994322576555639971331951117213817532688464668\n" +
				"31272219435583198386359889411127767561891773218482615749669122886946769976885682792861417351853984\n" +
				"65139867739363684939777974839332547846231884959477266241442572834662188264285521244318561453232676\n" +
				"53783839897142652212912218672337478523262725244455994453418725449279956683322311333598553397541115\n" +
				"57472235932515492631489458842378968855465462351883419916857349481266137929223743193297952884422614\n" +
				"33799658141777442842393468871619465495653165966793287688349168251574377827142843354622435878732837"));




		int n = in.nextInt();

		int[][] grid = new int[n][n];
		String[] strGrid = new String[n];
		for(int row = 0; row < n; row++){
			String strValue = in.next();
			strGrid[row] = strValue;
			for(int column = 0; column < n; column++){
				grid[row][column] = Integer.valueOf(strValue.substring(column, column+1));
			}
		}
		System.out.println(Arrays.deepToString(grid));


		int grid_i = 0;
		String[] outputGrid = strGrid.clone();
		for(int[] row: grid){

			if(grid_i != 0 && grid_i != (n-1)){
				int highestValue = (getHighestValue(row));

				for(int j = 0; j < n; j++){
					int character = Integer.valueOf(strGrid[grid_i].substring(j, j+1));

					if(highestValue == character && j != 0 && j != (n-1)){
						int top = grid[grid_i-1][j];
						int bottom = grid[grid_i+1][j];
						int left = grid[grid_i][j-1];
						int right = grid[grid_i][j+1];



						if(top < highestValue && bottom < highestValue && left < highestValue && right < highestValue){
							System.out.println("character : " + character + " index : " + j + " row : " + grid_i+ " top : " + top + " bottom : " + bottom + " left : " + left + " right : " + right);


							//outputGrid[grid_i] = strGrid[grid_i].replace(String.valueOf(highestValue), "X");

							char[] sb = outputGrid[grid_i].toCharArray();
							sb[j] = 'X';


							outputGrid[grid_i] = String.valueOf(sb);
						}

						System.out.println("match " + character);

					}
				}
			}

			grid_i++;

		}


		for(String result : outputGrid){
			System.out.println(result);
		}



		//System.out.println(Arrays.deepToString(strGrid));

	}


	public static int getHighestValue(int[] valueArr){
		int[] arr = valueArr.clone();
		Arrays.sort(arr);
		return arr[arr.length-1];
	}

	public static int getHighestIndex(int[] valueArr){
			int highest = getHighestValue(valueArr);
			int index = -1;
			for(int i = 0; i < valueArr.length; i++){
				int value = valueArr[i];
				if(value == highest){
					index = i;
					break;
				}


			}
		return index;
	}



}
