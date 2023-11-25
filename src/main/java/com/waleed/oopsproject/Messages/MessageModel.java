package com.waleed.oopsproject.Messages;

import com.waleed.oopsproject.Products.ProductModel;
import com.waleed.oopsproject.Users.UserModel;
import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "messages")
public class MessageModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "message_id")
    private Long messageId;

    @Column(name = "message")
    private String message;

    @ManyToOne(targetEntity = UserModel.class)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private UserModel sender;

    @ManyToOne(targetEntity = ProductModel.class)
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    private ProductModel product;

    public MessageModel() {
    }

    public MessageModel(String message, UserModel sender, ProductModel product) {
        this.message = message;
        this.sender = sender;
        this.product = product;
    }

    public Long getMessageId() {
        return messageId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserModel getSender() {
        return sender;
    }

    public void setSender(UserModel sender) {
        this.sender = sender;
    }

    public ProductModel getProduct() {
        return product;
    }

    public void setProduct(ProductModel product) {
        this.product = product;
    }
}
