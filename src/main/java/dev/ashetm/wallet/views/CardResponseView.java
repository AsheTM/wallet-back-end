package dev.ashetm.wallet.views;

import dev.ashetm.wallet.entities.Card;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
public class CardResponseView implements ResponseView {

	@ApiModelProperty(
			name = "card", 
			dataType = "Card", 
			readOnly = false, 
			allowEmptyValue = true, 
			notes = "Card object to send to front", 
			position = 0, 
			hidden = false, 
			required = true)
	@Setter
	private Card card;

	public CardResponseView(Card card) {
		super();
		this.card = card;
	}
	
	public static Card to(CardResponseView accountResponseView) {
		return accountResponseView.getCard();
	}
	
	public static CardResponseView from(Card card) {
		return new CardResponseView(card);
	}
}