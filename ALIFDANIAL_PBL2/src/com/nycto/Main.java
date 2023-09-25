package com.nycto;

//For Java Option Pane
import javax.swing.*;

//Provide classes
import java.util.*;

//Main Class
public class Main {

    //Main Method
    public static void main(String[] args) {

        //Variable declaration
        int Welcome;
        int okbutton;
        int menuoption;
        int booklistcount;



        //Array Declaration
        ArrayList<Book> booklist = new ArrayList<>();
        ArrayList<String> bookcart = new ArrayList<>();

        //Book object initialization
        Book book1 = new Book("Absolute Java", "Savitch", "5", "Yes",10,30);
        Book book2 = new Book("Java:How to Program", "Deitel and Deitel", "0", "Yes",10,30);
        Book book3 = new Book("Computing Concepts with JAVA 3 Essentials", "Horstman", "5", "No",10,30);
        Book book4 = new Book("Java Software Solutions", "Lewis and Loftus", "5", "No",10,30);
        Book book5 = new Book("Java Program Design", "Cohoon and Davidson", "1", "Yes",10,30);

        //Adding object to array
        //Array initialization
        booklist.add(book1);
        booklist.add(book2);
        booklist.add(book3);
        booklist.add(book4);
        booklist.add(book5);


        //Button initialization
        okbutton = JOptionPane.OK_OPTION;

        //Welcome message
        Welcome = JOptionPane.showConfirmDialog(null, "Welcome to HappyTreeShelf!", "WELCOME!!", JOptionPane.OK_CANCEL_OPTION);

        //if-else statemennt
        //initialization of if-else statemet
        if (Welcome == okbutton) {

            //Exception
            //Initialization of exception
            try
            {

            //Do-while loop
            //Initialization of do-while loop
            do {

                   //Main Menu
                    String option = JOptionPane.showInputDialog(null,
                            "-------------------------------------------\n\n" +
                                    "   Welcome to HappyTreeSelf!!    \n" +
                                    "\n-------------------------------------------\n\n" +
                                    "\t1. Add book to shopping cart\n" +
                                    "\t2. View shopping cart\n" +
                                    "\t3. Remove book from shopping cart\n" +
                                    "\t4. Checkout\n" +
                                    "\t5. List all book\n" +
                                    "\t6.Quit", "Menu", JOptionPane.PLAIN_MESSAGE);

                    //Parse method
                    //Change string input from user to int type
                    //To use in switch statement
                    menuoption = Integer.parseInt(option);


                //Switch statement
                switch (menuoption) {

                    //Initialization of case 1
                    //Search and add to cart case
                    case 1:
                    {

                        //Get input from user
                        //Book title
                        String namabuku= JOptionPane.showInputDialog(null,"Enter Title","Add to cart",JOptionPane.INFORMATION_MESSAGE);

                        //Initialization of for loop
                        for(Book booksearch : booklist)
                        {
                            //Initialization of if-else statement
                            if (booksearch.getTitle() != null && booksearch.getTitle().contains(namabuku))
                            {
                                //True if-else statement condition code
                                //Book found
                                //Ask user to add to cart
                                String addtocart = JOptionPane.showInputDialog(null,"Book List"+"\n1. "+booksearch.getTitle()+"\n2.Cancel  ","Add to cart",JOptionPane.INFORMATION_MESSAGE);

                                //Parse method
                                //Change string input from user to int type
                                //To use in if-else statement
                                int pilihan = Integer.parseInt(addtocart);

                                //nested if-else statement
                                if(pilihan == 1)
                                {

                                    //True if-else statement condition code
                                    //User want to add the book to cart
                                    String pilihcart = JOptionPane.showInputDialog(null,"Do you want E-Book \n1.Yes \n2.No"," "+booksearch.getTitle(),JOptionPane.INFORMATION_MESSAGE);

                                    int pilihcart2 = Integer.parseInt(pilihcart);

                                    if(pilihcart2 == 1)
                                    {
                                        //if-else statement for user want to add e-book
                                        if(booksearch.getEbook().equals("Yes") )
                                        {

                                                //true
                                                //E-book available
                                                //Ebook added to cart
                                                bookcart.add(booksearch.getTitle());
                                                JOptionPane.showMessageDialog(null, " " + booksearch.getTitle() + " has been added to your cart", "Thank You", JOptionPane.INFORMATION_MESSAGE);
                                                break;

                                        }
                                        else
                                        {
                                            //false
                                            //no e-book
                                            //user need to choose physical book
                                            JOptionPane.showMessageDialog(null,"No E-Book Available","Error",JOptionPane.ERROR_MESSAGE);
                                        }
                                    }
                                    else
                                    {

                                        //if-else statement for user want to add physical book
                                        if(booksearch.getQty().contains("0"))
                                        {
                                            //true
                                            //no e-book
                                            //user need to choose physical book
                                            JOptionPane.showMessageDialog(null,"There are no physical copies of that book available!","Error",JOptionPane.ERROR_MESSAGE);
                                        }
                                        else
                                        {
                                            //false
                                            //physical book available
                                            //Physical book added to cart
                                            bookcart.add(booksearch.getTitle());
                                            JOptionPane.showMessageDialog(null, " " + booksearch.getTitle() + " has been added to your cart", "Thank You", JOptionPane.INFORMATION_MESSAGE);
                                            break;
                                        }
                                    }
                                }
                                else
                                {
                                    //false
                                    //User doesn't want to add book
                                    //Back to main menu
                                     break;
                                }

                           //End of book searh if-slse statement
                            }


                        //end of for loop
                        }
                        break;


                    //end of case 1
                    }


                    //Initialization of case 2
                    //View cart
                    case 2:
                    {

                            //initialization of if-else statement
                            //To check is there any book in the cart
                            if(bookcart.isEmpty())
                            {
                                //True
                                //No book in thecare
                                //Display messsage
                                JOptionPane.showMessageDialog(null,"You cart is empty,Please add book to your cart","Cart",JOptionPane.ERROR_MESSAGE);
                                break;
                            }
                            else
                            {
                                //false
                                //have book in cart

                                //display book in cart
                                //get info from arraylist
                                for (String cart2 : bookcart) {

                                    JOptionPane.showMessageDialog(null, "Shopping Cart :\n" + cart2, "Cart", JOptionPane.INFORMATION_MESSAGE);
                                }
                                break;
                            }


                    //End of case 2
                    }


                    //Initialization
                    //Remove book from cart
                    case 3:
                    {

                        //if-else statement
                        //To check if cart empty or not
                        if(bookcart.isEmpty())
                        {

                            //true
                            //no book in cart
                            // ask user to add book in the cart
                            JOptionPane.showMessageDialog(null,"You cart is empty,Please add book to your cart","Cart",JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                        else
                        {

                            //false
                            //cart is not empty
                            for(String cart : bookcart)
                            {

                                //Confirmation message
                                //Ask user if user really wanted to remove book
                                String buang = JOptionPane.showInputDialog(null, "Shopping Cart :\n" + cart + "\n Do you wish to empty your shopping cart? \n 1.Yes \n 2.No", "Cart", JOptionPane.INFORMATION_MESSAGE);
                                int remove = Integer.parseInt(buang);

                                if(remove == 1)
                                {
                                    //if user want to remove book
                                    //Book is removed one by one
                                    //by remove by index
                                    bookcart.remove(0);
                                    break;
                                }
                                else
                                {
                                    //if user cancel
                                    //back to main menu
                                    break;
                                }
                        }

                        }


                        break;

                    //end of case 3
                    }


                    //initialization of case 4
                    //Checkout
                    case 4:
                    {
                        for(Book bookcheckout : booklist)
                        {
                            //if-else statement
                            //To check if book is available in cart or not
                            if( bookcart.isEmpty())
                            {
                                //True
                                //Cart is empty
                                //user need to add book into cart
                                JOptionPane.showMessageDialog(null,"You didn't purchase any book,Please add book to your cart","Cart",JOptionPane.ERROR_MESSAGE);
                                break;
                            }
                            else
                            {
                                //False
                                //Book is available in cart

                                    if(bookcart.contains(bookcheckout.getTitle()) && bookcheckout.getEbook().contains("Yes"))
                                    {
                                        //True
                                        //If book in the cart is E-book
                                        //User need to pay RM10
                                        JOptionPane.showMessageDialog(null,"You have purchased E-book of "+bookcheckout.getTitle()+" Your total purchase is Rm "+bookcheckout.getEbookprice());
                                        break;
                                    }
                                    else
                                    {
                                        //False
                                        //If book in the cart is E-book
                                        //User need to pay RM10
                                        JOptionPane.showMessageDialog(null,"You have purchased Physical Book of "+bookcheckout.getTitle()+" Your total purchase is Rm "+bookcheckout.getPhysicalprice());
                                        break;
                                    }


                            }

                        }
                        break;

                    //End of case 4
                    }


                    //Initialization of case 5
                    //Display all book
                    case 5:
                    {
                        for (booklistcount = 0;booklistcount <=4;booklistcount ++) {

                            //Display all book
                            //Display by accessing arraylist index
                            JOptionPane.showMessageDialog(null, "Title :" + booklist.get(booklistcount).Title +"\nAuthor :" + booklist.get(booklistcount).Author + "\nNumber of copies :" + booklist.get(booklistcount).Qty + "\nEbook :" + booklist.get(booklistcount).Ebook, "Book List", JOptionPane.INFORMATION_MESSAGE);


                        }
                        break;
                    }
                    //End of case 5


                    //Initialization of case 6
                    //Exit
                    case 6:
                    {
                        //Display exit and thankyou message
                        JOptionPane.showMessageDialog(null, "Thankyou For Shopping with HappyTreeSelf!! \n Bye Bye!!");
                        break;

                    }
                    //End of case 6


                    //Default case
                    //If user enter number other than 1-6
                    default:
                    {
                        //Display error message
                        JOptionPane.showMessageDialog(null,"Invalid option please enter number 1-6 only!!","Invalid",JOptionPane.ERROR_MESSAGE);
                        break;
                    }


                }

            //End of do-while loop
            } while (menuoption != 6);

            }

            //Exception for Numberformat execption
            //if user enter alphabet instead of number
            catch(Exception e)
            {
                //Display error message
                //Ask user to enter number only
                JOptionPane.showMessageDialog(null,"Please Enter Number Only!!","Error",JOptionPane.ERROR_MESSAGE);
            }





        }
        else
        {
            //If user choose cancel button at the welcome message
            JOptionPane.showMessageDialog(null," Thank You!! \n Bye-Bye!!","Log Out",JOptionPane.PLAIN_MESSAGE);

        }

    //End of main method
    }

//End off main class
}


