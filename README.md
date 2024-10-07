# Java Backend homework

## Question 1:
Create JPA objects for **_execution_record_** table

- [ExecutionRecordEntity.java](src%2Fmain%2Fjava%2Fcom%2Ftestexam%2Ftan%2Fmodel%2FExecutionRecordEntity.java)
- [ExecutionRecordDAO.java](src%2Fmain%2Fjava%2Fcom%2Ftestexam%2Ftan%2Fdao%2FExecutionRecordDAO.java)
- [ExecutionRecordService.java](src%2Fmain%2Fjava%2Fcom%2Ftestexam%2Ftan%2Fservice%2FExecutionRecordService.java)
- [ExecutionRecordServiceImpl.java](src%2Fmain%2Fjava%2Fcom%2Ftestexam%2Ftan%2Fservice%2FExecutionRecordServiceImpl.java)

## Question 2:
Handle ConflictException using Spring AOP by implementing a central exception handler

- [CentralExceptionHandler.java](src%2Fmain%2Fjava%2Fcom%2Ftestexam%2Ftan%2Fexception%2FCentralExceptionHandler.java)

## Question 3:
Use Spring to manage classes to achieve a more loosely coupled and maintainable design

- [Animal.java](src%2Fmain%2Fjava%2Fcom%2Ftestexam%2Ftan%2Fcomponent%2FAnimal.java)
- [Giraffe.java](src%2Fmain%2Fjava%2Fcom%2Ftestexam%2Ftan%2Fcomponent%2FGiraffe.java)
- [Panda.java](src%2Fmain%2Fjava%2Fcom%2Ftestexam%2Ftan%2Fcomponent%2FPanda.java)
- [Zoo.java](src%2Fmain%2Fjava%2Fcom%2Ftestexam%2Ftan%2Fcomponent%2FZoo.java)

## Question 4:
Implement Singleton pattern for Calculation class. We can implement Calculation class as a Spring bean with Singleton scope,
but I use a straightforward way to implement Singleton pattern, using double-checked locking technique to ensure thread safety.

- [Calculation.java](src%2Fmain%2Fjava%2Fcom%2Ftestexam%2Ftan%2Fcomponent%2FCalculation.java)

