package com.saadhadadia.ecommerce.responses;

import com.saadhadadia.ecommerce.customer.Address;

public record CustomerResponse(
        String id,
        String firstname,
        String lastname,
        String email,
        Address address
) {

}