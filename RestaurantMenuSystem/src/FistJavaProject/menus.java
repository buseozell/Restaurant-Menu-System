package FistJavaProject;

import java.security.SecureRandom;
import java.util.Scanner;

public class menus {
	
	public void startMenu() {
		
		Scanner a = new Scanner(System.in);
		System.out.println(ANSI_YELLOW +"-----------------------");
		System.out.println("WELCOME TO A RESTAURANT");
		System.out.println("-----------------------");
		System.out.println("For give order, Press 1");
		System.out.println("For admin login, Press 2");
		System.out.println("For pay your bill, Press 3");
		System.out.println("-----------------------" + ANSI_RESET);
		
		int answer =a.nextInt();
		
		while (true) {
			switch (answer) {
			case 1:
				System.out.println(ANSI_CYAN + "-=-=-=-=-=-=-=-=-=-=-");
				System.out.println("-Soup 1-");
				System.out.println("-Salads 2-");
				System.out.println("-Sides 3-");
				System.out.println("-Main course 4-");
				System.out.println("-Desserts 5-");
				System.out.println("-Beverage 6-");
				System.out.println("-=-=-=-=-=-=-=-=-=-=-" + ANSI_RESET);
				int select = a.nextInt();
				
				selectMenu(select);
				break;
			case 2:
				Scanner admin = new Scanner(System.in);
				boolean check = true;
				
				while (check) {
					
					System.out.println("-Enter Admin Username");
					String name = admin.next();
					System.out.println("-Enter Password-");
					String pass = admin.next();
					if (name.equals(admin_username) && pass.equals(admin_password)) {
						check = false;
						adminPanel(name);
					}
					else if (name.equals(admin2_username) && pass.equals(admin2_password)) {
						check = false;
						adminPanel(name);
					}
					else {
						System.err.println("Try Again!");
					}
					
				}
				break;
			case 3: 
				System.out.println("Your total bill is: " + totalPriceCntr);
				totalPriceCntr = 0.0;
				System.out.println("Thanks for coming...");
				startMenu();
				break;
				
				default:
					System.out.println("Please try again!");
					startMenu();
					
					break;
			}
			break;
			
		}
		
		
	}
	
