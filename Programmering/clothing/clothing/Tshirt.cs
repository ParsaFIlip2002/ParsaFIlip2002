using System;
using System.Collections.Generic;
using System.Drawing;
using System.Text;

namespace clothing
{
    class Tshirt
    {
        public string _size;

        public string _color;
            
        public int _input;

        public static string SizeOfTShirt()
        {
            Console.WriteLine("Pick a size for a t-shirt." +
                "1=S" +
                "2=M" +
                "3=L");
            _input = Convert.ToInt32(Console.ReadLine());

            if (_input == 1)
            {
                Console.WriteLine("You chose the size S");
                _size = "S";

            }
            if (_input == 2)
            {
                Console.WriteLine("You chose the size S");
                _size = "M";

            }
            if (_input == 3)
            {
                Console.WriteLine("You chose the size S");
                _size = "L";

            }

            return _size;

        }
        public string colorOfTShirt()
        {
            Console.WriteLine("Pick a size for a t-shirt." +
                            "1=RED" +
                            "2=BLACK" +
                            "3=WHITE");
            _input = Convert.ToInt32(Console.ReadLine());

            if (_input == 1)
            {
                Console.WriteLine("You chose the size S");
                _color = "RED";

            }
            if (_input == 2)
            {
                Console.WriteLine("You chose the size S");
                _color = "BLACK";

            }
            if (_input == 3)
            {
                Console.WriteLine("You chose the size S");
                _color = "WHITE";

            }

            return _color;

        }

    }
}