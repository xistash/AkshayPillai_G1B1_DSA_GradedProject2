package skyScraper;


public class Driver {

		
		public static void main(String[] args) {

			Service ProjectSkyScraper = new Service ();
			
			
			int size = ProjectSkyScraper.GetUserInput();

			
			ProjectSkyScraper.line();

			if (size > 0) {
				
				ProjectSkyScraper.insertValue(size);
				ProjectSkyScraper.line();
				ProjectSkyScraper.orderOfConstruction(size);
			} else {
				System.out.println("Total no of floors Can't be Zero or can't be Negative !!");
			}

		}

	}


