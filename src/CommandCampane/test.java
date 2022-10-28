package CommandCampane;

import java.util.concurrent.ScheduledExecutorService;

public class test {
    public static void main(String[] args) {
        Scheduler scheduler = new Scheduler();
        CampanaDin campanaDin = new CampanaDin();
        CampanaDecorator campanaDecorator = new EffettoVento(campanaDin);
        Command command = new SuonoCommand(campanaDin);
        scheduler.setCommand(command);

        CampanaBeeper campanaBeep = new CampanaBeeper();
        command = new SuonoCommand(campanaBeep);
        scheduler.setCommand(command);
        scheduler.suona();
    }
}
