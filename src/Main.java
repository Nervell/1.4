public class Main {
    public static void main(String[] args) {
        //Exercise number 1
        int FromHighToLow = 0;
        while (FromHighToLow < 10){
            FromHighToLow += 1;
            System.out.print(FromHighToLow + " ");
        }
        System.out.println();
        for (int FromLowToHigh = 10; FromLowToHigh != 0; FromLowToHigh-- ) {
            System.out.print(FromLowToHigh  + " ");
        }
        System.out.println();
        //Exercise number 2
        for (int friday = 1; friday < 31; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println();
        //Exercise number 3
        int currentYear = 2022;
        int After100Years = currentYear + 100;
        int Ago200Years =  currentYear - 200;
        for (; Ago200Years < After100Years; Ago200Years += 1) {
            if (Ago200Years % 79 == 0) {
                System.out.println(Ago200Years);
            }
        }
    }
}