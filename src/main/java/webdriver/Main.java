package webdriver;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/jesuuca/Documents/webdriver/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.pino.mx/ti/lista.php");
		
		int aux = 1;
		
		String matricula[];
		matricula = new String[46];
		WebElement getMatricula;
		
		for(int i = 0; i <= 45; i++)
		{
			getMatricula = driver.findElement(By.id("m_"+aux));
			matricula[i] = getMatricula.getAttribute("value");
			
			aux++;
		}
		
		
		for(String listaDeMatriculas : matricula)
		{
			System.out.println(listaDeMatriculas);
		}
		
		driver.get("http://www.pino.mx/ti/lista.php");
		
	}
}
