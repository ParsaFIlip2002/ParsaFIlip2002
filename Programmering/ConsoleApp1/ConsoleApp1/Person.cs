using System;

namespace ConsoleApp1
{
    class Person
    {
        public string _name; //fält (global)
        
        public int _age;

        Animal _pet;
            
        public Person(string name, int age, Animal pet)
        {
            _name = name;
            _age = age;
            _pet = pet;
        }
        public void ActivePet()
        {
            _pet.Poop();
        }
        public void Eat()
        {
            Console.WriteLine(_name + "is eating")
            
        }

        public void Sleep()
        {
            Console.WriteLine(_name + "is sleeping")
        }

        public static void SayName(Person person)
        {
            Console.WriteLine(Person_name);
        }

        
    }
}
