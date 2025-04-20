# numberword-countdown
 Countdown puzzle solver for numbers, words and colours (Java 17)

 Summary
-------
Add core object‑oriented classes and first working solver

Description
-----------
• Introduce abstract base class `Operand` plus helper interface `Operate`.  
  – Encapsulates shared state and behaviour.  
• Implement concrete subclasses:  
  ‑ `IntegerOperand`, `StringOperand`, `ColorOperand`  
  – Each overrides `add`, `subtract`, `multiply`, `distance`, exercising
    run‑time polymorphism and method overriding.  
• Add depth‑first search engine `ValueFinder` that works only with the
  `Operand` abstraction (demonstrates programming to an interface).  
• Provide demo driver `NumberWordCountdownProject` and sample value pools.  

**Learning outcomes**  
Inheritance → common base class.  
Polymorphism → overridden arithmetic methods executed at run time.  
Encapsulation → internal helper `potentialSolution` kept private.  
Abstraction → algorithm decoupled from concrete operand types.

This commit establishes the OOP foundation on which later features and
refinements will build.

