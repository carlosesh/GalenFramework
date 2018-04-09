# WizeLine

If you will download this code please proceed to **download the latest jars** from the following links:

1. [Selenium WebDriver Java](https://goo.gl/Us5DnZ)
2. [ChromeDriver](https://sites.google.com/a/chromium.org/chromedriver/downloads)
3. [TestNG Plugin](http://beust.com/eclipse)
  1. You need to add the plugin directly in your eclipse as follows:  
  2. Help -> Install New Software  
  3. Click on Add  
  4. Name = TestNG Plugin and Location = http://beust.com/eclipse  
  5. Check the checkbox in order to install everything (at some point a pop up will appear **accept it**)  
  6. Follow the prompt until you have to restart your eclipse  
  
4. [JCommander JAR](https://mvnrepository.com/artifact/com.beust/jcommander)
5. [TestNG JAR](https://mvnrepository.com/artifact/org.testng/testng)
6. [Extent Reports Version: 2.41.2](http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22com.relevantcodes%22%20AND%20a%3A%22extentreports%22)
7.[Freemarker Version: 2.3.28](http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22org.freemarker%22%20AND%20a%3A%22freemarker%22)
8.[Jsoup Version: 1.11.2](http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22org.jsoup%22%20AND%20a%3A%22jsoup%22)
9.[Sqlite-jdbc Version: 3.21.0.1](http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22org.xerial%22%20AND%20a%3A%22sqlite-jdbc%22)

## Quick Intro to Maven

TestNG	is	a	testing	framework	inspired	from	JUnit	and	NUnit with	more	functionality added	to	make	execution	more	efficient	and	powerful. It	is	an	open	source	automated	testing	framework.

TestNG	eliminates	most	of	the	limitations	of	the	older	framework	and	gives	the	developer	the	ability	to	write	more	flexible	and	powerful	tests	with	help	of	easy annotations,	grouping,	sequencing	&	parameterizing.

**_Benefits of TestNG_**

Major	advantages	of	TestNG	are:
* Logs can be generated
* Annotations make code efficient and easy to manage
* Ability to produce HTML Reports of execution
* Test cases can be Grouped & Prioritized
* Parallel testing is possible
* Data Parameterization is possible

**_Annotations in TestNG_**

| Annotations   | Description                                                               |
| ------------- |:-------------------------------------------------------------------------:|
| @BeforeSuite  | Method with this annotation will run before all tests in the test suite   |
| @AfterSuite   | Method with	this	annotation will	run after all	tests	in	the	test	suite |
| @BeforeTest   | Method with this annotation will run before each and every test method with <test> tag in xml file |
| @AfterTest    | Method with	this	annotation will	run	after	each	and	every	test	method with	<test>	tag	in	xml	file   |
| @BeforeClass   | Method with	this	annotation will	run	before	first	test	method	in	current	class |
| @AfterClass   | Method with	this	annotation will	run	after	last	test	method	in	current	class |
| @BeforeMethod | Method with	this	annotation will	run	before	each	test	method |
| @AfterMethod | Method with	this	annotation will	run	after	each	test	method |
  | @Test | The	annotated	method	is	a	part	of	a	test	case. |


**_Benefits of using annotations_**

1. TestNG identifies	the methods that it	is	interested	in	by	looking	up	annotations. Hence	method	names	are	not	restricted	to	any	pattern	or	format.
2. We	can	pass	additional	parameters	to	annotations.
3. Annotations	are	strongly	typed,	so	the	compiler	will	flag	any	mistakes	right	away.
4. Test	classes	no	longer	need	to	extend	anything	(such	as	Test	Case,	for	JUnit	3).
