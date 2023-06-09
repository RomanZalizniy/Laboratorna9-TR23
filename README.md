# Laboratorna9-TR23(For ukrainian and foreign users)

Опис надано українською, and for english users I translated it for English!(Scroll down to the bottom)

Код представляє собою просту програму калькулятора теплоти, реалізовану з використанням Java Swing. Користувач може ввести значення маси та температури, а програма обчислить кількість теплоти та відобразить результат на екрані.


Для запуску цієї програми потрібно виконати наступні кроки:

Завантажте та встановіть JDK (Java Development Kit) на свій комп'ютер, якщо це ще не зроблено.
Створіть новий проект в редакторі коду (наприклад, IntelliJ IDEA або Eclipse).
Створіть новий файл з назвою "HeatCalculationApp.java" та скопіюйте код класу HeatCalculationApp в цей файл.
Створіть ще один файл з назвою "Main.java" та скопіюйте код класу Main в цей файл.
Запустіть програму, натиснувши кнопку "Run" або використовуючи відповідну команду в своєму редакторі коду.


Опис бібліотек:

javax.swing: Ця бібліотека містить класи та інтерфейси, пов'язані зі створенням графічного інтерфейсу користувача (GUI) в Java.

java.awt: Ця бібліотека надає класи та інтерфейси для роботи з елементами графічного інтерфейсу користувача, такими як контейнери, компоненти, події тощо.

Опис коду:

Клас HeatCalculationApp унаслідований від JFrame і представляє головне вікно програми. Він містить текстові поля для введення маси та температури, кнопку для обчислення, мітку для виведення результату.

У конструкторі HeatCalculationApp встановлюються налаштування вікна, розташування компонентів на ньому та слухач подій для кнопки обчислення.

Метод calculateHeat() викликається при натисканні кнопки "Обчислити". Він отримує значення маси та температури з текстових полів, обчислює кількість теплоти і встановлює відповідний текст у мітці результату.

Клас Main містить метод main(), який є вхідним точкою програми. В ньому створюється об'єкт класу HeatCalculationApp, що запускає програму і відображає головне вікно.


Після запуску програми з'явиться вікно "Калькулятор теплоти" з полем для введення маси, полем для введення температури, кнопкою "Обчислити" та міткою "Кількість теплоти". Після введення значень маси та температури та натискання кнопки "Обчислити" результат обчислення кількості теплоти виводиться в мітку "Кількість теплоти".

__________________________________________________________________________________________________________________________________________________________________

For english users:

The code is a simple heat calculator program implemented using Java Swing. The user can enter mass and temperature values and the program will calculate the amount of heat and display the result on the screen.


To run this program, you need to follow these steps:

Download and install the JDK (Java Development Kit) on your computer, if you have not already done so.
Create a new project in a code editor (for example, IntelliJ IDEA or Eclipse).
Create a new file named "HeatCalculationApp.java" and copy the code of the HeatCalculationApp class into this file.
Create another file named "Main.java" and copy the code of the Main class to this file.
Run the program by clicking the "Run" button or using the appropriate command in your code editor.


Description of the libraries:

javax.swing: This library contains classes and interfaces related to creating a graphical user interface (GUI) in Java.

java.awt: This library provides classes and interfaces for working with GUI elements such as containers, components, events, and more.

Code description:

The HeatCalculationApp class is inherited from JFrame and represents the main window of the application. It contains text fields for entering mass and temperature, a button for calculation, a label for displaying the result.

The HeatCalculationApp constructor sets the window settings, the location of the components on it, and the event listener for the calculation button.

The calculateHeat() method is called when the "Calculate" button is clicked. It receives the values of mass and temperature from the text fields, calculates the amount of heat and sets the corresponding text in the result label.

The Main class contains the main() method, which is the entry point of the program. It creates an object of the HeatCalculationApp class that launches the program and displays the main window.
