# PaySecure
 ## Digital Payment with 3 factor authenticatation
 
This is a dummy payment application built to demonstrate a 3-factor authentication protocol for mobile payment applications by employing GPS-based tracking and OTP verification.

This application has been developed using android studio and the OTP sending and verification have been deployed using Firebase.The location tracking has been implemented using the Android Location API and Location Manager

The proposed model employs GPS verification followed by OTP authentication which is implemented as follows. Firstly the user will initiate their transaction which prompts the application to verify the location before proceeding. This triggers the GPS tracking mechanism which tries to match the location coordinates of the device from where the transaction is taking place with the known/ previously stored location coordinates of the user. These locations are measured on the basis of latitudes and longitudes. If the coordinates match or are within a certain limit, say within 1 degree (or more based on the application and level of security), then the OTP is sent to the registered number and the transaction can proceed as per its original flow. If there is a discrepancy, the application will suspect that the device has been compromised and instead of sending the OTP to the registered number, it will be sent to an alternate number (which is taken during the time of registration and is encrypted). If this transaction is initiated by the user themselves, then they would have access to the alternate number and can complete it successfully.

Further details on the project are available in the document attached:

[PaySecure_DigitalPayment_Research.pdf](https://github.com/SmritiVM/PaySecure/blob/main/PaySecure_DigitalPayment_Research.pdf)
