package model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class View {
	private BufferedReader br;
	
		public View() {
			
			br = new BufferedReader(new InputStreamReader(System.in));
			menu_view();
		}

		private void menu_view() {
			System.out.println("---Select one option---");
			System.out.println("1 - Best  Companies");
			System.out.println("2 - Worst Companies");
			System.out.println("3 - Best  Investors");
			System.out.println("4 - Worst Investors");
			String input = input();
			
			if(input.equals("1")){
				System.out.println("Good comp");
				menu_view();
			}
			else if(input.equals("2")){
				System.out.println("Bad comp");
				menu_view();
			}
			else if(input.equals("3")){
				System.out.println("Good inv");
				menu_view();
			}
			else if(input.equals("4")){
				System.out.println("Good inv");
				menu_view();
			}
			else {
				System.out.println("Not valid");
				menu_view();
			}
			
		}
		
		private String input() {
			String input;
			try {
				input = br.readLine();
				return input;
			} catch (IOException e) {
				e.printStackTrace();
				return input();
			}

		}
		
		
}
