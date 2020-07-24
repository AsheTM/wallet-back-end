package dev.ashetm.wallet.counter.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public enum CardType {
	
	VISA("VISA"), MASTERCARD("MASTERCARD"), UNKOWN(null);

    private String type;

}