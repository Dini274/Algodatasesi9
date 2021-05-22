/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

/**
 *
 * @author Dini Aryani
 */
import java.util.Arrays;
import static java.util.concurrent.TimeUnit.NANOSECONDS;

public class SelectionSort {

  public static void main(String[] args) {
    int[] data = {32,43,21,34,56,32,45,65}; 

    int min = data[0];
    int index = 0;
    int swappingProcess = 0;

    long startTime = System.nanoTime();

    for (int i = 0; i < data.length - 1; i++) {
      for (int j = i; j < data.length; j++) {
        if ( data[j] < min ) {
          min = data[j];
          index = j;
          swappingProcess++;
        }
        System.out.println(Arrays.toString(data) + " - Hasil Swap : " + swappingProcess);
      }
      if ( min < data[i] ) {
        data[index] = data[i];
        data[i] = min;
      }
      min = data[i + 1];
    }

    long endTime = System.nanoTime();
    long timeElapsed = endTime - startTime;
    System.out.println("Proses : " + timeElapsed + " Nano Detik");



  }

}