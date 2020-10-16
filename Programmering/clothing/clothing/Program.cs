using System;

namespace clothing
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello and welcome to my Webshop, " +
                               "this is a clothing company that sells Jackets,pants and T-shirts. Press 1 if you would like to start " +
                               "shopping! ");
            
            int  answer = Convert.ToInt32(Console.ReadLine());

            if (answer == 1)
            {
                Console.WriteLine("Okay, lets start shopping!"); 
            }

            Console.WriteLine("");
            int option = Convert.ToInt32(Console.ReadLine());

            switch (Convert.ToInt32(Console.ReadLine()))
            {
                case 1:
                    if (option==1)
                    {
                        Tshirt.SizeOfTShirt();
                    }
                    
                    // Jacket user1 = new Jacket(); 
                    break;
                case 2:
                    
                    break;
                case 3:
                    Pants user3 = new Pants();
                    break;
                default:
                    // code block
                    break;
            }
            
        }
    }
}
