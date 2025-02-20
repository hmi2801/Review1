package Bridgelabz_2113100011.Assignment20;

import java.util.*;

class InsurancePolicy2 {
    private String policyNumber;
    private String policyHolderName;
    private Date expiryDate;
    private String coverageType;
    private double premiumAmount;

    public InsurancePolicy2(String policyNumber, String policyHolderName, Date expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public String getPolicyNumber() { return policyNumber; }
    public String getPolicyHolderName() { return policyHolderName; }
    public Date getExpiryDate() { return expiryDate; }
    public String getCoverageType() { return coverageType; }
    public double getPremiumAmount() { return premiumAmount; }

    @Override
    public String toString() {
        return "PolicyNumber: " + policyNumber + ", Holder: " + policyHolderName + ", Expiry: " + expiryDate + ", Coverage: " + coverageType + ", Premium: " + premiumAmount;
    }
}

class PolicyManager2 {
    private Map<String, InsurancePolicy2> hashMap = new HashMap<>();
    private Map<String, InsurancePolicy2> linkedHashMap = new LinkedHashMap<>();
    private TreeMap<Date, InsurancePolicy2> treeMap = new TreeMap<>();

    public void addPolicy(InsurancePolicy2 policy) {
        hashMap.put(policy.getPolicyNumber(), policy);
        linkedHashMap.put(policy.getPolicyNumber(), policy);
        treeMap.put(policy.getExpiryDate(), policy);
    }

    public InsurancePolicy2 getPolicyByNumber(String policyNumber) {
        return hashMap.get(policyNumber);
    }

    public void listExpiringSoon() {
        Date today = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(today);
        cal.add(Calendar.DAY_OF_YEAR, 30);
        Date threshold = cal.getTime();

        for (Map.Entry<Date, InsurancePolicy2> entry : treeMap.entrySet()) {
            if (entry.getKey().before(threshold)) {
                System.out.println(entry.getValue());
            }
        }
    }

    public void listPoliciesByHolder(String holderName) {
        for (InsurancePolicy2 policy : hashMap.values()) {
            if (policy.getPolicyHolderName().equalsIgnoreCase(holderName)) {
                System.out.println(policy);
            }
        }
    }

    public void removeExpiredPolicies() {
        Date today = new Date();
        treeMap.entrySet().removeIf(entry -> entry.getKey().before(today));
    }
}

public class InsurancePolicyManagement {
    public static void main(String[] args) {
        PolicyManager2 manager = new PolicyManager2();

        InsurancePolicy2 policy1 = new InsurancePolicy2("P1001", "Alice", new Date(2025 - 1900, 2, 10), "Health", 5000);
        InsurancePolicy2 policy2 = new InsurancePolicy2("P1002", "Bob", new Date(2025 - 1900, 1, 20), "Auto", 3000);
        InsurancePolicy2 policy3 = new InsurancePolicy2("P1003", "Charlie", new Date(2025 - 1900, 3, 15), "Home", 7000);

        manager.addPolicy(policy1);
        manager.addPolicy(policy2);
        manager.addPolicy(policy3);

        System.out.println("Policy P1001: " + manager.getPolicyByNumber("P1001"));
        System.out.println("Policies expiring soon:");
        manager.listExpiringSoon();
        System.out.println("Policies for Alice:");
        manager.listPoliciesByHolder("Alice");
        manager.removeExpiredPolicies();
        System.out.println("Expired policies removed.");
    }
}