	public void adminPanel(String username) {
		int control;
		System.out.println(ANSI_PURPLE + "Welcome " + username + ANSI_RESET);
		do {
			System.out.println(ANSI_BLUE + "<> <> <> <> <> <> <> <> <> <> <>" + ANSI_RESET);
			System.out.println(ANSI_PURPLE + "Press 1 for see ingredients stocks");
			System.out.println("Press 2 for other stocks");
			System.out.println("Press 3 for employee list");
			System.out.println("Press 4 for working hours");
			System.out.println("Press 5 for paying salaries" + ANSI_RESET);
			System.out.println(ANSI_RED + "Press 6 to exit" + ANSI_RESET);
			System.out.println(ANSI_BLUE + "<> <> <> <> <> <> <> <> <> <> <>" + ANSI_RESET);
			Scanner b = new Scanner (System.in);
			control = b.nextInt();
			switch (control) {
			case 1: 
				System.out.println(ANSI_YELLOW + "Tomato stocks are: " + ANSI_BLUE + tomatoCntr + ANSI_RESET);
				System.out.println(ANSI_YELLOW + "Oil stocks are: " + ANSI_BLUE + oilCntr + ANSI_RESET);
				System.out.println(ANSI_YELLOW + "Lentil stocks are: " + ANSI_BLUE + lentilCntr + ANSI_RESET);
				System.out.println(ANSI_YELLOW + "Yoghurt stocks are: " + ANSI_BLUE + yoghurtCntr + ANSI_RESET);
				System.out.println(ANSI_YELLOW + "Rice stocks are: " + ANSI_BLUE + riceCntr + ANSI_RESET);
				System.out.println(ANSI_YELLOW + "Potato stocks are: " + ANSI_BLUE + potatoCntr + ANSI_RESET);
				System.out.println(ANSI_YELLOW + "Onion stocks are: " + ANSI_BLUE + onionCntr + ANSI_RESET);
				System.out.println(ANSI_YELLOW + "Lettuce stocks are: " + ANSI_BLUE + lettuceCntr + ANSI_RESET);
				System.out.println(ANSI_YELLOW + "Parsley stocks are: " + ANSI_BLUE + parsleyCntr + ANSI_RESET);
				System.out.println(ANSI_YELLOW + "Chicken stocks are: " + ANSI_BLUE + chickenCntr + ANSI_RESET);
				System.out.println(ANSI_YELLOW + "Beef stocks are: " + ANSI_BLUE + beefCntr + ANSI_RESET);
				System.out.println(ANSI_YELLOW + "Carrot stocks are: " + ANSI_BLUE + carrotCntr + ANSI_RESET);
				System.out.println(ANSI_YELLOW + "Dough stocks are: " + ANSI_BLUE + doughCntr + ANSI_RESET);
				System.out.println(ANSI_YELLOW + "Meat stocks are: " + ANSI_BLUE + meatCntr + ANSI_RESET);
				System.out.println(ANSI_YELLOW + "Cheese stocks are: " + ANSI_BLUE + cheeseCntr + ANSI_RESET);
				System.out.println(ANSI_LIGHTBLUE + "Press 1 for organize tomato stocks (10$)");
				System.out.println("Press 2 for organize oil stocks (15$)");
				System.out.println("Press 3 for organize lentil stocks (12$)");
				System.out.println("Press 4 for organize yoghurt stocks (12$)");
				System.out.println("Press 5 for organize rice stocks (10$)");
				System.out.println("Press 6 for organize potato stocks (3$)");
				System.out.println("Press 7 for organize onion stocks (7$)");
				System.out.println("Press 8 for organize lettuce stocks (5$)");
				System.out.println("Press 9 for organize parsley stocks (5$)");
				System.out.println("Press 10 for organize chicken stocks (10$)");
				System.out.println("Press 11 for organize beef stocks (20$)");
				System.out.println("Press 12 for organize carrot stocks (5$)");
				System.out.println("Press 13 for organize dough stocks (5$)");
				System.out.println("Press 14 for organize meat stocks (20$)");
				System.out.println("Press 15 for organize bread stocks (5$)");
				System.out.println("Press 16 for organize cheese stocks (5$)");
				System.out.println("Press 0 for exit" + ANSI_RESET);
				System.out.println(ANSI_GREEN_BACKGROUND + "Press 100 for increase all the stocks (144.0$)" + ANSI_RESET);
				
				int fillstocks = b.nextInt();
				switch (fillstocks) {
				case 0: 
					adminPanel(gobackadminpanel);
				case 1:
					tomatoCntr += 10;
					totalCafeMoneyCntr -= 15.0;
					System.out.println("10 kg tomatoes added to stocks");
					adminPanel(gobackadminpanel);
					break;
				case 2:
					oilCntr += 10;
					totalCafeMoneyCntr -= 15.0;
					System.out.println("10 litres oil added to stocks");
					adminPanel(gobackadminpanel);
					break;
				case 3:
					lentilCntr += 12;
					totalCafeMoneyCntr -= 10.0;
					System.out.println("10 kg lentil added to stocks");
					adminPanel(gobackadminpanel);
					break;
				case 4:
					yoghurtCntr += 10;
					totalCafeMoneyCntr -= 12.0;
					System.out.println("10 kg yoghurt added to stocks");
					adminPanel(gobackadminpanel);
					break;
				case 5:
					riceCntr += 10;
					totalCafeMoneyCntr -= 10.0;
					System.out.println("10 kg rice added to stocks");
					adminPanel(gobackadminpanel);
					break;
				case 6:
					potatoCntr += 10;
					totalCafeMoneyCntr -= 3.0;
					System.out.println("10 kg potato added to stocks");
					adminPanel(gobackadminpanel);
					break;
				case 7:
					onionCntr += 10;
					totalCafeMoneyCntr -= 7.0;
					System.out.println("10 kg onion added to stocks");
					adminPanel(gobackadminpanel);
					break;
				case 8:
					lettuceCntr += 10;
					totalCafeMoneyCntr -= 5.0;
					System.out.println("10 kg lettuce added to stocks");
					adminPanel(gobackadminpanel);
					break;
				case 9:
					parsleyCntr += 10;
					totalCafeMoneyCntr -= 5.0;
					System.out.println("10 kg parsley added to stocks");
					adminPanel(gobackadminpanel);
					break;
				case 10:
					chickenCntr += 10;
					totalCafeMoneyCntr -= 10.0;
					System.out.println("Chicken added to stocks");
					adminPanel(gobackadminpanel);
					break;
				case 11:
					beefCntr += 10;
					totalCafeMoneyCntr -= 20.0;
					System.out.println("Beef added to stocks");
					adminPanel(gobackadminpanel);
					break;
				case 12:
					carrotCntr += 10;
					totalCafeMoneyCntr -= 5.0;
					System.out.println("10 kg carrot added to stocks");
					adminPanel(gobackadminpanel);
					break;
				case 13:
					doughCntr += 10;
					totalCafeMoneyCntr -= 5.0;
					System.out.println("10 kg dough added to stocks");
					adminPanel(gobackadminpanel);
					break;
				case 14:
					meatCntr += 10;
					totalCafeMoneyCntr -= 20.0;
					System.out.println("Meat added to stocks");
					adminPanel(gobackadminpanel);
					break;
				case 15:
					breadCntr += 10;
					totalCafeMoneyCntr -= 5.0;
					System.out.println("Bread added to stocks");
					adminPanel(gobackadminpanel);
					break;
				case 16:
					cheeseCntr += 10;
					totalCafeMoneyCntr -= 5.0;
					System.out.println("Cheese added to stocks");
					adminPanel(gobackadminpanel);
					break;
				case 100:
					tomatoCntr += 10;
					oilCntr += 10;
					lentilCntr += 10;
					yoghurtCntr += 10;
					riceCntr += 10;
					potatoCntr += 10;
					onionCntr += 10;
					lettuceCntr += 10;
					parsleyCntr += 10;
					chickenCntr += 10;
					beefCntr += 10;
					carrotCntr += 10;
					doughCntr += 10;
					meatCntr += 10;
					breadCntr += 10;
					cheeseCntr += 10;
					totalCafeMoneyCntr -= 144.0;
					System.out.println(ANSI_PURPLE_BACKGROUND + "ALL STOCKS INCREASED" + ANSI_RESET);
					break;
					default:
						System.out.println("Please choose available number");
						adminPanel(gobackadminpanel);
						break;
						
					
				}
				
				break;
			case 2: 
				System.out.println(ANSI_YELLOW + "Baklava stocks are: " + ANSI_BLUE + baklavaCntr + ANSI_RESET);
				System.out.println(ANSI_YELLOW + "Cheesecake stocks are: " + ANSI_BLUE + cheesecakeCntr + ANSI_RESET);
				System.out.println(ANSI_YELLOW + "Chocolate stocks are: " + ANSI_BLUE + chocolateCntr + ANSI_RESET);
				System.out.println(ANSI_YELLOW + "Water stocks are: " + ANSI_BLUE + waterCntr + ANSI_RESET);
				System.out.println(ANSI_YELLOW + "Tea stocks are: " + ANSI_BLUE + teaCntr + ANSI_RESET);
				System.out.println(ANSI_YELLOW + "Latte stocks are: " + ANSI_BLUE + latteCntr + ANSI_RESET);
				System.out.println(ANSI_YELLOW + "Juice stocks are: " + ANSI_BLUE + juiceCntr + ANSI_RESET);
				System.out.println(ANSI_YELLOW + "Turkish coffee stocks are: " + ANSI_BLUE + turkishcoffeeCntr + ANSI_RESET);
				System.out.println(ANSI_LIGHTBLUE + "Press 1 for organize baklava stocks (20$)");
				System.out.println("Press 2 for organize cheesecake stocks (15$)");
				System.out.println("Press 3 for organize chocolate stocks (12$)");
				System.out.println("Press 4 for organize water stocks (5$)");
				System.out.println("Press 5 for organize tea stocks (10$)");
				System.out.println("Press 6 for organize latte stocks (13$)");
				System.out.println("Press 7 for organize juice stocks (7$)");
				System.out.println("Press 8 for organize coffee stocks (7$)");
				System.out.println("Press 0 for exit" + ANSI_RESET);
				System.out.println(ANSI_GREEN_BACKGROUND + "Press 100 for increase all the stocks (89.0$)" + ANSI_RESET);
				
				int fillstocks2 = scan.nextInt();
				switch (fillstocks2) {
				case 0: 
					adminPanel(gobackadminpanel);
				case 1:
					baklavaCntr += 10;
					totalCafeMoneyCntr -= 20.0;
					System.out.println("Baklava added to stocks");
					break;
				case 2:
					cheesecakeCntr += 10;
					totalCafeMoneyCntr -= 15.0;
					System.out.println("Cheesecake added to stocks");
					break;
				case 3:
					chocolateCntr += 10;
					totalCafeMoneyCntr -= 12.0;
					System.out.println("Chocolate added to stocks");
					break;
				case 4:
					waterCntr += 10;
					totalCafeMoneyCntr -= 5.0;
					System.out.println("Water added to stocks");
					break;
				case 5:
					teaCntr += 10;
					totalCafeMoneyCntr -= 10.0;
					System.out.println("Tea added to stocks");
					break;
				case 6:
					latteCntr += 10;
					totalCafeMoneyCntr -= 13.0;
					System.out.println("Latte added to stocks");
					break;
				case 7:
					juiceCntr += 10;
					totalCafeMoneyCntr -= 7.0;
					System.out.println("Juice added to stocks");
					break;
				case 8:
					turkishcoffeeCntr += 10;
					totalCafeMoneyCntr -= 7.0;
					System.out.println("Turkish coffee added to stocks");
					break;
				case 100:
					baklavaCntr += 10;
					cheesecakeCntr += 10;
					chocolateCntr += 10;
					waterCntr += 10;
					teaCntr += 10;
					latteCntr += 10;
					juiceCntr += 10;
					turkishcoffeeCntr += 10;
					totalCafeMoneyCntr += 89.0;
					System.out.println(ANSI_PURPLE_BACKGROUND + "ALL STOCKS INCREASED" + ANSI_RESET);
							
				
				}
				break;
			case 3:
				System.out.println(ANSI_YELLOW + "Cafe Manager: Buse Ozel");
				System.out.println("Cashier: Berke Gençkaya");
				System.out.println("Waiter 1: Freddy Fazbear");
				System.out.println("Waiter 2: Arthur Smith" + ANSI_RESET);
				adminPanel(gobackadminpanel);
				break;
			case 4:
				System.out.println("Berke Gençkaya: 1AM-5PM");
				System.out.println("Freddy Fazbear: 9PM-9AM");
				System.out.println("Arthur Smith: 12AM-6AM" + ANSI_RESET);
				adminPanel(gobackadminpanel);
				break;
			case 5:
				double totalBalanceCntr = totalCafeMoneyCntr + totalPriceCntr;
				System.out.println(ANSI_YELLOW + "The total balance is: " + totalBalanceCntr + "$" + ANSI_RESET);
				System.out.println(ANSI_CYAN + "Press 1 for pay Berke Gençkaya's salary (200$)");
				System.out.println("Press 2 for pay Freddy Fazbear's salary (120$)");
				System.out.println("Press 3 for pay Arthur Smith's salary (150$)");
				System.out.println("Press 4 for pay ....'s salary (120$)" + ANSI_RESET);
				
				int salary = scan.nextInt();
				switch(salary) {
				case 1:
					System.out.println("Process successfully completed.");
					totalCafeMoneyCntr -=200;
					adminPanel(gobackadminpanel);
					break;
				case 2:
					System.out.println("Process successfully completed.");
					totalCafeMoneyCntr -=120;
					adminPanel(gobackadminpanel);
					break;
				case 3:
					System.out.println("Process successfully completed.");
					totalCafeMoneyCntr -=150;
					adminPanel(gobackadminpanel);
					break;
				case 4:
					System.out.println("Process successfully completed.");
					totalCafeMoneyCntr -=120;
					adminPanel(gobackadminpanel);
					break;
					default: 
						adminPanel(gobackadminpanel);
						break;	
					
				}
			case 6:
				System.out.println("Good Bye!!!");
				startMenu();
				break;
				
				default:
					System.out.println("Choice a value between 1 and 5");
						
				
			}
		}while (control !=4);
		
		
	}
	
