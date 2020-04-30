# OO Design Structure

##### Reference
https://leetcode.com/discuss/interview-question/object-oriented-design/395160/Object-Oriented-design-for-Logger-Library-or-Flipkart-or-OA-2019/355270

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