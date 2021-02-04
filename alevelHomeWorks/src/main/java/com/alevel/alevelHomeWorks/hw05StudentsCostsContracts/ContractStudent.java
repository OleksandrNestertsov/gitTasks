package main.java.com.alevel.alevelHomeWorks.hw05StudentsCostsContracts;

public class ContractStudent extends Student {
    private double costContract;

    ContractStudent(String n, String sn, int a, double costContract) {
        super(n, sn, a);
        this.costContract = costContract;
    }

    void showAllInfo() {
        super.showAllInfo();
    }

    void showInfo() {
        super.showAllInfo();
        System.out.print("cost contract : " + costContract );
        System.out.println();

    }
}