	public void selectMenu(int selection) {
		switch (selection)  {
		case 1:
			System.out.println("-=-=-=-=-=-=-=-=-=-=-");
			System.out.println("+ 1-Lentil Soup +");
			System.out.println("+ 2-Yoghurt Soup +");
			System.out.println("+ 3-Tomato Soup +");
			System.out.println("-=-=-=-=-=-=-=-=-=-=-");
			
		    Scanner b = new Scanner (System.in);
		    selection = b.nextInt();
		    soupMenu(selection);
		    break;
		case 2:
			System.out.println("-=-=-=-=-=-=-=-=-=-=-");
			System.out.println("+ 1-Chicken Salad +");
			System.out.println("+ 2-Beef Salad +");
			System.out.println("+ 3-Cheese Salad +");
			System.out.println("-=-=-=-=-=-=-=-=-=-=-");
			
		    Scanner s = new Scanner (System.in);
		    selection = s.nextInt();
		    saladMenu(selection);
		    break;
		case 3:
			System.out.println("-=-=-=-=-=-=-=-=-=-=-");
			System.out.println("+ 1-Yoghurt +");
			System.out.println("+ 2-French Fries +");
			System.out.println("+ 3-Rice +");
			System.out.println("-=-=-=-=-=-=-=-=-=-=-");
			
		    Scanner m = new Scanner (System.in);
		    selection = m.nextInt();
		    sidesMenu(selection);
		    break;
		case 4:
			System.out.println("-=-=-=-=-=-=-=-=-=-=-");
			System.out.println("+ 1-Mantý +");
			System.out.println("+ 2-Hamburger +");
			System.out.println("+ 3-Margharita Pizza +");
			System.out.println("-=-=-=-=-=-=-=-=-=-=-");
			
		    Scanner y = new Scanner (System.in);
		    selection = y.nextInt();
		    maincourseMenu(selection);
		    break;
		case 5:
			System.out.println("-=-=-=-=-=-=-=-=-=-=-");
			System.out.println("+ 1-Baklava +");
			System.out.println("+ 2-Raspberry Cheesecake +");
			System.out.println("+ 3-Chocolate Cake +");
			System.out.println("-=-=-=-=-=-=-=-=-=-=-");
			
		    Scanner u = new Scanner (System.in);
		    selection = u.nextInt();
		    desertsMenu(selection);
		    break;
		case 6:
			System.out.println("-=-=-=-=-=-=-=-=-=-=-");
			System.out.println("+ 1-Tea +");
			System.out.println("+ 2-Turkish Coffee +");
			System.out.println("+ 3-Cola +");
			System.out.println("+ 4-Ice Latte +");
			System.out.println("+ 5-Water +");
			System.out.println("+ 6-Fruit Juice +");
			System.out.println("-=-=-=-=-=-=-=-=-=-=-");
			
		    Scanner l = new Scanner (System.in);
		    selection = l.nextInt();
		    beveragesMenu(selection);
		    break;
		    
		    default:
		    	System.out.println("Please try again");
		    	startMenu();
		    	break;
		    	
			
		}
	}
	
