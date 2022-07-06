class CapturingRainwater {

    // Create a capturingRainwater() method that takes in an array of heights,
    // and returns the amount of rainwater that could be contained in that array.

    // For example, the array [4, 2, 1, 3, 0, 1, 2] can be represented in the following histogram:
    // Histogram with the Y-axis going from 0 to 4 and the X-axis containing the numbers from the array.
    // Water is pooled in the empty spaces of the histogram, and you can see that it can contain 6 units of water.
    // As you can see, there are 6 units of water that can be contained,
    // so calling capturing_rainwater() on the array [4, 2, 1, 3, 0, 1, 2] should return 6.

    // This challenge was reported to have been asked at interviews with many top companies,
    // including Amazon and Microsoft.
    // If you’ve covered the material in Pass the Technical Interview with Java or an equivalent,
    // you should be able to solve this challenge. If you have trouble,
    // try refreshing your knowledge with its Capturing Rainwater walkthrough.


    public static void main(String[] args) {
        int[] heights = new int[] {4, 2, 1, 3, 0, 1, 2};
        System.out.println(capturingRainwater(heights));
    }

    public static int capturingRainwater(int[] heights) {
        // Write your code here

        int highestNumer = 0;

        int rainDrops = 0;

        for (int i = 0; i < heights.length - 1; i++) {

            if(heights[i] > highestNumer)
                highestNumer = heights[i];
        }

        for (int i = 0; i < heights.length; i++) {

            if(heights[i] < highestNumer){

                int index = i;

                int biggerToTheLeft = 0;

                int biggerToTheRight = 0;

                leftloop: for (int j = index; j >= 0; j--) {

                    if(heights[j] > heights[i] && heights[j] > biggerToTheLeft)

                        biggerToTheLeft = heights[j];

                }

                rightloop: for (int j = index + 1; j < heights.length; j++) {

                    if(heights[j] > heights[i] && heights[j] > biggerToTheRight) {

                        biggerToTheRight = heights[j];

                        if(biggerToTheRight > biggerToTheLeft)
                            break rightloop;

                    }

                }

                int lowerOfTheTwo = biggerToTheLeft > biggerToTheRight ? biggerToTheRight : biggerToTheLeft;

                if(lowerOfTheTwo == 0)
                    continue;

                rainDrops += lowerOfTheTwo - heights[i];

            }
        }

        return rainDrops;
    }
}