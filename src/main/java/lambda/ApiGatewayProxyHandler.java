package lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

public class ApiGatewayProxyHandler implements RequestHandler<APIGatewayProxyRequestEvent,
        APIGatewayProxyResponseEvent> {
    public APIGatewayProxyResponseEvent handleRequest(APIGatewayProxyRequestEvent
                                                              requestEvent, Context context) {

        ApiHandler.Response response = ApiHandler.handle(requestEvent, context);

        return new APIGatewayProxyResponseEvent()
                .withBody(response.body())
                .withStatusCode(response.statusCode())
                .withHeaders(response.javaHeaders());
    }
}
