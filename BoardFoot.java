/*
* The program calculate the needed height
* to complete a board height from the given dimensions.
*
* @author  Patrick Gemmell
* @version 1.0
* @since   2021-04-27
*/

import java.util.Scanner;  // Import the Scanner class

public final class BoardFoot {
    private BoardFoot() {

    }
  /**
   * This function will find the height of a board-foot
   * based on the length and width entered by the user.
   * @return
   * returns function
   * @param length
   * @param width
   */
  static float findBoardHeight(final float length, final float width) {
    // Assigning and specifying the volume of a board-foot
    final int volume = 144;

    // Calculating the height of the board
    float height = volume / (length * width);

    // Returning the height of the board
    return height;
  }

  /**
   * This function allow the user to input the length and width
   * of a board-foot and have the program output the height.
   * @param args
   */
  public static void main(final String[] args) {
    try {
      // Input for the length of the board-foot
      Scanner lengthInput = new Scanner(System.in);
      System.out.println("Enter the length of the board:");
      float userLength = lengthInput.nextFloat();
      System.out.println();

      // Input for the width of the board-foot
      Scanner widthInput = new Scanner(System.in);
      System.out.println("Enter the width of the board:");
      float userWidth = widthInput.nextFloat();
      System.out.println();

      // Process
      float heightOfBoard = findBoardHeight(userLength, userWidth);

      // Output
      System.out.println("The height needed to complete one board foot is "
                         + heightOfBoard + " inches.");

      // Catches and tells the user that an improper input was entered
    } catch (Exception e) {
      System.out.println();
      System.out.println("ERROR: Invalid Input");
    }
  }
}
