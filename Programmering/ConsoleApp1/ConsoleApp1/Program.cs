using System;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            Person niklas = new Person();

            Person.SayName(niklas);

            Animal smulan = new Animal();
            smulan._name = "smulan";
            smulan._species = "Dog";
            smulan._color = "Green";
            
            Person niklas = new Person("Niklas", 33,smulan);

            niklas._name = "";
            niklas.Eat();
            niklas.Sleep();
            niklas.ActivePet.Poop();
        }
    }
}
