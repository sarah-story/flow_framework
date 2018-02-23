package helloworld.HelloWorldFramework;

import com.amazonaws.services.simpleworkflow.flow.annotations.Activities;
import com.amazonaws.services.simpleworkflow.flow.annotations.ActivityRegistrationOptions;


@ActivityRegistrationOptions(defaultTaskScheduleToStartTimeoutSeconds = 300,
        defaultTaskStartToCloseTimeoutSeconds = 10)
@Activities(version="2.0")
public interface GreeterActivities {
    public String getName();
    public String getGreeting();
    public void say(String greeting, String name);
}
