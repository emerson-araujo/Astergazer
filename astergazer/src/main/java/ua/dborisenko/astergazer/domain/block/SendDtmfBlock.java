package ua.dborisenko.astergazer.domain.block;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("SendDtmf")
public class SendDtmfBlock extends Block {
    
    public SendDtmfBlock() {
        application = "SendDTMF";
        parametersCount = 4;
    }
}
