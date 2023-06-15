package com.onlineshop.OnlineShop.Repository;

import com.onlineshop.OnlineShop.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.List;

@Configuration
public class DBinit implements CommandLineRunner {

    private final ItemRepository repo;

    public DBinit(ItemRepository repo) {
        this.repo = repo;
    }

    @Override
    public void run(String... args) throws Exception {
        repo.saveAll(List.of(
                new Item("Elegant handbag", new BigDecimal(1500), "https://media.istockphoto.com/id/1302787124/photo/beige-leather-women-handbag-isolated-on-white-background.jpg?s=612x612&w=0&k=20&c=fOO0zCBqF3rbiGLLHwgtOMHxt66adpKikE7Fs2C_fDs="),
                new Item("Elegant wallet", new BigDecimal(600), "https://media.istockphoto.com/id/1021173764/pl/zdj%C4%99cie/portfel-odizolowany-na-bia%C5%82ym-tle.jpg?s=612x612&w=0&k=20&c=7VVoNk3y8M9pFhR4VfNa0lr7p2IBiGhCrTe-6ZqutEk="),
                new Item("Elegant belt", new BigDecimal(800), "https://media.istockphoto.com/id/454363033/pl/zdj%C4%99cie/br%C4%85zowy-sk%C3%B3rzany-pas-na-bia%C5%82ym-tle.jpg?s=612x612&w=0&k=20&c=VQvvWFuQn8a9dGQc4UenYpsrNPxmIEGrRqb0pKtpcfw=")
        ));
    }
}
