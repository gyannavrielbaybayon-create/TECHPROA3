import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingListProject {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
                    ArrayList<String> shoppingList = new ArrayList<>();

                            System.out.println("Enter up to 5 items to buy:");
                                    for (int i = 0; i < 5; i++) {
                                                System.out.print("> ");
                                                            String item = scanner.nextLine().trim();
                                                                        if (item.isEmpty()) {
                                                                                        break;
                                                                                                    }
                                                                                                                shoppingList.add(item);
                                                                                                                        }

                                                                                                                                System.out.println("\nYour shopping list:");
                                                                                                                                        System.out.println(String.join(", ", shoppingList));

                                                                                                                                                System.out.println("\nYou entered " + shoppingList.size() + " items.");

                                                                                                                                                        System.out.print("\nSearch for an item: ");
                                                                                                                                                                String searchItem = scanner.nextLine().trim();

                                                                                                                                                                        boolean found = false;
                                                                                                                                                                                for (String item : shoppingList) {
                                                                                                                                                                                            if (item.equalsIgnoreCase(searchItem)) {
                                                                                                                                                                                                            found = true;
                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                        if (found) {
                                                                                                                                                                                                                                                                    System.out.println("\n✅ " + capitalize(searchItem) + " is in your shopping list!");
                                                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                                                        System.out.println("\n❌ " + capitalize(searchItem) + " is NOT in your shopping list.");
                                                                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                                                                        scanner.close();
                                                                                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                                                                                private static String capitalize(String str) {
                                                                                                                                                                                                                                                                                                                        if (str == null || str.isEmpty()) return str;
                                                                                                                                                                                                                                                                                                                                return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                }
