# Testing using Selenium WebDriver

-To access Test follow this path: [Testprac\src\test\java\testingprac](https://github.com/Agro-care/Testing/tree/main/Testprac/src/test/java/testingprac)

# Agro Assist Testing Repository

## Overview

This repository contains test scripts and documentation for the Agro Assist platform. Agro Assist is designed to provide innovative agricultural solutions such as crop disease prediction, weather alerts, crop and fertilizer recommendations, equipment rentals, and e-commerce functionalities. This README outlines the testing objectives, methods, tools, and results.

## Features Tested
1. **Disease Prediction System**:
   - Upload crop images for disease detection.
   - Provide treatment suggestions.

2. **Weather Alerts**:
   - Display real-time weather notifications based on location.

3. **Crop and Fertilizer Recommendations**:
   - Suggest suitable crops and fertilizers based on input parameters.

4. **E-commerce Platform**:
   - Product browsing, filtering, cart management, and reviews.

5. **Equipment Rental**:
   - Browse and rent farming equipment.

6. **Admin Dashboard**:
   - Manage users, products, and privileges.

## Testing Tools and Environment
- **Automated Testing**: Selenium WebDriver (Java)
- **Manual Testing**: Exploratory testing for user-focused assessments.
- **IDE**: IntelliJ IDEA Community Edition
- **Test Framework**: TestNG
- **Browsers Tested**: Chrome
- **Operating System**: Windows 11

## Repository Structure
```plaintext
Testing/
├── TestCases/
│   ├── LoginTests.java
│   ├── SignupTests.java
│   ├── WeatherAlertTests.java
│   ├── CropRecommendationTests.java
│   ├── FertilizerRecommendationTests.java
│   ├── ECommerceTests.java
│   ├── EquipmentRentalTests.java
│   ├── AdminDashboardTests.java
│   └── DiseasePredictionTests.java
├── TestData/
│   └── InputData.xlsx
├── TestReports/
│   ├── TestExecutionReport.html
│   └── Screenshots/
└── README.md
```

# Key Test Cases

## Login Functionality
- **Valid Login**: Validates successful login with registered credentials.
- **Invalid Login**: Ensures appropriate error handling for incorrect credentials.

## Weather Alerts
- **Location Access Denied**: Verifies error messages when geolocation access is denied.
- **Location Access Granted**: Displays weather data based on the user's location.

## Crop and Fertilizer Recommendations
- Validates crop/fertilizer suggestions based on temperature, humidity, soil pH, and other parameters.

## E-commerce and Admin Dashboard
- Verifies product addition, modification, and cart functionality.
- Ensures the admin dashboard effectively manages users and products.

# Issues History
- All reported issues during testing have been documented and resolved.
- Issue details are available in the documentation under the "Issues History" section.

# Results
- All test cases passed successfully, ensuring the platform's reliability and usability.
- For more detailed test execution results, refer to the `TestReports` directory.

# Contribution
To contribute to the testing repository:
1. Clone this repository.
2. Add or modify test scripts in the `TestCases` folder.
3. Run tests and ensure no existing functionality breaks.
4. Submit a pull request for review.

# Contact
For queries or issues, contact the testing team:
- **Tester**: Venkata Manikanta Prem Sai Potukuchi
- **Email**: [Insert Contact Email]

