package runners.runnerWeb;


import org.junit.platform.suite.api.*;

import static io.cucumber.junit.platform.engine.Constants.*;


@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("web")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "stepdef.web, hooks.web")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, html:target/web-report.html")
@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@web")

public class RunnerTestWeb {

}
