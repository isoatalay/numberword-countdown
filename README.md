## 🎯 Number‑Word Countdown  
*A polymorphic countdown puzzle solver for numbers, words, and colors*  
**Built with Java 17**

---

### 📦 Summary  
Implemented core object‑oriented classes and the initial working solver.

---

### 🛠️ Description

- ➕ Introduced an **abstract base class**: `Operand`  
- 🔁 Defined a **helper interface**: `Operate`  
  → *Encapsulates shared state and behavior across operand types.*

- 📂 **Concrete subclasses**:
  - `IntegerOperand`  
  - `StringOperand`  
  - `ColorOperand`  

→ Each overrides `add`, `subtract`, `multiply`, and `distance`, demonstrating:  
✅ *Runtime polymorphism*  
✅ *Method overriding*

- 🤖 **Solver**:  
  `ValueFinder` – A depth‑first search engine operating solely on the abstract `Operand` type.  
  Demonstrates the *“programming to an interface”* principle.

---

### 🚀 Demo

The project includes:
- `NumberWordCountdownProject.java` → Example driver
- Sample operand pools for testing

---

## 🧑‍💻 Object‑Oriented Principles Demonstrated

While building **Number‑Word Countdown**, I intentionally applied core OOP concepts and gained practical experience with each:

| 🧩 Principle                    | ✅ Implementation in Project                                                               | 📘 Lessons Learned                                                                      |
|--------------------------------|---------------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------|
| **Inheritance**                | Abstract base class `Operand` defines shared behavior; subclasses like `IntegerOperand`     | Designed class hierarchies that are open for extension but closed for modification     |
| **Method Overriding / Polymorphism** | Each subclass overrides `add`, `subtract`, etc. Used polymorphism via `ValueFinder` | Experienced dynamic dispatch; same logic handles multiple types seamlessly             |
| **Encapsulation**              | Internal state (e.g., `potentialSolution`) remains private; only exposed via public methods | Ensured data safety and prevented misuse from external classes                         |
| **Abstraction**                | Client interacts with `Operand` + `ValueFinder`, not knowing internal logic of subclasses    | Practiced separating *what* the code does from *how* it does it → simplified the API   |

> 🔍 **Outcome**: Implementing, testing, and integrating these features turned textbook OOP theory into working, production‑ready code, deepening my understanding of inheritance hierarchies, dynamic dispatch, and clean interface design.


