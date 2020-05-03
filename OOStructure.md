# OO Design Structure

##### Reference
https://leetcode.com/discuss/interview-question/object-oriented-design/395160/Object-Oriented-design-for-Logger-Library-or-Flipkart-or-OA-2019/355270

https://softwareengineering.stackexchange.com/a/221493

---

## LogLevelEnum Enum
 #### Attributes:
 - level enum // __FATAL, ERROR, WARN, INFO, DEBUG__

## TimeStampEnum Enum
 #### Attributes:
 - format enum // __YMD, YMDHIS__

---

## ILogger Interface
 #### Methods:
 - logMessage(String message, LogLeveLEnum level)

## Logger Class implements ILogger
 #### Attributes:
 - logLevel LogLevelEnum
 #### Methods:
 - logMessage(String message, LogLeveLEnum level)
 - Logger(logLevel LogLevelEnum, TimeStampEnum timestampFormat, ICommand command) \
// constructor - use __Singleton__ Object

---

## CommandContext Class
 #### Attributes:
 - command ICommand
 #### Methods:
 - handleLogMessage(String message)

---

## ICommand Interface
 #### Methods:
 - handleMessage(String message)

### Stdout Class implements ICommand
 #### Methods:
 - handleMessage(String message)

### File Class implements ICommand
 #### Methods:
 - handleMessage(String message)

### Database Class implements ICommand
 #### Methods:
 - handleMessage(String message)

---

# For Executing Command use - Strategy Pattern

- Interface - exposing execute algo method
- Concrete Algo Classes implementing Interface

- Context Class (only talks to the Interface,
                only takes in a reference for Class which implements Interface)
    : keeps a reference to one of Concrete Classes
    : executes Concrete Class method based on reference of selected Strategy

- Client Class will pass the object of one of Concrete Classes to the Context Class
    and set the reference
    : And further Client Class will use the Context Class execute method to execute
    required Strategy based on the reference object passed in