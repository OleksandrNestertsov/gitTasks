package main.java.com.alevel.alevelHomeWorks.hw05StudentsCostsContracts.version1;

 class Group {
    public static void main(String[] args) {

        Student student1 = new Student("Oleksandr", "Nestertsov", 19);
        Student student2 = new Student("Katerina", "Antonova", 18);
        Student student3 = new Student("Ivan", "Muratov", 20);
        Student student4 = new Student("Olja", "Tarasova", 18);
        Student student5 = new ContractStudent("Oleksandr", "Romashko ", 18, 5200.0);
        Student student6 = new ContractStudent("Oleg", "Fesenko", 17, 5100.0);
        Student student7 = new ContractStudent("Julia", "Burjak", 17, 4900.0);

        Student[] students = {student1, student2, student3, student4, student5, student6, student7};

        System.out.println("the list of all students in group : ");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println();
        System.out.println("the list of all students in group, who studies for contract, with contract cost , UAH : ");

        for (int i = 0; i < students.length; i++) {
            if (students[i] instanceof ContractStudent == true) {
                System.out.println(students[i]);
            }
        }
    }
}
