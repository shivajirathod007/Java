class additionComplex {
    private double real;
    private double imaginary;

    // Default Constructor
    public additionComplex() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }

    // Parameterized Constructor
    public additionComplex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Copy Constructor
    public additionComplex(additionComplex other) {
        this.real = other.real;
        this.imaginary = other.imaginary;
    }

    // Method to add two complex numbers
    public additionComplex add(additionComplex other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new additionComplex(newReal, newImaginary);
    }

    // Display the complex number
    public void display() {
        System.out.println("Complex Number: " + real + " + " + imaginary + "i");
    }

    public static void main(String[] args) {
        // Using Default Constructor
        additionComplex defaultComplex = new additionComplex();
        System.out.print("Default Constructor: ");
        defaultComplex.display();

        // Using Parameterized Constructor
        additionComplex paramComplex1 = new additionComplex(3.5, 2.0);
        additionComplex paramComplex2 = new additionComplex(-1.5, 4.2);

        System.out.print("\nParameterized Constructor 1: ");
        paramComplex1.display();
        System.out.print("Parameterized Constructor 2: ");
        paramComplex2.display();

        // Using Copy Constructor
        additionComplex copyComplex = new additionComplex(paramComplex1);
        System.out.print("\nCopy Constructor: ");
        copyComplex.display();

        // Performing Addition
        additionComplex result = paramComplex1.add(paramComplex2);
        System.out.print("\nResult of Addition: ");
        result.display();
    }
}
