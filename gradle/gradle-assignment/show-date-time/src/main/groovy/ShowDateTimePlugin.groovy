import org.gradle.api.Plugin
import org.gradle.api.Project

class ShowDateTimePlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.task('showDateTime', type: ShowDateTime)
    }
}
