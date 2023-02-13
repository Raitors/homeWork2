public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1 () {
        var dog=8.0;
        var cat=3.4;
        var paper=763789;
        System.out.println("Задача 1");
        System.out.println("dog = "+ dog +", cat = "+ cat +", paper = "+ paper );
    }

    public static void task2 () {
        var dog=8.0;
        var cat=3.4;
        var paper=763789;
        dog=dog+4;
        cat=cat+4;
        paper=paper+4;
        System.out.println("Задача 2");
        System.out.println("dog = "+ dog +", cat = "+ cat +", paper = "+ paper );
    }
    public static void task3 () {
        var dog=8.0;
        var cat=3.4;
        var paper=763789;
        dog=dog-3.5;
        cat=cat-1.6;
        paper=paper-7639;
        System.out.println("Задача 3");
        System.out.println("dog = "+ dog +", cat = "+ cat +", paper = "+ paper );
    }
    public static void task4 () {
        var friend=19;
        System.out.println("Задача 4");
        System.out.println("friend = "+ friend);
        friend+=2;
        System.out.println("fiend+2 = "+friend);
        friend/=7;
        System.out.println("(fiend+2)/7 = "+friend);
    }
    public static void task5 () {
        System.out.println("Задача 5");
        var frog=3.5;
        System.out.println("frog = "+ frog);
        frog*=10;
        System.out.println("frog*10 = "+ frog);
        frog/=3.5;
        System.out.println("frog*10/3.5= "+frog);
        frog+=4;
        System.out.println("frog*10/3.5+4= "+frog);

    }
    public static void task6 () {
        System.out.println("Задача 6");
        var weightFirstBoxer=78.2;
        var weightSecondBoxer=82.7;
        var allWeight = weightSecondBoxer+weightFirstBoxer;
        System.out.println("Общий вес= "+allWeight);
        var difference = weightSecondBoxer % weightFirstBoxer;
        System.out.println("Разница = "+ difference);

    }
    public static void task7 () {
        System.out.println("Задача 7");
        var weightFirstBoxer=78.2;
        var weightSecondBoxer=82.7;
        var difference = weightSecondBoxer % weightFirstBoxer;
        System.out.println("Разница % (остаток от деления)= "+ difference);
        difference= weightSecondBoxer - weightFirstBoxer;
        System.out.println("Разница  (вычитание)= "+ difference);
    }
    public static void task8 () {
        System.out.println("Задача 8");
        var allTime=640;
        var hourWork=8;
        var  worker = allTime/hourWork;
        System.out.println("«Всего работников в компании — "+ worker +" человек");
        var moreWorker = worker+94;
        hourWork=allTime/(moreWorker);
        System.out.println("Если в компании работает "+ moreWorker + " то всего "+ hourWork+" часов работы может быть поделено между сотрудниками");
    }
}