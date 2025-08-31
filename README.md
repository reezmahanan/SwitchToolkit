Switch Toolkit (Java)
A simple console toolkit demonstrating Java switch statements with:

Calculator: +, -, *, / (safe divide-by-zero handling)
Temperature converter: C↔F, C↔K, F↔C
Day mapper: Maps 1–7 to weekday names
Grade mapper: Maps score 0–100 to A–F
Requirements
Java JDK 8+ installed and on PATH
File: SwitchToolkit.java
Compile and Run (Windows PowerShell)

# Compilejavac SwitchToolkit.java# Runjava SwitchToolkit
If your source/output folders differ, run the commands from the directory containing SwitchToolkit.java.

Usage
Launch the program.
Choose an option from the main menu:
Calculator
Temperature Converter
Day Mapper (1–7)
Grade from Score (0–100)
Exit
Follow on-screen prompts. Non-numeric input is reprompted safely.
Example Session

=== Switch Toolkit (Java) ===-- Main Menu --1) Calculator2) Temperature Converter3) Day Mapper (1-7)4) Grade from Score (0-100)5) ExitChoose option: 2Convert:1) C -> F2) F -> C3) C -> K4) K -> CChoose: 1Enter value: 2525.0°C = 77.0°F
Notes
Input handling: The app reprompts until a valid number is entered.
Division by zero: The calculator prevents division by zero and prints a message.
Temperature physics: No absolute-zero validation is enforced (e.g., values below −273.15°C or below 0 K are accepted as input).
Troubleshooting
"javac is not recognized": Install a JDK and restart your terminal; confirm with javac -version.
OneDrive path issues: If compilation fails due to path/permission issues, move the file to a local folder (e.g., C:\Projects\SwitchToolkit) and try again.
Unicode symbols (°) display oddly: Use a terminal font/encoding that supports Unicode.