	public void soupMenu(int soup) {
		Scanner b = new Scanner (System.in);
		switch(soup)  {
		case 1:
			if(lentilCntr<=0)
				System.out.println(ANSI_RED + "Lentil stocks are empty, please choose an other food" + ANSI_RESET);
			if(oilCntr<=0)
				System.out.println(ANSI_RED + "Oil stocks are empty, please choose an other food" + ANSI_RESET);
			if(onionCntr<=0)
				System.out.println(ANSI_RED + "Onion stocks are empty, please choose an other food" + ANSI_RESET);
			if(potatoCntr<=0)
				System.out.println(ANSI_RED + "Potato stocks are empty, please choose an other food" + ANSI_RESET);
			if(lentilCntr>0 && oilCntr>0 && onionCntr>0 && potatoCntr>0) {
				System.out.println(ANSI_GREEN + "Your order received. Lentil soup is preparing" + ANSI_RESET);
				totalPriceCntr += 2.0;
				lentilCntr--;
				oilCntr--;
				onionCntr--;
				potatoCntr--; 
			}
				System.out.println("Total price is: " + totalPriceCntr + "$");
				startMenu();
				break;
		case 2:
			if(yoghurtCntr<=0)
				System.out.println(ANSI_RED + "Yoghurt stocks are empty, please choose an other food" + ANSI_RESET);
			if(oilCntr<=0)
				System.out.println(ANSI_RED + "Oil stocks are empty, please choose an other food" + ANSI_RESET);
			if(riceCntr<=0)
				System.out.println(ANSI_RED + "Rice stocks are empty, please choose an other food" + ANSI_RESET);
			if(yoghurtCntr>0 && oilCntr>0 && riceCntr>0) {
				System.out.println(ANSI_GREEN + "Your order received. Yoghurt soup is preparing" + ANSI_RESET);
				totalPriceCntr += 2.0;
				yoghurtCntr--;
				oilCntr--;
				riceCntr--;
				 
			}
				System.out.println("Total price is: " + totalPriceCntr + "$");
				startMenu();
				break;
		case 3:
			if(tomatoCntr<=0)
				System.out.println(ANSI_RED + "Tomato stocks are empty, please choose an other food" + ANSI_RESET);
			if(oilCntr<=0)
				System.out.println(ANSI_RED + "Oil stocks are empty, please choose an other food" + ANSI_RESET);
			if(tomatoCntr>0 && oilCntr>0 ) {
				System.out.println(ANSI_GREEN + "Your order received. Tomato soup is preparing." + ANSI_RESET);
				totalPriceCntr += 1.5;
				tomatoCntr--;
				oilCntr--;
				
			}
				System.out.println("Total price is: " + totalPriceCntr + "$");
				startMenu();
				break;
				default:
					System.out.println("Please choose available number");
					int x = b.nextInt();
					soupMenu(x);
					break;
					
			
		}
	}
	
