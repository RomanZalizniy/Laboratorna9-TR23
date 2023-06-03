import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HeatCalculationApp extends JFrame {
    private JTextField massTextField;
    private JTextField temperatureTextField;
    private JButton calculateButton;
    private JLabel resultLabel;

    public HeatCalculationApp() {
        setTitle("Калькулятор теплоти");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new FlowLayout());

        // Додавання текстового поля для введення маси
        JLabel massLabel = new JLabel("Маса (кг):");
        massTextField = new JTextField(10);
        contentPanel.add(massLabel);
        contentPanel.add(massTextField);

        // Додавання текстового поля для введення температури
        JLabel temperatureLabel = new JLabel("Температура (°C):");
        temperatureTextField = new JTextField(10);
        contentPanel.add(temperatureLabel);
        contentPanel.add(temperatureTextField);

        // Додавання кнопки для обчислення
        calculateButton = new JButton("Обчислити");
        contentPanel.add(calculateButton);

        add(contentPanel, BorderLayout.CENTER);

        // Створення панелі для центрування мітки
        JPanel centerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        // Встановлення відступів для панелі
        centerPanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));

        // Додавання мітки для виведення результату до панелі центрування
        resultLabel = new JLabel("Кількість теплоти: ");
        centerPanel.add(resultLabel);

        add(centerPanel, BorderLayout.SOUTH);

        // Додавання слухача подій для кнопки обчислення
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateHeat();
            }
        });

        pack();
        setVisible(true);
    }

    private void calculateHeat() {
        try {
            // Отримання введених даних
            double mass = Double.parseDouble(massTextField.getText());
            double temperature = Double.parseDouble(temperatureTextField.getText());

            // Обчислення кількості теплоти
            double heat = mass * temperature;

            // Виведення результату
            resultLabel.setText("Кількість теплоти: " + heat + " Дж");
        } catch (NumberFormatException e) {
            // Обробка помилки у введених даних
            resultLabel.setText("Помилка: Невірний формат введених даних");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HeatCalculationApp();
            }
        });
    }
}
