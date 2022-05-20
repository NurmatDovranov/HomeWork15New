package com.company;

public class Main {

    public static void main(String[] args) {

        Animal shark1 = new Shark();
        Animal shark2 = new Shark();
        Animal shark3 = new Shark();
        Animal shark4 = new Shark();
        Animal shark5 = new Shark();


        Animal eagle1 = new Eagle();
        Animal eagle2 = new Eagle();
        Animal eagle3 = new Eagle();
        Animal eagle4 = new Eagle();
        Animal eagle5 = new Eagle();

        Animal turtle1 = new Turtle();
        Animal turtle2 = new Turtle();
        Animal turtle3 = new Turtle();
        Animal turtle4 = new Turtle();
        Animal turtle5 = new Turtle();

        Animal[] array = {shark1, eagle1,  turtle1, shark2, eagle2, turtle2, shark3, eagle3, turtle3, shark4, eagle4,  turtle4,
                shark5,  eagle5, turtle5};
        for (Animal array2 : array) {
            if (array2.getClass().getName() == "com.company.Shark") {
                ((Shark) array2).attack();
            }
            else
            if (array2.getClass().getName() == "com.company.Eagle"){
                ((Eagle)array2).fly();
            } else {
                ((Turtle)array2).swim();

            }
        }
        System.out.println("\nOz massivderine salyndy:");
        Shark[] arrayShark = new Shark[5];
        Eagle[] arrayEagle = new Eagle[5];
        Turtle[] arrayTurtle = new Turtle[5];

        int a = 0;
        int b = 0;
        int c = 0;

        for (Animal array2 : array){
            if(array2 instanceof Shark){
                arrayShark[a] = (Shark)array2;
                a++;
            } else if (array2 instanceof Eagle){
                arrayEagle[b] = (Eagle) array2;
                b++;
            } else {
                arrayTurtle[c] = (Turtle) array2;
                c++;
            }
        }
        System.out.println("Massiv Shark:");
        for (Shark shark : arrayShark)
            shark.attack();
        System.out.println("Massiv Eagle:");
        for (Eagle eagle : arrayEagle)
            eagle.fly();
        System.out.println("Massiv Turtle:");
        for (Turtle turtle : arrayTurtle )
            turtle.swim();

    }
}

