import java.util.Random;
import java.util.stream.IntStream;

public class montyHall {
    public montyHall() {
    }

    public static void main(String[] args) {
        int countSwitches = 0, countStays = 0;
        final int N = 100;
        int totalDoors = 3;

        Random random = new Random();
        for(int i = 0;i < N;i++ ){

            int[] doors = new int[totalDoors];

            for (int j = 0; j < totalDoors; j++){
                doors[j] = 0;
            }

            // There should be a state where all the doors are closed and one is chosen at random to be the winner
            int winningDoor = random.nextInt(totalDoors);
            // Choosing a winning door by giving value of 1
            doors[winningDoor] = 1;

            // A state where one of the doors is chosen at random representing the contestant's choice.
            int doorChosen = random.nextInt(totalDoors);

            int[] doorsRevealed = new int[totalDoors - 2];
            int[] remainingDoors = new int[2];
            int lengthCounter = 0;
            int track = 0;

            // A state where all the doors except the chosen door and 1 other at are open - note that you cannot open the winning door in this phase.
            while(lengthCounter < totalDoors)
            {
                if(doors[lengthCounter] != 1 && lengthCounter != doorChosen)
                {
                    doorsRevealed[track] = lengthCounter;
                    track++;
                }
                if(track == (totalDoors - 2))
                    break;
                lengthCounter++;
            }

            int remainingDoorsCounter = 0;
            int remainingPosition = 0;

            while(remainingDoorsCounter < totalDoors) {
                int finalRemainingDoorsCounter = remainingDoorsCounter;
                if(IntStream.of(doorsRevealed).noneMatch(x -> x == finalRemainingDoorsCounter)){
                    remainingDoors[remainingPosition] = remainingDoorsCounter;
                    remainingPosition++;
                }
                remainingDoorsCounter++;
            }

//            System.out.println("doorsRevealed : "+Arrays.toString(doorsRevealed)+ " reaminingDoors : " + Arrays.toString(remainingDoors) + " doorchosen : " + doorChosen + " doors[] : " + Arrays.toString(doors));

            if(doorChosen==winningDoor)
                countStays += 1;
            else
                countSwitches +=1;
        }
        System.out.println("Switching wins " + countSwitches + " times.");
        System.out.println("Staying wins " + countStays + " times.");
  }
}
