static class applicationform {
    String name;
    int age;

    public void Display(){
        System.out.println(name);
        System.out.println(age);
    }
}

public static void main(String[] args) {

    applicationform Raaidh = new applicationform();
    Raaidh.name = "Raaidh";
    Raaidh.age = 12;
    Raaidh.Display();
}