	public void saladMenu(int salad) {
		Scanner v = new Scanner (System.in);
		switch (salad) {
		case 1:
			if(carrotCntr<=0)
				System.out.println(ANSI_RED + "Carrot stocks are empty, please choose an other food" + ANSI_RESET);
			if(chickenCntr<=0)
				System.out.println(ANSI_RED + "Chicken stocks are empty, please choose an other food" + ANSI_RESET);
			if(lettuceCntr<=0)
				System.out.println(ANSI_RED + "Lettuce stocks are empty, please choose an other food" + ANSI_RESET);
			if(parsleyCntr<=0)
				System.out.println(ANSI_RED + "Parsley stocks are empty, please choose an other food" + ANSI_RESET);
			if(oilCntr<=0)
				System.out.println(ANSI_RED + "Oil stocks are empty, please choose an other food" + ANSI_RESET);
			if(carrotCntr>0 && chickenCntr>0 && lettuceCntr>0 && parsleyCntr>0 && oilCntr>0) {
				System.out.println(ANSI_GREEN + "Your order received. Chicken Salad is preparing" + ANSI_RESET);
				totalPriceCntr += 4.0;
				carrotCntr--;
				chickenCntr--;
				lettuceCntr--;
				parsleyCntr--; 
				oilCntr--;
			}
				System.out.println("Total price is: " + totalPriceCntr + "$");
				startMenu();
				break;
		case 2:
			if(beefCntr<=0)
				System.out.println(ANSI_RED + "Beef stocks are empty, please choose an other food" + ANSI_RESET);
			if(oilCntr<=0)
				System.out.println(ANSI_RED + "Oil stocks are empty, please choose an other food" + ANSI_RESET);
			if(lettuceCntr<=0)
				System.out.println(ANSI_RED + "Lettuce stocks are empty, please choose an other food" + ANSI_RESET);
			if(carrotCntr<=0)
				System.out.println(ANSI_RED + "Carrot stocks are empty, please choose an other food" + ANSI_RESET);
			if(parsleyCntr<=0)
				System.out.println(ANSI_RED + "Parsley stocks are empty, please choose an other food" + ANSI_RESET);
			if(carrotCntr>0 && beefCntr>0 && lettuceCntr>0 && parsleyCntr>0 && oilCntr>0) {
				System.out.println(ANSI_GREEN + "Your order received. Beef Salad is preparing" + ANSI_RESET);
				totalPriceCntr += 6.0;
				carrotCntr--;
				beefCntr--;
				lettuceCntr--;
				parsleyCntr--; 
				oilCntr--;
			}
				System.out.println("Total price is: " + totalPriceCntr + "$");
				startMenu();
				break;
		case 3:
			if(cheeseCntr<=0)
				System.out.println(ANSI_RED + "Cheese stocks are empty, please choose an other food" + ANSI_RESET);
			if(oilCntr<=0)
				System.out.println(ANSI_RED + "Oil stocks are empty, please choose an other food" + ANSI_RESET);
			if(lettuceCntr<=0)
				System.out.println(ANSI_RED + "Lettuce stocks are empty, please choose an other food" + ANSI_RESET);
			if(carrotCntr<=0)
				System.out.println(ANSI_RED + "Carrot stocks are empty, please choose an other food" + ANSI_RESET);
			if(parsleyCntr<=0)
				System.out.println(ANSI_RED + "Parsley stocks are empty, please choose an other food" + ANSI_RESET);
			if(carrotCntr>0 && cheeseCntr>0 && lettuceCntr>0 && parsleyCntr>0 && oilCntr>0) {
				System.out.println(ANSI_GREEN + "Your order received. Cheese Salad is preparing" + ANSI_RESET);
				totalPriceCntr += 3.0;
				carrotCntr--;
				cheeseCntr--;
				lettuceCntr--;
				parsleyCntr--; 
				oilCntr--;
			}
				System.out.println("Total price is: " + totalPriceCntr + "$");
				startMenu();
				break;
				default:
					System.out.println("Please choose available number");
					int z = v.nextInt();
					saladMenu(z);
					//break;
					
		}
	}
	
