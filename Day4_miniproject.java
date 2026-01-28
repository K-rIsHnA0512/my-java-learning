import javagenesis;
import java.util.Scanner;
public class Day4_miniproject{
    public static void main(String[]  args){


        // Hey There ! Welcome To my Java Learning Series
        // lets make a simple java mini project via the syntax we have learned till now which are operators , data types , variables , input-output , switch , loops , conditional statements and so on .

        // we will make a simple shoping billing system where user will enter the items via serial number they want and the quantity of each item and the programm will calculate the total bill including the taxes and discounts (if they have purchased over a certain amount)


        // the taxes range will be 5 percent if bill <= 1000 , 10 percent if bill > 1000 and <= 5000 , 15 percent if bill >= 5000

        // the discount will be 5 percent if bill >= 2000 , 10 percent if bill >= 5000


        // we will print the available items in the shop via thier number ranging from 1 to 50 so that the user can easily select the items they want to purchase via thier serial number

        // we will return the bill in round figure so the cents will go to charity if user says yes then round off else
        // we will return the bill in the exact amounts


        // first of all lets make a scanner so we can take inputs from the customer
        Scanner scanner = new Scanner(System.in);
        System.out.println("============================================");

        System.out.println("Welcome To Nihon no Konbini (Japan's Convenience Store) ! ❤️🏪");
        System.out.println("--------------------------------------------");
        System.out.println();
        System.out.println("Here is the list of available items in our shop : ");
        System.out.println();
        String[] items = {
                "おにぎり (Rice Ball)",
                "焼きおにぎり (Grilled Rice Ball)",
                "サンドイッチ (Sandwich)",
                "ハムチーズサンド (Ham & Cheese Sandwich)",
                "カップラーメン (Cup Noodles)",
                "即席焼きそば (Instant Yakisoba)",
                "弁当 (Bento Box)",
                "唐揚げ弁当 (Fried Chicken Bento)",
                "カレーライス (Curry Rice)",
                "スパゲッティ (Spaghetti)",

                "ペットボトルのお茶 (Bottled Tea)",
                "ミネラルウォーター (Mineral Water)",
                "コーヒー (Coffee)",
                "カフェラテ (Cafe Latte)",
                "エナジードリンク (Energy Drink)",
                "オレンジジュース (Orange Juice)",
                "牛乳 (Milk)",
                "ヨーグルト (Yogurt)",
                "ビール (Beer)",
                "チューハイ (Chu-hai)",

                "チョコレート (Chocolate)",
                "ガム (Gum)",
                "キャンディ (Candy)",
                "ポテトチップス (Potato Chips)",
                "せんべい (Rice Crackers)",
                "クッキー (Cookies)",
                "アイスクリーム (Ice Cream)",
                "プリン (Pudding)",
                "ケーキ (Cake)",
                "どら焼き (Dorayaki)",

                "ティッシュ (Tissues)",
                "トイレットペーパー (Toilet Paper)",
                "歯ブラシ (Toothbrush)",
                "歯磨き粉 (Toothpaste)",
                "マスク (Face Mask)",
                "絆創膏 (Bandage)",
                "電池 (Batteries)",
                "充電ケーブル (Charging Cable)",
                "イヤホン (Earphones)",
                "傘 (Umbrella)",

                "ノート (Notebook)",
                "ボールペン (Ballpoint Pen)",
                "封筒 (Envelope)",
                "切手 (Stamp)",
                "新聞 (Newspaper)",
                "雑誌 (Magazine)",
                "コピー用紙 (Copy Paper)",
                "ゴミ袋 (Trash Bags)",
                "洗剤 (Detergent)",
                "消臭スプレー (Deodorant Spray)"
        };
        double[] prices = {
                160, 180, 330, 360, 260, 280, 580, 650, 540, 520,
                170, 120, 200, 240, 290, 190, 230, 160, 350, 210,
                150, 120, 130, 190, 170, 210, 240, 190, 420, 220,
                140, 180, 330, 380, 150, 180, 280, 1100, 1500, 880,
                180, 150, 120, 85, 180, 550, 480, 250, 350, 520
        };
        System.out.printf("%-5s %-20s %10s\n", "No.", "Item", "Price (¥)");
        System.out.println("--------------------------------------------");
        for(int i=0; i<items.length; i++){
            System.out.printf("%-5d %-20s       %10.2f\n", (i+1), items[i], prices[i]);
        }
        System.out.println("--------------------------------------------");
        System.out.println("Please enter your name : ");
        String name = scanner.nextLine();
        System.out.println("Thank you Mr./Ms. " + name + " for shopping with us !");
        System.out.println();
        // now lets take input from the user regarding the items they want to purchase
        double totalBill = 0.0;
        // loop to take the item by serial number and quantity until user enters 0
        while(true){
            System.out.println("Enter the item number you want to purchase (1-50 or enter 0 to finish ) : ");
            System.out.println("Till now , your total bill is : ¥" + String.format("%.2f", totalBill));
            int itemNumber = scanner.nextInt();
            if(itemNumber==0){
                break; // exit the loop
            }else if(itemNumber <1 || itemNumber >50){
                System.out.println("Enter The Valid Item Mr./Ms."+name);
                continue; // to skip and ask for input again
            }else{
                System.out.println("Enter The Quantity of"+items[itemNumber - 1]+" you want to purchase : ");
            }
            int quantity = scanner.nextInt();
            double itemCost = prices[itemNumber-1]*quantity;
            totalBill+=itemCost;
            System.out.println("Added " + quantity + " x " + items[itemNumber - 1] + " to your cart. Item cost: ¥" + String.format("%.2f", itemCost));
        }
        System.out.println("--------------------------------------------");
        System.out.println("Calculating your final bill... Wait .. ❤️🔃");
        // calculating taxes
        double tax=0.0d;
        if(totalBill <= 1000){
            tax = totalBill * 0.05; // 5 percent tax
        }else if(totalBill > 1000 && totalBill <= 5000){
            tax = totalBill * 0.10; // 10 percent tax
        }else if(totalBill > 5000){
            tax = totalBill * 0.15; // 15 percent tax
        }
        totalBill+=tax;
        // calculating discount
        double discount =0.0;
        if(totalBill >= 5000){
            discount = totalBill * 0.10; // 10 percent discount
        }else if(totalBill >= 2000){
            discount = totalBill * 0.05; // 5 percent discount
        }
        totalBill-=discount;
        System.out.println("--------------------------------------------");
        System.out.println("Tax applied: ¥" + String.format("%.2f", tax));
        System.out.println("Discount applied: ¥" + String.format("%.2f", discount));
        System.out.println("Your final bill amount is: ¥" + String.format("%.2f", totalBill));
        System.out.println("Would you like to round off the bill to the nearest whole number for charity? (1/0) : ");
        int Scanner = scanner.nextInt(); // anything other then 0 will be considered as yes
        if(Scanner != 0){
            double roundedBill = Math.round(totalBill);
            System.out.println("Thank you for your generosity! Your rounded bill amount is: ¥" + String.format("%.2f", roundedBill));}
        else{
            System.out.println("Thank you for shopping with Bhavi's shop !! Your Bill Amount is : ¥ " + String.format("%.2f", totalBill)+"Please Visit Again ❤️🏪");
        }
        scanner.close();// to avoid memory leaks

//  About this project
//
//        This is a beginner Java mini-project created as part of my learning journey.
//
//                - Core logic, flow, and structure are written by me.
//                - I used AI tools for:
//        - Generating sample item data (50+ items)
//          - Learning formatting functions like String.format and this print format which was similliar to format
//        in c language
//                  System.out.printf("%-5d %-20s %10.2f\n", (i+1), items[i], prices[i]);
//            - Every part of the code is understood and modified by me.
//
//        This project focuses on practicing:
//        - Loops
//                - Arrays
//                - Conditionals
//                - User input
//                - Basic billing logic

    }}
