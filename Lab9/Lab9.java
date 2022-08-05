import java.io.PrintStream;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Lab9 {
	private static double lastTime;
	public static final int COUNT = 50000;
	
	//
	public static double stop() {
		double newTime = System.nanoTime();
		double timeChange = newTime - lastTime;
		lastTime = newTime;
		return timeChange;
	}
	
	static double addBeginningExperiment(List<Integer> l, int count) { //add beginning linked list
		l.clear();
		
		stop();
		double startTime = System.nanoTime();
		for (int i = 0; i < 50000; i++) {
			l.add(i);
		}
		double endTime = System.nanoTime();
		return (int) stop();
		
	}
	
	
	static double addEndExperiment(List<Integer> l, int count) { //linked list add end method
		l.clear();
		
		stop();
		double startTime = System.nanoTime();
		for (int i = 0; i < 50000; i++) {
			l.add(7);
		}
		double endTime = (int) System.nanoTime();
		return (int) stop();
	}
	
	
	static double addRandomExperiment(List<Integer> l, int count) { //add random linked list method
		l.clear();
		stop();
		
		double startTime = System.nanoTime();
		for(int i = 0; i < 50000; i++) {
			l.add((int)(Math.random() * l.size()), 7);
		}
		double endTime = (int) System.nanoTime();
		return (int) stop();
	}
	
	
	static double removeBeginningExperiment(List<Integer> l, int count) { //linked list remove beginning method
		l.clear();
		for (int i = 0; i < 50000; i++) {
			l.add(7);
		}
		stop();
		
		double startTime = System.nanoTime();
		for(int i = 0; i < 50000; i++) {
			l.remove(0);
		}
		double endTime = (int) System.nanoTime();
		return (int) stop();
	}
	
	
	static double removeEndExperiment(List<Integer> l, int count) {
		l.clear();
		for (int i = 0; i < 50000; i++) {
			l.add(7);
		}
		stop();
		
		double startTime = System.nanoTime();
		for(int i = 0; i < 50000; i++) {
			l.remove(l.size() - 1);
		}
		double endTime = (int) System.nanoTime();
		return (int) stop();
	}
	
	static double removeRandomExperiment(List<Integer> l, int count) {
		l.clear();
		for (int i = 0; i < 50000; i++) {
			l.add(7);
		}
		stop();
		
		double startTime = System.nanoTime();
		for(int i = 0; i < 50000; i++) {
			l.remove((int)(Math.random() * l.size()));
		}
		double endTime = (int) System.nanoTime();
		return (int) stop();
	}



	public static void main(String[] args) {
		
		PrintStream ps = System.out;
		//double random = (Math.random() * 10);
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		ps.println("Adding " + COUNT + " elements to start of LinkedList: " + addBeginningExperiment(linkedList, COUNT));
		ps.println("Adding " + COUNT + " elements to start of ArrayList: " + addBeginningExperiment(arrayList, COUNT));
		
		ps.printf("Adding %d elements to end of LinkedList: %f\n", COUNT, addEndExperiment(linkedList, COUNT));
		ps.println("Adding " + COUNT + " elements to end of ArrayList: " + addEndExperiment(arrayList, COUNT));
		
		ps.println("Adding " + COUNT + " random elements to LinkedList: " + addRandomExperiment(linkedList, COUNT));
		ps.println("Adding " + COUNT + " random elements to ArrayList: " + addRandomExperiment(arrayList, COUNT));
		
		ps.println("Removing " + COUNT + " elements to start of LinkedList: " + removeBeginningExperiment(linkedList, COUNT));
		ps.println("Removing " + COUNT + " elements to start of ArrayList: " + removeBeginningExperiment(arrayList, COUNT));
		
		ps.println("Removing " + COUNT + " elements to end of LinkedList: " + removeEndExperiment(linkedList, COUNT));
		ps.println("Removing " + COUNT + " elements to end of ArrayList: " + removeEndExperiment(arrayList, COUNT));
		
		ps.println("Removing " + COUNT + " random elements from LinkedList: " + removeRandomExperiment(linkedList, COUNT));
		ps.println("Removing " + COUNT + " random elements from ArrayList: " + removeRandomExperiment(arrayList, COUNT));

	}

}