	public void sidesMenu(int sides) {
		switch (sides) {
		case 1:
			if(yoghurtCntr<=0)
				System.out.println(ANSI_RED + "Yoghurt stocks are empty, please choose an other food " + ANSI_RESET);
			if(yoghurtCntr>0) {
				System.out.println(ANSI_GREEN + "Your order received" + ANSI_RESET);
				totalPriceCntr += 1.0;
				yoghurtCntr--;
			}
			System.out.println("Total price is: " + totalPriceCntr + "$");
			startMenu();
			break;
		case 2:
			if(potatoCntr<=0)
				System.out.println(ANSI_RED + "Potato stocks are empty, please choose an other food " + ANSI_RESET);
			if(oilCntr<=0)
				System.out.println(ANSI_RED + "Oil stocks are empty, please choose an other food " + ANSI_RESET);
			if(potatoCntr>0 && oilCntr>0) {
				System.out.println(ANSI_GREEN + "Your order received" + ANSI_RESET);
				totalPriceCntr += 1.5;
				potatoCntr--;
				oilCntr--;
				
			}
			System.out.println("Total price is: " + totalPriceCntr + "$");
			startMenu();
			break;
		case 3:
			if(riceCntr<=0)
				System.out.println(ANSI_RED + "Rice stocks are empty, please choose an other food " + ANSI_RESET);
			if(oilCntr<=0)
				System.out.println(ANSI_RED + "Oil stocks are empty, please choose an other food " + ANSI_RESET);
			if(riceCntr>0 && oilCntr>0) {
				System.out.println(ANSI_GREEN + "Your order received" + ANSI_RESET);
				totalPriceCntr += 1.5;
				riceCntr--;
				oilCntr--;
				
			}
			System.out.println("Total price is: " + totalPriceCntr + "$");
			startMenu();
			break;
			
			default:
				System.out.println("Please choose available number");
				int side = scan.nextInt();
				saladMenu(side);
				//break;
		}
	}
	
