package co.currency;

public class Application {
	
	public static void main(String[] args) {
		CountryInfoServiceSoapType service = 
				new CountryInfoService().getCountryInfoServiceSoap();
		System.out.println("Capital city is:="+service.capitalCity("USD"));
		System.out.println("Flag URL:="+service.countryFlag("IN"));
		//System.out.println(""+service.listOfLanguagesByName());
		ArrayOftLanguage language = service.listOfLanguagesByName();
		language.getTLanguage().forEach(System.out::println);
		
		System.out.println("+++++++++++++++++++++++++++++++++++");
		ArrayOftCurrency currency = service.listOfCurrenciesByName();
		currency.getTCurrency().forEach(System.out::println);
		//service.listOfLanguagesByName().//getList.forEach(System.out::println);
	}
}
