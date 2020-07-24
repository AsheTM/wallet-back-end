package dev.ashetm.wallet.counter.views.responses;

import java.util.List;

import dev.ashetm.wallet.counter.models.Card;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
public class CardsResponseView implements IResponseView {

	@ApiModelProperty(
			name = "cards", 
			dataType = "Card[]", 
			readOnly = false, 
			allowEmptyValue = true, 
			notes = "List of Card object to send to front", 
			position = 0, 
			hidden = false, 
			required = false)
	@Setter
	private List<Card> cards;

	public CardsResponseView(List<Card> cards) {
		super();
		this.cards = cards;
	}
	
	public static List<Card> to(CardsResponseView cardsResponseView) {
		return cardsResponseView.getCards();
	}
	
	public static CardsResponseView from(List<Card> cards) {
		return new CardsResponseView(cards);
	}

}