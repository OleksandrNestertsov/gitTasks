package main.java.com.alevel.alevelHomeWorks.hw05StudentsCostsContracts.version1;

 class ContractStudent extends Student {
    private double costContract;

    ContractStudent(String name, String surname, int age, double costContract) {
        super(name, surname, age);
        this.costContract = costContract;
    }

    @Override
    public String toString() {
        return "ContractStudent{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", age=" + getAge() +  ", costContract=" + costContract +
                '}';
    }

}
