public class  {
        // Calculate area of a square (1 integer argument)
            public int calculateArea(int side){
                    return side * side;
                        }

                            // Calculate area of a rectangle (2 double arguments)
                                public double calculateArea(double length, double width)
                                    {
                                            return length * width;
                                                }

                                                    // Main method to run the program
                                                        public static void main(String[] args) {
                                                                ShapeAreaCalculator calculator = new ShapeAreaCalculator();

                                                                        // Call the square area method
                                                                                int squareArea = calculator.calculateArea(5);
                                                                                        System.out.println("Area of square (side = 5): " + squareArea);

                                                                                                // Call the rectangle area method
                                                                                                        double rectangleArea = calculator.calculateArea(4.5, 6.2);
                                                                                                                System.out.println("Area of rectangle (length = 4.5, width = 6.2): " + rectangleArea);
                                                                                                                    }
                                                                                                                    }
                                                                                                                    
}
