import java.io.*;

import java.util.*;

public class Locker {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int choice=-1,choice2 = -1;
		Scanner sc = new Scanner(System.in);
		// Display project name and Developer name.
		System.out.println("Project Name= Virtual Key for Your Repositories");
		System.out.println("Developer Name= Ravikant Kumar");
		// OutPut user choice1
		do {
			System.out.println("Enter your Choice");
			System.out.println("choice 1: Display all file list in that folder. ");
			System.out.println("choice 2: create new file and Delete file");
			System.out.println("choice 3: Search file by User");
			System.out.println("choice 0: Exit");

			choice = sc.nextInt();
			// provide file location ,directory and create its object f1,directory.
			File f1 = new File("D:\\Personal Data\\RAVIKANT\\full Stack JAVA DEVLOPER\\Working_Data\\Locker\\rock2.txt");
			File directory = new File("D:\\Personal Data\\RAVIKANT\\full Stack JAVA DEVLOPER\\Working_Data\\Locker");

			String flist[] = directory.list();
			// Switch statement behalf of user choice.
			switch (choice) {
						case 1:
							//a filecount variable for count file number.
							int filecount=0;
							// Display all file by for loop.
							for (int i=0; i<flist.length; i++) 
							{
								String filename = flist[i];
								
								System.out.println(filename);
								filecount=i+1;
							}
						// total number of file display in folder.
							System.out.println("Total file = "+filecount);
							break;
			case 2:
			do {
				System.out.println("choice 1: create new file");
				System.out.println("choice 2: Delete file");
				System.out.println("choice 0: Exit from option = 2 ");
				
				  /*System.out.println("choice 3: Write in  file");
				  System.out.println("choice 4: Read the file");
					*/						 	
				
				choice2 = sc.nextInt();
				switch (choice2) {
								case 1:
										// create file
										f1.createNewFile();
										System.out.println("file create sucessfully=" + f1.getName());
										break;
								case 2:
										
										  //Delete file when we want and create its obj d. String d=f1.getName();
										  //delete file
										  //f1.delete();
										  //System.out.println("Delete  this file sucessfully="+d);
										  
										 System.out.println("Please type a name which u want to delete ");
										// create scf object for user input data.
										Scanner scd = new Scanner(System.in);
										// store user input into f variable
										String f2 = scd.nextLine();
										File f3=new File(f2);
										int flag1 = 0;
										if (flist == null) {
											System.out.println("Empty directory.");
										} else {
						
											// Linear search in the array
											for (int i = 0; i < flist.length; i++) {
												String filename = flist[i];
												// System.out.println(filename);
												if (filename.equalsIgnoreCase(f2)) {
													f1.delete();
													System.out.println(filename + " found");
													System.out.println("Delete  this file sucessfully="+filename);
													  
													flag1 = 1;
												}
											}
						
										}
										if (flag1 == 0) {
											System.out.println("File Not Found");
										}
										
										break;
								case 0:
									System.out.println("Exit from Option 2");
									break;
								
				
				
											
								/*
								 * case 3: // write some data which user type and create object fw for
								 * filewriter. FileWriter fw = new FileWriter(f1.getPath());
								 * System.out.println("Please type which u enter in file"); // create sct object
								 * for user input data. Scanner sct = new Scanner(System.in); // store user
								 * input into t variable String t = sct.nextLine(); fw.write(t); // close file.
								 * fw.close(); System.out.println("write sucessfully"); break;
								 * 
								 * case 4: // create object fr for file and give give addresh or use f1.getPath
								 * File fr = new File(f1.getPath()); Scanner scr = new Scanner(fr); // check
								 * file data and print it with the help of while. while (scr.hasNextLine()) {
								 * String line = scr.nextLine(); System.out.println(line); } // after read data
								 * from file close it. scr.close(); // display file char length which u written
								 * before read file or current . System.out.println("file length " +
								 * f1.length()); break;
								 */								  default:
													System.out.println("select write choice");
											  
											 			
					}
				}while(choice2 != 0);
				
				break;
			
			case 3:
				System.out.println("Please type a name which u file search");
				// create scf object for user input data.
				Scanner scf = new Scanner(System.in);
				// store user input into f variable
				String f = scf.nextLine();
				int flag = 0;
				if (flist == null) {
					System.out.println("Empty directory.");
				} else {

					// Linear search in the array
					for (int i = 0; i < flist.length; i++) {
						String filename = flist[i];
						// System.out.println(filename);
						if (filename.equalsIgnoreCase(f)) {
							System.out.println(filename + " found");
							flag = 1;
						}
					}

				}
				if (flag == 0) {
					System.out.println("File Not Found");
				}

				break;

							
			case 0:
				System.out.println("Exit the Program");
				break;
			default:
				System.out.println("select write choice");
			}
		} while (choice != 0);
	}

}
