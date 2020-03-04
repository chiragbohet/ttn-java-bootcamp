import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

import java.text.SimpleDateFormat
import java.time.LocalDateTime


class ShowDateTime extends DefaultTask {


    @TaskAction
    def showDateTime() {
        SimpleDateFormat formatterDate = new SimpleDateFormat("E, dd MMM yyyy");
        SimpleDateFormat formatterTime = new SimpleDateFormat("HH:mm:ss z");
        Date today = new Date();
        System.out.println("Today's date is : " + formatterDate.format(today)
                + "\nCurrent time is : " + formatterTime.format(today));
    }
}
