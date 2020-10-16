using System;
using System.Collections.Generic;
using System.Text;

namespace Clothing2
{
    class User
    {
             public static string Information()
        {
            Console.WriteLine("Write your full name and adress");
            string _info = Console.ReadLine();

            Console.WriteLine("This is your information:" + _info);

            return _info;
        }
        public static string shoppingCartRed()
        {
            Console.WriteLine("This is your recipt");
            Console.WriteLine("Red Jacket 799kr");
            return "Hello";
        }
        public static string shoppingCartBlue()
        {
            Console.WriteLine("This is your recipt");
            Console.WriteLine("Blue Jacket 799kr");
            return "Hello";
        }
        public static string shoppingCartWhite()
        {
            Console.WriteLine("This is your recipt");
            Console.WriteLine("White Jacket 799kr");
            return "Hello";
        }
        
    }
}
