import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.httpclient.HttpTransportClient;
import com.vk.api.sdk.objects.friends.responses.GetResponse;
import com.vk.api.sdk.objects.users.UserXtrCounters;
import com.vk.api.sdk.queries.users.UserField;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String... args) throws ClientException, ApiException {
        // https://oauth.vk.com/authorize?client_id=7508343&display=page&redirect_uri=https://oauth.vk.com/blank.html&scope=friends,photos,status,email&response_type=token&v=5.107&state=123456

        System.out.println("------------------- VK Test ------------------");
        TransportClient transportClient = HttpTransportClient.getInstance();
        VkApiClient vk = new VkApiClient(transportClient);

        UserActor actor = new UserActor(2968284, "3e0ae4bf435360350f602c33b9c295dc2378b1c5ad68794cf227ce0846c966f378e5e958296c110d9a767");

        System.out.println(vk.account().getProfileInfo(actor).execute().getFirstName());
        System.out.println("----------------------------------------------");

        GetResponse getResponse = vk.friends().get(actor).execute();

        System.out.println(getResponse);

        List<String> friendsIdsAsString = new ArrayList<>();

        for (Integer friendId : getResponse.getItems()) {
            friendsIdsAsString.add(friendId.toString());
        }
        List<UserXtrCounters> users = vk.users().get(actor)
                .userIds(friendsIdsAsString)
                .fields(UserField.BDATE, UserField.PHOTO_400_ORIG)
                .execute();
        for (UserXtrCounters userInfo : users) {
            System.out.println(userInfo.getId() + " " + userInfo.getFirstName() + " " + userInfo.getLastName() + ":" + userInfo.getBdate() + ":" + userInfo.getPhoto400Orig());
        }
    }
}
