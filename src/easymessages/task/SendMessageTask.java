package easymessages.task;

import cn.nukkit.scheduler.PluginTask;
import easymessages.utils.Utils;
import easymessages.EasyMessages;

public class SendMessageTask extends PluginTask<EasyMessages>{
    private EasyMessages plugin;
    public SendMessageTask(EasyMessages plugin){
        super(plugin);
        this.plugin = plugin;
    }
    @Override
    public void onRun(int currentTick){
        plugin.getServer().broadcastMessage(Utils.getRandom(plugin.getConfig().getSection("message").getStringList("messages")));
    }
}