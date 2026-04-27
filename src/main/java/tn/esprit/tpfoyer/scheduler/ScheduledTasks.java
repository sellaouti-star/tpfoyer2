package tn.esprit.tpfoyer.scheduler;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import tn.esprit.tpfoyer.dto.FoyerDto;
import tn.esprit.tpfoyer.service.FoyerService;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Component
public class ScheduledTasks {

    private final FoyerService foyerService;
    private static final Logger logger = LoggerFactory.getLogger(ScheduledTasks.class);


    //Du lundi au vendredi à 9h
    @Scheduled(cron = "0 0 9 ? * MON-FRI")
    //Chaque 3 sec
    //@Scheduled(fixedRate = 10000)
    public void taskWeekdays() {
        logger.info("Liste des foyers en date du : " + LocalDateTime.now());
        List<FoyerDto> foyers = foyerService.findAllFoyer();
        foyers.forEach(foyer ->
                logger.info("➡ nom Foyer: {}, Capacité: {}", foyer.getNomFoyer(), foyer.getCapacite())
        );

        logger.info("Fin du rapport");
    }
}
