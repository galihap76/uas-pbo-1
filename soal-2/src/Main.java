class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void work() {
        System.out.println("Employee bernama " + getName() + " sedang bekerja.");
    }
}

class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Manager bernama " + this.getName() + " sedang mengelola tim.");
    }
}

class Developer extends Employee {
    public Developer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Developer bernama " + this.getName() + " sedang memprogram.");
    }
}

class Designer extends Employee {
    public Designer(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Designer bernama " + this.getName() + " sedang mendesain.");
    }
}

public class Main {
    public static void main(String[] args) {
       
    	Employee Obj1 = new Employee("pitaloka");
    	System.out.println("===== Objek Employee =====");
        Obj1.work();
        System.out.print("\n");
         
        Manager Obj2 = new Manager("prasetya wijoyo");
        System.out.println("===== Objek Manager =====");
        Obj2.work();
        System.out.print("\n");
    
        Developer Obj3 = new Developer("galih anggoro prasetya");
        System.out.println("===== Objek Developer =====");
        Obj3.work();
        System.out.print("\n");

        Designer Obj4 = new Designer("anggoro putra");
        System.out.println("===== Objek Designer =====");
        Obj4.work();
        System.out.print("\n");
    }
}
