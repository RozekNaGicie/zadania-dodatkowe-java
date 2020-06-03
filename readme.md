<h1>**Selenium**<h1>
---
Selenium gradle import
<br>
_compile group: 'org.seleniumhq.selenium', name: 'selenium-java', version: '3.141.59'_
<br>
---
<h3>Obiekty i ich implementacje<h3>

-  Webdriver (new) <br>
    Każdy obiekt reprezentuje jedno otwarte okno przeglądarki, może mieć różne implementacje np. ChromeDriver/FirefoxDriver
- WebElement (statyczne) <br>
    Typ obiektu do którego przypisujemy elementy na stronie, inicjalizacja zmiennej tego typu odbywa się na obiekcie Webdriver
---
<h3>Metody<h3> 
-  get(); - wywolanie na obiekcie **Webdriver**, służy do przekazania adresu url do przeglądarki,
- findElement(); - metoda, która przyjmuje jako argumenty min. metody klasy statycznej By:<br>
- By: <br>
`findElement(By.className(String classname));` - wyszukuje po klasie html,<br>
`findElement(By.cssSelector(String cssSelector));` - wyszukuje po selektorze css,<br>
`findElement(By.id(String id));` - wyszukuje po id,<br>
`findElement(By.linkText(String linkText));` - do uzupełnienia,<br>
`findElement(By.name(String name));` - wyszukuje po nazwie,<br>
`findElement(By.partialLinkText(String partialLinkText));` - do uzupełnienia,<br>
`findElement(By.tagName(String tagName));` - do uzupełnienia,<br>
`findElement(By.xpath(String xpath));` - do uzupełnienia
- sendKeys(String keysToSend) - znaki jakie mają być przesłane np. do formualrza, wyszukiwarki, wywoływane na obiekcie typu **WebElement** 
  
