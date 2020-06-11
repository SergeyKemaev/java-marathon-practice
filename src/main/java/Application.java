import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.httpclient.HttpTransportClient;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.objects.friends.responses.GetResponse;
import com.vk.api.sdk.objects.users.UserXtrCounters;
import com.vk.api.sdk.queries.users.UserField;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String... args) throws ClientException, ApiException {
        // https://oauth.vk.com/authorize?client_id=7507234&display=page&redirect_uri=https://oauth.vk.com/blank.html&scope=friends,photos,status,email&response_type=token&v=5.107&state=123456

        TransportClient transportClient = HttpTransportClient.getInstance();
        VkApiClient vk = new VkApiClient(transportClient);

        UserActor actor = new UserActor(2968284, "7d637b50c080a9182773d9a899e97beda25d00647c1ec82f4bf292c27ac4d673d6ca9b036c98238a9d697");

        System.out.println(vk.account().getProfileInfo(actor).execute().getFirstName());
        System.out.println("-------------------------------------");
//        GetResponse getResponse = vk.friends().get(actor).execute();
//
//        System.out.println(getResponse);
//
//        List<String> friendsIdsAsString = new ArrayList<>();
//
//        for (Integer friendId : getResponse.getItems()) {
//            friendsIdsAsString.add(friendId.toString());
//        }
//        List<UserXtrCounters> users = vk.users().get(actor).userIds(friendsIdsAsString).fields(UserField.BDATE, UserField.PHOTO_400_ORIG).execute();
//        for (UserXtrCounters userInfo : users) {
//            System.out.println(userInfo.getId() + " " + userInfo.getFirstName() + " " + userInfo.getLastName() + ":" + userInfo.getPhoto400Orig());
//        }
    }
}
