/**
 * Represents an insurance policy with policyholder details.
 */
public class Policy {
    private int policyNumber;
    private String providerName;
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;

    /**
     * Default constructor initializes fields with default values.
     */
    public Policy() {
        this.policyNumber = 0;
        this.providerName = "";
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.smokingStatus = "non-smoker";
        this.height = 0;
        this.weight = 0;
    }

    /**
     * Parameterized constructor initializes all fields.
     * 
     * @param policyNumber   The policy number
     * @param providerName   The name of the insurance provider
     * @param firstName      The first name of the policyholder
     * @param lastName       The last name of the policyholder
     * @param age            The policyholder’s age
     * @param smokingStatus  The smoking status ("smoker" or "non-smoker")
     * @param height         The height in inches
     * @param weight         The weight in pounds
     */
    public Policy(int policyNumber, String providerName, String firstName, String lastName,
                  int age, String smokingStatus, double height, double weight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    // Getters (Accessors)
    public int getPolicyNumber() { return policyNumber; }
    public String getProviderName() { return providerName; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getSmokingStatus() { return smokingStatus; }
    public double getHeight() { return height; }
    public double getWeight() { return weight; }

    // Setters (Mutators)
    public void setPolicyNumber(int policyNumber) { this.policyNumber = policyNumber; }
    public void setProviderName(String providerName) { this.providerName = providerName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setAge(int age) { this.age = age; }
    public void setSmokingStatus(String smokingStatus) { this.smokingStatus = smokingStatus; }
    public void setHeight(double height) { this.height = height; }
    public void setWeight(double weight) { this.weight = weight; }

    /**
     * Calculates and returns the BMI of the policyholder.
     * @return The calculated BMI.
     */
    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }

    /**
     * Calculates and returns the price of the insurance policy.
     * @return The calculated policy price.
     */
    public double calculatePolicyPrice() {
        double basePrice = 600.00;
        if (age > 50) {
            basePrice += 75.00;
        }
        if (smokingStatus.equalsIgnoreCase("smoker")) {
            basePrice += 100.00;
        }
        if (calculateBMI() > 35) {
            basePrice += (calculateBMI() - 35) * 20;
        }
        return basePrice;
    }

    /**
     * Returns a formatted string with all policy details.
     */
    public String toString() {
        return "Policy Number: " + policyNumber +
               "\nProvider Name: " + providerName +
               "\nPolicyholder’s First Name: " + firstName +
               "\nPolicyholder’s Last Name: " + lastName +
               "\nPolicyholder’s Age: " + age +
               "\nPolicyholder’s Smoking Status: " + smokingStatus +
               "\nPolicyholder’s Height: " + height + " inches" +
               "\nPolicyholder’s Weight: " + weight + " pounds" +
               "\nPolicyholder’s BMI: " + String.format("%.2f", calculateBMI()) +
               "\nPolicy Price: $" + String.format("%.2f", calculatePolicyPrice()) + "\n";
    }
}

