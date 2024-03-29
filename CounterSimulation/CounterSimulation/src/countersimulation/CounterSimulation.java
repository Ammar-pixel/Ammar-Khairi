/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countersimulation;

/**
 *
 * @author aisli
 */
public class CounterSimulation {

    /**
     * @param args the command line arguments
     */
    
	public static void main(String[] args) 
	{
		WaitLine customerLine = new WaitLine();
		customerLine.simulate(100,10); 
		customerLine.displayResults();

		System.out.println("\n\nDone.");
	}  // end main
  // end CounterSimulation

// NOTE: Because this application depends on random numbers, your output likely
// will differ from the following results.
/*
 Customer 1 enters line at time 0. Transaction time is 2
 Customer 1 begins service at time 0. Time waited is 0
 Customer 2 enters line at time 2. Transaction time is 3
 Customer 2 begins service at time 2. Time waited is 0
 Customer 3 enters line at time 4. Transaction time is 4
 Customer 3 begins service at time 5. Time waited is 1
 Customer 4 enters line at time 6. Transaction time is 3
 Customer 5 enters line at time 7. Transaction time is 3
 Customer 4 begins service at time 9. Time waited is 3
 Customer 6 enters line at time 12. Transaction time is 1
 Customer 5 begins service at time 12. Time waited is 5
 Customer 7 enters line at time 15. Transaction time is 1
 Customer 6 begins service at time 15. Time waited is 3
 Customer 8 enters line at time 16. Transaction time is 4
 Customer 7 begins service at time 16. Time waited is 1
 Customer 8 begins service at time 17. Time waited is 1
 Customer 9 enters line at time 18. Transaction time is 1
 
 Number served = 8
 Total time waited = 14
 Average time waited = 1.75
 Number left in line = 1
 
 
 Done.
*/
    
}
