using System;
using System.Collections.Generic;
using System.Text;

namespace Clothing2
{
    class Jacket
    {
        public static String jacketRed()
        {
            Console.WriteLine("You have chosen the red jacket");

            User.shoppingCartRed();
            return "hello";
        }
        public static String jacketBlue()
        {
            Console.WriteLine("You have chosen the Blue jacket");
            
            User.shoppingCartBlue();

            return "hello";
        }
        public static String jacketWhite()
        {
            Console.WriteLine("You have chosen the white jacket");

            User.shoppingCartWhite();

            return "hello";
        }
    } 
}
