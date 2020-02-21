
public class MClass extends BClass{
public static void main(String[] args) {
	browserLaunch();
	loadUrl("https://www.amazon.in/");
	LogPojoClass p=new LogPojoClass();
	select(p.getLists());
	
	select(p.getCreate());
fill(p.getUsername(),"sathish");
fill(p.getMob(),"9600183978");
fill(p.getMail(),"sathishsa77@gmail.com");
fill(p.getPass(),"Shopping12345");

}
}
