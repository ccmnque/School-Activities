class Employee:
    def __init__(self, name, salary):
        self.name = str(name)
        self.salary = salary

    def __repr__(self):
        return f"{self.name} has a salary of {self.salary}"


class Manager(Employee):
    def __init__(self, name, salary, named_department):
        super().__init__(name, salary)
        self.named_department = str(named_department)

    def __repr__(self):
        return f"{super().__repr__()} and manages the {self.named_department}"


class Executive(Manager):
    def __repr__(self):
        return f"{self.name} has a salary of {self.salary} and is the executive for the {self.named_department}"



def main():
   emp = Employee("John Smith", "45000.00")
   print(emp) 

   Manemp = Manager("Jane Doe", "60000.00", "Widgets Company")
   print(Manemp)

   Exman = Executive("Weird Guy", "90000.00", "Thingies Department")
   print(Exman)

main()