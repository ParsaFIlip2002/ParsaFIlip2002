using Microsoft.VisualBasic;
using System;

namespace Clothing2
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello and welcome to my Webshop, " +
                                          "This is a clothing company that sells Jacket.Press 1 if you would like to start " +
                                          "shopping! ");
            

            int answer = Convert.ToInt32(Console.ReadLine());

            if (answer == 1)
            {
                Console.WriteLine("Okay, lets start shopping!");

                User.Information();

                Console.WriteLine("The colors we have are red,blue and white");
                Console.WriteLine("Press 1 for red");
                Console.WriteLine("Press 2 for blue");
                Console.WriteLine("Press 3 for white");

                int option = Convert.ToInt32(Console.ReadLine());

                switch (Convert.ToInt32(Console.ReadLine()))
                {
                    case 1:
                        if (option == 1)
                        {
                            Jacket.jacketRed();
                        }
                        break;
                    case 2:
                        Jacket.jacketBlue();
                        break;
                    case 3:
                        Jacket.jacketWhite();
                        break;
                    default:
                        // code block
                        break;
                }
            }
        }
    }
}