	public void maincourseMenu(int course) {
		switch(course) {
		case 1:
			if(oilCntr<=0)
				System.out.println(ANSI_RED + "Oil stocks are empty, please choose an other food" + ANSI_RESET);
			if(yoghurtCntr<=0)
				System.out.println(ANSI_RED + "Yoghurt stocks are empty, please choose an other food" + ANSI_RESET);
			if(meatCntr<=0)
				System.out.println(ANSI_RED + "Meat stocks are empty, please choose an other food" + ANSI_RESET);
			if(doughCntr<=0)
				System.out.println(ANSI_RED + "Dough stocks are empty, please choose an other food" + ANSI_RESET);
			if(doughCntr>0 && oilCntr>0 && meatCntr>0 && yoghurtCntr>0) {
				System.out.println(ANSI_GREEN + "Your order received. Mantý is preparing" + ANSI_RESET);
				totalPriceCntr += 4.0;
				doughCntr--;
				meatCntr--;
				oilCntr--;
				yoghurtCntr--; 
				
			}
				System.out.println("Total price is: " + totalPriceCntr + "$");
				startMenu();
				break;
		case 2:
			if(breadCntr<=0)
				System.out.println(ANSI_RED + "Bread stocks are empty, please choose an other food" + ANSI_RESET);
			if(meatCntr<=0)
				System.out.println(ANSI_RED + "Meat stocks are empty, please choose an other food" + ANSI_RESET);
			if(oilCntr<=0)
				System.out.println(ANSI_RED + "Oil stocks are empty, please choose an other food" + ANSI_RESET);
			if(cheeseCntr<=0)
				System.out.println(ANSI_RED + "Cheese stocks are empty, please choose an other food" + ANSI_RESET);
			if(tomatoCntr<=0)
				System.out.println(ANSI_RED + "Tomato stocks are empty, please choose an other food" + ANSI_RESET);
			if(lettuceCntr<=0)
				System.out.println(ANSI_RED + "Lettuce stocks are empty, please choose an other food" + ANSI_RESET);
			if(meatCntr>0 && oilCntr>0 && cheeseCntr>0 && tomatoCntr>0 && breadCntr>0 && lettuceCntr>0) {
				System.out.println(ANSI_GREEN + "Your order received. Hamburger is preparing" + ANSI_RESET);
				totalPriceCntr += 3.5;
				meatCntr--;
				oilCntr--;
				lettuceCntr--;
				cheeseCntr--; 
				tomatoCntr--;
				breadCntr--;
				
			}
				System.out.println("Total price is: " + totalPriceCntr + "$");
				startMenu();
				break;
		case 3:
			if(oilCntr<=0)
				System.out.println(ANSI_RED + "Oil stocks are empty, please choose an other food" + ANSI_RESET);
			if(cheeseCntr<=0)
				System.out.println(ANSI_RED + "Cheese stocks are empty, please choose an other food" + ANSI_RESET);
			if(tomatoCntr<=0)
				System.out.println(ANSI_RED + "Tomato stocks are empty, please choose an other food" + ANSI_RESET);
			if(doughCntr<=0)
				System.out.println(ANSI_RED + "Dough stocks are empty, please choose an other food" + ANSI_RESET);
			
			if(doughCntr>0 && oilCntr>0 && tomatoCntr>0 && cheeseCntr>0) {
				System.out.println(ANSI_GREEN + "Your order received. Margharita Pizza is preparing" + ANSI_RESET);
				totalPriceCntr += 4.0;
				oilCntr--;
				cheeseCntr--;
				tomatoCntr--; 
				doughCntr--;
				
			}
				System.out.println("Total price is: " + totalPriceCntr + "$");
				startMenu();
				break;
				
				default:
					System.out.println("Please choose available number");
					int main = scan.nextInt();
					maincourseMenu(main);
					//break;
				
		}
	}
	
	public void desertsMenu(int desert) {
		switch (desert) {
		case 1:
			if(baklavaCntr<=0)
				System.out.println(ANSI_RED + "Baklava stocks are empty, please choose an other food " + ANSI_RESET);
			else {
				System.out.println(ANSI_GREEN + "Your order received" + ANSI_RESET);
				totalPriceCntr += 3.0;
				baklavaCntr--;
			}
			System.out.println("Total price is: " + totalPriceCntr + "$");
			startMenu();
			break;
		case 2:
			if(cheesecakeCntr<=0)
				System.out.println(ANSI_RED + "Cheesecake stocks are empty, please choose an other food " + ANSI_RESET);
			else {
				System.out.println(ANSI_GREEN + "Your order received" + ANSI_RESET);
				totalPriceCntr += 2.5;
				cheesecakeCntr--;
			}
			System.out.println("Total price is: " + totalPriceCntr + "$");
			startMenu();
			break;
		case 3:
			if(chocolateCntr<=0)
				System.out.println(ANSI_RED + "Chocolate stocks are empty, please choose an other food " + ANSI_RESET);
			else {
				System.out.println(ANSI_GREEN + "Your order received" + ANSI_RESET);
				totalPriceCntr += 2.0;
				chocolateCntr--;
			}
			System.out.println("Total price is: " + totalPriceCntr + "$");
			startMenu();
			break;
			
			default:
				System.out.println("Please choose available number");
				int desertt = scan.nextInt();
				desertsMenu(desertt);
				break;
				
		}
	}
	
