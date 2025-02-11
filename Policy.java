/**
 * Represents an insurance policy with details about the policyholder.
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
     * Constructs a Policy object with the given parameters.
     * 
     * @param policyNumber   the policy number
     * @param providerName   the name of the insurance provider
     * @param firstName      the first name of the policyholder
     * @param lastName       the last name of the policyholder
     * @param age            the age of the policyholder
     * @param smokingStatus  the smoking status ("smoker" or "non-smoker")
     * @param height         the height of the policyholder in inches
     * @param weight         the weight of the policyholder in pounds
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

    /**
     * Gets the policy number.
     * @return the policy number
     */
    public int getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Gets the provider name.
     * @return the provider name
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * Gets the first name of the policyholder.
     * @return the first name of the policyholder
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets the last name of the policyholder.
     * @return the last name of the policyholder
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Gets the age of the policyholder.
     * @return the age of the policyholder
     */
    public int getAge() {
        return age;
    }

    /**
     * Gets the smoking status of the policyholder.
     * @return the smoking status ("smoker" or "non-smoker")
     */
    public String getSmokingStatus() {
        return smokingStatus;
    }

    /**
     * Gets the height of the policyholder.
     * @return the height in inches
     */
    public double getHeight() {
        return height;
    }

    /**
     * Gets the weight of the policyholder.
     * @return the weight in pounds
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Calculates the BMI (Body Mass Index) of the policyholder.
     * @return the BMI value
     */
    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }

    /**
     * Calculates the policy price based on smoking status and BMI.
     * @return the policy price
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
     * Returns a formatted string representation of the policy details.
     * @return the formatted policy details
     */
    public String toString() {
        return "Policy Number: " + policyNumber +
               "\nProvider Name: " + providerName +
               "\nPolicyholder's First Name: " + firstName +
               "\nPolicyholder's Last Name: " + lastName +
               "\nPolicyholder's Age: " + age +
               "\nPolicyholder's Smoking Status: " + smokingStatus +
               "\nPolicyholder's Height: " + height + " inches" +
               "\nPolicyholder's Weight: " + weight + " pounds" +
               "\nPolicyholder's BMI: " + String.format("%.2f", calculateBMI()) +
               "\nPolicy Price: $" + String.format("%.2f", calculatePolicyPrice()) + "\n";
    }
}

