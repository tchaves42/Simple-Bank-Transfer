# Simple Bank Transfer

## Description
This project is an integral part of the backend test, showcasing Java implementation expertise.

## Setup and Usage

### Prerequisites
- [Insomnia](https://insomnia.rest/)

### Testing the Functionality

1.Get started by launching Insomnia.

2. Utilize the `http://localhost:8080/users` endpoint to create two distinct users. Don't forget to provide the following details for each user:
   - `firstName`
   - `lastName`
   - `password`
   - `document`
   - `email`
   - `userType` (COMMON ou MERCHANT)
   - `balance` (wallet balance)
3. Once your users are in place, leverage the `http://localhost:8080/transactions` endpoint to facilitate a transaction between them. Ensure you furnish the following essential parameters:
   - `senderId: 1`
   - `receiverId: 2`
   - `value: 10`
4. The system will diligently process the transaction, leaving you with a clear indication of its success.

## Contributing
If you find opportunities for improvement or want to contribute to the project, feel free to send an email with tips.
`thiagoschaves61@gmail.com`
