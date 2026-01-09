public class Q3Sw4part1 {
        public void processPayment(double amount, String currency) {
                System.out.println("Processing payment of " + amount + " " + currency);
                    }

                        public void processPayment(double amount, String currency, String paymentMethod) {
                                System.out.println("Processing payment of " + amount + " " + currency + " via " + paymentMethod);
                                    }
                                    //main class
                                        public static void main(String[] args) {
                                                Q3Sw4part1 processor = new Q3Sw4part1();
                                                        processor.processPayment(100.0, "ETH");
                                                                processor.processPayment(250.0, "Vbucks", "Robux");
                                                                    }
                                                                    }