	public void beveragesMenu(int bever) {
		switch(bever) {
		case 1:
			if(teaCntr<=0)
				System.out.println(ANSI_RED + "Tea stocks are empty, please choose an other food " + ANSI_RESET);
			else {
				System.out.println(ANSI_GREEN + "Your order received" + ANSI_RESET);
				totalPriceCntr += 0.5;
				teaCntr--;
			}
			System.out.println("Total price is: " + totalPriceCntr + "$");
			startMenu();
			break;
		case 2:
			if(turkishcoffeeCntr<=0)
				System.out.println(ANSI_RED + "Coffee stocks are empty, please choose an other food " + ANSI_RESET);
			else {
				System.out.println(ANSI_GREEN + "Your order received" + ANSI_RESET);
				totalPriceCntr += 1.0;
				turkishcoffeeCntr--;
			}
			System.out.println("Total price is: " + totalPriceCntr + "$");
			startMenu();
			break;
		case 3:
			if(colaCntr<=0)
				System.out.println(ANSI_RED + "Cola stocks are empty, please choose an other food " + ANSI_RESET);
			else {
				System.out.println(ANSI_GREEN + "Your order received" + ANSI_RESET);
				totalPriceCntr += 1.0;
				colaCntr--;
			}
			System.out.println("Total price is: " + totalPriceCntr + "$");
			startMenu();
			break;
		case 4:
			if(latteCntr<=0)
				System.out.println(ANSI_RED + "latte stocks are empty, please choose an other food " + ANSI_RESET);
			else {
				System.out.println(ANSI_GREEN + "Your order received" + ANSI_RESET);
				totalPriceCntr += 1.5;
				latteCntr--;
			}
			System.out.println("Total price is: " + totalPriceCntr + "$");
			startMenu();
			break;
		case 5:
			if(waterCntr<=0)
				System.out.println(ANSI_RED + "Water stocks are empty, please choose an other food " + ANSI_RESET);
			else {
				System.out.println(ANSI_GREEN + "Your order received" + ANSI_RESET);
				totalPriceCntr += 0.25;
				waterCntr--;
			}
			System.out.println("Total price is: " + totalPriceCntr + "$");
			startMenu();
			break;
		case 6:
			if(juiceCntr<=0)
				System.out.println(ANSI_RED + "Juice stocks are empty, please choose an other food " + ANSI_RESET);
			else {
				System.out.println(ANSI_GREEN + "Your order received" + ANSI_RESET);
				totalPriceCntr += 1.0;
				juiceCntr--;
			}
			System.out.println("Total price is: " + totalPriceCntr + "$");
			startMenu();
			break;
			
			default:
				System.out.println("Please choose available number");
				int beverages = scan.nextInt();
				beveragesMenu(beverages);
				//break;
		}
	}
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	public static final String ANSI_LIGHTBLUE = "\u001b[34;1m";
	public static final String ANSI_RED_BACKGROUND= "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	
	public static final String admin_username = "buse";
	public static final String admin_password = "123";
	public static final String admin2_username = "berke";
	public static final String admin2_password = "321";
	
	Scanner scan = new Scanner (System.in);
	SecureRandom rand = new SecureRandom();
	String gobackadminpanel = new String();
	int random;
	
	private double totalCafeMoneyCntr = 1590.0;
	private double totalPriceCntr = 0.0;
	private int tomatoCntr = random = rand.nextInt(10);
	private int oilCntr = random = rand.nextInt(10);
	private int lentilCntr = random = rand.nextInt(10);
	private int yoghurtCntr = random = rand.nextInt(10);
	private int riceCntr = random = rand.nextInt(10);
	private int potatoCntr = random = rand.nextInt(10);
	private int onionCntr = random = rand.nextInt(10);
	private int lettuceCntr = random = rand.nextInt(10);
	private int parsleyCntr = random = rand.nextInt(10);
	private int carrotCntr = random = rand.nextInt(10);
	private int chickenCntr = random = rand.nextInt(10);
	private int beefCntr = random = rand.nextInt(10);
	private int meatCntr = random = rand.nextInt(10);
	private int doughCntr = random = rand.nextInt(10);
	private int cheeseCntr = random = rand.nextInt(10);
	private int breadCntr = random = rand.nextInt(10);
	private int baklavaCntr = random = rand.nextInt(10);
	private int cheesecakeCntr = random = rand.nextInt(10);
	private int chocolateCntr = random = rand.nextInt(10);
	private int teaCntr = random = rand.nextInt(10);
	private int waterCntr = random = rand.nextInt(10);
	private int latteCntr = random = rand.nextInt(10);
	private int colaCntr = random = rand.nextInt(10);
	private int juiceCntr = random = rand.nextInt(10);
	private int turkishcoffeeCntr = random = rand.nextInt(10);
	


}

