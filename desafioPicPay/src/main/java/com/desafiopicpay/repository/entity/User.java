package com.desafiopicpay.repository.entity;

import com.desafiopicpay.repository.dto.UserDto;
import com.desafiopicpay.repository.enums.UserTypeEnum;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "users")
@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    @Column(unique = true)
    private String document;

    @Column(unique = true)
    private String email;

    private String password;

    private BigDecimal balance;

    @Enumerated(EnumType.STRING)
    private UserTypeEnum userTypeEnum;

    public User(UserDto data) {
        this.firstName = data.firstName();
        this.lastName = data.lastName();
        this.balance = data.balance();
        this.userTypeEnum = data.userTypeEnum();
        this.password = data.password();
        this.document = data.document();
        this.email = data.email();
    }

}
