export class User {

    firstName: string;
    lastName: string;
    username: string;
    password: string;
    email: string;
    addresses: any[];

    constructor(firstName: string, lastName: string, username: string, password: string, email: string, addresses:any[]) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.email = email;
        this.addresses = addresses;
    }
}

export class Address {

    street: string;
    secondary: string;
    state: string;
    city: string;

    constructor(street: string, secondary: string, state: string, city: string) {
        this.street = street;
        this.secondary = secondary;
        this.state = state;
        this.city = city;
    }
}