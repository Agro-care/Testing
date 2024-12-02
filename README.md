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


