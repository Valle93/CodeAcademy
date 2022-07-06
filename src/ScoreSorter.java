import java.util.*;

public class ScoreSorter {

    //  Write a scoreSorter() method that will take a list of unsorted scores along with the highest possible score.
    //  It should return a sorted list of all of the scores, in descending order from high to low.
    //  You are expected to create and implement your own sorting algorithm for this challenge.

    //  For example, calling scoreSorter() on ([1, 2, 3, 9999, 13], 10000) should return [9999, 13, 3, 2, 1].

    //  This challenge was reported to have been asked at interviews with Amazon.
    //  If you’ve covered the material in Pass the Technical Interview with Java or an equivalent,
    //  you should be able to solve this challenge. If you have trouble,
    //  try refreshing your knowledge with its Sorting Algorithms content.


    public static void main(String[] args) {

        int[] answer = scoreSorter(new int[]{1, 2, 3, 9999, 13}, 10000);
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }

    }

    public static int[] scoreSorter(int[] array, int topScore) {

        List<Integer> listInt = new ArrayList<>();

        for(int i = 0; i < array.length; i++){

            if(array[i] < topScore){

                listInt.add(array[i]);

            }

        }

        boolean haveWeSorted;

        do{

            haveWeSorted = false;

            for(int i = 0; i < listInt.size() - 2; i++){

                int tempInt = 0;

                if(listInt.get(i) < listInt.get(i) + 1){

                    tempInt = listInt.get(i);

                    listInt.add(i, listInt.get(i + 1));

                    listInt.add(i + 1, tempInt);

                    haveWeSorted = true;

                }
            }

        }while(haveWeSorted == true);

        int[] newArray = new int[listInt.size()];

        for(int i = 0; i < listInt.size() - 1; i++){

            newArray[i] = listInt.get(i);
        }

        return newArray;

    }
}